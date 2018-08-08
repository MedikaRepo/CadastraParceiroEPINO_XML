package br.com.sankhya;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.io.FileReader;
import java.io.BufferedReader;
import br.com.sankhya.extensions.actionbutton.AcaoRotinaJava;
import br.com.sankhya.extensions.actionbutton.ContextoAcao;


public class PrincipalClass {//implements AcaoRotinaJava {   //implements ScheduledAction{

	static String[] linha = new String[200000];
	static StringBuffer mensagem = new StringBuffer();

	public static Object ExecutaComandoNoBanco(String sql, String op)
	{
		try
		{
			Statement smnt = ConnectMSSQLServer.conn.createStatement(); 

			if(op=="select")
			{
				smnt.execute(sql);
				ResultSet result = smnt.executeQuery(sql); 
				result.next();
				return result.getObject(1);
			}
			else if(op=="alter")
			{
				smnt.executeUpdate(sql);
				return (Object)1;
			}
			else
			{
				return null;
			}
		}
		catch(SQLException ex)
		{
			System.err.println("SQLException: " + ex.getMessage());
			return null;
		}
	}	 

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		int cont = 0; int contLinhas =0;
		String temp = "";

		try {
			while (cont < 200000) {
				temp = buffRead.readLine();
				if (temp.contains("<![CDATA[_billing_first_name]]>")) {
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}


				if (temp.contains("<![CDATA[_billing_last_name]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);	
					contLinhas++;
				}

				if (temp.contains("<![CDATA[_billing_address_1]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				if (temp.contains("<![CDATA[_billing_number]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				if (temp.contains("<![CDATA[_billing_address_2]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				if (temp.contains("<![CDATA[_billing_neighborhood]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				if (temp.contains("<![CDATA[_shipping_city]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				if (temp.contains("<![CDATA[_shipping_state]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				if (temp.contains("<![CDATA[_shipping_postcode]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				if (temp.contains("<![CDATA[_shipping_country]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				if (temp.contains("<![CDATA[_billing_cpf]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				if (temp.contains("<![CDATA[_billing_phone]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				if (temp.contains("<![CDATA[E-mail do comprador]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				if (temp.contains("<![CDATA[Nome do comprador]]>")){
					linha[contLinhas] = buffRead.readLine();
					linha[contLinhas] = linha[contLinhas].substring(27, linha[contLinhas].length());
					linha[contLinhas] = linha[contLinhas].substring(0, linha[contLinhas].length()-19);
					//System.out.println(linha[contLinhas]);
					contLinhas++;
				}

				cont++;
			}

		} catch (Exception e) {
			//System.out.println("Cadastrados os parceiros:");
			/*for (int i = 0; i < contLinhas; i=i+14) {
				//if (!linha[i+13].contains("TESTE")) {
					String cpf = linha[i+8].replace( "." , ""); //tira ponto
					cpf = cpf.replace("-", "");
					cpf = cpf.replace(" ", "");
					if (ExecutaComandoNoBanco("SELECT CGC_CPF FROM TGFPAR WHERE CGC_CPF='"+cpf+"'", "select")==null)
					{
						mensagem.append(linha[i+13]+" CPF:"+linha[i+8]+" Email: "+linha[i+12]+" Telefone:"+linha[i+11]+" - Endereco: "+linha[i+2]+" "+linha[i+9]+" Complemento: "+linha[i+3]+" Bairro: "+linha[i+10]+" - "+linha[i+4]+" - "+linha[i+5]+" - "+linha[i+7]+" CEP: "+linha[i+6]+"\n");
					}
				}*/

			mensagem.append("Terminou a leitura \n");
		}

		buffRead.close();
	}

	public static void main(String[] args) throws IOException  {

	//public void doAction(ContextoAcao contexto) throws Exception {

		//@Override
		//public void onTime(ScheduledActionContext arg0) {
       
		int ultCodCid=0;
		int codCid = 0;
		int ultCodEnd = 0;
		int codEnd = 0;
		int ultCodBai = 0;
		int codBai = 0;
		int codReg = 0;
		short sUltCodUf = 0;
		short sCodUf = 0;
		String sexo = "F";
		try {

			//Conecta no banco do Sankhya
			ConnectMSSQLServer.dbConnect("jdbc:sqlserver://192.168.0.5:1433;DatabaseName=SANKHYA_PROD;", "sankhya","gap951753");

			try {

				//leitor("/home/mgeweb/modelos/PARCEIROSEPINO.xml");
				leitor("epi-no.wordpress.xml");

			} catch (Exception e) {
				// TODO: handle exception
				//mensagem.append(e.getMessage());
			}

			mensagem.append("Parceiros cadastrados: \n");
			//for(int i=0;i<14; i++)
			//{
			//	System.out.println("Posicao "+i+"="+linha[i]);
			//}
			for (int i = 0; i < linha.length; i=i+14) {
				
				if (linha[0].substring(linha[0].length()-1, linha[0].length())=="o") {
					sexo = "M";
				}
				
				String cpf = linha[i+9].replace( "." , ""); //tira ponto
				cpf = cpf.replace("-", "");
				cpf = cpf.replace(" ", "");
				//System.out.println(cpf);
				if (ExecutaComandoNoBanco("SELECT CGC_CPF FROM TGFPAR WHERE CGC_CPF='"+cpf+"'", "select")==null)
				{
					//ultimo parceiro
					int ultCodParc = (Integer)ExecutaComandoNoBanco("SELECT max(codparc) FROM TGFPAR", "select");

					if(ExecutaComandoNoBanco("SELECT codend FROM tsiend where nomeend = '"+linha[i+2]+"'", "select")!=null) {

						codEnd = (Integer)ExecutaComandoNoBanco("SELECT codend FROM tsiend where nomeend = '"+linha[i+2]+"'", "select");
					}else {
						//ultimo endereco
						ultCodEnd = (Integer)ExecutaComandoNoBanco("SELECT max(codend) FROM tsiend", "select");
					}

					if(ExecutaComandoNoBanco("SELECT coduf FROM tsiufs where uf = '"+linha[i+6]+"'", "select")!=null) {

						sCodUf = (Short)ExecutaComandoNoBanco("SELECT coduf FROM tsiufs where uf = '"+linha[i+6]+"'", "select");
					}else {
						//ultimo endereco
						sUltCodUf = (Short)ExecutaComandoNoBanco("SELECT max(coduf) FROM tsiufs", "select");
					}

					//System.out.println("SELECT codbai FROM tsibai where nomebai = '"+linha[i+11]+"'");
					if(ExecutaComandoNoBanco("SELECT codbai FROM tsibai where nomebai = convert(varchar(20),'"+linha[i+11]+"')", "select")!=null) {

						codBai = (Integer)ExecutaComandoNoBanco("SELECT codbai FROM tsibai where nomebai = convert(varchar(20),'"+linha[i+11]+"')", "select");
					}else {
						//ultimo bairro
						ultCodBai = (Integer)ExecutaComandoNoBanco("SELECT max(codbai) FROM tsibai", "select");
					}

					//System.out.println("SELECT codcid FROM tsicid where nomecid like '%'+convert(varchar(20),'"+linha[i+5]+"')+'%'");
					if(ExecutaComandoNoBanco("SELECT codcid FROM tsicid where nomecid like '%'+convert(varchar(20),'"+linha[i+5]+"')+'%'", "select")!=null) {

						codCid = (Integer)ExecutaComandoNoBanco("SELECT codcid FROM tsicid where nomecid like '%'+convert(varchar(20),'"+linha[i+5]+"')+'%'", "select");
					}else {
						//ultima cidade
						ultCodCid = (Integer)ExecutaComandoNoBanco("SELECT max(codcid) FROM tsicid", "select");
					}

					if (codEnd == 0) {
						//insere  endereco
						ExecutaComandoNoBanco("insert into tsiend (codend, nomeend, tipo, dtalter, codlogradouro)"
								+ "values ("+(ultCodEnd+1)+", '"+linha[i+2]+"', 'R', getdate(), 'R' )", "alter");
						codEnd = ultCodEnd+1;
					}

					if(codBai == 0) {
						//insere  bairro
						//System.out.println("insert into tsibai (codbai, nomebai, codreg, dtalter)"
							//	+ "values ("+(ultCodBai+1)+", '"+linha[i+11]+"', 0, getdate() )");
						ExecutaComandoNoBanco("insert into tsibai (codbai, nomebai, codreg, dtalter)"
								+ "values ("+(ultCodBai+1)+", convert(varchar(20),'"+linha[i+11]+"'), 0, getdate() )", "alter");
						codBai = ultCodBai;
					}

					
					//insere cidade
					if (sCodUf == 0){
						sUltCodUf++;
						//System.out.println("insert into tsiufs (coduf, uf, descricao, valsitcadsefaz, estornonfe)"
						//		+ "values ("+(sUltCodUf)+", '"+linha[i+6]+"', '"+linha[i+6]+"','N', 'N')");
						ExecutaComandoNoBanco("insert into tsiufs (coduf, uf, descricao, valsitcadsefaz, estornonfe)"
								+ "values ("+(sUltCodUf)+", '"+linha[i+6]+"', '"+linha[i+6]+"','N', 'N')", "alter");
						sCodUf = sUltCodUf;
					}
					
					//insere cidade
					if (codCid == 0){
						ultCodCid++;
						//System.out.println("insert into tsicid (codcid, nomecid, uf, codreg, dtalter, qtddiassub, qtdsub,"
							//	+ "TEMSUBSTITNFSE, TIPCANCNFSE)"
								//+ "values ("+(ultCodCid)+", '"+linha[i+5]+"', '"+sCodUf+"',0, getdate(), 0, 0, 'N', 1)");
						ExecutaComandoNoBanco("insert into tsicid (codcid, nomecid, uf, codreg, dtalter, qtddiassub, qtdsub,"
								+ "TEMSUBSTITNFSE, TIPCANCNFSE)"
								+ "values ("+(ultCodCid)+", convert(varchar(20),'"+linha[i+5]+"'), '"+sCodUf+"',0, getdate(), 0, 0, 'N', 1)", "alter");
						codCid = ultCodCid;
					}
					
					
					if(ExecutaComandoNoBanco("SELECT codreg FROM ad_tsirci where codcid="+codCid, "select")!=null) {

						codReg = (Integer)ExecutaComandoNoBanco("SELECT codreg FROM ad_tsirci where codcid="+codCid, "select");
					}

					String cep = linha[i+7].replace( "." , ""); //tira ponto
					cep = cep.replace("-", "");
					cep = cep.replace(" ", "");

					String telefone = linha[i+4].replace( "." , ""); //tira ponto
					telefone = telefone.replace("-", "");
					telefone = telefone.replace(" ", "");
					telefone = telefone.replace("(", "");
					telefone = telefone.replace(")", "");

					ultCodParc++;

					/*System.out.println("insert into tgfpar (codparc, codvend, nomeparc, tippessoa, cep, telefone, email, dtcad, "
							+ "dtalter, cgc_cpf, cliente, fornecedor, transportadora, vendedor, agencia, codtipparc, codbco, tare, IPIINCICMS, "
							+ "retemiss, reteminss, ativo, bloquear, calcinss, codusu, retempis, retemcofins, retemcsl, usuario, temipi,"
							+ "aluno, professor, descbonif, implaudolote, medico, tipofatur, motorista, descstiva, operlogist, agronomo, "
							+ "produtortemnf, flex, simples, tipanexonfe, codusucobr, emaildanfe, permitecorte, statusedz, sitreceita, "
							+ "sitsintegra, sitccf, usatabcrforn, artprecad, GERCTRCAUTO, codlocalpadrao, entregaendcontato, retstvenda, "
							+ "tipogerboleto, TIPOGERBOLETODUP, BOLDESTEMAIL, ENVIPEDEMAILTOP, APLICLEITRANSP, integraeconect, baseparceleconect,"
							+ "baseprazoeconect, perfileconect, emailnfe, codcid, codend, codbai)"
							+ "values ("+(ultCodParc)+",0, '"+linha[i+13]+"', 'F',  '"+cep+"','"+telefone+"','"+linha[i+12]+"', getdate(), "
							+ "getdate(), '"+cpf+"', 'S', 'N', 'N', 'N', 'N', 10301000, 0, 'N', 'S', 'N', 'N', 'S', 'N', "
							+ "'N', 0, 'N', 'N', 'N', 'N', 'S', 'N', 'N', 'L', 'N', 'N', 'L', 'N', 'S', 'N', 'N', 'S',"
							+ "'S', 'N', 'X', 0, 'S', 'S', 'P', 'I', 'I', 'I', 'N', 'N', 'N', 0, 'N', 'N',"
							+ "'I', 'I', 'A', 'A', 'N', 'N', 0, 0, 'B', '"+linha[i+12]+"', "+codCid+", "+codEnd+", "+codBai+")");*/

					//insere na tgfpar
					ExecutaComandoNoBanco("insert into tgfpar (codparc, codreg, codvend, nomeparc, razaosocial,tippessoa, cep, telefone, email, dtcad, "
						+ "dtalter, cgc_cpf, cliente, fornecedor, transportadora, vendedor, agencia, codtipparc, codbco, tare, IPIINCICMS, "
						+ "retemiss, reteminss, ativo, bloquear, calcinss, codusu, retempis, retemcofins, retemcsl, usuario, temipi,"
						+ "aluno, professor, descbonif, implaudolote, medico, tipofatur, motorista, descstiva, operlogist, agronomo, "
						+ "produtortemnf, flex, simples, tipanexonfe, codusucobr, emaildanfe, permitecorte, statusedz, sitreceita, "
						+ "sitsintegra, sitccf, usatabcrforn, artprecad, GERCTRCAUTO, codlocalpadrao, entregaendcontato, retstvenda, "
						+ "tipogerboleto, TIPOGERBOLETODUP, BOLDESTEMAIL, ENVIPEDEMAILTOP, APLICLEITRANSP, integraeconect, baseparceleconect,"
						+ "baseprazoeconect, perfileconect, emailnfe, codcid, codend, codbai, codemppref, CODPARCMATRIZ, IDENTINSCESTAD, sexo,"
						+ "numend, complemento, ad_tipcliente)"
						+ "values ("+(ultCodParc)+","+codReg+",0, '"+linha[i+13]+"', '"+linha[i+13]+"', 'F',  '"+cep+"','"+telefone+"','"+linha[i+12]+"', getdate(), "
						+ "getdate(), '"+cpf+"', 'S', 'N', 'N', 'N', 'N', 10301000, 0, 'N', 'S', 'N', 'N', 'S', 'N', "
						+ "'N', 0, 'N', 'N', 'N', 'N', 'S', 'N', 'N', 'L', 'N', 'N', 'L', 'N', 'S', 'N', 'N', 'S',"
						+ "'S', 'N', 'X', 0, 'S', 'S', 'P', 'I', 'I', 'I', 'N', 'N', 'N', 0, 'N', 'N',"
						+ "'I', 'I', 'A', 'A', 'N', 'N', 0, 0, 'B', '"+linha[i+12]+"', "+codCid+", "+codEnd+", "+codBai+",3,0, 'ISENTO',"
						+ "'"+sexo+"', '"+linha[10]+"','"+linha[3]+"',1 )", "alter");	

					//insere na tgfctt
					ExecutaComandoNoBanco("insert into tgfctt (codparc, codcontato, nomecontato, telefone, email, codparccad, possuiacessobt,"
							+ "nivelcob, recebeboletoemail, recebenotaemail, socio, recemailimpped, emailrecbol, envianotifcota)"
							+ "values ("+(ultCodParc)+",1, '"+linha[i+13]+"', '"+telefone+"','"+linha[i+12]+"', 0, 'N',  0, 'S', 'S', 'N', 'N', 'N', "
							+ "'N' )", "alter");

					//insere na tgfppa privado
					ExecutaComandoNoBanco("insert into tgfppa (codparc, codcontato, codtipparc, codusu, dtalter, ad_dhalter,"
							+ "ad_codusuinc, ad_codusualter, ad_dtinc)"
							+ "values ("+(ultCodParc)+",0, 10301000, 0, getdate(), getdate(), 0,  0, getdate() )", "alter");

					//insere na tgfppa epi-no
					ExecutaComandoNoBanco("insert into tgfppa (codparc, codcontato, codtipparc, codusu, dtalter, ad_dhalter,"
							+ "ad_codusuinc, ad_codusualter, ad_dtinc)"
							+ "values ("+(ultCodParc)+",0, 30902001, 0, getdate(), getdate(), 0,  0, getdate() )", "alter");

					mensagem.append(ultCodParc+" - "+linha[i+13]+" CPF:"+cpf+" Email: "+linha[i+12]+" Telefone:"+telefone+" - Endereco: "+linha[i+2]+" "+linha[i+9]+" Complemento: "+linha[i+3]+" Bairro: "+linha[i+10]+" - "+linha[i+4]+" - "+linha[i+5]+" - "+linha[i+7]+" CEP: "+cep+"\n");
				    if (codReg == 0) {
				    	mensagem.append("\nE necessario definir a regiao do parceiro: "+ultCodParc+"\n");
				    }
				}
			}
		}catch (Exception e) {
        	//contexto.setMensagemRetorno(mensagem.toString()+e.getMessage());
			System.out.println(e.getMessage());
        }
		//contexto.setMensagemRetorno(mensagem.toString());
		System.out.println(mensagem.toString());
	}
}
		 
		
