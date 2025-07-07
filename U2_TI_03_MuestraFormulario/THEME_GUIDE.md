# Dark/Light Theme Feature

This JavaFX application now includes a dark/light theme toggle button.

## Features

- **Light Theme**: Clean, bright interface with light background and dark text
- **Dark Theme**: Modern dark interface with dark background and light text  
- **Theme Toggle**: Click the toggle button to switch between themes
- **Dynamic Styling**: All UI components adapt to the selected theme

## How to Use

1. Run the application
2. Look for the toggle button labeled "🌙 Dark Mode" or "☀️ Light Mode"
3. Click the button to switch between themes
4. The interface will instantly update with the new theme

## Implementation Details

- Light theme CSS: `src/main/resources/css/light-theme.css`
- Dark theme CSS: `src/main/resources/css/dark-theme.css`
- Theme switching logic in `HelloApplication.java`

## Running the Application

```bash
mvn clean compile
mvn javafx:run
```

The application will start with the light theme by default, and you can toggle to dark mode using the theme switch button.