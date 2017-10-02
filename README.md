
# react-native-test-native-module

## Getting started

`$ npm install react-native-test-native-module --save`

### Mostly automatic installation

`$ react-native link react-native-test-native-module`

### Manual installation

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNTestNativeModulePackage;` to the imports at the top of the file
  - Add `new RNTestNativeModulePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-test-native-module'
  	project(':react-native-test-native-module').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-test-native-module/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-test-native-module')
  	```

## Usage
```javascript
import RNTestNativeModule from 'react-native-test-native-module';

// TODO: What to do with the module?
RNTestNativeModule;
```
  