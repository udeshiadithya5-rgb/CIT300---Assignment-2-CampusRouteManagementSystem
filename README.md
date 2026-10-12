# 🎓 Campus Route Management System

**CIT300 – Graded Practical Assignment 2**
**Data Structures and Algorithms**

A Java console application demonstrating Array, Stack, Queue, Linked List, Graph (BFS/DFS), and Searching algorithms with performance benchmarking.

---

## 👥 Team Members & Responsibilities

| Name | Student ID | Assigned Responsibility |
|------|-----------|-------------------------|
| K.A.D.U. Adithya | 23DA2-0366 | Array, Searching, Input Validation, Main Integration |
| W.A.M. Maduranga | 23DA2-0155 | Stack & Queue Implementation |
| R.P.G.S. Sandakelum | 23DA2-0216 | Linked List & Performance Comparison |
| H.P.M. Manodhya | 23DA2-0225 | Graph Implementation & BFS/DFS |

---

## 📋 Individual Contributions

### 🧑‍💼 K.A.D.U. Adithya (23DA2-0366) — Leader
**Assigned Responsibility:** Array, Searching, Input Validation, Main Integration

**Individual Contribution:**
- Implemented `ArrayOperations.java` (insert, delete, search, display)
- Implemented `SearchingOperations.java` (Linear vs Binary Search comparison)
- Implemented `InputValidator.java` (numeric + string validation)
- Designed and integrated `Main.java` (9-option menu)
- Led GitHub merging and integration testing

---

### 🧑‍💻 W.A.M. Maduranga (23DA2-0155)
**Assigned Responsibility:** Stack & Queue Implementation

**Individual Contribution:**
- Implemented `StackOperations.java` (push, pop, peek, display with overflow/underflow)
- Implemented `QueueOperations.java` (circular FIFO with enqueue, dequeue, peek, display)
- Tested edge cases (empty, full, circular wraparound)
- Added input validation for both structures

---

### 🧑‍💻 R.P.G.S. Sandakelum (23DA2-0216)
**Assigned Responsibility:** Linked List & Performance Comparison

**Individual Contribution:**
- Implemented `LinkedListOperations.java` (insert begin/end/position, delete, search, display)
- Implemented `PerformanceComparison.java` (benchmarks all structures with `System.nanoTime()`)
- Designed complexity summary table (`generateReport()`)
- Analyzed Big-O results

---

### 🧑‍💻 H.P.M. Manodhya (23DA2-0225)
**Assigned Responsibility:** Graph Implementation & BFS/DFS

**Individual Contribution:**
- Implemented `GraphOperations.java` (adjacency list graph)
- Implemented `addVertex()`, `addEdge()` with duplicate detection
- Implemented `bfs()`, `dfs()`, and `findPath()`
- Tested multi-hop path finding and disconnected vertices

---

## 🗂️ Project Structure

```
CampusRouteManagementSystem/
├── bin/                          # Compiled .class files
├── docs/
│   └── NOTES.md
├── src/
│   ├── array/
│   │   ├── ArrayOperations.java
│   │   └── SearchingOperations.java
│   ├── stack/
│   │   └── StackOperations.java
│   ├── queue/
│   │   └── QueueOperations.java
│   ├── linkedlist/
│   │   └── LinkedListOperations.java
│   ├── graph/
│   │   └── GraphOperations.java
│   ├── performance/
│   │   └── PerformanceComparison.java
│   ├── util/
│   │   └── InputValidator.java
│   └── Main.java
├── .gitignore
├── .project
└── README.md
```

---

## 🛠️ Technologies Used

- **Java** (JDK 8+)
- **OOP** (encapsulation, modularity)
- **Collections** (`java.util.*`)
- **VS Code** (IDE)
- **Git + GitHub** (version control)

---

## ✨ Main Features

1. **Array CRUD** — Insert, delete, search, display
2. **Stack (LIFO)** — Push, pop, peek, display with overflow/underflow handling
3. **Queue (FIFO)** — Enqueue, dequeue, peek, display with circular array
4. **Linked List** — Insert at begin/end/position, delete, search
5. **Searching** — Linear (O(n)) vs Binary (O(log n)) with step counting
6. **Graph** — Add vertex/edge, BFS, DFS, shortest path finder
7. **Performance Comparison** — Nanosecond benchmarks
8. **Complexity Report** — Big-O summary table

---

## 📊 Main Menu

```
==========================================
   CAMPUS ROUTE MANAGEMENT SYSTEM
   CIT300 - Graded Practical Assignment 2
==========================================

==========================================
   DATA STRUCTURE & GRAPH ANALYZER
==========================================

--- MAIN MENU ---
1. Array Operations
2. Stack Operations
3. Queue Operations
4. Linked List Operations
5. Searching Operations
6. Graph Operations
7. Performance Comparison
8. Display All Results
9. Exit
```

---

## 🚀 How to Run

### Step 1: Compile
```bash
javac -d bin src/array/*.java src/stack/*.java src/queue/*.java src/linkedlist/*.java src/graph/*.java src/performance/*.java src/util/*.java src/Main.java
```

### Step 2: Run
```bash
java -cp bin Main
```

### Requirements
- JDK 8 or higher
- Terminal / VS Code

---

## ⚡ Complexity Summary

| Data Structure | Operation | Complexity |
|----------------|-----------|------------|
| Array | Access | O(1) |
| Array | Insert/Delete | O(n) |
| Stack | Push/Pop | O(1) |
| Queue | Enqueue/Dequeue | O(1) |
| Linked List | Insert (begin) | O(1) |
| Linked List | Insert (end) / Search | O(n) |
| Linear Search | — | O(n) |
| Binary Search | — | O(log n) |
| Graph BFS/DFS | — | O(V+E) |

---

## 🔗 GitHub Collaboration

| Branch | Owner | Purpose |
|--------|-------|---------|
| `main` | Adithya | Stable integration |
| `feature/array-searching` | Adithya | Array + Searching |
| `feature/stack-queue` | Maduranga | Stack + Queue |
| `feature/linkedlist-performance` | Sandakelum | Linked List + Benchmarks |
| `feature/graph` | Manodhya | Graph + BFS/DFS |

---

## ✅ Submission Checklist

- [x] Array component
- [x] Stack component
- [x] Queue component
- [x] Linked List component
- [x] Searching functionality
- [x] Graph component (BFS/DFS/Path)
- [x] Performance comparison
- [x] Main integration
- [x] README with all member details
- [x] GitHub collaboration evidence



<div align="center">

**CIT300 – Graded Practical Assignment 2**
**Faculty of Computing and IT**
**Submission Date: 29th September**

</div>
