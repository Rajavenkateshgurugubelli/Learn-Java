# Module 06: Concurrency and Threading

Learn how to write multi-threaded applications to perform tasks in parallel.

## 🎯 Objectives
- Create threads using `Thread` class and `Runnable` interface.
- Manage thread safety with `synchronized`.
- Use the **Executor Framework** for thread pooling.
- Perform asynchronous tasks with `CompletableFuture`.
- Explore **Virtual Threads** (Java 21).

## 📂 Content Overview

| File | Description |
|---|---|
| `BasicThreads.java` | Starting threads manually. |
| `Synchronization.java` | Preventing race conditions. |
| `ExecutorsFramework.java` | Managing pools of threads. |
| `CompletableFutureExample.java` | Async programming (Promises). |
| `VirtualThreads.java` | Lightweight threads for high-throughput apps. |

## 🚀 Key Concepts
- **Thread**: A lightweight process.
- **Race Condition**: When multiple threads access shared data simultaneously, leading to unpredictable results.
- **Deadlock**: When two threads wait for each other forever.
- **Virtual Threads**: Project Loom features that allow millions of lightweight threads.
