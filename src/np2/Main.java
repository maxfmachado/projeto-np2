package np2;
import java.util.List;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import np2.Util;
import np2.BancoDeDadosFake;


class Main {
    public static void main(String[] args) {
    	
    	BancoDeDadosFake bd = new BancoDeDadosFake();
    	

    	Restaurante r = new Restaurante("Coco Bambu", bsb);
    	Hotel hotel = new Hotel("PlayTime", bsb, 300.00f);
    	Cidade bsb = new Cidade("Brasilia", "DF", hotel, r);
    	
    	bd.AddHotel(hotel, 300.00f, bsb);
 	
    	
//        Util.cls();
//        BancoDeDadosFake bd = GetBancoDeDadosFake(); // M�todo definido na linha 145 deste mesmo arquivo
//        
//        // O sistema impede que a mesma cidade seja cadastrada mais de uma vez
//        Cidade brasilia 	= new Cidade("Bras�lia", UF.DF, "https://61brasilia.com");
//        Cidade rioDeJaneiro = new Cidade("Bras�lia", Uf.DF, "https://61brasilia.com");
//        Cidade saoPaulo 	= new Cidade("Bras�lia", Uf.DF, "https://61brasilia.com");
//        bd.AddCidade(bsbRepetida1);
//        bd.AddCidade(bsbRepetida2);
//        bd.AddCidade(bsbRepetida3);
//                
//        // O sistema impede que o mesmo hotel seja cadastrado mais de uma vez
//        Hotel hotelRepeido1 = new Hotel("B Hotel Bras�lia", 355.95f, bsbRepetida1);
//        Hotel hotelRepeido2 = new Hotel("B Hotel Bras�lia", 355.95f, bsbRepetida1);
//        Hotel hotelRepeido3 = new Hotel("B Hotel Bras�lia", 355.95f, bsbRepetida1);
//        bd.AddHotel(hotelRepeido1);
//        bd.AddHotel(hotelRepeido2);
//        bd.AddHotel(hotelRepeido3);
//        
//        // O sistema impede que o mesmo restaurante seja cadastrado mais de uma vez      
//        Restaurante restRepetido1 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//        Restaurante restRepetido2 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//        Restaurante restRepetido3 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//        bd.AddRestaurante(restRepetido1);
//        bd.AddRestaurante(restRepetido2);
//        bd.AddRestaurante(restRepetido3);
//
//        int idEscolhido;
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Cadastrar novo pacote tur�stico: ");
//        System.out.println("  * Cidade      : ");
//        System.out.println("  * Hotel       : ");
//        System.out.println("  * Data in�cio : ");
//        System.out.println("  * Data fim    : ");
//        System.out.println("  * Restaurante : ");
//        System.out.println("  * Ref. di�rias : ");
//        System.out.println("-------------------------------------");
//        System.out.println("  Cidades dispon�veis: ");
//        for(Cidade c : bd.Cidades){
//            System.out.println("    + "+ c.Nome +"/"+ c.Uf +" ("+ c.Id +")");
//        }
//        System.out.printf("\n  Informe o c�digo da cidade: ");
//        idEscolhido = in.nextInt();
//        Cidade cidadeEscolhida = bd.GetCidadePeloId(idEscolhido);
//
//        Util.cls();
//        System.out.println("Cadastrar novo pacote tur�stico ");
//        System.out.println("  * Cidade       : "+ cidadeEscolhida.Nome +"/"+cidadeEscolhida.Uf);
//        System.out.println("  * Hotel        : ");
//        System.out.println("  * Data in�cio  : ");
//        System.out.println("  * Data fim     : ");
//        System.out.println("  * Restaurante  : ");
//        System.out.println("  * Ref. di�rias : ");
//        System.out.println("-------------------------------------");
//        System.out.println("  Hot�is dispon�veis na cidade escolhida:");
//        for(Hotel h : cidadeEscolhida.GetHoteis()){
//            System.out.println("    � "+ h.Nome +" ("+ h.Id +")");
//        }
//        System.out.printf("\n  Informe o c�digo do hotel: ");
//        idEscolhido = in.nextInt();
//        Hotel hotelEscolhido = bd.GetHotelPeloId(idEscolhido);
//
//        Util.cls();
//        System.out.println("Cadastrar novo pacote tur�stico ");
//        System.out.println("  * Cidade       : "+ cidadeEscolhida.Nome +"/"+cidadeEscolhida.Uf);
//        System.out.println("  * Hotel        : "+ hotelEscolhido.Nome);
//        System.out.println("  * Data in�cio  : ");
//        System.out.println("  * Data fim     : ");
//        System.out.println("  * Restaurante  : ");
//        System.out.println("  * Ref. di�rias : ");
//        System.out.println("-------------------------------------");
//        System.out.println("  Data de in�cio:");
//        System.out.printf("    � Dia: ");
//        int dia = in.nextInt();
//        System.out.printf("    � M�s (somente n�meros): ");
//        int mes = in.nextInt();
//        System.out.printf("    � Ano: ");
//        int ano = in.nextInt();
//        Calendar dataIniPacote = Util.GetData(dia, mes, ano);
//
//        Util.cls();
//        System.out.println("Cadastrar novo pacote tur�stico ");
//        System.out.println("  * Cidade       : "+ cidadeEscolhida.Nome +"/"+cidadeEscolhida.Uf);
//        System.out.println("  * Hotel        : "+ hotelEscolhido.Nome);
//        System.out.printf ("  * Data in�cio  : %02d/%02d/%d\n", dia, mes, ano);
//        System.out.println("  * Data fim     : ");
//        System.out.println("  * Restaurante  : ");
//        System.out.println("  * Ref. di�rias : ");
//        System.out.println("-------------------------------------");
//        System.out.printf("  Dias de perman�ncia: ");
//        int qtdDias = in.nextInt();
//        dataIniPacote.add(Calendar.DATE, qtdDias);
//
//        Util.cls();
//        System.out.println("Cadastrar novo pacote tur�stico ");
//        System.out.println("  * Cidade       : "+ cidadeEscolhida.Nome +"/"+cidadeEscolhida.Uf);
//        System.out.println("  * Hotel        : " + hotelEscolhido.Nome);
//        System.out.printf ("  * Data in�cio  : %02d/%02d/%d\n", dia, mes, ano);
//        System.out.printf ("  * Data in�cio  : %02d/%02d/%d\n", dataIniPacote.get(Calendar.DAY_OF_MONTH), dataIniPacote.get(Calendar.MONTH)+1, dataIniPacote.get(Calendar.YEAR));
//        System.out.println("  * Restaurante  : ");
//        System.out.println("  * Ref. di�rias : ");
//        System.out.println("-------------------------------------");
//        System.out.println("  Restaurantes dispon�veis na cidade escolhida:");
//        for(Restaurante r : cidadeEscolhida.GetRestaurantes()){
//            System.out.println("    � "+ r.Nome +" ("+ r.Id +")");
//        }
//        System.out.printf("\n  Informe o c�digo do restaurante: ");
//        idEscolhido = in.nextInt();
//        Restaurante restauranteEscolhido = bd.GetRestaurantePeloId(idEscolhido);
//
//        Util.cls();
//        System.out.println("Cadastrar novo pacote tur�stico ");
//        System.out.println("  * Cidade       : "+ cidadeEscolhida.Nome +"/"+cidadeEscolhida.Uf);
//        System.out.println("  * Hotel        : " + hotelEscolhido.Nome);
//        System.out.printf ("  * Data in�cio  : %02d/%02d/%d\n", dia, mes, ano);
//        System.out.printf ("  * Data in�cio  : %02d/%02d/%d\n", dataIniPacote.get(Calendar.DAY_OF_MONTH), dataIniPacote.get(Calendar.MONTH)+1, dataIniPacote.get(Calendar.YEAR));
//        System.out.println("  * Restaurante  : "+ restauranteEscolhido.Nome);
//        System.out.println("  * Ref. di�rias : ");
//        System.out.println("-------------------------------------");
//        System.out.printf("  Quantas refei��es di�rias inclusas? ");
//        int qtdRefeicoes = in.nextInt();
//
//        PacoteTuristico pacote = PacoteTuristico.Novo(cidadeEscolhida, hotelEscolhido, dataIniPacote, qtdDias, restauranteEscolhido, qtdRefeicoes);
//
//        Util.cls();
//        Calendar ini = pacote.DataInicio;
//        Calendar fim = pacote.DataFim;
//        System.out.println("Pacote tur�stico cadastrado com sucesso! ");
//        System.out.println("  � Cidade       : "+ pacote.Cidade.Nome +"/"+pacote.Cidade.Uf);
//        System.out.println("  � Hotel        : " + pacote.Hotel.Nome);
//        System.out.printf ("  � Data in�cio  : %02d/%02d/%d\n", ini.get(Calendar.DAY_OF_MONTH), ini.get(Calendar.MONTH)+1, ini.get(Calendar.YEAR));
//        System.out.printf ("  � Data fim     : %02d/%02d/%d\n", fim.get(Calendar.DAY_OF_MONTH), fim.get(Calendar.MONTH)+1, fim.get(Calendar.YEAR));
//        System.out.println("  � Restaurante  : "+ pacote.Restaurante.Nome);
//        System.out.println("  � Ref. di�rias : "+ pacote.QtdRefeicoesDiarias);
//    }
//    
//    public static BancoDeDadosFake GetBancoDeDadosFake(){
//        BancoDeDadosFake bd = new BancoDeDadosFake();
//        
//        Cidade bsb   = bd.AddCidade("Bras�lia"      , UF.DF);
//        Cidade rio   = bd.AddCidade("Rio de Janeiro", Uf.RJ);
//        Cidade jampa = bd.AddCidade("Jo�o Pessoa"   , Uf.PB);
//        
//        bd.AddHotel("B Hotel Bras�lia"            , 355.95f, bsb);
//        bd.AddHotel("Athos Bulc�o Hplus Executive", 211.00f, bsb);
//        bd.AddHotel("Cullinan Hplus Premium"      , 266.33f, bsb);
//        
//        bd.AddHotel("Atlantico Prime"             , 265.95f, rio);
//        bd.AddHotel("Pouso Real"                  , 271.10f, rio);
//        bd.AddHotel("Am�ricas Barra Hotal"        , 166.45f, rio);
//        
//        bd.AddHotel("Manos Royal Hotel"           , 195.95f, jampa);
//        bd.AddHotel("Mar doo Cabo Branco"         , 201.10f, jampa);
//        bd.AddHotel("Atl�ntico Pria Hotel"        , 132.45f, jampa);
//        
//        bd.AddRestaurante("Fred Restaurante"      ,  35.95f, bsb);
//        bd.AddRestaurante("Nazo Sushi Bar"        ,  21.00f, bsb);
//        bd.AddRestaurante("Caminito Parrila"      ,  26.33f, bsb);
//        
//        bd.AddRestaurante("Coco Bambu"            ,  25.95f, rio);
//        bd.AddRestaurante("Oliver"                ,  21.10f, rio);
//        bd.AddRestaurante("Tayp� Sabores Del Per�",  16.45f, rio);
//        
//        bd.AddRestaurante("Manos Royal Hotel"     ,  15.95f, jampa);
//        bd.AddRestaurante("Pobre Juan"            ,  21.10f, jampa);
//        bd.AddRestaurante("NAU Frutos do mar"     ,  12.45f, jampa);
//        
//        return bd;
    }
}