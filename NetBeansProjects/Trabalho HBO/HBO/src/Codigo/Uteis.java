package Codigo;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Felipe
 */
public class Uteis {

    public String Telefone(String telefone) {
        String ddd, quateto1, quateto2;
        double tele;
        try {
            telefone = telefone.replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("-", "").replaceAll(" ", "");
            if (telefone.length() == 8) {
                quateto1 = telefone.substring(0, 4);
                quateto2 = telefone.substring(4, 8);
                tele = Double.parseDouble(telefone);
                return "(37)" + quateto1 + "-" + quateto2;

            } else {
                if (telefone.length() == 10) {
                    ddd = telefone.substring(0, 2);
                    quateto1 = telefone.substring(2, 6);
                    quateto2 = telefone.substring(6, 10);
                    tele = Double.parseDouble(telefone);
                    return "(" + ddd + ")" + quateto1 + "-" + quateto2;
                } else {
                    if (telefone.length() == 11) {
                        ddd = telefone.substring(1, 3);
                        quateto1 = telefone.substring(3, 7);
                        quateto2 = telefone.substring(7, 11);
                        tele = Double.parseDouble(telefone);
                        return "(" + ddd + ")" + quateto1 + "-" + quateto2;
                    } else {
                        if (telefone.length() == 12) {
                            ddd = telefone.substring(2, 4);
                            quateto1 = telefone.substring(4, 8);
                            quateto2 = telefone.substring(8, 12);
                            tele = Double.parseDouble(telefone);
                            return "(" + ddd + ")" + quateto1 + "-" + quateto2;

                        } else {
                            if (telefone.length() < 8 && telefone.length() > 0 || telefone.length() > 12
                                    || telefone.length() == 9) {
                                Mensagem("O telefone contem numero a mais ou a menos");
                                return "";
                            } else {
                                return "";
                            }

                        }
                    }
                }
            }
        } catch (Exception e) {
            Mensagem("Voce digitou letra no telefone");
            return "";
        }
    }

    public void Mensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem.toUpperCase());
    }

    public void Mensagem(String mensagem, String Titulo) {
        JOptionPane.showMessageDialog(null, mensagem.toUpperCase(), Titulo.toUpperCase(), JOptionPane.INFORMATION_MESSAGE);
    }

    public int Pergunta(String men, String Titulo) {
        return JOptionPane.showConfirmDialog(null, men.toUpperCase(), Titulo.toUpperCase(), JOptionPane.YES_NO_OPTION);
    }

    public String Hora(String Hora){
        
        Hora=Hora.replaceAll(":","");
        if (Hora.length()==4) {
            return Hora.substring(0,2)+":"+Hora.substring(2,4);
        }else{
         Mensagem("Hora Errada Formato 00:00!");
        }
        return "";
    }


}
