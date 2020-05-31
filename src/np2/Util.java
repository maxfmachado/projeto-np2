package np2;

import java.util.Calendar;

public class Util{
    public static Calendar GetData(int dia, int mes, int ano){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR        , ano);
        c.set(Calendar.DAY_OF_MONTH, dia);

        switch (mes){
            case  1 : c.set(Calendar.MONTH, Calendar.JANUARY  ); break;
            case  2 : c.set(Calendar.MONTH, Calendar.FEBRUARY ); break;
            case  3 : c.set(Calendar.MONTH, Calendar.MARCH    ); break;
            case  4 : c.set(Calendar.MONTH, Calendar.APRIL    ); break;
            case  5 : c.set(Calendar.MONTH, Calendar.MAY      ); break;
            case  6 : c.set(Calendar.MONTH, Calendar.JUNE     ); break;
            case  7 : c.set(Calendar.MONTH, Calendar.JULY     ); break;
            case  8 : c.set(Calendar.MONTH, Calendar.AUGUST   ); break;
            case  9 : c.set(Calendar.MONTH, Calendar.SEPTEMBER); break;
            case 10 : c.set(Calendar.MONTH, Calendar.OCTOBER  ); break;
            case 11 : c.set(Calendar.MONTH, Calendar.NOVEMBER ); break;
            case 12 : c.set(Calendar.MONTH, Calendar.DECEMBER ); break;
        }

        return c;
    }

    public static Calendar GetDataHora(int dia, int mes, int ano, int hora, int minuto){
        Calendar c = Util.GetData(dia, mes, ano);
        c.set(Calendar.HOUR  , hora  );
        c.set(Calendar.MINUTE, minuto);

        return c;
    }
    
    public static void cls() {
    	
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    	
    }     
}