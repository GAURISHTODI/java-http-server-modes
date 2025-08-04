# Java Web Server – Single-threaded, Multi-threaded, and Thread Pool

This project demonstrates the core architecture of HTTP web servers in Java using three different concurrency models:

- 🧵 Single-threaded
- 🧶 Multi-threaded (1 thread per request)
- ⚙️ Thread Pool using `ExecutorService`

It includes benchmarking with **Apache JMeter** to analyze performance across models with **50,000 concurrent requests**.

---

## 🧠 Key Concepts Used

- `ServerSocket`, `Socket` for low-level networking
- `Runnable` interface for thread logic
- `ExecutorService`, `Executors.newFixedThreadPool()` for thread pool
- `BufferedReader`, `PrintWriter` for request/response I/O
- `Content-Length`, `HTTP/1.1` protocol basics
- Apache **JMeter** for load testing and benchmarking

---

## 📂 Folder Structure

