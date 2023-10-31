(ns dots.typescript.type-checker)

(defn type-of-symbol-at-location
  ^js [type-checker symbol node]
  (.getTypeOfSymbolAtLocation ^js type-checker symbol node))

(defn type-of-symbol
  ^js [type-checker symbol]
  (.getTypeOfSymbol ^js type-checker symbol))

(defn declared-type-of-symbol
  ^js [type-checker symbol]
  (.getDeclaredTypeOfSymbol ^js type-checker symbol))

(defn properties-of-type
  ^js [type-checker type]
  (.getPropertiesOfType ^js type-checker type))

(defn property-of-type
  ^js [type-checker type property-name]
  (.getPropertyOfType ^js type-checker type property-name))

(defn private-identifier-property-of-type
  ^js [type-checker left-type name location]
  (.getPrivateIdentifierPropertyOfType ^js type-checker left-type name location))

(defn index-info-of-type
  ^js [type-checker type kind]
  (.getIndexInfoOfType ^js type-checker type kind))

(defn index-infos-of-type
  ^js [type-checker type]
  (.getIndexInfosOfType ^js type-checker type))

(defn index-infos-of-index-symbol
  ^js [type-checker]
  (.-getIndexInfosOfIndexSymbol ^js type-checker))

(defn set-get-index-infos-of-index-symbol!
  ^js [type-checker value]
  (set! (.-getIndexInfosOfIndexSymbol ^js type-checker) value))

(defn signatures-of-type
  ^js [type-checker type kind]
  (.getSignaturesOfType ^js type-checker type kind))

(defn index-type-of-type
  ^js [type-checker type kind]
  (.getIndexTypeOfType ^js type-checker type kind))

(defn base-types
  ^js [type-checker type]
  (.getBaseTypes ^js type-checker type))

(defn base-type-of-literal-type
  ^js [type-checker type]
  (.getBaseTypeOfLiteralType ^js type-checker type))

(defn widened-type
  ^js [type-checker type]
  (.getWidenedType ^js type-checker type))

(defn return-type-of-signature
  ^js [type-checker signature]
  (.getReturnTypeOfSignature ^js type-checker signature))

(defn nullable-type
  ^js [type-checker type flags]
  (.getNullableType ^js type-checker type flags))

(defn non-nullable-type
  ^js [type-checker type]
  (.getNonNullableType ^js type-checker type))

(defn type-arguments
  ^js [type-checker type]
  (.getTypeArguments ^js type-checker type))

(defn type-to-type-node
  "Note that the resulting nodes cannot be checked."
  (^js [type-checker type]
   (.typeToTypeNode ^js type-checker type))
  (^js [type-checker type enclosing-declaration]
   (.typeToTypeNode ^js type-checker type enclosing-declaration))
  (^js [type-checker type enclosing-declaration flags]
   (.typeToTypeNode ^js type-checker type enclosing-declaration flags)))

(defn signature-to-signature-declaration
  "Note that the resulting nodes cannot be checked."
  (^js [type-checker signature kind]
   (.signatureToSignatureDeclaration ^js type-checker signature kind))
  (^js [type-checker signature kind enclosing-declaration]
   (.signatureToSignatureDeclaration ^js type-checker signature kind enclosing-declaration))
  (^js [type-checker signature kind enclosing-declaration flags]
   (.signatureToSignatureDeclaration ^js type-checker signature kind enclosing-declaration flags)))

(defn index-info-to-index-signature-declaration
  "Note that the resulting nodes cannot be checked."
  (^js [type-checker index-info]
   (.indexInfoToIndexSignatureDeclaration ^js type-checker index-info))
  (^js [type-checker index-info enclosing-declaration]
   (.indexInfoToIndexSignatureDeclaration ^js type-checker index-info enclosing-declaration))
  (^js [type-checker index-info enclosing-declaration flags]
   (.indexInfoToIndexSignatureDeclaration ^js type-checker index-info enclosing-declaration flags)))

(defn symbol-to-entity-name
  "Note that the resulting nodes cannot be checked."
  (^js [type-checker symbol meaning]
   (.symbolToEntityName ^js type-checker symbol meaning))
  (^js [type-checker symbol meaning enclosing-declaration]
   (.symbolToEntityName ^js type-checker symbol meaning enclosing-declaration))
  (^js [type-checker symbol meaning enclosing-declaration flags]
   (.symbolToEntityName ^js type-checker symbol meaning enclosing-declaration flags)))

(defn symbol-to-expression
  "Note that the resulting nodes cannot be checked."
  (^js [type-checker symbol meaning]
   (.symbolToExpression ^js type-checker symbol meaning))
  (^js [type-checker symbol meaning enclosing-declaration]
   (.symbolToExpression ^js type-checker symbol meaning enclosing-declaration))
  (^js [type-checker symbol meaning enclosing-declaration flags]
   (.symbolToExpression ^js type-checker symbol meaning enclosing-declaration flags)))

(defn symbol-to-type-parameter-declarations
  "Note that the resulting nodes cannot be checked."
  (^js [type-checker symbol]
   (.symbolToTypeParameterDeclarations ^js type-checker symbol))
  (^js [type-checker symbol enclosing-declaration]
   (.symbolToTypeParameterDeclarations ^js type-checker symbol enclosing-declaration))
  (^js [type-checker symbol enclosing-declaration flags]
   (.symbolToTypeParameterDeclarations ^js type-checker symbol enclosing-declaration flags)))

(defn symbol-to-parameter-declaration
  "Note that the resulting nodes cannot be checked."
  (^js [type-checker symbol]
   (.symbolToParameterDeclaration ^js type-checker symbol))
  (^js [type-checker symbol enclosing-declaration]
   (.symbolToParameterDeclaration ^js type-checker symbol enclosing-declaration))
  (^js [type-checker symbol enclosing-declaration flags]
   (.symbolToParameterDeclaration ^js type-checker symbol enclosing-declaration flags)))

(defn type-parameter-to-declaration
  "Note that the resulting nodes cannot be checked."
  (^js [type-checker parameter]
   (.typeParameterToDeclaration ^js type-checker parameter))
  (^js [type-checker parameter enclosing-declaration]
   (.typeParameterToDeclaration ^js type-checker parameter enclosing-declaration))
  (^js [type-checker parameter enclosing-declaration flags]
   (.typeParameterToDeclaration ^js type-checker parameter enclosing-declaration flags)))

(defn symbols-in-scope
  ^js [type-checker location meaning]
  (.getSymbolsInScope ^js type-checker location meaning))

(defn symbol-at-location
  ^js [type-checker node]
  (.getSymbolAtLocation ^js type-checker node))

(defn symbols-of-parameter-property-declaration
  ^js [type-checker parameter parameter-name]
  (.getSymbolsOfParameterPropertyDeclaration ^js type-checker parameter parameter-name))

(defn shorthand-assignment-value-symbol
  "The function returns the value (local variable) symbol of an identifier in the short-hand property assignment.
   This is necessary as an identifier in short-hand property assignment can contains two meaning: property name and property value."
  (^js [type-checker]
   (.getShorthandAssignmentValueSymbol ^js type-checker))
  (^js [type-checker location]
   (.getShorthandAssignmentValueSymbol ^js type-checker location)))

(defn export-specifier-local-target-symbol
  ^js [type-checker location]
  (.getExportSpecifierLocalTargetSymbol ^js type-checker location))

(defn export-symbol-of-symbol
  "If a symbol is a local symbol with an associated exported symbol, returns the exported symbol.
   Otherwise returns its input.
   For example, at `export type T = number;`:
       - `getSymbolAtLocation` at the location `T` will return the exported symbol for `T`.
       - But the result of `getSymbolsInScope` will contain the *local* symbol for `T`, not the exported symbol.
       - Calling `getExportSymbolOfSymbol` on that local symbol will return the exported symbol."
  ^js [type-checker symbol]
  (.getExportSymbolOfSymbol ^js type-checker symbol))

(defn property-symbol-of-destructuring-assignment
  ^js [type-checker location]
  (.getPropertySymbolOfDestructuringAssignment ^js type-checker location))

(defn type-of-assignment-pattern
  ^js [type-checker pattern]
  (.getTypeOfAssignmentPattern ^js type-checker pattern))

(defn type-at-location
  ^js [type-checker node]
  (.getTypeAtLocation ^js type-checker node))

(defn type-from-type-node
  ^js [type-checker node]
  (.getTypeFromTypeNode ^js type-checker node))

(defn signature-to-string
  (^js [type-checker signature]
   (.signatureToString ^js type-checker signature))
  (^js [type-checker signature enclosing-declaration]
   (.signatureToString ^js type-checker signature enclosing-declaration))
  (^js [type-checker signature enclosing-declaration flags]
   (.signatureToString ^js type-checker signature enclosing-declaration flags))
  (^js [type-checker signature enclosing-declaration flags kind]
   (.signatureToString ^js type-checker signature enclosing-declaration flags kind)))

(defn type-to-string
  (^js [type-checker type]
   (.typeToString ^js type-checker type))
  (^js [type-checker type enclosing-declaration]
   (.typeToString ^js type-checker type enclosing-declaration))
  (^js [type-checker type enclosing-declaration flags]
   (.typeToString ^js type-checker type enclosing-declaration flags)))

(defn symbol-to-string
  (^js [type-checker symbol]
   (.symbolToString ^js type-checker symbol))
  (^js [type-checker symbol enclosing-declaration]
   (.symbolToString ^js type-checker symbol enclosing-declaration))
  (^js [type-checker symbol enclosing-declaration meaning]
   (.symbolToString ^js type-checker symbol enclosing-declaration meaning))
  (^js [type-checker symbol enclosing-declaration meaning flags]
   (.symbolToString ^js type-checker symbol enclosing-declaration meaning flags)))

(defn type-predicate-to-string
  (^js [type-checker predicate]
   (.typePredicateToString ^js type-checker predicate))
  (^js [type-checker predicate enclosing-declaration]
   (.typePredicateToString ^js type-checker predicate enclosing-declaration))
  (^js [type-checker predicate enclosing-declaration flags]
   (.typePredicateToString ^js type-checker predicate enclosing-declaration flags)))

(defn fully-qualified-name
  ^js [type-checker symbol]
  (.getFullyQualifiedName ^js type-checker symbol))

(defn augmented-properties-of-type
  ^js [type-checker type]
  (.getAugmentedPropertiesOfType ^js type-checker type))

(defn root-symbols
  ^js [type-checker symbol]
  (.getRootSymbols ^js type-checker symbol))

(defn symbol-of-expando
  ^js [type-checker node allow-declaration?]
  (.getSymbolOfExpando ^js type-checker node allow-declaration?))

(defn contextual-type
  ^js [type-checker node]
  (.getContextualType ^js type-checker node))

(defn resolved-signature
  "returns unknownSignature in the case of an error.
   returns undefined if the node is not valid."
  (^js [type-checker node]
   (.getResolvedSignature ^js type-checker node))
  (^js [type-checker node candidates-out-array]
   (.getResolvedSignature ^js type-checker node candidates-out-array))
  (^js [type-checker node candidates-out-array argument-count]
   (.getResolvedSignature ^js type-checker node candidates-out-array argument-count)))

(defn signature-from-declaration
  ^js [type-checker declaration]
  (.getSignatureFromDeclaration ^js type-checker declaration))

(defn implementation-of-overload?
  ^js [type-checker node]
  (.isImplementationOfOverload ^js type-checker node))

(defn undefined-symbol?
  ^js [type-checker symbol]
  (.isUndefinedSymbol ^js type-checker symbol))

(defn arguments-symbol?
  ^js [type-checker symbol]
  (.isArgumentsSymbol ^js type-checker symbol))

(defn unknown-symbol?
  ^js [type-checker symbol]
  (.isUnknownSymbol ^js type-checker symbol))

(defn constant-value
  ^js [type-checker node]
  (.getConstantValue ^js type-checker node))

(defn valid-property-access?
  ^js [type-checker node property-name]
  (.isValidPropertyAccess ^js type-checker node property-name))

(defn aliased-symbol
  "Follow all aliases to get the original symbol."
  ^js [type-checker symbol]
  (.getAliasedSymbol ^js type-checker symbol))

(defn immediate-aliased-symbol
  "Follow a *single* alias to get the immediately aliased symbol."
  ^js [type-checker symbol]
  (.getImmediateAliasedSymbol ^js type-checker symbol))

(defn exports-of-module
  ^js [type-checker module-symbol]
  (.getExportsOfModule ^js type-checker module-symbol))

(defn jsx-intrinsic-tag-names-at
  ^js [type-checker location]
  (.getJsxIntrinsicTagNamesAt ^js type-checker location))

(defn optional-parameter?
  ^js [type-checker node]
  (.isOptionalParameter ^js type-checker node))

(defn ambient-modules
  ^js [type-checker]
  (.getAmbientModules ^js type-checker))

(defn try-get-member-in-module-exports
  ^js [type-checker member-name module-symbol]
  (.tryGetMemberInModuleExports ^js type-checker member-name module-symbol))

(defn apparent-type
  ^js [type-checker type]
  (.getApparentType ^js type-checker type))

(defn base-constraint-of-type
  ^js [type-checker type]
  (.getBaseConstraintOfType ^js type-checker type))

(defn default-from-type-parameter
  ^js [type-checker type]
  (.getDefaultFromTypeParameter ^js type-checker type))

(defn any-type
  "Gets the intrinsic `any` type. There are multiple types that act as `any` used internally in the compiler,
   so the type returned by this function should not be used in equality checks to determine if another type
   is `any`. Instead, use `type.flags & TypeFlags.Any`."
  ^js [type-checker]
  (.getAnyType ^js type-checker))

(defn string-type
  ^js [type-checker]
  (.getStringType ^js type-checker))

(defn string-literal-type
  ^js [type-checker value]
  (.getStringLiteralType ^js type-checker value))

(defn number-type
  ^js [type-checker]
  (.getNumberType ^js type-checker))

(defn number-literal-type
  ^js [type-checker value]
  (.getNumberLiteralType ^js type-checker value))

(defn big-int-type
  ^js [type-checker]
  (.getBigIntType ^js type-checker))

(defn boolean-type
  ^js [type-checker]
  (.getBooleanType ^js type-checker))

(defn false-type
  ^js [type-checker]
  (.getFalseType ^js type-checker))

(defn true-type
  ^js [type-checker]
  (.getTrueType ^js type-checker))

(defn void-type
  ^js [type-checker]
  (.getVoidType ^js type-checker))

(defn undefined-type
  "Gets the intrinsic `undefined` type. There are multiple types that act as `undefined` used internally in the compiler
   depending on compiler options, so the type returned by this function should not be used in equality checks to determine
   if another type is `undefined`. Instead, use `type.flags & TypeFlags.Undefined`."
  ^js [type-checker]
  (.getUndefinedType ^js type-checker))

(defn null-type
  "Gets the intrinsic `null` type. There are multiple types that act as `null` used internally in the compiler,
   so the type returned by this function should not be used in equality checks to determine if another type
   is `null`. Instead, use `type.flags & TypeFlags.Null`."
  ^js [type-checker]
  (.getNullType ^js type-checker))

(defn es-symbol-type
  ^js [type-checker]
  (.getESSymbolType ^js type-checker))

(defn never-type
  "Gets the intrinsic `never` type. There are multiple types that act as `never` used internally in the compiler,
   so the type returned by this function should not be used in equality checks to determine if another type
   is `never`. Instead, use `type.flags & TypeFlags.Never`."
  ^js [type-checker]
  (.getNeverType ^js type-checker))

(defn array-type?
  "True if this type is the `Array` or `ReadonlyArray` type from lib.d.ts.
   This function will _not_ return true if passed a type which
   extends `Array` (for example, the TypeScript AST's `NodeArray` type)."
  ^js [type-checker type]
  (.isArrayType ^js type-checker type))

(defn tuple-type?
  "True if this type is a tuple type. This function will _not_ return true if
   passed a type which extends from a tuple."
  ^js [type-checker type]
  (.isTupleType ^js type-checker type))

(defn array-like-type?
  "True if this type is assignable to `ReadonlyArray<any>`."
  ^js [type-checker type]
  (.isArrayLikeType ^js type-checker type))

(defn type-predicate-of-signature
  ^js [type-checker signature]
  (.getTypePredicateOfSignature ^js type-checker signature))

(defn run-with-cancellation-token
  "Depending on the operation performed, it may be appropriate to throw away the checker
   if the cancellation token is triggered. Typically, if it is used for error checking
   and the operation is cancelled, then it should be discarded, otherwise it is safe to keep."
  ^js [type-checker token cb]
  (.runWithCancellationToken ^js type-checker token cb))
