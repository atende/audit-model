package br.pucminas.icei.audition.entityModel;

import java.util.Arrays;
import java.util.List;

/**
 * Utility to convert strings separated with ; to lists and vice versa
 * @author Giovanni Silva
 */
public class StringUtil {
    /**
     * Converte para csv
     * @param list Lista a ser convertida. Codigo otimista, as strings da lista <b>NÃO</b> devem conter <b>;<b/>
     * @return String separada por ;
     */
    public static String toCsv(final List<String> list) {
        return toString(list, ';');
    }

    /**
     * Converte de um CSV para List. Codigo otimista não trata a string.
     * @param string  A string deve estar separada por ;
     * @return Lista de String
     */
    public static List<String> fromCsv(final String string){
        return fromString(string, ';');
    }

    /**
     * Converte uma lista de objetos em uma string separada por um delimitador
     * @param list Lista a ser convertida
     * @param delimiter Delimitador a ser adicionado entre as Strings da lista
     * @return String separada por delimitador
     */
    public static String toString(final List<String> list, char delimiter) {
        final StringBuilder b = new StringBuilder();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                b.append(list.get(i));
                if (i != list.size() - 1) {
                    b.append(delimiter);
                }
            }
        }
        return b.toString();
    }

    /**
     * Convert uma string em uma lista separando-a por um delimitador
     * @param string String a ser convertida
     * @param delimiter Delimitador para separar string
     * @return Lista de pedaços da String
     */
    public static List<String> fromString(final String string, char delimiter){
        String[] split = string.split(String.valueOf(delimiter));
        return Arrays.asList(split);
    }
}
