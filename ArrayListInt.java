
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    //guarda un array de numeros enteros.
    private int[] arrayList;

    /**
     * 
     */
    public ArrayListInt(){
        arrayList = new int[0];
    }

    /**
     * 
     */
    public void add(int elemento){
        int[] array2 = arrayList;
        arrayList = new int[array2.length + 1];
        for (int count = 0; count < array2.length; count++)
        {
            arrayList[count] = array2[count];
        }
        arrayList[array2.length] = elemento;
    }

    /**
     * 
     */
    public void add(int index, int elemento){
        if (index <= arrayList.length){
            int[] array2 = arrayList;
            arrayList = new int[array2.length + 1];
            for (int count = 0; count < array2.length; count++)
            {
                if (index < count){
                    arrayList[count] = array2[count];                    
                }
                else{
                    arrayList[count+1] = array2[count];
                }
            }
            arrayList[index] = elemento;
        }
    }
    
    /**
     * 
     */
    public void clear(){
        arrayList = new int[0];
    }
    
    /**
     * 
     */
    public boolean contains(int elemento){
        boolean encontrado = false;
        int count = 0;
        while (!false && count < arrayList.length){
            if (arrayList[count] == elemento){
                arrayList[count] = elemento;
                encontrado = true;
            }
            count++;
        }
        return encontrado;
    }
}
