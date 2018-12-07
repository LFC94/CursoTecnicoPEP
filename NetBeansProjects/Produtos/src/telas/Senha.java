package telas;

/**
 *
 * @author Lucas
 */
public class Senha {

    String senha_descript, Senha_cript;

    public String getSenha_descript() {
        return senha_descript;
    }

    public void setSenha_descript(String Senha) {
        String hex, hex1, hexto = "";
        hex1 = Senha;
        int qt = hex1.length();
        for (int i = 0; i < qt; i += 4) {

            hex = hex1.substring(0, 4);
            int hexToInt = Integer.parseInt(hex, 16);
            char intToChar = (char) hexToInt;
            hex1 = hex1.substring(4, hex1.length());
            hexto = hexto + String.valueOf(intToChar);
        }

        this.senha_descript = hexto;
    }

    public String getSenha_cript() {
        return Senha_cript;
    }

    public void setSenha_cript(String Senha) {
        String hex = "";
        int qtChar = Senha.length();
        char ch[] = new char[Senha.length()];

        for (int i = 0; i < qtChar; i++) {
            ch[i] = Senha.charAt(0);
            Senha = Senha.substring(1, Senha.length());
            hex += String.format("%04x", (int) ch[i]);
        }
        this.Senha_cript = hex;
    }
}
