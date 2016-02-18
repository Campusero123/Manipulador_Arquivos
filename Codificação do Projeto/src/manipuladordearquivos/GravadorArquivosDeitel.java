

package manipuladordearquivos;

import java.io.File;

/**
 *
 * @author Igor Q. Silva
 */
public class GravadorArquivosDeitel {
    
    public void analyzePath(String path)
    {
        File name = new File(path);
        
        if(name.exists())
        {
            Sytem.out.printf("",name.getName(),"exists");
        }
        
    }
    
}
