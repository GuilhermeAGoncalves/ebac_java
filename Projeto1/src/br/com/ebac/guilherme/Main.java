package br.com.ebac.guilherme;

import br.com.ebac.guilherme.dao.ClientMapDAO;
import br.com.ebac.guilherme.dao.IClientDAO;
import br.com.ebac.guilherme.model.Client;

import javax.swing.*;


public class Main {

    public static IClientDAO iClientDAO;
    public static void main(String[] args) {
        iClientDAO = new ClientMapDAO();

        String option = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consulta, 3 para alterar, 4 para deletar, 5 para sair", "Cadastro" , JOptionPane.INFORMATION_MESSAGE);

        while (!isOptionValid(option)) {
            if("".equals(option) || option == null) {
                exit();
            }

            option = JOptionPane.showInputDialog(null, "Opção invalida: Digite 1 para cadastro, 2 para consulta, 3 para alterar, 4 para deletar, 5 para sair", "Cadastro" , JOptionPane.ERROR_MESSAGE);

        }

        while (isOptionValid(option)) {
            if(optionExit(option)){
                exit();
            } else if (optionCreateClient(option)) {
                String newClient = JOptionPane.showInputDialog(null, "Digite o cliente separado por vigula: nome, cpf, numero, end, cidade, state", "Cadastro" , JOptionPane.INFORMATION_MESSAGE);
                createClient(newClient);
            }
            else if (optionGetClient(option)) {
                String cpf = JOptionPane.showInputDialog(null, "Pesquisar cliente por cpf", "Buscar" , JOptionPane.INFORMATION_MESSAGE);
                getClient(cpf);
            }
            else if (optionUpdateClient(option)) {
                String cpf = JOptionPane.showInputDialog(null, "Digite o CPF da pessoa que vai ser alterado", "Editar" , JOptionPane.INFORMATION_MESSAGE);
                if(verifyClientInDatas(cpf) != null) {
                    String newClient = JOptionPane.showInputDialog(null, "Digite o cliente separado por vigula: nome, numero, end, cidade, state", "Cadastro" , JOptionPane.INFORMATION_MESSAGE);
                    updateClient(newClient, cpf);
                }
            }
            else if (optionDeleteClient(option)) {
                String cpf = JOptionPane.showInputDialog(null, "Digite o CPF da pessoa que vai ser deletado", "deletado" , JOptionPane.INFORMATION_MESSAGE);
                deleteClient(cpf);
            }
            option = JOptionPane.showInputDialog(null, "Digite 1 para cadastro, 2 para consulta, 3 para alterar, 4 para deletar, 5 para sair", "Cadastro" , JOptionPane.INFORMATION_MESSAGE);
 /*
 O que falta fazer
 PUT client
 get client
 get allClient
  */
        }

    }

    public static void deleteClient(String cpf) {
        if(verifyClientInDatas(cpf) != null) {
            iClientDAO.deleteClient(cpf);
            JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso", "Buscar" , JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Buscar" , JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void getClient(String cpf) {
        if(verifyClientInDatas(cpf) != null) {
            JOptionPane.showMessageDialog(null, "Cliente pesquisado: " + verifyClientInDatas(cpf) , "Buscar" , JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado", "Buscar" , JOptionPane.ERROR_MESSAGE);
        }

    };

    private static Client verifyClientInDatas(String cpf) {
        return iClientDAO.getClient(cpf);
    }

    private static void updateClient(String newClient, String cpf) {

            String[] data = newClient.split(",");
            Client client = new Client(data[0],cpf,data[1],data[2],data[3],data[4]);
            boolean updated = iClientDAO.updateClient(client);
            if(updated) {
                JOptionPane.showMessageDialog(null, "Cliente alterado", "Alterado" , JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não alterado ", "ERROR" , JOptionPane.ERROR_MESSAGE);
            }
    }

    private static void createClient(String newClient) {
        if(isValidateNewClient(newClient)) {
            String[] data = newClient.split(",");
            Client client = new Client(data[0],data[1],data[2],data[3],data[4],data[5]);
            boolean created = iClientDAO.createClient(client);
            if(created) {
                JOptionPane.showMessageDialog(null, "Cliente cadastrado ", "Cadastrado" , JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Cliente ja cadastrado ", "ERROR" , JOptionPane.ERROR_MESSAGE);
            }
        };
    }

    private static boolean optionGeAllClient(String option) {
        if("6".equals(option)) {
            return true;
        }
        return false;
    }
    private static boolean isValidateNewClient(String newClient) {
        String[] datas = newClient.split(",");
        boolean valid = true;
        if(datas.length != 6) {
            valid = false;
        }
        for(String data : datas) {
            if(data == null) {
                valid = false;
            }
        }
        if (valid == false) {
            JOptionPane.showMessageDialog(null, "Falta dados", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private static boolean optionDeleteClient(String option) {
        if("4".equals(option)) {
            return true;
        }
        return false;
    }

    private static boolean optionUpdateClient(String option) {
        if("3".equals(option)) {
            return true;
        }
        return false;
    }

    private static boolean optionGetClient(String option) {
        if("2".equals(option)) {
            return true;
        }
        return false;
    }

    private static boolean optionCreateClient(String option) {
        if("1".equals(option)) {
            return true;
        }
        return false;

    }

    private static boolean optionExit(String option) {
        if("5".equals(option)) {
            return true;
        }
        return false;

    }

    private static boolean isOptionValid(String option) {
        return option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4") || option.equals("5");
    }

    private static void exit() {
        JOptionPane.showMessageDialog(null, "Até logo", "Sair" , JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
