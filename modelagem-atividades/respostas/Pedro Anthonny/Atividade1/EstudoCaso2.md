Estudo de Caso 2 — PetCare

1. Elicitação e stakeholders:

Stakeholder:

Tutores dos animais:
Necessidade - Marcar consultas pelo celular e receber lembretes de vacinação.

Veterinários:
Necessidade - Consultar o histórico do animal e registrar diagnósticos, tratamentos e medicamentos.

Recepção:
Necessidade - Controlar os horários disponíveis e confirmar ou cancelar consultas.

Gerência:
Necessidade - Ver relatórios com a quantidade de atendimentos.

Proprietário da clínica:
Necessidade - Sistema entregue em 4 meses, dentro do orçamento, e que seja "rápido, seguro e fácil de usar".

Equipe de TI/desenvolvimento:
Necessidade - Requisitos claros para conseguir entregar no prazo.

Técnicas de elicitação:

1° Entrevistas: com o proprietário, veterinários, recepcionistas e a gerência, para entender o que cada um precisa e quais são as dores do dia a dia. Escolhi essa técnica porque o grupo é pequeno e cada papel tem necessidades bem diferentes.
2° Observação: acompanhar a rotina da recepção, vendo como os agendamentos são feitos por telefone e WhatsApp. Mostra problemas que as pessoas nem pensam em citar numa conversa, como conflitos de horário.
3° Análise de documentos: olhar as fichas e arquivos de histórico dos animais para ver quais informações são registradas e como, e assim montar o cadastro e o histórico do sistema.

2. Análise e especificação de requisitos

Requisitos funcionais

ID	Descrição:

RF01 - O tutor deve poder agendar consultas pelo aplicativo, escolhendo entre os horários disponíveis.
RF02 - O sistema deve enviar lembretes de vacinação aos tutores.
RF03 - O veterinário deve poder consultar o histórico do animal (consultas, vacinas e medicamentos).
RF04 - O veterinário deve poder registrar diagnósticos, tratamentos e medicamentos de cada consulta.
RF05 - A recepção deve poder controlar os horários disponíveis na agenda.
RF06 - A recepção deve poder confirmar ou cancelar consultas.
RF07 - A gerência deve poder gerar relatórios com a quantidade de atendimentos por período.
RF08 - O sistema deve permitir o cadastro de tutores e de seus animais.

Requisitos não funcionais

ID	Descrição:

RNF01 - Desempenho: as telas principais devem responder em até 2 segundos.
RNF02 - Segurança: os dados dos tutores e dos animais só podem ser acessados por usuários autenticados, de acordo com o seu perfil, seguindo a LGPD.
RNF03 - Usabilidade: um tutor deve conseguir agendar uma consulta sem ajuda e em poucos passos.
RNF04 - Disponibilidade: o sistema deve estar disponível pelo menos 99% do tempo no horário de funcionamento da clínica.

3. Negociação com MoSCoW

Categoria	Funcionalidades:

Must have - Cadastro de tutores e animais (RF08), agendamento pelo app (RF01), controle de agenda (RF05), confirmar/cancelar consultas (RF06), histórico do animal (RF03), registro de diagnósticos e tratamentos (RF04)
Should have - Lembretes de vacinação (RF02), relatórios de atendimentos (RF07)
Could have - Chat com o veterinário
Won't have - Pagamento pelo aplicativo, publicação de fotos dos animais

Justificativas:

Pagamento pelo app (Won't): exige integração com meios de pagamento e cuidados extras de segurança, o que aumenta custo, risco e tempo. Com apenas 4 meses, isso ameaçaria o que é essencial. A clínica já recebe pagamentos de outra forma, então o problema não fica sem solução.
Chat com o veterinário (Could): é útil, mas o contato por WhatsApp já existe e funciona. Exige tempo real e um cuidado com a carga dos veterinários. Só entra se sobrar tempo e orçamento.
Fotos dos animais (Won't): é um recurso "legal", mas não resolve nenhum problema central da clínica. Também traz custos de armazenamento e moderação de conteúdo.
Os itens Must são os que resolvem a dor principal da clínica: agendamentos desorganizados e histórico espalhado em fichas.

4. Especificação de requisitos não funcionais

A frase "O sistema deve ser rápido, seguro e muito fácil de usar" virou:

ID	Requisito	Critério objetivo	Como verificar:

ID - RNF01
Requisito: Desempenho
Critério objetivo: 95% das ações (abrir agenda, buscar histórico, agendar) concluídas em até 2 segundos com até 100 usuários simultâneos.
Como verificar: Teste de carga com ferramenta de testes, medindo o tempo de resposta.

ID - RNF02
Requisito: Segurança
Critério objetivo: Acesso só com login; senhas armazenadas com hash; comunicação criptografada (HTTPS); cada perfil acessa só o que lhe cabe (o tutor vê só os seus animais).
Como verificar: Testes de acesso com cada perfil, verificação do HTTPS e tentativa de acessar dados de outro tutor (deve ser negado).

ID - RNF03
Requisito: Usabilidade
Critério objetivo: 90% dos tutores de teste conseguem agendar uma consulta em até 5 cliques e menos de 2 minutos, sem ajuda.
Como verificar: Teste de usabilidade com tutores reais, cronometrando e anotando as dificuldade

5. Validação dos requisitos

1° Revisão com os stakeholders: reunião com o proprietário, veterinários, recepção e gerência para ler os requisitos, confirmar se estão corretos e completos e se as prioridades fazem sentido. Ajuda a encontrar omissões e divergências antes de começar a programar.

2° Protótipos das telas: mostrar protótipos de agendamento, agenda da recepção e prontuário aos usuários. Ao ver as telas, eles percebem erros e sugerem mudanças que não teriam pensado só lendo o texto.

3° Cenários de uso e critérios de aceitação: descrever situações reais e combinar com os stakeholders o que significa "funcionar". Isso liga os requisitos às expectativas de cada um e serve depois para os testes.

6. Desafio — Priorização da primeira versão

Com orçamento para apenas cinco funcionalidades, escolhi:

1. Cadastro de tutores e animais (com login)

. Necessidade: base para todo o resto, já que sem saber quem é o tutor e qual é o animal não dá para agendar nem registrar nada.

. Beneficiados: todos os usuários.
. Por que na 1ª versão: as outras funções dependem dele.

2. Agendamento de consultas pelo aplicativo

. Necessidade: hoje os agendamentos são por telefone e WhatsApp, o que é desorganizado.

. Beneficiados: tutores (mais comodidade) e recepção (menos ligações e mensagens).

. Por que na 1ª versão: é o principal pedido dos tutores e o que mais muda a rotina da clínica.

3. Controle de agenda e confirmação/cancelamento pela recepção

. Necessidade: ver os horários disponíveis e evitar conflitos.

. Beneficiados: recepção e tutores.

. Por que na 1ª versão: sem ele o agendamento pelo app não funciona direito, pois os dois precisam andar juntos.

4. Histórico clínico do animal (consulta e registro de diagnósticos, tratamentos e medicamentos)

. Necessidade: acabar com as fichas e arquivos separados, que dificultam achar consultas, vacinas e remédios.

. Beneficiados: veterinários (atendimento mais seguro e rápido) e os animais.

. Por que na 1ª versão: é a segunda grande dor da clínica e afeta a qualidade do atendimento.

5. Lembretes de vacinação

. Necessidade: os tutores querem ser avisados, e a clínica quer que eles voltem no prazo certo.

. Beneficiados: tutores, animais e a clínica (retorno de clientes).

. Por que na 1ª versão: tem bom resultado para o custo, pois usa os dados que o histórico já guarda.

Ficaram para depois e os riscos de adiar:

. Relatórios para a gerência: a gerência fica sem uma visão consolidada, mas pode contar os atendimentos manualmente a partir dos dados do sistema por um tempo.

. Pagamento pelo app: continua sendo feito presencialmente, com risco de filas e de menos praticidade, mas sem prejuízo ao atendimento.

. Chat com o veterinário: os tutores continuam usando o WhatsApp, o que mantém mensagens fora do sistema.

. Fotos dos animais: risco baixo, pois não afeta nenhum processo importante da clínica.