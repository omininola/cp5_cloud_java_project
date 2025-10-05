# 🏠 SafeHub

Sistema para gestão de abrigos emergenciais, oferecendo controle de ocupação, estoque, localização e administração em situações de emergência.

---

### 👥 Integrantes do Grupo

| Nome             | RM     | Sala    |
|------------------|--------|---------|
| Julia Monteiro   | 557023 | 2TDSPV  |
| Victor Henrique  | 556206 | 2TDSPH  |
| Sofia Petruk     | 556585 | 2TDSPV  |

---

### 💡 Sobre o Projeto

O **SafeHub** é um aplicativo mobile com foco em eficiência e segurança na administração de abrigos temporários. Sua interface intuitiva facilita o acompanhamento em tempo real da capacidade e necessidades de cada abrigo.

---

### ✨ Funcionalidades

- Cadastro e Login de Usuário
- Cadastro e Edição de Abrigos:
  - Nome, capacidade, localização e responsável
- Controle de Estoque:
  - Alimentos, roupas, medicamentos, água e pessoas
  - Edição e exclusão de itens
- Configurações e Gerenciamento:
  - Atualização de dados do usuário e abrigo
  - Exclusão de conta e abrigo (com confirmação)
- Segurança:
  - Validação para evitar exceder a capacidade máxima
  - Confirmações obrigatórias antes de ações críticas

---

### 🔍 Solução Proposta

Criar uma ferramenta digital completa que otimize a gestão de abrigos emergenciais, com foco em usabilidade, geolocalização, estoque e segurança, permitindo tomada de decisões ágeis em momentos de crise.

---

### 🛠️ Status de Desenvolvimento

- ✅ Backend estruturado com Spring Boot 3
- ✅ Funcionalidades básicas implementadas
- 🔄 Em desenvolvimento:
  - Integração com IoT para monitoramento físico
  - Interface web administrativa
  - Reconhecimento de imagem para controle de acesso (visão computacional)

---

### 🧰 Tecnologias Utilizadas

- ⚙️ Java 17
- 🚀 Spring Boot 3.5.0
- 🗃️ Spring Data JPA
- 🔐 Spring Security + JWT (JJWT)
- ✅ Bean Validation (javax.validation)
- 🧪 Oracle JDBC (ojdbc11 – compatível com Oracle 11g+)
- 📖 Swagger/OpenAPI (springdoc)
- 💡 Lombok
- ♻️ Spring DevTools

---


### 🚧 Build & Deploy
- CI/CD: Link do Builder ou Render (https://safehub-gs.onrender.com)
- Documentação Swagger: (https://safehub-gs.onrender.com/swagger-ui/index.html)

---

### 🛠️ Como Rodar o Projeto

#### ✅ Pré-requisitos

- IntelliJ IDEA
- JDK 17+
- Oracle Database 11g ou superior
- Maven

#### 📥 Clonar o Repositório

```bash
git clone https://github.com/sofiapetruk/safehub.git
cd safehub
