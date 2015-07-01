/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author rafaelresende
 */
import entidade.Modelo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.exception.MethodInvocationException;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;


public class GeradorJava {
    
@SuppressWarnings("null")
    public static int gerar(Modelo model, File caminho) {
        Properties p = new Properties();
         p.setProperty("file.resource.loader.path", new File("").getAbsolutePath() + "/src/templates/templatesJava");
        Velocity.init(p);

        VelocityContext context = new VelocityContext();

        context.put("model", model);

        Template template = null;

        try {
            template = Velocity.getTemplate("templateJava.vm");
        } catch (ResourceNotFoundException rnfe) {
            // couldn't find the template
        } catch (ParseErrorException pee) {
            // syntax error: problem parsing the template
        } catch (MethodInvocationException mie) {
            // something invoked in the template
            // threw an exception
        } catch (Exception e) {
        }

        StringWriter sw = new StringWriter();

        template.merge(context, sw);

        try {
            FileWriter fw = new FileWriter(caminho);
            fw.write(sw.toString());
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Gerador.class.getName()).log(Level.SEVERE, null, ex);
            return Gerador.SUCESSO;
        }

        return Gerador.SUCESSO;
    }

}

