public class Comentarios {
    public static void main(String[] args) {
        // Seu código do main aqui
    }

    public int somaMultiplica(int n, int m, String r) {
        int resultado = 0;
        // REMOVA o "anObject:" e deixe apenas as aspas
        if (r.equals("s")) { 
            resultado = n + m;
        } else if (r.equals("m")) { 
            resultado = n * m;
        }
        return resultado;
    }
}
