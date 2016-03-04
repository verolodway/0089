import java.util.*;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    //ArrayList de los contactos de la agenda
    private ArrayList<Contactos> contacto;
    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        contacto = new ArrayList<>();
    }

    /**
     * Permite almacenar un nuevo número en la agenda indicando el nombre del contacto
     * y su numero de telefono asociado
     */
    public void enterNumber(String name, String number){
        Map<String,String> contact = new HashMap<String,String>();
        contact.put(name, number);
    }

    /**
     * Devuelve el numero de teléfono del contacto indicado. Si el contacto no existe, 
     * devuelve null.
     */
    public String lookupNumber(String name){
        String nombre = name;
        Map<String,String> contact = new HashMap<String,String>();
        String numDevuelto = null;
        for (Contactos cont : contacto){
            if (contact.containsKey(nombre) == true){
                numDevuelto = contact.get(nombre);
            }
        }
        return numDevuelto;
    }
}
