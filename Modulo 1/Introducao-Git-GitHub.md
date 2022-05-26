# Introdução ao GIT e ao GITHUB

Você possui a disponibilidade de manter versões dos arquivos em cronologias diferentes em um só lugar e dividir com outras pessoas.
Primero veremos o Git, um software de versionamento de código.

Foco em aprender:
1. Controle de versão
2. Armazenamento em nuvem
3. Trabalho em equipe
4. Melhorar seu código
5. Reconhecimento 

GUI (Graphic User Interface) X CLI (Comand Line Interface) 

Um tem o programa responsivo e interage com comandos de clicar arrastar e etc, o outro funciona através de códigos.

O que vamos ver nessa aula:
- Mudar de pastas
- Listar as pastas
- Criar as pastas/arquivos
- Deletar pastas / arquivos


- Dir: é uma lista de diretórios na pasta em que estamos
- cd: é o change directory e muda de pasta que estamos 
	- O comando "cd .. " volta para o diretório anterior. 
	- O comando cls é clear screen e limpa a tela do terminal
	- O TAB é auto completar então escreve as letras e aperta TAB e ele completa as informações
- mkdir: é o make directory e você cria pastas
	- os prompts de comando utilizam-se de ideias como o silent on sucsess, ou seja se deu certo não aparece nada
	- O comando echo é imprimir uma frase no diretório e se usar o redirecionador de fluxo ">" e coloca o nome e a extensão do arquivo criando um doc com a frase do echo antes, ex:  "C:\workspace>echo hello > hello.txt".
- del: no windows deleta todo o conteúdo de um repositório,
	- A seta direcional para cima no teclado mostra os últimos comandos utilizados 
- rmdir  para deletar uma pasta no terminal

Como funciona o GIT

O GIT utiliza-se de criptografia com o SHA 1, Secure Hash Algorithm, que é um conjunto de funções hash projetada pela NSA, agencia de segurança Norte Americana. A encriptação gera um conjunto de 40 digitos.

GitBASH - é uma ferramenta que unifica os comandos para serem os mesmos tanto em Windows como em Unix. 
$ openssl sha1 texto.txt ele transforma o doc nesse hash encriptografado.

Objetos no GIT que são responsáveis por versionar o código: BLOBS, TREES e COMMITS.

Exemplo BLOBS:


O stdin é uma flag para mostrar para a função que realmente estamos enviando texto e não um arquivo como esperado.


Os arquivos são salvos dentro dos Blobs e é composto por
-  tipo do Objeto 
- O tamanho 
- o \0
- E por fim o conteúdo
NO exemplo anterior veja que os sha1 estão diferentes um começa por fc31 e o outro começa por 65b.


Veja que quando colocamos os metadados no openssl ele permanece o mesmo.

Exemplo de Tree:

O Tree é o arquivo que reúne vários Blobs e é a responsável por mostrar a estrutura dos arquivos, portanto também pode mostrar outras Trees.

Repare que na estrutura mostra o sha1 e o texto do arquivo, uma vez alterado a bolha o sha1 da arvore também altera.



Exemplo de COMMIT:

Por fim o mais importante de todos os objetos, pois ele aponta:
Uma Tree
Parente, ultimo commit realizado antes dele.
Autor.
Mensagem.
Timestamp, carimbo de tempo.

Commits também tem sha1, ou seja se mudar qualquer coisa nos metadados do commit seja na Tree ou no Blob é alterado no sha1.



Chaves SSH e Tokens

A chave SSH é uma forma de estabelecer uma conexão segura e encriptada entre duas máquinas. 

No github a chave fica, accont > settings > SSH and GPG Keys



Você entra no git bash e escreve a linha de codigo:

$ ssh-keygen -t ed25519 -C fgabech@hotmail.comcomo pedir uma chave SSH com os seus dados.
e ele vai responder
Generating public/private ed25519 key pair.
Enter file in which to save the key (/c/Users/fgabe/.ssh/id_ed25519): - os dois pontos no final da linha significa que a pasta é oculta.
Enter same passphrase again:
Your identification has been saved in /c/Users/fgabe/.ssh/id_ed25519
Your public key has been saved in /c/Users/fgabe/.ssh/id_ed25519.pub
The key fingerprint is:
SHA256:OCxFy9jxmoG0q4v+UYwpOqvpouBDoqqP9rqa4VHKCHQ fgabech@hotmail.com
The key's randomart image is:
+--[ED25519 256]--+
|    . o          |
|   . B +         |
| . E+ * .        |
|. . ++ =         |
|.. +oo* S        |
|*.+... .         |
|X+..             |
|*@...            |
|^OOo             |
+----[SHA256]-----+

Mais comandos;

- ls - É o comando que lista as pastas, docs e arquivos na pasta em que estamos usando.
- cat "nome do arquivo" - mostra o conteudo de um dos documentos 
- pwd - mostra o caminho completo para chegar no local onde estamos vendo os arquivos
- $ eval $(ssh-agent -s) - retorna o valor de um agente pid

Tendo a maquina configurada com os protocolos SSH, e querendo colonar uma pasta no github você precisa entrar com os comandos: 
- git clone "pegar na pagina do github as informações de ssh ex: git@github.com: perkles/perkles..." 

---


Iniciando com o GIT


Quando estamos usando o terminal temos que colocar o nome do programa na frente, então todos os comando do git começam com git e depois o comando.

- git init, cria um repositório de git em uma pasta (diretório) especifica.
	- Quando criamos o diretório ele cria uma pasta oculta .git que não podemos ver, agora para podemos ver a pasta precisamos usar a flag -a no comando ls ex: $ls -a 
	- No git  o comando ctrl + l limpa a tela do terminal 
- git add
- git commit com uma flag "-m" comando para colocar as informações do commit.
	- $ git commit -m "commit inicial"
	- [master (root-commit) ba7f124] commit inicial - ai temos os primeiros caracteres do sha1   / essa é a mensagem que nos escrevemos
	-  1 file changed, 25 insertions(+)
	-  create mode 100644 strogonoff.md
- Para alterar configurações utilizamos o git config, e esse comando pode ser para alterar o git como um todo (usando a flag --global) ou para alterar um diretório especifico (usando a flag --????) ex: $ git config --global user.email "fgabech@hotmail.com"

Tipos de arquivo no git - no meio o navegador e os tipos de arquivo Markdown e HTML

- marcadores de edição do texto que nem whatsapp: **Negrito** e _italico_
- Para fazer Unorder list é só colocar "- " traço com um espaço antes do texto que ele faz a lista.
- Para fazer uma lista ordenada "1. " o numero com ponto e espaço.

Os arquivos untracked o git anda não tem ciencia deles, e os arquivos tracked são os que o git tem conhecimento.

Staged são arquivos que estão sendo preparados para fazer parte de outro tipo de agrupamento. 

1. Quando nós criamos um arquivo com o git innit ele aparece como untracked
2. Quando usamos o git add nós movemos ele de untracked para Tracked 
3. Quando o git pega a chave sha1 do arquivo e vê que ele não possui nenhuma alteração ele  é arquivado como unmodified, se o sha for alterado o git compara os dois valeres e envia para modified
4. Se usarmos git add no arquivo modfied ele migra para staged
5. Se nos removermos o arquivo unmodified ele vai para untracked
6. ele está se preparando para virar um commit, ou seja se nos enveloparmos os arquivos e colocarmos mensagem e informações como abaixo ele retorna para unmodfied, como se o git tivesse tirado uma "foto do doc"



O que é um repositório? 



1. É o seu computador 
2. são os arquivos que estão na maquinas e estão prontos para passarem para o commit
3. São todos os arquivos "commitados" 
4. É o repositório remoto um servidor fora do seu computador





- $ git status Mostra todos os status dos arquivos na pasta do git como o exemplo abaixo:
	On branch master
	nothing to commit, working tree clean
	
$ git status
On branch master
Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    strogonoff.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        receitas/
	
- $ mv strogonoff.md ./receitas/ - comando de mover arquivos para dentro da pasta / local de destino do arquivo

Exemplo de git commit:
$ git commit -m "cria pasta receitas, move arquivos para receitas"
[master 70f0d28] cria pasta receitas, move arquivos para receitas
 1 file changed, 0 insertions(+), 0 deletions(-)
 rename strogonoff.md => receitas/strogonoff.md (100%)

- $ git add * - Pega tudo o que foi modificado na working space e adiciona.
- $ git config --list - mostra a lista de todas as configurações do git 
- $ git config -- global -- unset "e a configuração que você deseja mudar exemplo user.name e user.email" - ele retira as configurações globais.
- $ git config -- global  "e a configuração que você deseja mudar exemplo user.name e user.email" e entre parênteses "O que você quer alterar exemplo fgabech e fgabech@hotmail.com" - e você cadastra seus dados 
- $ git remote add origin "+link" - adiciona um repositório remoto

Os arquivo de inicialização dos repositórios do Github é um arquivo chamado README

Como ocorrem os problemas no git hub?


Quando você tem um arquivo no Github e alguém copia o seu arquivo e os dois fazem modificação, o Github retorna o erro de que os arquivos estão diferentes. Abaixo ex:




- $ git clone https://github.com/python/cpython.git- clona um repositório no github.
- $ ls - a - mostra arquivos e pastas ocultas no local de trabalho
- $ git remote -v - mostra aonde o repositório está apontado.

---

Desafio Git /GitHub


- $ echo > Dicas-gerais-de-um-bootcamp.md - cria o arquivo: Dicas-gerais-de-um-bootcamp.md
- $ git status - mostra o status da pasta que você está utilizando, no caso abaixo mostra que os arquivos que eu criei não estão tracked.
	- $ git status
	- On branch main
	- Your branch is up to date with 'origin/main'.
	- 
	- Untracked files:
	-   (use "git add <file>..." to include in what will be committed)
	-         Dicas-gerais-de-um-bootcamp.md
	-         Historia-da-Computacao.md
	-         Introducao-Git-GitHub.md
	-         Markdow-Sheet.md
	-         Pensamento-computacional.md
	- 
	- nothing added to commit but untracked files present (use "git add" to track)
- $ git add . - para adicionat todos os arquivos untracked
	- warning: LF will be replaced by CRLF in Dicas-gerais-de-um-bootcamp.md.
	- The file will have its original line endings in your working directory
	- warning: LF will be replaced by CRLF in Historia-da-Computacao.md.
	- The file will have its original line endings in your working directory
	- warning: LF will be replaced by CRLF in Introducao-Git-GitHub.md.
	- The file will have its original line endings in your working directory
	- warning: LF will be replaced by CRLF in Markdow-Sheet.md.
	- The file will have its original line endings in your working directory
	- warning: LF will be replaced by CRLF in Pensamento-computacional.md.
	- The file will have its original line endings in your working directory
- $ git status - para verificar se os arquivos foram adicionados ao meu reposit´rio no github
	- On branch main
	- Your branch is up to date with 'origin/main'.
	- 
	- Changes to be committed:
	-   (use "git restore --staged <file>..." to unstage)
	-         new file:   Dicas-gerais-de-um-bootcamp.md
	-         new file:   Historia-da-Computacao.md
	-         new file:   Introducao-Git-GitHub.md
	-         new file:   Markdow-Sheet.md
	-         new file:   Pensamento-computacional.md
- $ git commit -m "Inclusão das anotações do curso que eu fiz do Git/GitHub" - para fazer o commit que estamos alterando o repositório com arquivos
	- [main 5cc2b2a] Inclusão das anotações do curso que eu fiz do Git/GitHub
	-  5 files changed, 5 insertions(+)
	-  create mode 100644 Dicas-gerais-de-um-bootcamp.md
	-  create mode 100644 Historia-da-Computacao.md
	-  create mode 100644 Introducao-Git-GitHub.md
	-  create mode 100644 Markdow-Sheet.md
	-  create mode 100644 Pensamento-computacional.md
- $ git status - para verificar aonde estamos
	- On branch main
	- Your branch is ahead of 'origin/main' by 1 commit.
	-   (use "git push" to publish your local commits)
	- 
	- nothing to commit, working tree clean
- $ git push origin main - para enviar para o repositório remoto no github
	- Enumerating objects: 4, done.
	- Counting objects: 100% (4/4), done.
	- Delta compression using up to 4 threads
	- Compressing objects: 100% (2/2), done.
	- Writing objects: 100% (3/3), 417 bytes | 417.00 KiB/s, done.
	- Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
	- To https://github.com/FGabech/Dio-desafio-github-primeiro-repositorio.git
	-    a5b2a56..5cc2b2a  main -> main
