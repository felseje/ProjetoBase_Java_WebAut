package br.com.projeto.commons;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {

    public static final String HORA = "HHmmss";
    public static final String DATA = "ddMMuuuu";
    public static final String DATAHORA = "ddMMuuuuHHmmss";

    public static Date obterDataAtual() {
        return Calendar.getInstance().getTime();
    }

    public static String obterDataAtual(String formato) {
        return new SimpleDateFormat(formato).format(obterDataAtual());
    }
}