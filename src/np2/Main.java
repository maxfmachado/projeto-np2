package np2;
import java.util.List;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import np2.Util;
import np2.BancoDeDadosFake;


class Main {
    public static void main(String[] args) {
    	
 
    	
        Util.cls();
        BancoDeDadosFake bd = GetBancoDeDadosFake(); // M�todo definido na linha 145 deste mesmo arquivo
        
        // O sistema impede que a mesma cidade seja cadastrada mais de uma vez


        
//        bd.addCidade(brasilia);
//      bd.addCidade(bsbRepetida2);
//      bd.addCidade(bsbRepetida3);
                
        // O sistema impede que o mesmo hotel seja cadastrado mais de uma vez
//        Hotel hotelRepeido1 = new Hotel("B Hotel Bras�lia", 355.95f, brasilia);
        
//      Hotel hotelRepeido2 = new Hotel("B Hotel Bras�lia", 355.95f, bsbRepetida1);
//      Hotel hotelRepeido3 = new Hotel("B Hotel Bras�lia", 355.95f, bsbRepetida1);
//      bd.addHotel(hotelRepeido1);
//      bd.addHotel(hotelRepeido2);
//      bd.addHotel(hotelRepeido3);
        
        // O sistema impede que o mesmo restaurante seja cadastrado mais de uma vez      
//        Restaurante restRepetido1 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//        Restaurante restRepetido2 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//        Restaurante restRepetido3 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//        bd.addRestaurante(restRepetido1);
//      bd.addRestaurante(restRepetido2);
//      bd.addRestaurante(restRepetido3);

        int idEscolhido;
        Scanner in = new Scanner(System.in);

        System.out.println("Cadastrar novo pacote tur�stico: ");
        System.out.println("  * Cidade      : ");
        System.out.println("  * Hotel       : ");
        System.out.println("  * Data in�cio : ");
        System.out.println("  * Data fim    : ");
        System.out.println("  * Restaurante : ");
        System.out.println("  * Ref. di�rias : ");
        System.out.println("-------------------------------------");
        System.out.println("  Cidades dispon�veis: ");
        for(Cidade c : bd.cidades){
            System.out.println(" ("+ c.id +") "  + c.nome +"/"+ c.UF);
        }
        System.out.printf("\n  Informe o c�digo da cidade: ");
        idEscolhido = in.nextInt();
        Cidade cidadeEscolhida = bd.getCidadePeloId(idEscolhido);

        Util.cls();
        System.out.println("Cadastrar novo pacote tur�stico ");
        System.out.println("  * Cidade       : "+ cidadeEscolhida.nome +"/"+cidadeEscolhida.UF);
        System.out.println("  * Hotel        : ");
        System.out.println("  * Data in�cio  : ");
        System.out.println("  * Data fim     : ");
        System.out.println("  * Restaurante  : ");
        System.out.println("  * Ref. di�rias : ");
        System.out.println("-------------------------------------");
        System.out.println("  Hot�is dispon�veis na cidade escolhida:");
//        for(Hotel h : cidadeEscolhida.getHoteis()){
//            System.out.println(" ("+ h.id +")   � " + h.nome);
//        }
        System.out.printf("\n  Informe o c�digo do hotel: ");
        idEscolhido = in.nextInt();
        Hotel hotelEscolhido = bd.getHotelPeloId(idEscolhido);

        Util.cls();
        System.out.println("Cadastrar novo pacote tur�stico ");
        System.out.println("  * Cidade       : "+ cidadeEscolhida.nome +"/"+cidadeEscolhida.UF);
        System.out.println("  * Hotel        : "+ hotelEscolhido.nome);
        System.out.println("  * Data in�cio  : ");
        System.out.println("  * Data fim     : ");
        System.out.println("  * Restaurante  : ");
        System.out.println("  * Ref. di�rias : ");
        System.out.println("-------------------------------------");
        System.out.println("  Data de in�cio:");
        System.out.printf("    � Dia: ");
        int dia = in.nextInt();
        System.out.printf("    � M�s (somente n�meros): ");
        int mes = in.nextInt();
        System.out.printf("    � Ano: ");
        int ano = in.nextInt();
        Calendar dataIniPacote = Util.GetData(dia, mes, ano);

        Util.cls();
        System.out.println("Cadastrar novo pacote tur�stico ");
        System.out.println("  * Cidade       : "+ cidadeEscolhida.nome +"/"+cidadeEscolhida.UF);
        System.out.println("  * Hotel        : "+ hotelEscolhido.nome);
        System.out.printf ("  * Data in�cio  : %02d/%02d/%d\n", dia, mes, ano);
        System.out.println("  * Data fim     : ");
        System.out.println("  * Restaurante  : ");
        System.out.println("  * Ref. di�rias : ");
        System.out.println("-------------------------------------");
        System.out.printf("  Dias de perman�ncia: ");
        int qtdDias = in.nextInt();
        dataIniPacote.add(Calendar.DATE, qtdDias);

        Util.cls();
        System.out.println("Cadastrar novo pacote tur�stico ");
        System.out.println("  * Cidade       : "+ cidadeEscolhida.nome +"/"+cidadeEscolhida.UF);
        System.out.println("  * Hotel        : " + hotelEscolhido.nome);
        System.out.printf ("  * Data in�cio  : %02d/%02d/%d\n", dia, mes, ano);
        System.out.printf ("  * Data in�cio  : %02d/%02d/%d\n", dataIniPacote.get(Calendar.DAY_OF_MONTH), dataIniPacote.get(Calendar.MONTH)+1, dataIniPacote.get(Calendar.YEAR));
        System.out.println("  * Restaurante  : ");
        System.out.println("  * Ref. di�rias : ");
        System.out.println("-------------------------------------");
        System.out.println("  Restaurantes dispon�veis na cidade escolhida:");
//        for(Restaurante r : cidadeEscolhida.getRestaurantes()){
//            System.out.println("    � "+ r.nome +" ("+ r.id +")");
//        }
        System.out.printf("\n  Informe o c�digo do restaurante: ");
        idEscolhido = in.nextInt();
        Restaurante restauranteEscolhido = bd.GetRestaurantePeloId(idEscolhido);

        Util.cls();
        System.out.println("Cadastrar novo pacote tur�stico ");
        System.out.println("  * Cidade       : "+ cidadeEscolhida.nome +"/"+cidadeEscolhida.UF);
        System.out.println("  * Hotel        : " + hotelEscolhido.nome);
        System.out.printf ("  * Data in�cio  : %02d/%02d/%d\n", dia, mes, ano);
        System.out.printf ("  * Data in�cio  : %02d/%02d/%d\n", dataIniPacote.get(Calendar.DAY_OF_MONTH), dataIniPacote.get(Calendar.MONTH)+1, dataIniPacote.get(Calendar.YEAR));
        System.out.println("  * Restaurante  : "+ restauranteEscolhido.nome);
        System.out.println("  * Ref. di�rias : ");
        System.out.println("-------------------------------------");
        System.out.printf("  Quantas refei��es di�rias inclusas? ");
        int qtdRefeicoes = in.nextInt();

        PacoteTuristico pacote = PacoteTuristico.Novo(cidadeEscolhida, hotelEscolhido, dataIniPacote, qtdDias, restauranteEscolhido, qtdRefeicoes);

        Util.cls();
        Calendar ini = pacote.dataInicio;
        Calendar fim = pacote.dataFim;
        System.out.println("Pacote tur�stico cadastrado com sucesso! ");
        System.out.println("  � Cidade       : "+ pacote.cidade.nome +"/"+pacote.cidade.UF);
        System.out.println("  � Hotel        : " + pacote.hotel.nome);
        System.out.printf ("  � Data in�cio  : %02d/%02d/%d\n", ini.get(Calendar.DAY_OF_MONTH), ini.get(Calendar.MONTH)+1, ini.get(Calendar.YEAR));
        System.out.printf ("  � Data fim     : %02d/%02d/%d\n", fim.get(Calendar.DAY_OF_MONTH), fim.get(Calendar.MONTH)+1, fim.get(Calendar.YEAR));
        System.out.println("  � Restaurante  : "+ pacote.restaurante.nome);
        System.out.println("  � Ref. di�rias : "+ pacote.qtdRefeicoesDiarias);
    }
    
    public static BancoDeDadosFake GetBancoDeDadosFake(){
        BancoDeDadosFake bd = new BancoDeDadosFake();
        
        Cidade bsb 			= new Cidade(1, "Bras�lia", EnumUF.DF);
        Cidade saoPaulo 	= new Cidade(2, "S�o Paulo", EnumUF.SP);
        Cidade rio			= new Cidade(3, "Rio de Janeiro", EnumUF.RJ);
        
		bd.addCidade(bsb);
		bd.addCidade(saoPaulo);
		bd.addCidade(rio);

        
        bd.addHotel("B Hotel Bras�lia"            , 355.95f, bsb);
        bd.addHotel("Athos Bulc�o Hplus Executive", 211.00f, bsb);
        bd.addHotel("Cullinan Hplus Premium"      , 266.33f, bsb);
        
        bd.addHotel("Atlantico Prime"             , 265.95f, saoPaulo);
        bd.addHotel("Pouso Real"                  , 271.10f, saoPaulo);
        bd.addHotel("Am�ricas Barra Hotal"        , 166.45f, saoPaulo);
        
        bd.addHotel("Atlantico Prime"             , 265.95f, rio);
        bd.addHotel("Pouso Real"                  , 271.10f, rio);
        bd.addHotel("Am�ricas Barra Hotal"        , 166.45f, rio);
        
        
        bd.addRestaurante("Fred Restaurante"      ,  35.95f, bsb);
        bd.addRestaurante("Nazo Sushi Bar"        ,  21.00f, bsb);
        bd.addRestaurante("Caminito Parrila"      ,  26.33f, bsb);

        bd.addRestaurante("Coco Bambu"            ,  25.95f, saoPaulo);
        bd.addRestaurante("Oliver"                ,  21.10f, saoPaulo);
        bd.addRestaurante("Tayp� Sabores Del Per�",  16.45f, saoPaulo);        

        bd.addRestaurante("Coco Bambu"            ,  25.95f, rio);
        bd.addRestaurante("Oliver"                ,  21.10f, rio);
        bd.addRestaurante("Tayp� Sabores Del Per�",  16.45f, rio);
        
        
        return bd;
    }
}