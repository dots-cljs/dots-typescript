(ns dots.typescript.compiler-options)

(defn allow-importing-ts-extensions?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-allowImportingTsExtensions ^js compiler-options))

(defn set-allow-importing-ts-extensions!
  ^js [compiler-options value]
  (set! (.-allowImportingTsExtensions ^js compiler-options) value))

(defn allow-js?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-allowJs ^js compiler-options))

(defn set-allow-js!
  ^js [compiler-options value]
  (set! (.-allowJs ^js compiler-options) value))

(defn allow-arbitrary-extensions?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-allowArbitraryExtensions ^js compiler-options))

(defn set-allow-arbitrary-extensions!
  ^js [compiler-options value]
  (set! (.-allowArbitraryExtensions ^js compiler-options) value))

(defn allow-synthetic-default-imports?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-allowSyntheticDefaultImports ^js compiler-options))

(defn set-allow-synthetic-default-imports!
  ^js [compiler-options value]
  (set! (.-allowSyntheticDefaultImports ^js compiler-options) value))

(defn allow-umd-global-access?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-allowUmdGlobalAccess ^js compiler-options))

(defn set-allow-umd-global-access!
  ^js [compiler-options value]
  (set! (.-allowUmdGlobalAccess ^js compiler-options) value))

(defn allow-unreachable-code?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-allowUnreachableCode ^js compiler-options))

(defn set-allow-unreachable-code!
  ^js [compiler-options value]
  (set! (.-allowUnreachableCode ^js compiler-options) value))

(defn allow-unused-labels?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-allowUnusedLabels ^js compiler-options))

(defn set-allow-unused-labels!
  ^js [compiler-options value]
  (set! (.-allowUnusedLabels ^js compiler-options) value))

(defn always-strict?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-alwaysStrict ^js compiler-options))

(defn set-always-strict!
  ^js [compiler-options value]
  (set! (.-alwaysStrict ^js compiler-options) value))

(defn base-url
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-baseUrl ^js compiler-options))

(defn set-base-url!
  ^js [compiler-options value]
  (set! (.-baseUrl ^js compiler-options) value))

(defn charset
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-charset ^js compiler-options))

(defn set-charset!
  ^js [compiler-options value]
  (set! (.-charset ^js compiler-options) value))

(defn check-js?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-checkJs ^js compiler-options))

(defn set-check-js!
  ^js [compiler-options value]
  (set! (.-checkJs ^js compiler-options) value))

(defn custom-conditions
  "**Returns:** `string[] | undefined`"
  ^js [compiler-options]
  (.-customConditions ^js compiler-options))

(defn set-custom-conditions!
  ^js [compiler-options value]
  (set! (.-customConditions ^js compiler-options) value))

(defn declaration?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-declaration ^js compiler-options))

(defn set-declaration!
  ^js [compiler-options value]
  (set! (.-declaration ^js compiler-options) value))

(defn declaration-map?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-declarationMap ^js compiler-options))

(defn set-declaration-map!
  ^js [compiler-options value]
  (set! (.-declarationMap ^js compiler-options) value))

(defn emit-declaration-only?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-emitDeclarationOnly ^js compiler-options))

(defn set-emit-declaration-only!
  ^js [compiler-options value]
  (set! (.-emitDeclarationOnly ^js compiler-options) value))

(defn declaration-dir
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-declarationDir ^js compiler-options))

(defn set-declaration-dir!
  ^js [compiler-options value]
  (set! (.-declarationDir ^js compiler-options) value))

(defn disable-size-limit?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-disableSizeLimit ^js compiler-options))

(defn set-disable-size-limit!
  ^js [compiler-options value]
  (set! (.-disableSizeLimit ^js compiler-options) value))

(defn disable-source-of-project-reference-redirect?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-disableSourceOfProjectReferenceRedirect ^js compiler-options))

(defn set-disable-source-of-project-reference-redirect!
  ^js [compiler-options value]
  (set! (.-disableSourceOfProjectReferenceRedirect ^js compiler-options) value))

(defn disable-solution-searching?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-disableSolutionSearching ^js compiler-options))

(defn set-disable-solution-searching!
  ^js [compiler-options value]
  (set! (.-disableSolutionSearching ^js compiler-options) value))

(defn disable-referenced-project-load?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-disableReferencedProjectLoad ^js compiler-options))

(defn set-disable-referenced-project-load!
  ^js [compiler-options value]
  (set! (.-disableReferencedProjectLoad ^js compiler-options) value))

(defn downlevel-iteration?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-downlevelIteration ^js compiler-options))

(defn set-downlevel-iteration!
  ^js [compiler-options value]
  (set! (.-downlevelIteration ^js compiler-options) value))

(defn emit-bom?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-emitBOM ^js compiler-options))

(defn set-emit-bom!
  ^js [compiler-options value]
  (set! (.-emitBOM ^js compiler-options) value))

(defn emit-decorator-metadata?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-emitDecoratorMetadata ^js compiler-options))

(defn set-emit-decorator-metadata!
  ^js [compiler-options value]
  (set! (.-emitDecoratorMetadata ^js compiler-options) value))

(defn exact-optional-property-types?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-exactOptionalPropertyTypes ^js compiler-options))

(defn set-exact-optional-property-types!
  ^js [compiler-options value]
  (set! (.-exactOptionalPropertyTypes ^js compiler-options) value))

(defn experimental-decorators?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-experimentalDecorators ^js compiler-options))

(defn set-experimental-decorators!
  ^js [compiler-options value]
  (set! (.-experimentalDecorators ^js compiler-options) value))

(defn force-consistent-casing-in-file-names?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-forceConsistentCasingInFileNames ^js compiler-options))

(defn set-force-consistent-casing-in-file-names!
  ^js [compiler-options value]
  (set! (.-forceConsistentCasingInFileNames ^js compiler-options) value))

(defn ignore-deprecations
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-ignoreDeprecations ^js compiler-options))

(defn set-ignore-deprecations!
  ^js [compiler-options value]
  (set! (.-ignoreDeprecations ^js compiler-options) value))

(defn import-helpers?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-importHelpers ^js compiler-options))

(defn set-import-helpers!
  ^js [compiler-options value]
  (set! (.-importHelpers ^js compiler-options) value))

(defn imports-not-used-as-values
  "**Returns:** `ImportsNotUsedAsValues | undefined`"
  ^js [compiler-options]
  (.-importsNotUsedAsValues ^js compiler-options))

(defn set-imports-not-used-as-values!
  ^js [compiler-options value]
  (set! (.-importsNotUsedAsValues ^js compiler-options) value))

(defn inline-source-map?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-inlineSourceMap ^js compiler-options))

(defn set-inline-source-map!
  ^js [compiler-options value]
  (set! (.-inlineSourceMap ^js compiler-options) value))

(defn inline-sources?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-inlineSources ^js compiler-options))

(defn set-inline-sources!
  ^js [compiler-options value]
  (set! (.-inlineSources ^js compiler-options) value))

(defn isolated-modules?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-isolatedModules ^js compiler-options))

(defn set-isolated-modules!
  ^js [compiler-options value]
  (set! (.-isolatedModules ^js compiler-options) value))

(defn jsx
  "**Returns:** `JsxEmit | undefined`"
  ^js [compiler-options]
  (.-jsx ^js compiler-options))

(defn set-jsx!
  ^js [compiler-options value]
  (set! (.-jsx ^js compiler-options) value))

(defn keyof-strings-only?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-keyofStringsOnly ^js compiler-options))

(defn set-keyof-strings-only!
  ^js [compiler-options value]
  (set! (.-keyofStringsOnly ^js compiler-options) value))

(defn lib
  "**Returns:** `string[] | undefined`"
  ^js [compiler-options]
  (.-lib ^js compiler-options))

(defn set-lib!
  ^js [compiler-options value]
  (set! (.-lib ^js compiler-options) value))

(defn locale
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-locale ^js compiler-options))

(defn set-locale!
  ^js [compiler-options value]
  (set! (.-locale ^js compiler-options) value))

(defn map-root
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-mapRoot ^js compiler-options))

(defn set-map-root!
  ^js [compiler-options value]
  (set! (.-mapRoot ^js compiler-options) value))

(defn max-node-module-js-depth
  "**Returns:** `number | undefined`"
  ^js [compiler-options]
  (.-maxNodeModuleJsDepth ^js compiler-options))

(defn set-max-node-module-js-depth!
  ^js [compiler-options value]
  (set! (.-maxNodeModuleJsDepth ^js compiler-options) value))

(defn module
  "**Returns:** `ModuleKind | undefined`"
  ^js [compiler-options]
  (.-module ^js compiler-options))

(defn set-module!
  ^js [compiler-options value]
  (set! (.-module ^js compiler-options) value))

(defn module-resolution
  "**Returns:** `ModuleResolutionKind | undefined`"
  ^js [compiler-options]
  (.-moduleResolution ^js compiler-options))

(defn set-module-resolution!
  ^js [compiler-options value]
  (set! (.-moduleResolution ^js compiler-options) value))

(defn module-suffixes
  "**Returns:** `string[] | undefined`"
  ^js [compiler-options]
  (.-moduleSuffixes ^js compiler-options))

(defn set-module-suffixes!
  ^js [compiler-options value]
  (set! (.-moduleSuffixes ^js compiler-options) value))

(defn module-detection
  "**Returns:** `ModuleDetectionKind | undefined`"
  ^js [compiler-options]
  (.-moduleDetection ^js compiler-options))

(defn set-module-detection!
  ^js [compiler-options value]
  (set! (.-moduleDetection ^js compiler-options) value))

(defn new-line
  "**Returns:** `NewLineKind | undefined`"
  ^js [compiler-options]
  (.-newLine ^js compiler-options))

(defn set-new-line!
  ^js [compiler-options value]
  (set! (.-newLine ^js compiler-options) value))

(defn no-emit?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noEmit ^js compiler-options))

(defn set-no-emit!
  ^js [compiler-options value]
  (set! (.-noEmit ^js compiler-options) value))

(defn no-emit-helpers?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noEmitHelpers ^js compiler-options))

(defn set-no-emit-helpers!
  ^js [compiler-options value]
  (set! (.-noEmitHelpers ^js compiler-options) value))

(defn no-emit-on-error?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noEmitOnError ^js compiler-options))

(defn set-no-emit-on-error!
  ^js [compiler-options value]
  (set! (.-noEmitOnError ^js compiler-options) value))

(defn no-error-truncation?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noErrorTruncation ^js compiler-options))

(defn set-no-error-truncation!
  ^js [compiler-options value]
  (set! (.-noErrorTruncation ^js compiler-options) value))

(defn no-fallthrough-cases-in-switch?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noFallthroughCasesInSwitch ^js compiler-options))

(defn set-no-fallthrough-cases-in-switch!
  ^js [compiler-options value]
  (set! (.-noFallthroughCasesInSwitch ^js compiler-options) value))

(defn no-implicit-any?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noImplicitAny ^js compiler-options))

(defn set-no-implicit-any!
  ^js [compiler-options value]
  (set! (.-noImplicitAny ^js compiler-options) value))

(defn no-implicit-returns?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noImplicitReturns ^js compiler-options))

(defn set-no-implicit-returns!
  ^js [compiler-options value]
  (set! (.-noImplicitReturns ^js compiler-options) value))

(defn no-implicit-this?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noImplicitThis ^js compiler-options))

(defn set-no-implicit-this!
  ^js [compiler-options value]
  (set! (.-noImplicitThis ^js compiler-options) value))

(defn no-strict-generic-checks?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noStrictGenericChecks ^js compiler-options))

(defn set-no-strict-generic-checks!
  ^js [compiler-options value]
  (set! (.-noStrictGenericChecks ^js compiler-options) value))

(defn no-unused-locals?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noUnusedLocals ^js compiler-options))

(defn set-no-unused-locals!
  ^js [compiler-options value]
  (set! (.-noUnusedLocals ^js compiler-options) value))

(defn no-unused-parameters?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noUnusedParameters ^js compiler-options))

(defn set-no-unused-parameters!
  ^js [compiler-options value]
  (set! (.-noUnusedParameters ^js compiler-options) value))

(defn no-implicit-use-strict?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noImplicitUseStrict ^js compiler-options))

(defn set-no-implicit-use-strict!
  ^js [compiler-options value]
  (set! (.-noImplicitUseStrict ^js compiler-options) value))

(defn no-property-access-from-index-signature?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noPropertyAccessFromIndexSignature ^js compiler-options))

(defn set-no-property-access-from-index-signature!
  ^js [compiler-options value]
  (set! (.-noPropertyAccessFromIndexSignature ^js compiler-options) value))

(defn assume-changes-only-affect-direct-dependencies?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-assumeChangesOnlyAffectDirectDependencies ^js compiler-options))

(defn set-assume-changes-only-affect-direct-dependencies!
  ^js [compiler-options value]
  (set! (.-assumeChangesOnlyAffectDirectDependencies ^js compiler-options) value))

(defn no-lib?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noLib ^js compiler-options))

(defn set-no-lib!
  ^js [compiler-options value]
  (set! (.-noLib ^js compiler-options) value))

(defn no-resolve?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noResolve ^js compiler-options))

(defn set-no-resolve!
  ^js [compiler-options value]
  (set! (.-noResolve ^js compiler-options) value))

(defn no-unchecked-indexed-access?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noUncheckedIndexedAccess ^js compiler-options))

(defn set-no-unchecked-indexed-access!
  ^js [compiler-options value]
  (set! (.-noUncheckedIndexedAccess ^js compiler-options) value))

(defn out
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-out ^js compiler-options))

(defn set-out!
  ^js [compiler-options value]
  (set! (.-out ^js compiler-options) value))

(defn out-dir
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-outDir ^js compiler-options))

(defn set-out-dir!
  ^js [compiler-options value]
  (set! (.-outDir ^js compiler-options) value))

(defn out-file
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-outFile ^js compiler-options))

(defn set-out-file!
  ^js [compiler-options value]
  (set! (.-outFile ^js compiler-options) value))

(defn paths
  "**Returns:** `MapLike<string[]> | undefined`"
  ^js [compiler-options]
  (.-paths ^js compiler-options))

(defn set-paths!
  ^js [compiler-options value]
  (set! (.-paths ^js compiler-options) value))

(defn preserve-const-enums?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-preserveConstEnums ^js compiler-options))

(defn set-preserve-const-enums!
  ^js [compiler-options value]
  (set! (.-preserveConstEnums ^js compiler-options) value))

(defn no-implicit-override?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-noImplicitOverride ^js compiler-options))

(defn set-no-implicit-override!
  ^js [compiler-options value]
  (set! (.-noImplicitOverride ^js compiler-options) value))

(defn preserve-symlinks?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-preserveSymlinks ^js compiler-options))

(defn set-preserve-symlinks!
  ^js [compiler-options value]
  (set! (.-preserveSymlinks ^js compiler-options) value))

(defn preserve-value-imports?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-preserveValueImports ^js compiler-options))

(defn set-preserve-value-imports!
  ^js [compiler-options value]
  (set! (.-preserveValueImports ^js compiler-options) value))

(defn project
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-project ^js compiler-options))

(defn set-project!
  ^js [compiler-options value]
  (set! (.-project ^js compiler-options) value))

(defn react-namespace
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-reactNamespace ^js compiler-options))

(defn set-react-namespace!
  ^js [compiler-options value]
  (set! (.-reactNamespace ^js compiler-options) value))

(defn jsx-factory
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-jsxFactory ^js compiler-options))

(defn set-jsx-factory!
  ^js [compiler-options value]
  (set! (.-jsxFactory ^js compiler-options) value))

(defn jsx-fragment-factory
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-jsxFragmentFactory ^js compiler-options))

(defn set-jsx-fragment-factory!
  ^js [compiler-options value]
  (set! (.-jsxFragmentFactory ^js compiler-options) value))

(defn jsx-import-source
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-jsxImportSource ^js compiler-options))

(defn set-jsx-import-source!
  ^js [compiler-options value]
  (set! (.-jsxImportSource ^js compiler-options) value))

(defn composite?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-composite ^js compiler-options))

(defn set-composite!
  ^js [compiler-options value]
  (set! (.-composite ^js compiler-options) value))

(defn incremental?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-incremental ^js compiler-options))

(defn set-incremental!
  ^js [compiler-options value]
  (set! (.-incremental ^js compiler-options) value))

(defn ts-build-info-file
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-tsBuildInfoFile ^js compiler-options))

(defn set-ts-build-info-file!
  ^js [compiler-options value]
  (set! (.-tsBuildInfoFile ^js compiler-options) value))

(defn remove-comments?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-removeComments ^js compiler-options))

(defn set-remove-comments!
  ^js [compiler-options value]
  (set! (.-removeComments ^js compiler-options) value))

(defn resolve-package-json-exports?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-resolvePackageJsonExports ^js compiler-options))

(defn set-resolve-package-json-exports!
  ^js [compiler-options value]
  (set! (.-resolvePackageJsonExports ^js compiler-options) value))

(defn resolve-package-json-imports?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-resolvePackageJsonImports ^js compiler-options))

(defn set-resolve-package-json-imports!
  ^js [compiler-options value]
  (set! (.-resolvePackageJsonImports ^js compiler-options) value))

(defn root-dir
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-rootDir ^js compiler-options))

(defn set-root-dir!
  ^js [compiler-options value]
  (set! (.-rootDir ^js compiler-options) value))

(defn root-dirs
  "**Returns:** `string[] | undefined`"
  ^js [compiler-options]
  (.-rootDirs ^js compiler-options))

(defn set-root-dirs!
  ^js [compiler-options value]
  (set! (.-rootDirs ^js compiler-options) value))

(defn skip-lib-check?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-skipLibCheck ^js compiler-options))

(defn set-skip-lib-check!
  ^js [compiler-options value]
  (set! (.-skipLibCheck ^js compiler-options) value))

(defn skip-default-lib-check?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-skipDefaultLibCheck ^js compiler-options))

(defn set-skip-default-lib-check!
  ^js [compiler-options value]
  (set! (.-skipDefaultLibCheck ^js compiler-options) value))

(defn source-map?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-sourceMap ^js compiler-options))

(defn set-source-map!
  ^js [compiler-options value]
  (set! (.-sourceMap ^js compiler-options) value))

(defn source-root
  "**Returns:** `string | undefined`"
  ^js [compiler-options]
  (.-sourceRoot ^js compiler-options))

(defn set-source-root!
  ^js [compiler-options value]
  (set! (.-sourceRoot ^js compiler-options) value))

(defn strict?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-strict ^js compiler-options))

(defn set-strict!
  ^js [compiler-options value]
  (set! (.-strict ^js compiler-options) value))

(defn strict-function-types?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-strictFunctionTypes ^js compiler-options))

(defn set-strict-function-types!
  ^js [compiler-options value]
  (set! (.-strictFunctionTypes ^js compiler-options) value))

(defn strict-bind-call-apply?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-strictBindCallApply ^js compiler-options))

(defn set-strict-bind-call-apply!
  ^js [compiler-options value]
  (set! (.-strictBindCallApply ^js compiler-options) value))

(defn strict-null-checks?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-strictNullChecks ^js compiler-options))

(defn set-strict-null-checks!
  ^js [compiler-options value]
  (set! (.-strictNullChecks ^js compiler-options) value))

(defn strict-property-initialization?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-strictPropertyInitialization ^js compiler-options))

(defn set-strict-property-initialization!
  ^js [compiler-options value]
  (set! (.-strictPropertyInitialization ^js compiler-options) value))

(defn strip-internal?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-stripInternal ^js compiler-options))

(defn set-strip-internal!
  ^js [compiler-options value]
  (set! (.-stripInternal ^js compiler-options) value))

(defn suppress-excess-property-errors?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-suppressExcessPropertyErrors ^js compiler-options))

(defn set-suppress-excess-property-errors!
  ^js [compiler-options value]
  (set! (.-suppressExcessPropertyErrors ^js compiler-options) value))

(defn suppress-implicit-any-index-errors?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-suppressImplicitAnyIndexErrors ^js compiler-options))

(defn set-suppress-implicit-any-index-errors!
  ^js [compiler-options value]
  (set! (.-suppressImplicitAnyIndexErrors ^js compiler-options) value))

(defn target
  "**Returns:** `ScriptTarget | undefined`"
  ^js [compiler-options]
  (.-target ^js compiler-options))

(defn set-target!
  ^js [compiler-options value]
  (set! (.-target ^js compiler-options) value))

(defn trace-resolution?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-traceResolution ^js compiler-options))

(defn set-trace-resolution!
  ^js [compiler-options value]
  (set! (.-traceResolution ^js compiler-options) value))

(defn use-unknown-in-catch-variables?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-useUnknownInCatchVariables ^js compiler-options))

(defn set-use-unknown-in-catch-variables!
  ^js [compiler-options value]
  (set! (.-useUnknownInCatchVariables ^js compiler-options) value))

(defn resolve-json-module?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-resolveJsonModule ^js compiler-options))

(defn set-resolve-json-module!
  ^js [compiler-options value]
  (set! (.-resolveJsonModule ^js compiler-options) value))

(defn types
  "**Returns:** `string[] | undefined`"
  ^js [compiler-options]
  (.-types ^js compiler-options))

(defn set-types!
  ^js [compiler-options value]
  (set! (.-types ^js compiler-options) value))

(defn type-roots
  "Paths used to compute primary types search locations
   
   **Returns:** `string[] | undefined`"
  ^js [compiler-options]
  (.-typeRoots ^js compiler-options))

(defn set-type-roots!
  "Paths used to compute primary types search locations"
  ^js [compiler-options value]
  (set! (.-typeRoots ^js compiler-options) value))

(defn verbatim-module-syntax?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-verbatimModuleSyntax ^js compiler-options))

(defn set-verbatim-module-syntax!
  ^js [compiler-options value]
  (set! (.-verbatimModuleSyntax ^js compiler-options) value))

(defn es-module-interop?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-esModuleInterop ^js compiler-options))

(defn set-es-module-interop!
  ^js [compiler-options value]
  (set! (.-esModuleInterop ^js compiler-options) value))

(defn use-define-for-class-fields?
  "**Returns:** `boolean | undefined`"
  ^js [compiler-options]
  (.-useDefineForClassFields ^js compiler-options))

(defn set-use-define-for-class-fields!
  ^js [compiler-options value]
  (set! (.-useDefineForClassFields ^js compiler-options) value))
