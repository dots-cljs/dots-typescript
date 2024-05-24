(ns dots.typescript.server.protocol.compiler-options)

(defn allow-js?
  ^js [compiler-options]
  (.-allowJs ^js compiler-options))

(defn set-allow-js!
  ^js [compiler-options value]
  (set! (.-allowJs ^js compiler-options) value))

(defn allow-synthetic-default-imports?
  ^js [compiler-options]
  (.-allowSyntheticDefaultImports ^js compiler-options))

(defn set-allow-synthetic-default-imports!
  ^js [compiler-options value]
  (set! (.-allowSyntheticDefaultImports ^js compiler-options) value))

(defn allow-unreachable-code?
  ^js [compiler-options]
  (.-allowUnreachableCode ^js compiler-options))

(defn set-allow-unreachable-code!
  ^js [compiler-options value]
  (set! (.-allowUnreachableCode ^js compiler-options) value))

(defn allow-unused-labels?
  ^js [compiler-options]
  (.-allowUnusedLabels ^js compiler-options))

(defn set-allow-unused-labels!
  ^js [compiler-options value]
  (set! (.-allowUnusedLabels ^js compiler-options) value))

(defn always-strict?
  ^js [compiler-options]
  (.-alwaysStrict ^js compiler-options))

(defn set-always-strict!
  ^js [compiler-options value]
  (set! (.-alwaysStrict ^js compiler-options) value))

(defn base-url
  ^js [compiler-options]
  (.-baseUrl ^js compiler-options))

(defn set-base-url!
  ^js [compiler-options value]
  (set! (.-baseUrl ^js compiler-options) value))

(defn charset
  ^js [compiler-options]
  (.-charset ^js compiler-options))

(defn set-charset!
  ^js [compiler-options value]
  (set! (.-charset ^js compiler-options) value))

(defn check-js?
  ^js [compiler-options]
  (.-checkJs ^js compiler-options))

(defn set-check-js!
  ^js [compiler-options value]
  (set! (.-checkJs ^js compiler-options) value))

(defn declaration?
  ^js [compiler-options]
  (.-declaration ^js compiler-options))

(defn set-declaration!
  ^js [compiler-options value]
  (set! (.-declaration ^js compiler-options) value))

(defn declaration-dir
  ^js [compiler-options]
  (.-declarationDir ^js compiler-options))

(defn set-declaration-dir!
  ^js [compiler-options value]
  (set! (.-declarationDir ^js compiler-options) value))

(defn disable-size-limit?
  ^js [compiler-options]
  (.-disableSizeLimit ^js compiler-options))

(defn set-disable-size-limit!
  ^js [compiler-options value]
  (set! (.-disableSizeLimit ^js compiler-options) value))

(defn downlevel-iteration?
  ^js [compiler-options]
  (.-downlevelIteration ^js compiler-options))

(defn set-downlevel-iteration!
  ^js [compiler-options value]
  (set! (.-downlevelIteration ^js compiler-options) value))

(defn emit-bom?
  ^js [compiler-options]
  (.-emitBOM ^js compiler-options))

(defn set-emit-bom!
  ^js [compiler-options value]
  (set! (.-emitBOM ^js compiler-options) value))

(defn emit-decorator-metadata?
  ^js [compiler-options]
  (.-emitDecoratorMetadata ^js compiler-options))

(defn set-emit-decorator-metadata!
  ^js [compiler-options value]
  (set! (.-emitDecoratorMetadata ^js compiler-options) value))

(defn experimental-decorators?
  ^js [compiler-options]
  (.-experimentalDecorators ^js compiler-options))

(defn set-experimental-decorators!
  ^js [compiler-options value]
  (set! (.-experimentalDecorators ^js compiler-options) value))

(defn force-consistent-casing-in-file-names?
  ^js [compiler-options]
  (.-forceConsistentCasingInFileNames ^js compiler-options))

(defn set-force-consistent-casing-in-file-names!
  ^js [compiler-options value]
  (set! (.-forceConsistentCasingInFileNames ^js compiler-options) value))

(defn import-helpers?
  ^js [compiler-options]
  (.-importHelpers ^js compiler-options))

(defn set-import-helpers!
  ^js [compiler-options value]
  (set! (.-importHelpers ^js compiler-options) value))

(defn inline-source-map?
  ^js [compiler-options]
  (.-inlineSourceMap ^js compiler-options))

(defn set-inline-source-map!
  ^js [compiler-options value]
  (set! (.-inlineSourceMap ^js compiler-options) value))

(defn inline-sources?
  ^js [compiler-options]
  (.-inlineSources ^js compiler-options))

(defn set-inline-sources!
  ^js [compiler-options value]
  (set! (.-inlineSources ^js compiler-options) value))

(defn isolated-modules?
  ^js [compiler-options]
  (.-isolatedModules ^js compiler-options))

(defn set-isolated-modules!
  ^js [compiler-options value]
  (set! (.-isolatedModules ^js compiler-options) value))

(defn jsx
  ^js [compiler-options]
  (.-jsx ^js compiler-options))

(defn set-jsx!
  ^js [compiler-options value]
  (set! (.-jsx ^js compiler-options) value))

(defn lib
  ^js [compiler-options]
  (.-lib ^js compiler-options))

(defn set-lib!
  ^js [compiler-options value]
  (set! (.-lib ^js compiler-options) value))

(defn locale
  ^js [compiler-options]
  (.-locale ^js compiler-options))

(defn set-locale!
  ^js [compiler-options value]
  (set! (.-locale ^js compiler-options) value))

(defn map-root
  ^js [compiler-options]
  (.-mapRoot ^js compiler-options))

(defn set-map-root!
  ^js [compiler-options value]
  (set! (.-mapRoot ^js compiler-options) value))

(defn max-node-module-js-depth
  ^js [compiler-options]
  (.-maxNodeModuleJsDepth ^js compiler-options))

(defn set-max-node-module-js-depth!
  ^js [compiler-options value]
  (set! (.-maxNodeModuleJsDepth ^js compiler-options) value))

(defn module
  ^js [compiler-options]
  (.-module ^js compiler-options))

(defn set-module!
  ^js [compiler-options value]
  (set! (.-module ^js compiler-options) value))

(defn module-resolution
  ^js [compiler-options]
  (.-moduleResolution ^js compiler-options))

(defn set-module-resolution!
  ^js [compiler-options value]
  (set! (.-moduleResolution ^js compiler-options) value))

(defn new-line
  ^js [compiler-options]
  (.-newLine ^js compiler-options))

(defn set-new-line!
  ^js [compiler-options value]
  (set! (.-newLine ^js compiler-options) value))

(defn no-emit?
  ^js [compiler-options]
  (.-noEmit ^js compiler-options))

(defn set-no-emit!
  ^js [compiler-options value]
  (set! (.-noEmit ^js compiler-options) value))

(defn no-emit-helpers?
  ^js [compiler-options]
  (.-noEmitHelpers ^js compiler-options))

(defn set-no-emit-helpers!
  ^js [compiler-options value]
  (set! (.-noEmitHelpers ^js compiler-options) value))

(defn no-emit-on-error?
  ^js [compiler-options]
  (.-noEmitOnError ^js compiler-options))

(defn set-no-emit-on-error!
  ^js [compiler-options value]
  (set! (.-noEmitOnError ^js compiler-options) value))

(defn no-error-truncation?
  ^js [compiler-options]
  (.-noErrorTruncation ^js compiler-options))

(defn set-no-error-truncation!
  ^js [compiler-options value]
  (set! (.-noErrorTruncation ^js compiler-options) value))

(defn no-fallthrough-cases-in-switch?
  ^js [compiler-options]
  (.-noFallthroughCasesInSwitch ^js compiler-options))

(defn set-no-fallthrough-cases-in-switch!
  ^js [compiler-options value]
  (set! (.-noFallthroughCasesInSwitch ^js compiler-options) value))

(defn no-implicit-any?
  ^js [compiler-options]
  (.-noImplicitAny ^js compiler-options))

(defn set-no-implicit-any!
  ^js [compiler-options value]
  (set! (.-noImplicitAny ^js compiler-options) value))

(defn no-implicit-returns?
  ^js [compiler-options]
  (.-noImplicitReturns ^js compiler-options))

(defn set-no-implicit-returns!
  ^js [compiler-options value]
  (set! (.-noImplicitReturns ^js compiler-options) value))

(defn no-implicit-this?
  ^js [compiler-options]
  (.-noImplicitThis ^js compiler-options))

(defn set-no-implicit-this!
  ^js [compiler-options value]
  (set! (.-noImplicitThis ^js compiler-options) value))

(defn no-unused-locals?
  ^js [compiler-options]
  (.-noUnusedLocals ^js compiler-options))

(defn set-no-unused-locals!
  ^js [compiler-options value]
  (set! (.-noUnusedLocals ^js compiler-options) value))

(defn no-unused-parameters?
  ^js [compiler-options]
  (.-noUnusedParameters ^js compiler-options))

(defn set-no-unused-parameters!
  ^js [compiler-options value]
  (set! (.-noUnusedParameters ^js compiler-options) value))

(defn no-implicit-use-strict?
  ^js [compiler-options]
  (.-noImplicitUseStrict ^js compiler-options))

(defn set-no-implicit-use-strict!
  ^js [compiler-options value]
  (set! (.-noImplicitUseStrict ^js compiler-options) value))

(defn no-lib?
  ^js [compiler-options]
  (.-noLib ^js compiler-options))

(defn set-no-lib!
  ^js [compiler-options value]
  (set! (.-noLib ^js compiler-options) value))

(defn no-resolve?
  ^js [compiler-options]
  (.-noResolve ^js compiler-options))

(defn set-no-resolve!
  ^js [compiler-options value]
  (set! (.-noResolve ^js compiler-options) value))

(defn out
  ^js [compiler-options]
  (.-out ^js compiler-options))

(defn set-out!
  ^js [compiler-options value]
  (set! (.-out ^js compiler-options) value))

(defn out-dir
  ^js [compiler-options]
  (.-outDir ^js compiler-options))

(defn set-out-dir!
  ^js [compiler-options value]
  (set! (.-outDir ^js compiler-options) value))

(defn out-file
  ^js [compiler-options]
  (.-outFile ^js compiler-options))

(defn set-out-file!
  ^js [compiler-options value]
  (set! (.-outFile ^js compiler-options) value))

(defn paths
  ^js [compiler-options]
  (.-paths ^js compiler-options))

(defn set-paths!
  ^js [compiler-options value]
  (set! (.-paths ^js compiler-options) value))

(defn plugins
  ^js [compiler-options]
  (.-plugins ^js compiler-options))

(defn set-plugins!
  ^js [compiler-options value]
  (set! (.-plugins ^js compiler-options) value))

(defn preserve-const-enums?
  ^js [compiler-options]
  (.-preserveConstEnums ^js compiler-options))

(defn set-preserve-const-enums!
  ^js [compiler-options value]
  (set! (.-preserveConstEnums ^js compiler-options) value))

(defn preserve-symlinks?
  ^js [compiler-options]
  (.-preserveSymlinks ^js compiler-options))

(defn set-preserve-symlinks!
  ^js [compiler-options value]
  (set! (.-preserveSymlinks ^js compiler-options) value))

(defn project
  ^js [compiler-options]
  (.-project ^js compiler-options))

(defn set-project!
  ^js [compiler-options value]
  (set! (.-project ^js compiler-options) value))

(defn react-namespace
  ^js [compiler-options]
  (.-reactNamespace ^js compiler-options))

(defn set-react-namespace!
  ^js [compiler-options value]
  (set! (.-reactNamespace ^js compiler-options) value))

(defn remove-comments?
  ^js [compiler-options]
  (.-removeComments ^js compiler-options))

(defn set-remove-comments!
  ^js [compiler-options value]
  (set! (.-removeComments ^js compiler-options) value))

(defn references
  ^js [compiler-options]
  (.-references ^js compiler-options))

(defn set-references!
  ^js [compiler-options value]
  (set! (.-references ^js compiler-options) value))

(defn root-dir
  ^js [compiler-options]
  (.-rootDir ^js compiler-options))

(defn set-root-dir!
  ^js [compiler-options value]
  (set! (.-rootDir ^js compiler-options) value))

(defn root-dirs
  ^js [compiler-options]
  (.-rootDirs ^js compiler-options))

(defn set-root-dirs!
  ^js [compiler-options value]
  (set! (.-rootDirs ^js compiler-options) value))

(defn skip-lib-check?
  ^js [compiler-options]
  (.-skipLibCheck ^js compiler-options))

(defn set-skip-lib-check!
  ^js [compiler-options value]
  (set! (.-skipLibCheck ^js compiler-options) value))

(defn skip-default-lib-check?
  ^js [compiler-options]
  (.-skipDefaultLibCheck ^js compiler-options))

(defn set-skip-default-lib-check!
  ^js [compiler-options value]
  (set! (.-skipDefaultLibCheck ^js compiler-options) value))

(defn source-map?
  ^js [compiler-options]
  (.-sourceMap ^js compiler-options))

(defn set-source-map!
  ^js [compiler-options value]
  (set! (.-sourceMap ^js compiler-options) value))

(defn source-root
  ^js [compiler-options]
  (.-sourceRoot ^js compiler-options))

(defn set-source-root!
  ^js [compiler-options value]
  (set! (.-sourceRoot ^js compiler-options) value))

(defn strict?
  ^js [compiler-options]
  (.-strict ^js compiler-options))

(defn set-strict!
  ^js [compiler-options value]
  (set! (.-strict ^js compiler-options) value))

(defn strict-null-checks?
  ^js [compiler-options]
  (.-strictNullChecks ^js compiler-options))

(defn set-strict-null-checks!
  ^js [compiler-options value]
  (set! (.-strictNullChecks ^js compiler-options) value))

(defn suppress-excess-property-errors?
  ^js [compiler-options]
  (.-suppressExcessPropertyErrors ^js compiler-options))

(defn set-suppress-excess-property-errors!
  ^js [compiler-options value]
  (set! (.-suppressExcessPropertyErrors ^js compiler-options) value))

(defn suppress-implicit-any-index-errors?
  ^js [compiler-options]
  (.-suppressImplicitAnyIndexErrors ^js compiler-options))

(defn set-suppress-implicit-any-index-errors!
  ^js [compiler-options value]
  (set! (.-suppressImplicitAnyIndexErrors ^js compiler-options) value))

(defn use-define-for-class-fields?
  ^js [compiler-options]
  (.-useDefineForClassFields ^js compiler-options))

(defn set-use-define-for-class-fields!
  ^js [compiler-options value]
  (set! (.-useDefineForClassFields ^js compiler-options) value))

(defn target
  ^js [compiler-options]
  (.-target ^js compiler-options))

(defn set-target!
  ^js [compiler-options value]
  (set! (.-target ^js compiler-options) value))

(defn trace-resolution?
  ^js [compiler-options]
  (.-traceResolution ^js compiler-options))

(defn set-trace-resolution!
  ^js [compiler-options value]
  (set! (.-traceResolution ^js compiler-options) value))

(defn resolve-json-module?
  ^js [compiler-options]
  (.-resolveJsonModule ^js compiler-options))

(defn set-resolve-json-module!
  ^js [compiler-options value]
  (set! (.-resolveJsonModule ^js compiler-options) value))

(defn types
  ^js [compiler-options]
  (.-types ^js compiler-options))

(defn set-types!
  ^js [compiler-options value]
  (set! (.-types ^js compiler-options) value))

(defn type-roots
  "Paths used to used to compute primary types search locations"
  ^js [compiler-options]
  (.-typeRoots ^js compiler-options))

(defn set-type-roots!
  "Paths used to used to compute primary types search locations"
  ^js [compiler-options value]
  (set! (.-typeRoots ^js compiler-options) value))
