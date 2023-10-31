(ns dots.typescript.symbol-format-flags
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/SymbolFormatFlags))

(def write-type-parameters-or-arguments (.-WriteTypeParametersOrArguments typescript/SymbolFormatFlags))

(def use-only-external-aliasing (.-UseOnlyExternalAliasing typescript/SymbolFormatFlags))

(def allow-any-node-kind (.-AllowAnyNodeKind typescript/SymbolFormatFlags))

(def use-alias-defined-outside-current-scope (.-UseAliasDefinedOutsideCurrentScope typescript/SymbolFormatFlags))
