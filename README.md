# MUTLAQ Studio

A modern Android application for photo prints, Arabic calligraphy, and custom artwork.

## 📱 Application Overview

MUTLAQ Studio is a comprehensive mobile application that offers three main services:

### 1. Photo Prints
- Upload and print high-quality photos
- Multiple size options
- Various paper quality choices
- Direct delivery to your address

### 2. Arabic Calligraphy
- Browse beautiful Arabic calligraphy designs
- Custom text to calligraphy conversion
- Multiple style options
- Frame and material selection

### 3. Custom Artwork
- Request personalized artwork
- Collaborate with artists
- Track artwork progress
- Digital preview before finalization

## 🎨 Design Guidelines

### Color Palette
- **Primary Color:** Deep maroon (#800000 to #4C0A0A)
  - Used for backgrounds and main accents
  - Creates a luxurious and sophisticated feel
- **Secondary Color:** Soft cream (#FDEEE2 to #FFF5EC)
  - Used for text boxes, panels, and highlights
  - Provides contrast and readability
- **Accent Color:** Golden beige (#F2D1B3 to #EEC39A)
  - Used for important text and highlights
  - Adds elegance to the design

### Typography
- **Brand/Heading Font:** 
  - Elegant script or serif font (e.g., Playfair Display, Great Vibes)
  - Gold-beige color for main logo text
- **Body/Labels Font:**
  - Clean, modern sans-serif (e.g., Montserrat, Poppins)
  - Cream or light beige color for readability

### Layout Structure
1. **Top Section (Branding)**
   - Centered brand name in elegant script
   - Solid maroon background
   - Subtle animations for engagement

2. **Main Content**
   - Large, rounded-rectangle cards for categories
   - Consistent spacing and margins
   - Clear visual hierarchy

3. **Product Details**
   - Prominent product images
   - Clean, organized information layout
   - Clear call-to-action buttons

### UI Components
- **Buttons:** Rounded corners with hover effects
- **Cards:** Subtle shadows and borders
- **Navigation:** Bottom bar or top navigation
- **Icons:** Minimal, line-based design in gold/beige

### User Experience
- Smooth transitions between screens
- Consistent spacing and alignment
- High contrast for readability
- Intuitive navigation flow
- Elegant animations and effects

## 🔄 Application Flow

### User Journey
1. **Authentication**
   - Sign up/Login
   - Profile creation
   - Address management

2. **Home Screen**
   - Featured categories
   - Recent works
   - Special offers
   - Quick access to all services

3. **Service Selection**
   - Choose between Photo Prints, Calligraphy, or Custom Art
   - View service details and pricing
   - Select customization options

4. **Order Process**
   - Add items to cart
   - Review order
   - Select delivery address
   - Payment processing
   - Order confirmation

5. **Order Tracking**
   - View order status
   - Track delivery
   - Download digital proofs
   - Rate and review

## 🛠 Technical Architecture

### Frontend
- **UI Framework**: Jetpack Compose
- **Design System**: Material 3
- **Navigation**: Navigation Compose
- **State Management**: ViewModel + StateFlow

### Backend Integration
- **API Communication**: Retrofit
- **Image Loading**: Coil
- **Data Storage**: Room Database
- **Authentication**: JWT Token

## 📋 Project Structure

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/mutlaq_studio/
│   │   │   ├── data/
│   │   │   │   ├── api/          # API services
│   │   │   │   ├── model/        # Data models
│   │   │   │   └── repository/   # Data repositories
│   │   │   ├── di/               # Dependency injection
│   │   │   ├── ui/
│   │   │   │   ├── screens/      # App screens
│   │   │   │   ├── components/   # Reusable components
│   │   │   │   └── theme/        # App theme
│   │   │   └── utils/            # Utility classes
│   │   └── res/                  # Resources
```

## 🚀 Getting Started

### Prerequisites
- Android Studio Arctic Fox or newer
- JDK 11 or newer
- Android SDK 33 or newer

### Installation
1. Clone the repository
   ```bash
   git clone https://github.com/alameed143/Mutlaq-studio.git
   ```

2. Open the project in Android Studio

3. Sync Gradle files

4. Build and run the application

## 🔑 Key Features

### User Management
- Secure authentication
- Profile management
- Address book
- Order history

### Shopping Experience
- Intuitive navigation
- Real-time cart updates
- Multiple payment options
- Order tracking

### Customization
- Photo size selection
- Calligraphy style options
- Artwork customization
- Frame selection

## 📱 Screenshots

(Coming soon)

## 📄 License

Copyright (c) 2024 MUTLAQ Studio. All Rights Reserved.

This software and associated documentation files (the "Software") are the exclusive property of MUTLAQ Studio and its designer. The Software is protected by copyright laws and international copyright treaties, as well as other intellectual property laws and treaties.

No part of this Software may be reproduced, distributed, or transmitted in any form or by any means, including photocopying, recording, or other electronic or mechanical methods, without the prior written permission of MUTLAQ Studio.

## 👥 Contributing

For any inquiries about contributing or licensing, please contact MUTLAQ Studio.

## 🙏 Acknowledgments

- Material Design for UI components
- Android Jetpack for modern Android development tools
- The Android community for their valuable resources and support 