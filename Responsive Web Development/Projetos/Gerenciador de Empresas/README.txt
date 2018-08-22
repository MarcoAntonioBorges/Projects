Para poder importa os projetos para a sua WorkSpace através do Eclipse siga as Etapas abaixo:

1. Extraia o arquivo compactado que você baixou
2. Inicie seu Eclipse
3. Entre na sua Workspace
4. Vai no menu "File", selecione "Import"
5. Abre a aba "General" 
6. Escolhe "Existing Projects into Workspace", click em "Next"
7. Deixe marcado "Select root directory" caso não esteja marcarda, click em "Browser"
8. Localize o arquivo extraido onde você salvou
9. Desmarque qualquer outra caixa caso estejam selecionadas
10. Click em "Finish".

Pronto! :)



VERIFIQUEM SE TEM O TOMCAT9, CASO NÃO TENHA BASTA BAIXA NESSE SITE: https://tomcat.apache.org/download-90.cgi, É SÓ 
DESCER ATÉ A PARTE QUE TEM A OPÇÃO Core E BAIXAR OU .ZIP OU WINDOWS SERVICE INSTALLER, RECOMENDO BAIXAR O WINDOWS
SERVICE INSTALLER.

OUTRO PONTO IMPORTANTE É VERIFICANDO QUANDO VOCÊ JÁ IMPORTOU A WORKSPACE, VERIFICAR O ARQUIVO servlet-api.jar NO PROJETO
ELE ESTA LOCALIZADO EM WebContent > WEB-INF > lib, CASO ELE ESTEJA JÁ NO PROJETO BASTA O RODAR O PROJETO E CONFIGURAR O TOMCAT 9,
CASO NÃO ESTEJA NO PROJETO VOCÊ PRECISARÁ REFERENCIANDO ESSE ARQUIVO.

PARA CONFIGURAR O TOMCAT 9, VOCÊ RODA O PROJETO ATRAVES DO "Run as" > "Run on Server" 
DEIXA MARCADO A OPÇÃO DE "Manually define a new server" PROCURA A PASTA CHAMADA "Apache" E DENTRO DELA ESCOLHE A OPÇÃO
"Tomcat v9.0 Server" APÓS ISSO BASTA CLICAR EM "Finish" E ELE RODARÁ O PROJETO, CASO ELE DÊ PROBLEMA DE PORTA, VOCÊ 
PODE TENTAR FINALIZAR O BANCO DE DADOS, POIS O BANCO DE DADOS DA ORACLE OCUPA A PORTA 8080, BASTA VOCÊ PROCURAR 
POR "Stop Database" ELE INICIARÁ O SEU CMD E FINALIZAR O BANCO DE DADOS, APÓS ISSO PODERÁ RODAR O PROJETO NOVAMENTE. 









Dúvida?
Contato: mabo.marcoantonio@gmail.com
