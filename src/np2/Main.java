package np2;

import java.util.Scanner;
import java.util.Calendar;
import np2.Util;
import np2.BancoDeDadosFake;

class Main {
    public static void main(String[] args) {

        Util.cls();
        BancoDeDadosFake bd = GetBancoDeDadosFake(); // Método definido na linha 145 deste mesmo arquivo
        // O sistema impede que a mesma cidade seja cadastrada mais de uma vez


//        Cidade bsb = new Cidade(1, "Brasília", EnumUF.DF);
//        //        bd.addCidade(bsb);
        
//      bd.addCidade(brasilia);
//
//      bd.addCidade(bsbRepetida2);
//      bd.addCidade(bsbRepetida3);
                
        // O sistema impede que o mesmo hotel seja cadastrado mais de uma vez
//      Hotel hotelRepetido1 = new Hotel(1, "B Hotel Brasília", 355.95f, bsb);
        
//      Hotel hotelRepeido2 = new Hotel("B Hotel Brasília", 355.95f, bsbRepetida1);
//	    Hotel hotelRepeido3 = new Hotel("B Hotel Brasília", 355.95f, bsbRepetida1);
//	    bd.addHotel(hotelRepetido1);
//	    bd.addHotel(hotelRepeido2);
//	    bd.addHotel(hotelRepeido3);
        
//        // O sistema impede que o mesmo restaurante seja cadastrado mais de uma vez      
//      Restaurante restRepetido1 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//      Restaurante restRepetido2 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//      Restaurante restRepetido3 = new Restaurante("Fred Restaurante",  35.95f, bsbRepetida1);
//      bd.addRestaurante(restRepetido1);
//      bd.addRestaurante(restRepetido2);
//      bd.addRestaurante(restRepetido3);
        
        int	idEscolhido;        
       
        Scanner in = new Scanner(System.in);
        
        System.out.println("Cadastrar novo pacote turístico: ");
        System.out.println("  * Cidade      : ");
        System.out.println("  * Hotel       : ");
        System.out.println("  * Data início : ");
        System.out.println("  * Data fim    : ");
        System.out.println("  * Restaurante : ");
        System.out.println("  * Ref. diárias : ");
        System.out.println("-------------------------------------");
        System.out.println("  Cidades disponíveis: ");
        
        for(Cidade c : bd.cidades){
            System.out.println(" ("+ c.id +") "  + c.nome +"/"+ c.UF);
        }
        System.out.printf("\n  Informe o código da cidade: ");
        idEscolhido = in.nextInt();
        Cidade cidadeEscolhida = bd.getCidadePeloId(idEscolhido);

        Util.cls();Util.cls();Util.cls();

        System.out.println("Cadastrar novo pacote turístico ");
        System.out.println("  * Cidade       : "+ cidadeEscolhida.nome +"/"+cidadeEscolhida.UF);
        System.out.println("  * Hotel        : ");
        System.out.println("  * Data início  : ");
        System.out.println("  * Data fim     : ");
        System.out.println("  * Restaurante  : ");
        System.out.println("  * Ref. diárias : ");
        System.out.println("-------------------------------------");
        System.out.println("  Hotéis disponíveis na cidade escolhida:");
        
        for(Hotel h : cidadeEscolhida.getHoteis()){
            System.out.println(" ("+ h.id +")   » " + h.nome);
        }
        System.out.printf("\n  Informe o código do hotel: ");
        idEscolhido = in.nextInt();
        
        Hotel hotelEscolhido = bd.getHotelPeloId(cidadeEscolhida.hoteis, idEscolhido);
        
        Util.cls();
        System.out.println("Cadastrar novo pacote turístico ");
        System.out.println("  * Cidade       : "+ cidadeEscolhida.nome +"/"+cidadeEscolhida.UF);
        System.out.println("  * Hotel        : "+ hotelEscolhido.nome);
        System.out.println("  * Data início  : ");
        System.out.println("  * Data fim     : ");
        System.out.println("  * Restaurante  : ");
        System.out.println("  * Ref. diárias : ");
        System.out.println("-------------------------------------");
        System.out.println("  Data de início:");
        System.out.printf("    » Dia: ");
        int dia = in.nextInt();
        System.out.printf("    » Mês (somente números): ");
        int mes = in.nextInt();
        System.out.printf("    » Ano: ");
        int ano = in.nextInt();
        Calendar dataIniPacote = Util.GetData(dia, mes, ano);

        Util.cls();
        System.out.println("Cadastrar novo pacote turístico ");
        System.out.println("  * Cidade       : "+ cidadeEscolhida.nome +"/"+cidadeEscolhida.UF);
        System.out.println("  * Hotel        : "+ hotelEscolhido.nome);
        System.out.printf ("  * Data início  : %02d/%02d/%d\n", dia, mes, ano);
        System.out.println("  * Data fim     : ");
        System.out.println("  * Restaurante  : ");
        System.out.println("  * Ref. diárias : ");
        System.out.println("-------------------------------------");
        System.out.printf("  Dias de permanência: ");
        int qtdDias = in.nextInt();
        dataIniPacote.add(Calendar.DATE, qtdDias);
        
        Util.cls();
        System.out.println("Cadastrar novo pacote turístico ");
        System.out.println("  * Cidade       : "+ cidadeEscolhida.nome +"/"+cidadeEscolhida.UF);
        System.out.println("  * Hotel        : " + hotelEscolhido.nome);
        System.out.printf ("  * Data início  : %02d/%02d/%d\n", dia, mes, ano);
        System.out.printf ("  * Data Fim	 : %02d/%02d/%d\n", dataIniPacote.get(Calendar.DAY_OF_MONTH), dataIniPacote.get(Calendar.MONTH)+1, dataIniPacote.get(Calendar.YEAR));
        System.out.println("  * Restaurante  : ");
        System.out.println("  * Ref. diárias : ");
        System.out.println("-------------------------------------");
        System.out.println("  Restaurantes disponíveis na cidade escolhida:");
        for(Restaurante r : cidadeEscolhida.getRestaurantes()){
            System.out.println("  ("+ r.id +")" + "  » " + r.nome);
        }
        System.out.printf("\n  Informe o código do restaurante: ");
        idEscolhido = in.nextInt();
        Restaurante restauranteEscolhido = bd.getRestaurantePeloId(cidadeEscolhida.restaurantes, idEscolhido);


        Util.cls();
        System.out.println("Cadastrar novo pacote turístico ");
        System.out.println("  * Cidade       : "+ cidadeEscolhida.nome +"/"+cidadeEscolhida.UF);
        System.out.println("  * Hotel        : " + hotelEscolhido.nome);
        System.out.printf ("  * Data início  : %02d/%02d/%d\n", dia, mes, ano);
        System.out.printf ("  * Data Fim	 : %02d/%02d/%d\n", dataIniPacote.get(Calendar.DAY_OF_MONTH), dataIniPacote.get(Calendar.MONTH)+1, dataIniPacote.get(Calendar.YEAR));
//        System.out.printf ("  * Data início  : %02d/%02d/%d\n", dataIniPacote.get(Calendar.DAY_OF_MONTH), dataIniPacote.get(Calendar.MONTH)+1, dataIniPacote.get(Calendar.YEAR));
        System.out.println("  * Restaurante  : "+ restauranteEscolhido.nome);
        System.out.println("  * Ref. diárias : ");
        System.out.println("-------------------------------------");
        System.out.printf("  Quantas refeições diárias inclusas? ");
        int qtdRefeicoesDiarias = in.nextInt();

        Calendar dataFimPacote = Util.GetData(dia, mes, ano);
        
        dataIniPacote = Util.GetData(dia, mes, ano);
        dataFimPacote = Util.GetData(dia + qtdDias, mes, ano);
        
        PacoteTuristico pacote = PacoteTuristico.novo(cidadeEscolhida, hotelEscolhido, dataIniPacote, dataFimPacote, restauranteEscolhido, qtdRefeicoesDiarias);
        
        Util.cls();
//        Calendar ini = pacote.dataInicio;
//        Calendar fim = pacote.dataFim;
        System.out.println("Pacote turístico cadastrado com sucesso! ");
        System.out.println("  » Cidade       : "+ pacote.cidade.nome +"/"+pacote.cidade.UF);
        System.out.println("  » Hotel        : " + pacote.hotel.nome);
        System.out.printf ("  » Data início  : %02d/%02d/%d\n", dataIniPacote.get(Calendar.DAY_OF_MONTH), dataIniPacote.get(Calendar.MONTH)+1, dataIniPacote.get(Calendar.YEAR));
        System.out.printf ("  » Data fim     : %02d/%02d/%d\n", dataFimPacote.get(Calendar.DAY_OF_MONTH), dataIniPacote.get(Calendar.MONTH)+1, dataIniPacote.get(Calendar.YEAR));
        System.out.println("  » Restaurante  : "+ pacote.restaurante.nome);
        System.out.println("  » Ref. diárias : "+ pacote.qtdRefeicoesDiarias);
        
        int qtdRefeicoes = in.nextInt();

    }
    
		public static BancoDeDadosFake GetBancoDeDadosFake(){
        BancoDeDadosFake bd = new BancoDeDadosFake();
        
        Cidade bsb 			= new Cidade(1, "Brasilia"		, EnumUF.DF);
        Cidade saoPaulo 	= new Cidade(2, "Sao Paulo"		, EnumUF.SP);
        Cidade rio			= new Cidade(3, "Rio de Janeiro", EnumUF.RJ);
        
		bd.addCidade(bsb);
		bd.addCidade(saoPaulo);
		bd.addCidade(rio);

		Hotel bHotelBrasilia 	= new Hotel(1, "B Hotel Brasilia", 331.94f, bsb);
		Hotel athosBulcao 		= new Hotel(2, "Athos Bulcao"    , 365.74f, bsb);
		Hotel cullinanplus 		= new Hotel(3, "Cullinan Plus"   , 355.99f, bsb);		
		
		Hotel atlanticoPrime 	= new Hotel(1, "Atlantico Prime"      , 265.95f, saoPaulo);
        Hotel pousoReal 		= new Hotel(2, "Pouso Real"           , 271.10f, saoPaulo);
        Hotel americasBarra 	= new Hotel(3, "Americas Barra Hotel" , 166.45f, saoPaulo);
        
        Hotel ibisPrime			= new Hotel(1, "Ibis Prime" 		, 265.95f, rio);
        Hotel pousoRio 			= new Hotel(2, "Pouso Rio"          , 271.10f, rio);
        Hotel copacabanaPalace 	= new Hotel(3, "Copacabana Palace"  , 166.45f, rio);
		
		
        bd.addHotel(bHotelBrasilia);
        bd.addHotel(athosBulcao);
        bd.addHotel(cullinanplus);
        
        bd.addHotel(atlanticoPrime);
        bd.addHotel(pousoReal);
        bd.addHotel(americasBarra);
        
        bd.addHotel(ibisPrime);
        bd.addHotel(pousoRio);
        bd.addHotel(copacabanaPalace);
        
        Restaurante fredRestaurante = new Restaurante(1, "Fred Restaurante" , 35.95f, bsb);
        Restaurante nazoSushiBar 	= new Restaurante(2, "Nazo Sushi Bar"	, 36.95f, bsb);
        Restaurante caminitoParrila = new Restaurante(3, "Fred Restaurante" , 34.95f, bsb);       

        Restaurante cocoBambu 		= new Restaurante(1, "Fred Restaurante" , 32.95f, saoPaulo);
        Restaurante oliver 			= new Restaurante(2, "Nazo Sushi Bar"	, 39.95f, saoPaulo);
        Restaurante taypaSabores 	= new Restaurante(3, "Fred Restaurante" , 35.95f, saoPaulo);   
        
        Restaurante cocoBambu2 			= new Restaurante(1, "Coco Bambu 2"            , 32.95f, rio);
        Restaurante oliver2 			= new Restaurante(2, "Oliver 2"				   , 39.95f, rio);
        Restaurante taypaSabores2 		= new Restaurante(3, "Taypa Sabores Del Peru 2", 35.95f, rio);   
        
        bd.addRestaurante(fredRestaurante);
        bd.addRestaurante(nazoSushiBar);
        bd.addRestaurante(caminitoParrila);

        bd.addRestaurante(cocoBambu);
        bd.addRestaurante(oliver);
        bd.addRestaurante(taypaSabores);        

        bd.addRestaurante(cocoBambu2);
        bd.addRestaurante(oliver2);
        bd.addRestaurante(taypaSabores2);

        return bd;
    }
}