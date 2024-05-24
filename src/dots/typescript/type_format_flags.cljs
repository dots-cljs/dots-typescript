(ns dots.typescript.type-format-flags
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/TypeFormatFlags))

(def no-truncation (.-NoTruncation typescript/TypeFormatFlags))

(def write-array-as-generic-type (.-WriteArrayAsGenericType typescript/TypeFormatFlags))

(def generate-names-for-shadowed-type-params (.-GenerateNamesForShadowedTypeParams typescript/TypeFormatFlags))

(def use-structural-fallback (.-UseStructuralFallback typescript/TypeFormatFlags))

(def write-type-arguments-of-signature (.-WriteTypeArgumentsOfSignature typescript/TypeFormatFlags))

(def use-fully-qualified-type (.-UseFullyQualifiedType typescript/TypeFormatFlags))

(def suppress-any-return-type (.-SuppressAnyReturnType typescript/TypeFormatFlags))

(def multiline-object-literals (.-MultilineObjectLiterals typescript/TypeFormatFlags))

(def write-class-expression-as-type-literal (.-WriteClassExpressionAsTypeLiteral typescript/TypeFormatFlags))

(def use-type-of-function (.-UseTypeOfFunction typescript/TypeFormatFlags))

(def omit-parameter-modifiers (.-OmitParameterModifiers typescript/TypeFormatFlags))

(def use-alias-defined-outside-current-scope (.-UseAliasDefinedOutsideCurrentScope typescript/TypeFormatFlags))

(def use-single-quotes-for-string-literal-type (.-UseSingleQuotesForStringLiteralType typescript/TypeFormatFlags))

(def no-type-reduction (.-NoTypeReduction typescript/TypeFormatFlags))

(def omit-this-parameter (.-OmitThisParameter typescript/TypeFormatFlags))

(def allow-unique-es-symbol-type (.-AllowUniqueESSymbolType typescript/TypeFormatFlags))

(def add-undefined (.-AddUndefined typescript/TypeFormatFlags))

(def write-arrow-style-signature (.-WriteArrowStyleSignature typescript/TypeFormatFlags))

(def in-array-type (.-InArrayType typescript/TypeFormatFlags))

(def in-element-type (.-InElementType typescript/TypeFormatFlags))

(def in-first-type-argument (.-InFirstTypeArgument typescript/TypeFormatFlags))

(def in-type-alias (.-InTypeAlias typescript/TypeFormatFlags))

(def node-builder-flags-mask (.-NodeBuilderFlagsMask typescript/TypeFormatFlags))
