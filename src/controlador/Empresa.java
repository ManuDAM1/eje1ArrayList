/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Categoria;
import modelo.Usuario;
import utilidades.encriptar.Encriptar;

/**
 *
 * @author dam
 */
public class Empresa {
    
    ArrayList <Usuario> usuarios;
    ArrayList <Categoria> categorias;
    public Empresa() {
        
        usuarios = new ArrayList <>();
        categorias = new ArrayList<>();
    }
    
    public void anadir(){
//    String contra = "pepe";
//    String encriptado= Encriptar.getMD5(contra);  //TIENES QUE MIRAR LA VARIABLE IMPORTANTE Y EN EL USUARIO EN LA PARTE DE LA CONTRASEÑA pones contra.
    usuarios.add(new Usuario ("pepe","926e27eecdbc7a18858b3798ba99bddd")); //Contra pepe
    categorias.add(new Categoria("1","Deportes"));
    categorias.add(new Categoria("2","Politica"));
    categorias.add(new Categoria("3","Economia"));
//    usuarios.remove(2);
        
    }


    
    
    
    
    
}
