(ns dots.typescript.emit-flags
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/EmitFlags))

(def single-line (.-SingleLine typescript/EmitFlags))

(def multi-line (.-MultiLine typescript/EmitFlags))

(def advise-on-emit-node (.-AdviseOnEmitNode typescript/EmitFlags))

(def no-substitution (.-NoSubstitution typescript/EmitFlags))

(def captures-this (.-CapturesThis typescript/EmitFlags))

(def no-leading-source-map (.-NoLeadingSourceMap typescript/EmitFlags))

(def no-trailing-source-map (.-NoTrailingSourceMap typescript/EmitFlags))

(def no-source-map (.-NoSourceMap typescript/EmitFlags))

(def no-nested-source-maps (.-NoNestedSourceMaps typescript/EmitFlags))

(def no-token-leading-source-maps (.-NoTokenLeadingSourceMaps typescript/EmitFlags))

(def no-token-trailing-source-maps (.-NoTokenTrailingSourceMaps typescript/EmitFlags))

(def no-token-source-maps (.-NoTokenSourceMaps typescript/EmitFlags))

(def no-leading-comments (.-NoLeadingComments typescript/EmitFlags))

(def no-trailing-comments (.-NoTrailingComments typescript/EmitFlags))

(def no-comments (.-NoComments typescript/EmitFlags))

(def no-nested-comments (.-NoNestedComments typescript/EmitFlags))

(def helper-name (.-HelperName typescript/EmitFlags))

(def export-name (.-ExportName typescript/EmitFlags))

(def local-name (.-LocalName typescript/EmitFlags))

(def internal-name (.-InternalName typescript/EmitFlags))

(def indented (.-Indented typescript/EmitFlags))

(def no-indentation (.-NoIndentation typescript/EmitFlags))

(def async-function-body (.-AsyncFunctionBody typescript/EmitFlags))

(def reuse-temp-variable-scope (.-ReuseTempVariableScope typescript/EmitFlags))

(def custom-prologue (.-CustomPrologue typescript/EmitFlags))

(def no-hoisting (.-NoHoisting typescript/EmitFlags))

(def iterator (.-Iterator typescript/EmitFlags))

(def no-ascii-escaping (.-NoAsciiEscaping typescript/EmitFlags))
