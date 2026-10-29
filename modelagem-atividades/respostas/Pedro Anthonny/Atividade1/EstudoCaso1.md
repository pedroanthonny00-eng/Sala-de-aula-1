Atividade 1 — Engenharia de Requisitos

Aluno: Pedro Anthonny


Estudo de Caso 1 — Conecta Campus

1. Concepção

Problema: hoje os serviços acadêmicos da universidade estão espalhados e o sistema atual é lento e difícil de usar. Com isso, alunos, professores e coordenação têm dificuldade para consultar informações, divulgar avisos e se comunicar.

Objetivo principal: criar uma plataforma única, rápida, fácil de usar e segura, onde os alunos consultem notas, horários e avisos, os professores publiquem materiais e comunicados e a coordenação divulgue eventos e informações acadêmicas.

2. Elicitação

Stakeholders:

Alunos;
Professores;
Coordenação;
Universidade ou direção;
Secretaria acadêmica;
Equipe de TI e de desenvolvimento.

Técnicas de elicitação:

1° Entrevistas: conversar individualmente com representantes de cada grupo (alguns alunos, professores, a coordenação e a TI), com um roteiro de perguntas, por exemplo "o que você mais faz no sistema atual?" e "o que mais atrapalha?". Serve para entender as necessidades de cada papel com mais profundidade.

2° Questionários: como há muitos alunos, aplicar um formulário online para saber quais funções mais usam e quais problemas enfrentam. Alcança bastante gente com pouco esforço.

3° Observação: acompanhar alunos e professores usando o sistema atual para ver onde eles travam, em quais telas se perdem e quanto tempo levam em tarefas simples.

3. Análise e modelagem

Requisitos funcionais:

ID	Descrição:

RF01 - O sistema deve permitir que o aluno consulte suas notas.
RF02 - O sistema deve permitir que o aluno consulte seus horários de aula.
RF03 - O sistema deve exibir avisos aos alunos e notificá-los quando houver um novo.
RF04 - O sistema deve permitir que o professor publique materiais de aula para suas turmas.
RF05 - O sistema deve permitir que o professor publique comunicados para suas turmas.
RF06 - O sistema deve permitir que a coordenação divulgue eventos e informações acadêmicas.
RF07 - O sistema deve exigir login (autenticação) de todos os usuários.

Requisitos não funcionais:

ID	Descrição:

RNF01 - Segurança: as informações acadêmicas só podem ser acessadas por usuários autenticados.
RNF02 - Desempenho: as telas devem carregar rápido, mesmo com muitos usuários ao mesmo tempo.
RNF03 - Usabilidade: o sistema deve ser simples, de modo que um aluno novo consiga usar sem treinamento.

4. Negociação (MoSCoW):

Categoria	Itens
Must have - RF07 (login), RF01 (notas), RF02 (horários), RF03 (avisos), RF04 (materiais), RNF01 (segurança), RNF02 (desempenho)
Should have - RF05 (comunicados), RF06 (eventos), RNF03 (usabilidade)
Could have - Notificações push no celular, calendário de eventos integrado
Won't have - Chat entre alunos e professores

Justificativas:

Notas, horários, avisos e materiais são o motivo de existir do sistema, e sem login nada disso pode ser exibido com segurança. Por isso são Must.
Segurança e desempenho também são Must, porque a universidade exige autenticação e a reclamação mais forte dos alunos é a lentidão.
Comunicados e eventos são importantes, mas a primeira versão funciona sem eles, então são Should.
O chat fica como Won't nesta versão. A própria equipe acredita que ele pode atrasar a primeira versão, e ele exige mais trabalho. Pode entrar numa versão futura.

5. Especificação:

A frase "O aplicativo deve ser rápido, seguro e fácil de usar" foi transformada em requisitos mensuráveis:

ID	Requisito:

RNF01 - Desempenho: 95% das telas devem carregar em até 3 segundos com até 1000 usuários simultâneos.

RNF02 - Segurança: nenhuma informação acadêmica pode ser acessada sem login; as senhas devem ser armazenadas com hash e a conta deve ser bloqueada após 5 tentativas erradas.

RNF03 - Usabilidade: 90% dos usuários de teste devem conseguir consultar suas notas em até 3 cliques, sem ajuda.

Como testar:

RNF02 - RNF01 Teste de carga com uma ferramenta como o Apache JMeter, medindo o tempo de resposta.

RNF02 - Tentar abrir páginas internas sem estar logado (deve redirecionar para o login) e errar a senha 5 vezes para ver se bloqueia.

RNF03 - Teste de usabilidade com um grupo de alunos, cronometrando e contando os cliques.

6. Validação:

1° Revisão dos requisitos com os stakeholders: reunião com representantes de alunos, professores e coordenação para ler a lista de requisitos e confirmar se está certa, se falta algo ou se tem algo que não faz sentido. Ajuda a achar erros e omissões antes de desenvolver.

2° Prototipação: montar protótipos das telas e mostrar aos usuários. Ao ver e "mexer" no protótipo, eles percebem mais facilmente o que está diferente do que esperavam.

3° Testes de aceitação: na entrega, os usuários testam o sistema com situações reais e dizem se atende ao que foi combinado.