/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy_insta_fb;

/**
 *
 * @author Arafat
 */
public class Main {
    public static void main(String[] args) {
       SocialMediaContext context1=new SocialMediaContext();
       context1.setName("Nitu");
       context1.setSocialMedia(new FbStrategy());
       context1.connect();
       context1.setSocialMedia(new InstraStrategy());
       context1.setName("Sanzida");
       context1.connect();
//       SocialMediaStratey n=new FbStrategy();
//       n.connectTo();
//       SocialMediaStratey n2=new InstraStrategy();
//       n2.connectTo();
    }
}
