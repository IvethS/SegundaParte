
import java.util.Scanner;
public class SegundaParteExamen {

	public static void main(String[] args) {
		 //Fuentes Utilizadas para llevar acabo este programa:
        //http://www.javaya.com.ar/detalleconcepto.php?codigo=81&inicio=
        //http://es.wikihow.com/calcular-porcentaje-en-Java
        //y Una idea para poder hacer la suma de los puntos:
        //https://github.com/FabianTr13/examen_parte2_ejercicio_4/blob/master/src/quiz/quiz.java
        //tambien saque informacion para poder omitir el problema de que si ponian en mayuscula
        //o en minuscula las respuestas siempre se las tomara correctas de este link: http://todojava.awardspace.com/ejemplos-java.html?desc=CompararString
       //Ahora explicare un poco el codigo.
        Scanner lea =new Scanner(System.in);
        //aqui se declara la variable que hara la suma de todas las respuestas buenas.
         int puntos=0;
         //aqui colocaremos las preguntas que se van hacer en el quiz.
        System.out.print("Cuál es la capital de Japón?" );
       	//lee la respuesta.  
        String resp1 = lea.next();
        //aqui coloca cual es la respuesta correcta.
           String opcion_correcta1="tokio";
           //en este caso si la respuesta esta bien entonces se le sumara un punto 
           //y aparecera un mensaje si no esta bien, le dara un mensaje de error.
            if (resp1.equalsIgnoreCase(opcion_correcta1)){
		 puntos=+1;	
             System.out.print("Correcto\n");
         }
         else {
			System.out.print("Incorrecto La respuesta correcta era Tokio\n");
    }
            //lo mismo se hara en todas las demas....
        System.out.print("Cuál es la moneda de Francia?:");
        String resp2 = lea.next();
        String opcion_correcta2="euro";
            
          if (resp2.equalsIgnoreCase(opcion_correcta2)){
		 puntos=puntos+1;	
             System.out.print("Correcto\n");
         }
         else {
			System.out.print("Incorrecto La respuesta correcta era Euro\n");
    }
        System.out.print("Cuál es la montaña mas alta del mundo?");
        String resp3 = lea.next();
         String opcion_correcta3="everest";
           if (resp3.equalsIgnoreCase(opcion_correcta3)){
		puntos=puntos+1;	
             System.out.print("Correcto\n");
         }
         else {
			System.out.print("Incorrecto La respuesta correcta era  Everest\n");
    }
         System.out.print("Cuál es el nombre del presidente de chile?");
        String resp4 = lea.next();
         String opcion_correcta4="michelle";
           if (resp4.equalsIgnoreCase(opcion_correcta4)){
		puntos=puntos+1;
             System.out.print("Correcto\n");
         }
         else {
			System.out.print("Incorrecto La respuesta correcta era Michelle\n");
    }
         System.out.print("Cuál es el país más poblado?");
        String resp5 = lea.next();
         String opcion_correcta5="china";
          if (resp5.equalsIgnoreCase(opcion_correcta5)){
		puntos=puntos+1;	
             System.out.print("Correcto\n");
         }
         else {
			System.out.print("Incorrecto La respuesta correcta era China\n");
    }
        //una vez contestado todo viene a sumar el total de los puntos.
   System.out.print("Total de Preguntas Correctas son: "+puntos+"\n\n");
   //ahora para calcular el porcentaje hacemos lo siguiente declaramos la variable
   //como float porque asi permite ingresar numeros grandes y decimales.
   float porcentaje;            
   //aqui hacemos el calculo el total de puntos * 100 dividido en la cantidad de preguntas.
   porcentaje=(puntos * 100 / 5);
   //le muestra el mensaje de cuanto es el porcentaje total.
         System.out.print("El porcentaje total es: "+porcentaje+"%\n");
         //aqui es algo extra que quise agregarle al programa si el porcentaje, donde
         //mide el nivel de conocimiento de la persona basada en el porcentaje obtenido.
         if (porcentaje==100) {
            System.out.print("Excelente Tiene un Nivel de Conocimiento Alto\n");
        } else {
         if (porcentaje>=80) {
            System.out.print("Tiene un Buen Conocimiento\n");
        } else {
            if (porcentaje>=60) {
                System.out.print("Nivel de conocimiento Medio\n");
            } else {
                if (porcentaje>=40) {
                    System.out.print("Nivel de conocimiento Bajo\n");
                } else {
                    System.out.print("Pesimo, Debe Estudiar Mas\n");
                }
           }
            }
        }

	}

}
