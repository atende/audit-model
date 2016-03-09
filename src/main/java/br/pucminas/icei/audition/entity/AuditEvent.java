package br.pucminas.icei.audition.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Entidade representando AuditLogs na Base de dados
 * @author Giovanni Silva.
 */
@Entity
@SequenceGenerator(name = "audit_seq", sequenceName = "audit_seq", initialValue = 1, allocationSize = 50)
public class AuditEvent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "audit_seq")
    private Long id;

    @Column(nullable = false, length = 50)
    private String applicationName;
    @Column(nullable = false, length = 100)
    private String userName;
    @Column(nullable = false, length = 200)
    private String action;
    @Embedded
    private Resource resource;
    @Column(nullable = false)
    @Convert(converter = LocalDateTimeAttributeConverter.class)
    private LocalDateTime dateTime;
    @Column(length = 46) // 46 é o tamanho maximo de IPV6
    private String ip;
    @Enumerated(EnumType.STRING)
    private SecurityLevel securityLevel;

    public AuditEvent(String applicationName, String userName, String action, Resource resource, LocalDateTime dateTime, String ip, SecurityLevel securityLevel) {
        this.applicationName = applicationName;
        this.userName = userName;
        this.action = action;
        this.resource = resource;
        this.dateTime = dateTime;
        this.ip = ip;
        this.securityLevel = securityLevel;
    }

    public AuditEvent(String applicationName, String userName, String action, Resource resource, LocalDateTime dateTime) {
        this.applicationName = applicationName;
        this.userName = userName;
        this.action = action;
        this.resource = resource;
        this.dateTime = dateTime;
    }

    public AuditEvent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public SecurityLevel getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(SecurityLevel securityLevel) {
        this.securityLevel = securityLevel;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "AuditEvent{" +
                "id=" + id +
                ", applicationName='" + applicationName + '\'' +
                ", userName='" + userName + '\'' +
                ", action='" + action + '\'' +
                ", resource=" + resource +
                ", dateTime=" + dateTime +
                ", ip='" + ip + '\'' +
                ", securityLevel=" + securityLevel +
                '}';
    }
}