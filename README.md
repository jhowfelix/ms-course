# Projeto desenvolvido durante o curso de microsserviços com java, spring boot e spring cloud. O projeto consiste em calcular o valor total de um funcionário, simples, porém utilizando comunicação entre api, docker, oauth2 e mais algumas tecnologias.

					Microsserviços: Orientado a produto
Coeso (Responsabilidade reduzidas / especializado)
Desacoplado
Independentes 
1.	Banco de dados próprio.
2.	Tecnologias/linguagens próprias.
3.	Governança própria.
Infraestrutura automatizada
Desenhado para falhar: Às vezes um micro serviço pode estar fora do ar, então é necessário evitar falhas em cascatas. 
Design evolutivo. 

Rest Template/Feing: Utilizados para comunicação entre APIS

RIBBON: Serve para balancear a comunicação entre os microsserviços

EUREKA SERVER: Um serviço rest que é usado, principalemnte na nuvem AWS, que localiza serviços e balancea carga e failover de servidores.

API GATEWAY: Funciona como uma camada de segurança, ele gerencia e roteia as chamadas, além de encontrar a melhor instância de um microsserviços para fazer a requisição. 

Autenticação e Autorização: O mais interessante, foi distinguir um do outro, a autenticação é quando o sistema reconhece quem você é (User, password.), já a autorização, é quando o sistema decide se você tem autorização para realizar x requisição.

Além de tudo, tive meu primeiro contato com a tecnologia Docker, que é utilizada para virtualização, podendo criar imagens de aplicações transformando as em "containers", isso facilitou muito para aprender sobre comunicação entre APIS.

Aqui estão o link do repositório do projeto desenvolvido durante o curso: https://github.com/jhowfelix/ms-course
Repositório de configuração contendo os perfis de properties: https://github.com/jhowfelix/ms-course-configs


