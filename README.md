# AndroidNote

## Android 的发展和历史

### Android的发展和简介

1. Android 公司的创始人 Andy Rubin
2. Google 收购，Andy Rubin 称为 Android 产品负责人
3. 2007-11-5 发布 Android 1.0 手机操作系统 （没有赢得广泛的市场支持）
4. 2009-5 发布 Android 1.5 —— 提供界面、蓝牙连接支持。吸引大量的开发者目光。
5. 2009-9-22 T-Mobile 在纽约发布第一款 Android 手机—— T-Mobile G1
6. 2010-1-7 Google 发布合作品牌手机 Nexus One(HTC G5)

### 常见的手机系统

- iOS: Appgle 公司的手机、平台操作系统
- Android: Google 开源的手机操作系统，广泛用于TV、手表以及各种可穿戴设备

### 搭载 Android 系统的手机厂商

- 三星
- HTC
- 索尼爱立信
- LG
- 华为
- 联想
- 中兴
- 小米

## Android 5.x 平台架构与特性

> 由操作系统、中间件、用户界面和应用软件组成。它采用软件叠层的方式进行构建。层与层之间相互分离，明确各层的分工。保证了层与层之间的低耦合，当下层的层内与层下发生改变时，上层应用程序无需任何改变。

- 1. **应用程序层**：核心应用程序（Java编写的），编写Android 系统上的应用程序
  - 电子邮件客户端
  - SMS程序
  - 日历
  - 地图
  - 浏览器
  - 联系人
- 2. **应用程序框架**：Android 提供的 API 框架
  - 应用程序开发的基础
  - 发布应用程序的功能模块——遵守框架约定，其他应用程序就可以使用功能模块
- 3. **函数库**：一套被不同组件所使用的 **C/C++ 库的集合**。开发者不能直接调用C/C++库集，但可以用应用程序框架来调用这些库。
  - **系统 C 库**：**标准 C 系统库（libc）**，为嵌入式 Linux 设备调整过
  - 媒体库：基于 **PacketVideo 的 OpenCORE**。支持**播放和录制音乐或视频，以及查看静态图片**。
    - MPEG4、H.264、MP#、AAC、AMR、JPG、PNG
  - **Surface Manager**：管理对显示**子系统的访问**，并可以对多个应用程序的 2D 和 3D 图层提供无缝整合
  - **LibWebCore**: Web浏览器引擎，为**WebView**提供支持。
  - **SGL**：底层的 **2D 图形引擎**
  - **3D libraries**: 基于 **OpenGL ES API** 实现的 3D 系统，使用**硬件 3D 加速**，页可以使用高度优化的**软件 3D 加速**
  - **FreeType**：**位图和向量字体**显示
  - **SQLite**：供应用程序使用的轻量级**关系数据库**
- 4. **Android 运行时**：两部分组成
  - **核心库集**：提供Java语言核心库
  - **虚拟机**：负责运行 Android 应用程序
    - **Dalvik** 虚拟机：采用 **JIT** (Just-in-time)的解释器进行动态编译并执行，因此导致**运行时比较慢**
    - **ART 模式**：用户**安装 APP 时进行预编译**(Ahead-of-time，**AOT**)，将原本程序运行时的编译动作提前到应用安装时，这样程序在运行时**减少动态编译的开销**，从而提升 Android App 的运行效率
      - 安装 APP 时进行 AOT 处理，因此ART 需要占用**更多的存储空间**，应用**安装和系统启动时间会延长不少**
      - 支持 ARM，x86，MIPS架构，并且完全兼容 64 bit 系统
- 5. **Linux kernel**：Android 系统建立在 Linux 2.6 之上。
  - 提供了安全性、内存管理、进程管理、网络协议栈和驱动模型等核心系统服务
  - 系统硬件和软件叠层之间的抽象层

## 搭建 Android 开发环境

### 0. JDK安装并配置

- 环境变量配置：`JAVA_HOME`

### 1. Eclise + ADT

### 2. Android Studio

> Google 基于 IntelliJ IDEA 基础的推出的 Android 开发环境

[Android Studio](http://developer.android.com/sdk/)

- Android Studio 项目相当于一个工作空间，一个工作空间可以包含多个模块，每个模块对应一个 Android 项目

- 新建项目
- 选择 SDK 最低版本要求：**API 21 Android 5.0**
- Activity：与用户交互的组件（界面编程的窗口）

### 下载和安装 Android SDK

> 最新版本的 Android Studio 自动下载的 Android SDK往往不是最新版。

[Anroid SDK 下载](http://www.android.com)

- android-sdk-PLATFORM
  - add-ons: 第三方公司为 Android 平台开发的附加功能系统
  - platforms: 不同版本的 Android 系统
  - tools：开发和调试工具
  - AVD Manager.exe：虚拟设备管理器
  - SDK Manager.exe: SDK 管理器(运行该程序无法显示列表)
    - 1. Tools -> Options (勾选 Force)
    - 2. 修改 windows/System32/drivers/etc/hosts
      - 203.208.46.146 dl.google.com 
      - 203.208.46.146 dl-ssl.google.com
  - docs: SDK开发文件和API文档
  - 