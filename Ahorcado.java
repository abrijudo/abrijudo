- 👋 Hi, I’m @abrijudo
- 👀 I’m interested in ...
- 🌱 I’m currently learning ...
- 💞️ I’m looking to collaborate on ...
- 📫 How to reach me ...

<!---
abrijudo/abrijudo is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->
public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String palabras;
        int intentos=0, veces=0;
        boolean juegoTerminado = false, error;
        System.out.println("Inserte una palabra: ");
        palabras=teclado.nextLine();
        palabras=palabras.toLowerCase();
        do{
        try{
         error=false;
        System.out.println("inserte el número de intentos : ");
        intentos=teclado.nextInt();
        }catch(Exception e){
            System.out.println("Fallo generado por no insertar un número");
            teclado.nextLine();
            error=true;
        }
        }while(error==true);
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("***********************A JUGAR!!!!**************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        System.out.println("************************************************************");
        int n = palabras.length();
        System.out.println("La palabra buscada tiene "+n+" letras");
        String palabraSecreta = palabras;
        
        int nLetrasPalabraSecreta = palabraSecreta.length();
        char [] palabraGuiones = new char[nLetrasPalabraSecreta];
        for(int i=0; i<palabraGuiones.length; i++){
            palabraGuiones[i]= '_';
        }
        
        do{
            System.out.println(palabraGuiones);
            System.out.println("Introduce una letra: ");
            char letra = teclado.next().charAt(0);
            veces++;
            System.out.println("Llevas "+veces+" de "+intentos);
            boolean algunaLetraAcertada=false;
            for(int i=0; i<palabraSecreta.length(); i++){
                if(palabraSecreta.charAt(i)==letra){
                    palabraGuiones[i]= letra;
                    algunaLetraAcertada=true;
                }
            }
            if(!algunaLetraAcertada)System.out.println("No has acertado ninguna letra\n");
            if(intentos==0){
                System.out.println("Has perdido porque agotaste los intentos");
                juegoTerminado=true;
            }
            else{
                boolean juegoTerminado2 = !hayGuiones(palabraGuiones);
                if(juegoTerminado2){
                    System.out.println("Has ganado el juego\n");
                    juegoTerminado=true;
                }
            }
        }while(juegoTerminado==false);
        
    }
    static boolean hayGuiones(char[]array){
        for(char l:array){
            if(l=='_')return true;
        }
        return false;
    }
