(ns dots.typescript.symbol-display-part-kind
  (:refer-clojure :exclude [keyword])
  (:require ["typescript" :as typescript]))

(def alias-name (.-aliasName typescript/SymbolDisplayPartKind))

(def class-name (.-className typescript/SymbolDisplayPartKind))

(def enum-name (.-enumName typescript/SymbolDisplayPartKind))

(def field-name (.-fieldName typescript/SymbolDisplayPartKind))

(def interface-name (.-interfaceName typescript/SymbolDisplayPartKind))

(def keyword (.-keyword typescript/SymbolDisplayPartKind))

(def line-break (.-lineBreak typescript/SymbolDisplayPartKind))

(def numeric-literal (.-numericLiteral typescript/SymbolDisplayPartKind))

(def string-literal (.-stringLiteral typescript/SymbolDisplayPartKind))

(def local-name (.-localName typescript/SymbolDisplayPartKind))

(def method-name (.-methodName typescript/SymbolDisplayPartKind))

(def module-name (.-moduleName typescript/SymbolDisplayPartKind))

(def operator (.-operator typescript/SymbolDisplayPartKind))

(def parameter-name (.-parameterName typescript/SymbolDisplayPartKind))

(def property-name (.-propertyName typescript/SymbolDisplayPartKind))

(def punctuation (.-punctuation typescript/SymbolDisplayPartKind))

(def space (.-space typescript/SymbolDisplayPartKind))

(def text (.-text typescript/SymbolDisplayPartKind))

(def type-parameter-name (.-typeParameterName typescript/SymbolDisplayPartKind))

(def enum-member-name (.-enumMemberName typescript/SymbolDisplayPartKind))

(def function-name (.-functionName typescript/SymbolDisplayPartKind))

(def regular-expression-literal (.-regularExpressionLiteral typescript/SymbolDisplayPartKind))

(def link (.-link typescript/SymbolDisplayPartKind))

(def link-name (.-linkName typescript/SymbolDisplayPartKind))

(def link-text (.-linkText typescript/SymbolDisplayPartKind))
