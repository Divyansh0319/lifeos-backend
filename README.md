# 🚀 LifeOS Backend

> A modern, modular backend powering **LifeOS** — a Personal Growth & Productivity Platform built with Spring Boot.

---

## 📖 About

LifeOS is designed to help users manage every important area of life from one place.

Instead of using multiple applications for habits, tasks, goals, learning, fitness, finance, and journaling, LifeOS provides a unified, customizable experience.

Users can enable only the modules they need, creating a personalized productivity system.

---

## ✨ Features

### Authentication
- JWT Authentication
- Refresh Token
- Role-Based Authorization
- Secure Password Encryption

### Productivity
- Habit Tracker
- Task Management
- Goal Management
- Calendar
- Dashboard

### Analytics
- Productivity Analytics
- Habit Streaks
- Weekly Reports
- Monthly Reports

### Health
- Workout Tracking *(Planned)*
- Nutrition *(Planned)*
- Sleep Tracking *(Planned)*

### Learning
- Reading Tracker *(Planned)*
- Study Planner *(Planned)*

### Finance
- Expense Tracker *(Planned)*
- Budget Planner *(Planned)*

---

## 🏗 Architecture

The project follows a **modular architecture**, where each feature is developed independently.

Example:

```
habit
├── controller
├── dto
│   ├── request
│   └── response
├── entity
├── mapper
├── repository
├── service
│   └── impl
├── validation
└── exception
```

---

## 🛠 Tech Stack

### Backend

- Java 21
- Spring Boot 3
- Spring Security
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Lombok
- Docker
- OpenAPI / Swagger

---

## 📂 Project Status

| Module | Status |
|---------|--------|
| Foundation | 🟢 In Progress |
| Authentication | ⚪ Planned |
| User | ⚪ Planned |
| Habit | ⚪ Planned |
| Task | ⚪ Planned |
| Goal | ⚪ Planned |
| Dashboard | ⚪ Planned |
| Analytics | ⚪ Planned |

---

## 🚀 Getting Started

### Clone Repository

```bash
git clone https://github.com/YOUR_USERNAME/lifeos-backend.git
```

### Configure Environment

Copy:

```
application-dev.example.yml
```

to

```
application-dev.yml
```

Update your PostgreSQL username and password.

### Run

```bash
mvn spring-boot:run
```

---

## 📚 API Documentation

After starting the application:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 📈 Roadmap

### Version 1.0

- Authentication
- User Module
- Habit Tracker
- Task Management
- Goal Management
- Dashboard

### Version 2.0

- Health
- Learning
- Finance
- Journal

### Version 3.0

- AI Coach
- Smart Analytics
- Notifications
- Gamification

---

## 🤝 Contributing

Currently under active development.

Contributions will be welcome after Version 1.0.

---

## 📜 License

MIT License

---

⭐ If you like this project, consider giving it a star.
