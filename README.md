# apk-dependency-graph

## Usage

Set different JSON attributes in ./filters/default.json, 'package-name', 'show-inner-classes', 'show-package-dependencies', 'package-prefix' :
```json
{
    "package-name": "(twitter)",
    "show-inner-classes": false,
    "ignored-classes": [".*Dagger.*", ".*Inject.*", ".*ViewBinding$", ".*Factory$", ".*_.*", "^R$", "^R\\$.*"],
    "show-package-dependencies": true,
    "package-prefix": ""
} 
```
```code
package-name: mandatory non empty attribute, filter the package name; for "twitter" all packages like *.twitter.* will be considered,
show-inner-classes: to show inner classes in the APK,
show-package-dependencies: interesting for big APKs as it shows only package-level dependencies without the classes,
package-prefix: this option allows you intelligent zoom on a given subset of packages starting with the prefix set here.
```

*For Windows*:

```shell
run.bat full\path\to\the\apk\app-release.apk full\path\to\the\filterset.json
```
*For Linux*:

```shell
./run.sh full/path/to/the/apk/app-release.apk full/path/to/the/filterset.json
```

## Credits

This is a modified version of the original project : <https://github.com/alexzaitsev/apk-dependency-graph>
It might be intersting to merge this upgrade into the original work !


