# 🎟️ Venuo – Event Ticket Booking Platform

A full-stack web application that enables users to discover events, purchase tickets, and manage bookings through a secure and scalable platform.

## 🚀 Features

* Browse and search events
* View event details and ticket availability
* Purchase tickets securely
* Generate QR-code-based tickets
* Authenticate users with Keycloak and JWT
* Manage events and bookings through REST APIs

## 🛠️ Tech Stack

**Backend:** Java, Spring Boot, Spring Security, JPA, PostgreSQL

**Frontend:** React, TypeScript, Vite

**Tools:** Docker, Keycloak, Maven, Git

## 📂 Project Structure

```text
Venuo/
├── backend/              # Spring Boot REST API
│   ├── src/
│   ├── pom.xml
│   └── ...
│
├── frontend/             # React + TypeScript application
│   ├── src/
│   ├── public/
│   ├── package.json
│   └── ...
│
└── README.md
```

## ⚡ Getting Started

### Clone the Repository

```bash
git clone https://github.com/saipriyak2/Venuo.git
cd Venuo
```

### Start Services

```bash
docker compose up -d
```

### Run Backend

```bash
mvn spring-boot:run
```

### Run Frontend

```bash
npm install
npm run dev
```

## 📌 Key Highlights

* Built RESTful APIs using Spring Boot
* Implemented secure authentication and authorization
* Designed a PostgreSQL-backed data model
* Generated QR codes for ticket validation
* Developed a responsive React user interface

## 📜 License

This project is licensed under the [MIT License](LICENSE).

---

## 👨‍💻 Author

**Saipriya Kaja**
- 📧 [saipriya.k50@gmail.com](mailto:saipriya.k50@gmail.com)
- 🔗 [GitHub](https://github.com/saipriyak2)
