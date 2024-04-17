
package herenciajava;

public class Herencia {

    
    public static void main(String[] args) {
       Humano adulto = new Humano();
       adulto.setNombre("freddy");
       adulto.comer(adulto.getNombre());
       adulto.dormir();    
       
        System.out.println();
        //crear objeto clase hija > hombra
        Hombre padre = new Hombre();
        padre.setNombre("nicolas");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarse();
        
        System.out.println();
        //crear objeto clase hija > mujer
        Mujer madre = new Mujer();
        madre.setNombre("gloria");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
        
    }
       
}
