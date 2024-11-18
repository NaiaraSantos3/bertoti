package Singleton.singleton;

public class Main {
    public static void main(String[] args) {
        // Obtendo a instância única
        ConfigurationManager config = ConfigurationManager.getInstance();
        
        // Exibindo a configuração padrão
        System.out.println("Configuração atual: " + config.getSetting());
        
        // Alterando a configuração
        config.setSetting("Nova Configuração");
        
        // Obtendo a instância novamente e verificando a alteração
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        System.out.println("Configuração atualizada: " + config2.getSetting());
    }
}
