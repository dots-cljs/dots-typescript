(ns dots.typescript.transpile-options)

(defn compiler-options
  ^js [transpile-options]
  (.-compilerOptions ^js transpile-options))

(defn set-compiler-options!
  ^js [transpile-options value]
  (set! (.-compilerOptions ^js transpile-options) value))

(defn file-name
  ^js [transpile-options]
  (.-fileName ^js transpile-options))

(defn set-file-name!
  ^js [transpile-options value]
  (set! (.-fileName ^js transpile-options) value))

(defn report-diagnostics?
  ^js [transpile-options]
  (.-reportDiagnostics ^js transpile-options))

(defn set-report-diagnostics!
  ^js [transpile-options value]
  (set! (.-reportDiagnostics ^js transpile-options) value))

(defn module-name
  ^js [transpile-options]
  (.-moduleName ^js transpile-options))

(defn set-module-name!
  ^js [transpile-options value]
  (set! (.-moduleName ^js transpile-options) value))

(defn renamed-dependencies
  ^js [transpile-options]
  (.-renamedDependencies ^js transpile-options))

(defn set-renamed-dependencies!
  ^js [transpile-options value]
  (set! (.-renamedDependencies ^js transpile-options) value))

(defn transformers
  ^js [transpile-options]
  (.-transformers ^js transpile-options))

(defn set-transformers!
  ^js [transpile-options value]
  (set! (.-transformers ^js transpile-options) value))

(defn js-doc-parsing-mode
  ^js [transpile-options]
  (.-jsDocParsingMode ^js transpile-options))

(defn set-js-doc-parsing-mode!
  ^js [transpile-options value]
  (set! (.-jsDocParsingMode ^js transpile-options) value))
