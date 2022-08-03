# Renna

## O Projeto
Esse é um projeto Back-end Webservices que controla o Feed de uma rede social onde contem diversos usuarios realizando posts e comentando no mesmo.

## 📋 Pré-requsitos

### Instalar o MongoDB

- https://www.mongodb.com/try/download/community

### Java Zulu: 

- https://cdn.azul.com/zulu/bin/zulu18.32.11-ca-jdk18.0.2-win_x64.msi

## 🔧 Instruções 

### Instalar o MongoDB

Baixar e realizar a instalação com opção "Complete"

https://docs.mongodb.com/manual/tutorial/install-mongodb-on-windows/ -> Set up the MongoDB environment

Criar pasta C:\data\db

Acrescentar em PATH: C:\Program Files\MongoDB\Server\3.6\bin (adapte para sua versão).

Testar no terminal: mongod

### Instalar o Zulu

Baixar e realiza a instalação marcando a opção JAVA_HOME para instalação.

Verificar se foi registrando a variavel de ambiente, caso contrario registrar.

### Package

Baixar o App: https://drive.google.com/file/d/1ksB3ZgnOM93DtTnblxUev-dl6ZDDMeTC/view

Alocar os arquivos em questão e abrir o Executavel.bat.

## ⚙️ Usabilidade (Requisições) 

`GET` Users

```yaml

Buscar todos:
localhost:8080/users
```
```yaml
Buscar pelo ID:
localhost:8080/users/{ID}
Exemplo:
localhost:8080/users/62eaab9a8950645017822f2f
```
```yaml
Buscar post de um determinado usuario:
localhost:8080/users/{id}/posts
Exemplo:
localhost:8080/users/62eaab9a8950645017822f2f/posts
```
____________________________________________________________________________________________________________________

`POST` Users

```yaml
Inserir um novo usuario:
localhost:8080/users/
Enviar no Body em formto JSON:
{
"name" : "Alice",
"email" : "Alice@gmail.com"
}
```
____________________________________________________________________________________________________________________
`PUT` Users
```yaml
Alterar um usuario existente:
localhost:8080/users/62eaab9a8950645017822f2f

Enviar no Body em formto JSON:
{
"name" : "Alice",
"email" : "Alice@gmail.com"
}
```
____________________________________________________________________________________________________________________
`DELETE` Users
```yaml
localhost:8080/users/{ID}
Exemplo:
localhost:8080/users/62eaab9a8950645017822f2f
```
____________________________________________________________________________________________________________________
`GET` Posts
```yaml
Buscar pelo ID:
localhost:8080/posts/{ID}
Exemplo:
localhost:8080/posts/62eaab9a8950645017822f32
```
```yaml
Buscar pelo titulo do post:
localhost:8080/posts/titlesearch?text={TITULO}
Exemplo:
localhost:8080/posts/titlesearch?text=Partiu
```
```yaml
Busca completa:
localhost:8080/posts/fullsearch?text={Conteudo de um comentario}&maxDat={DATA}
Exemplo:
localhost:8080/posts/fullsearch?text=Que%daora&maxDate=2022-08-03
```

## 🛠️ Construído com

* [SpringToolsSuite4](https://spring.io/guides/gs/sts/) - O framework web usado
* [Maven](https://maven.apache.org/) - Gerente de Dependência


## 🎁 Expressões de gratidão

* Gostaria de agradecer ao professor Nelio Alves por oferecer um curso que trás além de conteúdo super atualizado uma formula de ensino que já nos apresenta às boas práticas do desenvolvimento de software, sem falar na excelente didática.
Github do mesmo:

[Git](https://github.com/acenelio)

## Licença

The scripts and documentation in this project are released under the [MIT License](license)
