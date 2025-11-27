public class ekisde {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Hola");
        for(int i = 0;i < arr.length;i++)
        {
            for (int j = 0;j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "");
            }
            System.out.println(" ");
        }
        for(int i = 0;i < arr.length;i++)
        {
            int sumrow = 0;
            for (int j = 0; j < arr[i].length; j++)
            {
                sumrow += arr [i][j];
            }
            System.out.println("Fila: " + (i+1) + " ; Suma: " + sumrow);
        }


        for(int j = 0;j < arr[0].length;j++)
        {
            int sumcol = 0;
            for (int i = 0; i < arr.length; i++)
            {
                sumcol += arr [i][j];
            }
            System.out.println("Columna: " + (j+1) + " ; Suma: " + sumcol);
        }


        int resultado = 0;
        for(int x = 0;x < arr.length;x++)
        {
            resultado += arr [x][x];
        }
        System.out.println("Suma diagonal 1: " + resultado);

        int resultado2 = 0;
        for(int x = 0;x < arr.length;x++)
        {
            resultado2 += arr [(arr.length - 1) - x][x];
        }
        System.out.println("Suma diagonal 2: " + resultado2);
    }
}