package br.pucminas.icei.audition.entity;

import br.pucminas.icei.audition.entityModel.StringUtil;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import java.util.Arrays;

/**
 * Representa um recurso em AuditEvent.
 * Um recurso é composto de um tipo e um id. Por exemplo: aluno 1234
 * @author Giovanni Silva
 */
@Embeddable
public class Resource {

    @Column(nullable = false, length = 200)
    private String resourceType;
    @Column(nullable = false, length = 200)
    private String resourceId;

    public Resource(String resourceType, String... resourceIds){
        this.resourceType = resourceType;
         setResourceIds(resourceIds);
    }

    public Resource() {
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Adiciona resourceIds como Comma Separated Value (separados por ;)
     * @param resourceIds IDs a serem adicioandos
     */
    @Transient
    public void setResourceIds(String... resourceIds){
        this.resourceId = StringUtil.toCsv(Arrays.asList(resourceIds));
    }

    /**
     * Retorna os resourceIds como uma lista
     * @return Lista de IDs, se houver apenas um ID retorna uma Lista com valor 1
     */
    public List<String> getResourceIds(){
        return StringUtil.fromCsv(this.resourceId);
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceType='" + resourceType + '\'' +
                ", resourceId='" + resourceId + '\'' +
                '}';
    }
}
