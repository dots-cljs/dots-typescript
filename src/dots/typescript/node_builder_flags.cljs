(ns dots.typescript.node-builder-flags
  (:require ["typescript" :as typescript]))

(def none (.-None typescript/NodeBuilderFlags))

(def no-truncation (.-NoTruncation typescript/NodeBuilderFlags))

(def write-array-as-generic-type (.-WriteArrayAsGenericType typescript/NodeBuilderFlags))

(def generate-names-for-shadowed-type-params (.-GenerateNamesForShadowedTypeParams typescript/NodeBuilderFlags))

(def use-structural-fallback (.-UseStructuralFallback typescript/NodeBuilderFlags))

(def forbid-indexed-access-symbol-references (.-ForbidIndexedAccessSymbolReferences typescript/NodeBuilderFlags))

(def write-type-arguments-of-signature (.-WriteTypeArgumentsOfSignature typescript/NodeBuilderFlags))

(def use-fully-qualified-type (.-UseFullyQualifiedType typescript/NodeBuilderFlags))

(def use-only-external-aliasing (.-UseOnlyExternalAliasing typescript/NodeBuilderFlags))

(def suppress-any-return-type (.-SuppressAnyReturnType typescript/NodeBuilderFlags))

(def write-type-parameters-in-qualified-name (.-WriteTypeParametersInQualifiedName typescript/NodeBuilderFlags))

(def multiline-object-literals (.-MultilineObjectLiterals typescript/NodeBuilderFlags))

(def write-class-expression-as-type-literal (.-WriteClassExpressionAsTypeLiteral typescript/NodeBuilderFlags))

(def use-type-of-function (.-UseTypeOfFunction typescript/NodeBuilderFlags))

(def omit-parameter-modifiers (.-OmitParameterModifiers typescript/NodeBuilderFlags))

(def use-alias-defined-outside-current-scope (.-UseAliasDefinedOutsideCurrentScope typescript/NodeBuilderFlags))

(def use-single-quotes-for-string-literal-type (.-UseSingleQuotesForStringLiteralType typescript/NodeBuilderFlags))

(def no-type-reduction (.-NoTypeReduction typescript/NodeBuilderFlags))

(def omit-this-parameter (.-OmitThisParameter typescript/NodeBuilderFlags))

(def allow-this-in-object-literal (.-AllowThisInObjectLiteral typescript/NodeBuilderFlags))

(def allow-qualified-name-in-place-of-identifier (.-AllowQualifiedNameInPlaceOfIdentifier typescript/NodeBuilderFlags))

(def allow-anonymous-identifier (.-AllowAnonymousIdentifier typescript/NodeBuilderFlags))

(def allow-empty-union-or-intersection (.-AllowEmptyUnionOrIntersection typescript/NodeBuilderFlags))

(def allow-empty-tuple (.-AllowEmptyTuple typescript/NodeBuilderFlags))

(def allow-unique-es-symbol-type (.-AllowUniqueESSymbolType typescript/NodeBuilderFlags))

(def allow-empty-index-info-type (.-AllowEmptyIndexInfoType typescript/NodeBuilderFlags))

(def allow-node-modules-relative-paths (.-AllowNodeModulesRelativePaths typescript/NodeBuilderFlags))

(def ignore-errors (.-IgnoreErrors typescript/NodeBuilderFlags))

(def in-object-type-literal (.-InObjectTypeLiteral typescript/NodeBuilderFlags))

(def in-type-alias (.-InTypeAlias typescript/NodeBuilderFlags))

(def in-initial-entity-name (.-InInitialEntityName typescript/NodeBuilderFlags))
