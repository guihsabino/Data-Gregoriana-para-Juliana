
	import java.util.Calendar;
	import java.util.GregorianCalendar;
	
	public class Data {
		public static void main(String[] args) {
			GregorianCalendar gc = converteDataJulianoGregoriano("16218"); 
			int xano = gc.get(Calendar.YEAR);  
			int xmes = gc.get(Calendar.MONTH) + 1;  
			int xdia = gc.get(Calendar.DAY_OF_MONTH);  
			System.out.println("Ano:"+ xano+ " Mês:"+xmes+" Dia: "+xdia);
		}
		static GregorianCalendar converteDataJulianoGregoriano(String dataJulianoString){
			String seculoJuliano = dataJulianoString.substring(0,1);
			String anoJuliano = dataJulianoString.substring(1,3);
			String diaJuliano = dataJulianoString.substring(3,6);
			int anoGregoriano;
			if ( seculoJuliano.equals("1") ){
				anoGregoriano = 2000;
			}
			else
			{
				anoGregoriano = 1900;
			}
			GregorianCalendar gc = new GregorianCalendar(anoGregoriano+Integer.parseInt(anoJuliano),
					                                     1,
					                                     1);  
			gc.set(Calendar.DAY_OF_YEAR, Integer.parseInt(diaJuliano) );
			return gc;	
		}
	}

