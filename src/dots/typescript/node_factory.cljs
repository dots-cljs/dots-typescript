(ns dots.typescript.node-factory)

(defn create-node-array
  "**Parameters:**
   - `elements`: `readonly T[] | undefined`
   - `has-trailing-comma?`: `boolean | undefined`
   
   **Returns:** `NodeArray<T>`"
  (^js [node-factory]
   (.createNodeArray ^js node-factory))
  (^js [node-factory elements]
   (.createNodeArray ^js node-factory elements))
  (^js [node-factory elements has-trailing-comma?]
   (.createNodeArray ^js node-factory elements has-trailing-comma?)))

(defn create-numeric-literal
  "**Parameters:**
   - `value`: `string | number`
   - `numeric-literal-flags`: `TokenFlags | undefined`
   
   **Returns:** `NumericLiteral`"
  (^js [node-factory value]
   (.createNumericLiteral ^js node-factory value))
  (^js [node-factory value numeric-literal-flags]
   (.createNumericLiteral ^js node-factory value numeric-literal-flags)))

(defn create-big-int-literal
  "**Parameters:**
   - `value`: `string | PseudoBigInt`
   
   **Returns:** `BigIntLiteral`"
  ^js [node-factory value]
  (.createBigIntLiteral ^js node-factory value))

(defn create-string-literal
  "**Parameters:**
   - `text`: `string`
   - `single-quote?`: `boolean | undefined`
   
   **Returns:** `StringLiteral`"
  (^js [node-factory text]
   (.createStringLiteral ^js node-factory text))
  (^js [node-factory text single-quote?]
   (.createStringLiteral ^js node-factory text single-quote?)))

(defn create-string-literal-from-node
  "**Parameters:**
   - `source-node`: `PrivateIdentifier | PropertyNameLiteral`
   - `single-quote?`: `boolean | undefined`
   
   **Returns:** `StringLiteral`"
  (^js [node-factory source-node]
   (.createStringLiteralFromNode ^js node-factory source-node))
  (^js [node-factory source-node single-quote?]
   (.createStringLiteralFromNode ^js node-factory source-node single-quote?)))

(defn create-regular-expression-literal
  "**Parameters:**
   - `text`: `string`
   
   **Returns:** `RegularExpressionLiteral`"
  ^js [node-factory text]
  (.createRegularExpressionLiteral ^js node-factory text))

(defn create-identifier
  "**Parameters:**
   - `text`: `string`
   
   **Returns:** `Identifier`"
  ^js [node-factory text]
  (.createIdentifier ^js node-factory text))

(defn create-temp-variable
  "Create a unique temporary variable.
   
   **Parameters:**
   - `record-temp-variable`: `((node: Identifier) => void) | undefined` - An optional callback used to record the temporary variable name. This
   should usually be a reference to `hoistVariableDeclaration` from a `TransformationContext`, but
   can be `undefined` if you plan to record the temporary variable manually.
   - `reserved-in-nested-scopes?`: `boolean | undefined` - When `true`, reserves the temporary variable name in all nested scopes
   during emit so that the variable can be referenced in a nested function body. This is an alternative to
   setting `EmitFlags.ReuseTempVariableScope` on the nested function itself.
   
   **Returns:** `Identifier`"
  (^js [node-factory]
   (.createTempVariable ^js node-factory))
  (^js [node-factory record-temp-variable]
   (.createTempVariable ^js node-factory record-temp-variable))
  (^js [node-factory record-temp-variable reserved-in-nested-scopes?]
   (.createTempVariable ^js node-factory record-temp-variable reserved-in-nested-scopes?)))

(defn create-loop-variable
  "Create a unique temporary variable for use in a loop.
   
   **Parameters:**
   - `reserved-in-nested-scopes?`: `boolean | undefined` - When `true`, reserves the temporary variable name in all nested scopes
   during emit so that the variable can be referenced in a nested function body. This is an alternative to
   setting `EmitFlags.ReuseTempVariableScope` on the nested function itself.
   
   **Returns:** `Identifier`"
  (^js [node-factory]
   (.createLoopVariable ^js node-factory))
  (^js [node-factory reserved-in-nested-scopes?]
   (.createLoopVariable ^js node-factory reserved-in-nested-scopes?)))

(defn create-unique-name
  "Create a unique name based on the supplied text.
   
   **Parameters:**
   - `text`: `string`
   - `flags`: `GeneratedIdentifierFlags | undefined`
   
   **Returns:** `Identifier`"
  (^js [node-factory text]
   (.createUniqueName ^js node-factory text))
  (^js [node-factory text flags]
   (.createUniqueName ^js node-factory text flags)))

(defn generated-name-for-node
  "Create a unique name generated for a node.
   
   **Parameters:**
   - `node`: `Node | undefined`
   - `flags`: `GeneratedIdentifierFlags | undefined`
   
   **Returns:** `Identifier`"
  (^js [node-factory]
   (.getGeneratedNameForNode ^js node-factory))
  (^js [node-factory node]
   (.getGeneratedNameForNode ^js node-factory node))
  (^js [node-factory node flags]
   (.getGeneratedNameForNode ^js node-factory node flags)))

(defn create-private-identifier
  "**Parameters:**
   - `text`: `string`
   
   **Returns:** `PrivateIdentifier`"
  ^js [node-factory text]
  (.createPrivateIdentifier ^js node-factory text))

(defn create-unique-private-name
  "**Parameters:**
   - `text`: `string | undefined`
   
   **Returns:** `PrivateIdentifier`"
  (^js [node-factory]
   (.createUniquePrivateName ^js node-factory))
  (^js [node-factory text]
   (.createUniquePrivateName ^js node-factory text)))

(defn generated-private-name-for-node
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `PrivateIdentifier`"
  ^js [node-factory node]
  (.getGeneratedPrivateNameForNode ^js node-factory node))

(defn create-token
  "**Parameters:**
   - `token`: `TKind`
   
   **Returns:** `KeywordToken<TKind>`"
  ^js [node-factory token]
  (.createToken ^js node-factory token))

(defn create-super
  "**Returns:** `SuperExpression`"
  ^js [node-factory]
  (.createSuper ^js node-factory))

(defn create-this
  "**Returns:** `ThisExpression`"
  ^js [node-factory]
  (.createThis ^js node-factory))

(defn create-null
  "**Returns:** `NullLiteral`"
  ^js [node-factory]
  (.createNull ^js node-factory))

(defn create-true
  "**Returns:** `TrueLiteral`"
  ^js [node-factory]
  (.createTrue ^js node-factory))

(defn create-false
  "**Returns:** `FalseLiteral`"
  ^js [node-factory]
  (.createFalse ^js node-factory))

(defn create-modifier
  "**Parameters:**
   - `kind`: `T`
   
   **Returns:** `ModifierToken<T>`"
  ^js [node-factory kind]
  (.createModifier ^js node-factory kind))

(defn create-modifiers-from-modifier-flags
  "**Parameters:**
   - `flags`: `ModifierFlags`
   
   **Returns:** `Modifier[] | undefined`"
  ^js [node-factory flags]
  (.createModifiersFromModifierFlags ^js node-factory flags))

(defn create-qualified-name
  "**Parameters:**
   - `left`: `EntityName`
   - `right`: `string | Identifier`
   
   **Returns:** `QualifiedName`"
  ^js [node-factory left right]
  (.createQualifiedName ^js node-factory left right))

(defn update-qualified-name
  "**Parameters:**
   - `node`: `QualifiedName`
   - `left`: `EntityName`
   - `right`: `Identifier`
   
   **Returns:** `QualifiedName`"
  ^js [node-factory node left right]
  (.updateQualifiedName ^js node-factory node left right))

(defn create-computed-property-name
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ComputedPropertyName`"
  ^js [node-factory expression]
  (.createComputedPropertyName ^js node-factory expression))

(defn update-computed-property-name
  "**Parameters:**
   - `node`: `ComputedPropertyName`
   - `expression`: `Expression`
   
   **Returns:** `ComputedPropertyName`"
  ^js [node-factory node expression]
  (.updateComputedPropertyName ^js node-factory node expression))

(defn create-type-parameter-declaration
  "**Parameters:**
   - `modifiers`: `readonly Modifier[] | undefined`
   - `name`: `string | Identifier`
   - `constraint`: `TypeNode | undefined`
   - `default-type`: `TypeNode | undefined`
   
   **Returns:** `TypeParameterDeclaration`"
  (^js [node-factory]
   (.createTypeParameterDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createTypeParameterDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createTypeParameterDeclaration ^js node-factory modifiers name))
  (^js [node-factory modifiers name constraint]
   (.createTypeParameterDeclaration ^js node-factory modifiers name constraint))
  (^js [node-factory modifiers name constraint default-type]
   (.createTypeParameterDeclaration ^js node-factory modifiers name constraint default-type)))

(defn update-type-parameter-declaration
  "**Parameters:**
   - `node`: `TypeParameterDeclaration`
   - `modifiers`: `readonly Modifier[] | undefined`
   - `name`: `Identifier`
   - `constraint`: `TypeNode | undefined`
   - `default-type`: `TypeNode | undefined`
   
   **Returns:** `TypeParameterDeclaration`"
  (^js [node-factory node]
   (.updateTypeParameterDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateTypeParameterDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updateTypeParameterDeclaration ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name constraint]
   (.updateTypeParameterDeclaration ^js node-factory node modifiers name constraint))
  (^js [node-factory node modifiers name constraint default-type]
   (.updateTypeParameterDeclaration ^js node-factory node modifiers name constraint default-type)))

(defn create-parameter-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `name`: `string | BindingName`
   - `question-token`: `QuestionToken | undefined`
   - `type`: `TypeNode | undefined`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `ParameterDeclaration`"
  (^js [node-factory]
   (.createParameterDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createParameterDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers dot-dot-dot-token]
   (.createParameterDeclaration ^js node-factory modifiers dot-dot-dot-token))
  (^js [node-factory modifiers dot-dot-dot-token name]
   (.createParameterDeclaration ^js node-factory modifiers dot-dot-dot-token name))
  (^js [node-factory modifiers dot-dot-dot-token name question-token]
   (.createParameterDeclaration ^js node-factory modifiers dot-dot-dot-token name question-token))
  (^js [node-factory modifiers dot-dot-dot-token name question-token type]
   (.createParameterDeclaration ^js node-factory modifiers dot-dot-dot-token name question-token type))
  (^js [node-factory modifiers dot-dot-dot-token name question-token type initializer]
   (.createParameterDeclaration ^js node-factory modifiers dot-dot-dot-token name question-token type initializer)))

(defn update-parameter-declaration
  "**Parameters:**
   - `node`: `ParameterDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `name`: `string | BindingName`
   - `question-token`: `QuestionToken | undefined`
   - `type`: `TypeNode | undefined`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `ParameterDeclaration`"
  (^js [node-factory node]
   (.updateParameterDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateParameterDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers dot-dot-dot-token]
   (.updateParameterDeclaration ^js node-factory node modifiers dot-dot-dot-token))
  (^js [node-factory node modifiers dot-dot-dot-token name]
   (.updateParameterDeclaration ^js node-factory node modifiers dot-dot-dot-token name))
  (^js [node-factory node modifiers dot-dot-dot-token name question-token]
   (.updateParameterDeclaration ^js node-factory node modifiers dot-dot-dot-token name question-token))
  (^js [node-factory node modifiers dot-dot-dot-token name question-token type]
   (.updateParameterDeclaration ^js node-factory node modifiers dot-dot-dot-token name question-token type))
  (^js [node-factory node modifiers dot-dot-dot-token name question-token type initializer]
   (.updateParameterDeclaration ^js node-factory node modifiers dot-dot-dot-token name question-token type initializer)))

(defn create-decorator
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `Decorator`"
  ^js [node-factory expression]
  (.createDecorator ^js node-factory expression))

(defn update-decorator
  "**Parameters:**
   - `node`: `Decorator`
   - `expression`: `Expression`
   
   **Returns:** `Decorator`"
  ^js [node-factory node expression]
  (.updateDecorator ^js node-factory node expression))

(defn create-property-signature
  "**Parameters:**
   - `modifiers`: `readonly Modifier[] | undefined`
   - `name`: `string | PropertyName`
   - `question-token`: `QuestionToken | undefined`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `PropertySignature`"
  (^js [node-factory]
   (.createPropertySignature ^js node-factory))
  (^js [node-factory modifiers]
   (.createPropertySignature ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createPropertySignature ^js node-factory modifiers name))
  (^js [node-factory modifiers name question-token]
   (.createPropertySignature ^js node-factory modifiers name question-token))
  (^js [node-factory modifiers name question-token type]
   (.createPropertySignature ^js node-factory modifiers name question-token type)))

(defn update-property-signature
  "**Parameters:**
   - `node`: `PropertySignature`
   - `modifiers`: `readonly Modifier[] | undefined`
   - `name`: `PropertyName`
   - `question-token`: `QuestionToken | undefined`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `PropertySignature`"
  (^js [node-factory node]
   (.updatePropertySignature ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updatePropertySignature ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updatePropertySignature ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name question-token]
   (.updatePropertySignature ^js node-factory node modifiers name question-token))
  (^js [node-factory node modifiers name question-token type]
   (.updatePropertySignature ^js node-factory node modifiers name question-token type)))

(defn create-property-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | PropertyName`
   - `question-or-exclamation-token`: `QuestionToken | ExclamationToken | undefined`
   - `type`: `TypeNode | undefined`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `PropertyDeclaration`"
  (^js [node-factory]
   (.createPropertyDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createPropertyDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createPropertyDeclaration ^js node-factory modifiers name))
  (^js [node-factory modifiers name question-or-exclamation-token]
   (.createPropertyDeclaration ^js node-factory modifiers name question-or-exclamation-token))
  (^js [node-factory modifiers name question-or-exclamation-token type]
   (.createPropertyDeclaration ^js node-factory modifiers name question-or-exclamation-token type))
  (^js [node-factory modifiers name question-or-exclamation-token type initializer]
   (.createPropertyDeclaration ^js node-factory modifiers name question-or-exclamation-token type initializer)))

(defn update-property-declaration
  "**Parameters:**
   - `node`: `PropertyDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | PropertyName`
   - `question-or-exclamation-token`: `QuestionToken | ExclamationToken | undefined`
   - `type`: `TypeNode | undefined`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `PropertyDeclaration`"
  (^js [node-factory node]
   (.updatePropertyDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updatePropertyDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updatePropertyDeclaration ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name question-or-exclamation-token]
   (.updatePropertyDeclaration ^js node-factory node modifiers name question-or-exclamation-token))
  (^js [node-factory node modifiers name question-or-exclamation-token type]
   (.updatePropertyDeclaration ^js node-factory node modifiers name question-or-exclamation-token type))
  (^js [node-factory node modifiers name question-or-exclamation-token type initializer]
   (.updatePropertyDeclaration ^js node-factory node modifiers name question-or-exclamation-token type initializer)))

(defn create-method-signature
  "**Parameters:**
   - `modifiers`: `readonly Modifier[] | undefined`
   - `name`: `string | PropertyName`
   - `question-token`: `QuestionToken | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `MethodSignature`"
  (^js [node-factory]
   (.createMethodSignature ^js node-factory))
  (^js [node-factory modifiers]
   (.createMethodSignature ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createMethodSignature ^js node-factory modifiers name))
  (^js [node-factory modifiers name question-token]
   (.createMethodSignature ^js node-factory modifiers name question-token))
  (^js [node-factory modifiers name question-token type-parameters]
   (.createMethodSignature ^js node-factory modifiers name question-token type-parameters))
  (^js [node-factory modifiers name question-token type-parameters parameters]
   (.createMethodSignature ^js node-factory modifiers name question-token type-parameters parameters))
  (^js [node-factory modifiers name question-token type-parameters parameters type]
   (.createMethodSignature ^js node-factory modifiers name question-token type-parameters parameters type)))

(defn update-method-signature
  "**Parameters:**
   - `node`: `MethodSignature`
   - `modifiers`: `readonly Modifier[] | undefined`
   - `name`: `PropertyName`
   - `question-token`: `QuestionToken | undefined`
   - `type-parameters`: `NodeArray<TypeParameterDeclaration> | undefined`
   - `parameters`: `NodeArray<ParameterDeclaration>`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `MethodSignature`"
  (^js [node-factory node]
   (.updateMethodSignature ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateMethodSignature ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updateMethodSignature ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name question-token]
   (.updateMethodSignature ^js node-factory node modifiers name question-token))
  (^js [node-factory node modifiers name question-token type-parameters]
   (.updateMethodSignature ^js node-factory node modifiers name question-token type-parameters))
  (^js [node-factory node modifiers name question-token type-parameters parameters]
   (.updateMethodSignature ^js node-factory node modifiers name question-token type-parameters parameters))
  (^js [node-factory node modifiers name question-token type-parameters parameters type]
   (.updateMethodSignature ^js node-factory node modifiers name question-token type-parameters parameters type)))

(defn create-method-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `asterisk-token`: `AsteriskToken | undefined`
   - `name`: `string | PropertyName`
   - `question-token`: `QuestionToken | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `body`: `Block | undefined`
   
   **Returns:** `MethodDeclaration`"
  (^js [node-factory]
   (.createMethodDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createMethodDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers asterisk-token]
   (.createMethodDeclaration ^js node-factory modifiers asterisk-token))
  (^js [node-factory modifiers asterisk-token name]
   (.createMethodDeclaration ^js node-factory modifiers asterisk-token name))
  (^js [node-factory modifiers asterisk-token name question-token]
   (.createMethodDeclaration ^js node-factory modifiers asterisk-token name question-token))
  (^js [node-factory modifiers asterisk-token name question-token type-parameters]
   (.createMethodDeclaration ^js node-factory modifiers asterisk-token name question-token type-parameters))
  (^js [node-factory modifiers asterisk-token name question-token type-parameters parameters]
   (.createMethodDeclaration ^js node-factory modifiers asterisk-token name question-token type-parameters parameters))
  (^js [node-factory modifiers asterisk-token name question-token type-parameters parameters type]
   (.createMethodDeclaration ^js node-factory modifiers asterisk-token name question-token type-parameters parameters type))
  (^js [node-factory modifiers asterisk-token name question-token type-parameters parameters type body]
   (.createMethodDeclaration ^js node-factory modifiers asterisk-token name question-token type-parameters parameters type body)))

(defn update-method-declaration
  "**Parameters:**
   - `node`: `MethodDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `asterisk-token`: `AsteriskToken | undefined`
   - `name`: `PropertyName`
   - `question-token`: `QuestionToken | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `body`: `Block | undefined`
   
   **Returns:** `MethodDeclaration`"
  (^js [node-factory node]
   (.updateMethodDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateMethodDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers asterisk-token]
   (.updateMethodDeclaration ^js node-factory node modifiers asterisk-token))
  (^js [node-factory node modifiers asterisk-token name]
   (.updateMethodDeclaration ^js node-factory node modifiers asterisk-token name))
  (^js [node-factory node modifiers asterisk-token name question-token]
   (.updateMethodDeclaration ^js node-factory node modifiers asterisk-token name question-token))
  (^js [node-factory node modifiers asterisk-token name question-token type-parameters]
   (.updateMethodDeclaration ^js node-factory node modifiers asterisk-token name question-token type-parameters))
  (^js [node-factory node modifiers asterisk-token name question-token type-parameters parameters]
   (.updateMethodDeclaration ^js node-factory node modifiers asterisk-token name question-token type-parameters parameters))
  (^js [node-factory node modifiers asterisk-token name question-token type-parameters parameters type]
   (.updateMethodDeclaration ^js node-factory node modifiers asterisk-token name question-token type-parameters parameters type))
  (^js [node-factory node modifiers asterisk-token name question-token type-parameters parameters type body]
   (.updateMethodDeclaration ^js node-factory node modifiers asterisk-token name question-token type-parameters parameters type body)))

(defn create-constructor-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `body`: `Block | undefined`
   
   **Returns:** `ConstructorDeclaration`"
  (^js [node-factory]
   (.createConstructorDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createConstructorDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers parameters]
   (.createConstructorDeclaration ^js node-factory modifiers parameters))
  (^js [node-factory modifiers parameters body]
   (.createConstructorDeclaration ^js node-factory modifiers parameters body)))

(defn update-constructor-declaration
  "**Parameters:**
   - `node`: `ConstructorDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `body`: `Block | undefined`
   
   **Returns:** `ConstructorDeclaration`"
  (^js [node-factory node]
   (.updateConstructorDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateConstructorDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers parameters]
   (.updateConstructorDeclaration ^js node-factory node modifiers parameters))
  (^js [node-factory node modifiers parameters body]
   (.updateConstructorDeclaration ^js node-factory node modifiers parameters body)))

(defn create-get-accessor-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | PropertyName`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `body`: `Block | undefined`
   
   **Returns:** `GetAccessorDeclaration`"
  (^js [node-factory]
   (.createGetAccessorDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createGetAccessorDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createGetAccessorDeclaration ^js node-factory modifiers name))
  (^js [node-factory modifiers name parameters]
   (.createGetAccessorDeclaration ^js node-factory modifiers name parameters))
  (^js [node-factory modifiers name parameters type]
   (.createGetAccessorDeclaration ^js node-factory modifiers name parameters type))
  (^js [node-factory modifiers name parameters type body]
   (.createGetAccessorDeclaration ^js node-factory modifiers name parameters type body)))

(defn update-get-accessor-declaration
  "**Parameters:**
   - `node`: `GetAccessorDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `PropertyName`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `body`: `Block | undefined`
   
   **Returns:** `GetAccessorDeclaration`"
  (^js [node-factory node]
   (.updateGetAccessorDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateGetAccessorDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updateGetAccessorDeclaration ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name parameters]
   (.updateGetAccessorDeclaration ^js node-factory node modifiers name parameters))
  (^js [node-factory node modifiers name parameters type]
   (.updateGetAccessorDeclaration ^js node-factory node modifiers name parameters type))
  (^js [node-factory node modifiers name parameters type body]
   (.updateGetAccessorDeclaration ^js node-factory node modifiers name parameters type body)))

(defn create-set-accessor-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | PropertyName`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `body`: `Block | undefined`
   
   **Returns:** `SetAccessorDeclaration`"
  (^js [node-factory]
   (.createSetAccessorDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createSetAccessorDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createSetAccessorDeclaration ^js node-factory modifiers name))
  (^js [node-factory modifiers name parameters]
   (.createSetAccessorDeclaration ^js node-factory modifiers name parameters))
  (^js [node-factory modifiers name parameters body]
   (.createSetAccessorDeclaration ^js node-factory modifiers name parameters body)))

(defn update-set-accessor-declaration
  "**Parameters:**
   - `node`: `SetAccessorDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `PropertyName`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `body`: `Block | undefined`
   
   **Returns:** `SetAccessorDeclaration`"
  (^js [node-factory node]
   (.updateSetAccessorDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateSetAccessorDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updateSetAccessorDeclaration ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name parameters]
   (.updateSetAccessorDeclaration ^js node-factory node modifiers name parameters))
  (^js [node-factory node modifiers name parameters body]
   (.updateSetAccessorDeclaration ^js node-factory node modifiers name parameters body)))

(defn create-call-signature
  "**Parameters:**
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `CallSignatureDeclaration`"
  (^js [node-factory]
   (.createCallSignature ^js node-factory))
  (^js [node-factory type-parameters]
   (.createCallSignature ^js node-factory type-parameters))
  (^js [node-factory type-parameters parameters]
   (.createCallSignature ^js node-factory type-parameters parameters))
  (^js [node-factory type-parameters parameters type]
   (.createCallSignature ^js node-factory type-parameters parameters type)))

(defn update-call-signature
  "**Parameters:**
   - `node`: `CallSignatureDeclaration`
   - `type-parameters`: `NodeArray<TypeParameterDeclaration> | undefined`
   - `parameters`: `NodeArray<ParameterDeclaration>`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `CallSignatureDeclaration`"
  (^js [node-factory node]
   (.updateCallSignature ^js node-factory node))
  (^js [node-factory node type-parameters]
   (.updateCallSignature ^js node-factory node type-parameters))
  (^js [node-factory node type-parameters parameters]
   (.updateCallSignature ^js node-factory node type-parameters parameters))
  (^js [node-factory node type-parameters parameters type]
   (.updateCallSignature ^js node-factory node type-parameters parameters type)))

(defn create-construct-signature
  "**Parameters:**
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `ConstructSignatureDeclaration`"
  (^js [node-factory]
   (.createConstructSignature ^js node-factory))
  (^js [node-factory type-parameters]
   (.createConstructSignature ^js node-factory type-parameters))
  (^js [node-factory type-parameters parameters]
   (.createConstructSignature ^js node-factory type-parameters parameters))
  (^js [node-factory type-parameters parameters type]
   (.createConstructSignature ^js node-factory type-parameters parameters type)))

(defn update-construct-signature
  "**Parameters:**
   - `node`: `ConstructSignatureDeclaration`
   - `type-parameters`: `NodeArray<TypeParameterDeclaration> | undefined`
   - `parameters`: `NodeArray<ParameterDeclaration>`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `ConstructSignatureDeclaration`"
  (^js [node-factory node]
   (.updateConstructSignature ^js node-factory node))
  (^js [node-factory node type-parameters]
   (.updateConstructSignature ^js node-factory node type-parameters))
  (^js [node-factory node type-parameters parameters]
   (.updateConstructSignature ^js node-factory node type-parameters parameters))
  (^js [node-factory node type-parameters parameters type]
   (.updateConstructSignature ^js node-factory node type-parameters parameters type)))

(defn create-index-signature
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode`
   
   **Returns:** `IndexSignatureDeclaration`"
  (^js [node-factory]
   (.createIndexSignature ^js node-factory))
  (^js [node-factory modifiers]
   (.createIndexSignature ^js node-factory modifiers))
  (^js [node-factory modifiers parameters]
   (.createIndexSignature ^js node-factory modifiers parameters))
  (^js [node-factory modifiers parameters type]
   (.createIndexSignature ^js node-factory modifiers parameters type)))

(defn update-index-signature
  "**Parameters:**
   - `node`: `IndexSignatureDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode`
   
   **Returns:** `IndexSignatureDeclaration`"
  (^js [node-factory node]
   (.updateIndexSignature ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateIndexSignature ^js node-factory node modifiers))
  (^js [node-factory node modifiers parameters]
   (.updateIndexSignature ^js node-factory node modifiers parameters))
  (^js [node-factory node modifiers parameters type]
   (.updateIndexSignature ^js node-factory node modifiers parameters type)))

(defn create-template-literal-type-span
  "**Parameters:**
   - `type`: `TypeNode`
   - `literal`: `TemplateMiddle | TemplateTail`
   
   **Returns:** `TemplateLiteralTypeSpan`"
  ^js [node-factory type literal]
  (.createTemplateLiteralTypeSpan ^js node-factory type literal))

(defn update-template-literal-type-span
  "**Parameters:**
   - `node`: `TemplateLiteralTypeSpan`
   - `type`: `TypeNode`
   - `literal`: `TemplateMiddle | TemplateTail`
   
   **Returns:** `TemplateLiteralTypeSpan`"
  ^js [node-factory node type literal]
  (.updateTemplateLiteralTypeSpan ^js node-factory node type literal))

(defn create-class-static-block-declaration
  "**Parameters:**
   - `body`: `Block`
   
   **Returns:** `ClassStaticBlockDeclaration`"
  ^js [node-factory body]
  (.createClassStaticBlockDeclaration ^js node-factory body))

(defn update-class-static-block-declaration
  "**Parameters:**
   - `node`: `ClassStaticBlockDeclaration`
   - `body`: `Block`
   
   **Returns:** `ClassStaticBlockDeclaration`"
  ^js [node-factory node body]
  (.updateClassStaticBlockDeclaration ^js node-factory node body))

(defn create-keyword-type-node
  "**Parameters:**
   - `kind`: `TKind`
   
   **Returns:** `KeywordTypeNode<TKind>`"
  ^js [node-factory kind]
  (.createKeywordTypeNode ^js node-factory kind))

(defn create-type-predicate-node
  "**Parameters:**
   - `asserts-modifier`: `AssertsKeyword | undefined`
   - `parameter-name`: `string | Identifier | ThisTypeNode`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `TypePredicateNode`"
  (^js [node-factory]
   (.createTypePredicateNode ^js node-factory))
  (^js [node-factory asserts-modifier]
   (.createTypePredicateNode ^js node-factory asserts-modifier))
  (^js [node-factory asserts-modifier parameter-name]
   (.createTypePredicateNode ^js node-factory asserts-modifier parameter-name))
  (^js [node-factory asserts-modifier parameter-name type]
   (.createTypePredicateNode ^js node-factory asserts-modifier parameter-name type)))

(defn update-type-predicate-node
  "**Parameters:**
   - `node`: `TypePredicateNode`
   - `asserts-modifier`: `AssertsKeyword | undefined`
   - `parameter-name`: `Identifier | ThisTypeNode`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `TypePredicateNode`"
  (^js [node-factory node]
   (.updateTypePredicateNode ^js node-factory node))
  (^js [node-factory node asserts-modifier]
   (.updateTypePredicateNode ^js node-factory node asserts-modifier))
  (^js [node-factory node asserts-modifier parameter-name]
   (.updateTypePredicateNode ^js node-factory node asserts-modifier parameter-name))
  (^js [node-factory node asserts-modifier parameter-name type]
   (.updateTypePredicateNode ^js node-factory node asserts-modifier parameter-name type)))

(defn create-type-reference-node
  "**Parameters:**
   - `type-name`: `string | EntityName`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   
   **Returns:** `TypeReferenceNode`"
  (^js [node-factory type-name]
   (.createTypeReferenceNode ^js node-factory type-name))
  (^js [node-factory type-name type-arguments]
   (.createTypeReferenceNode ^js node-factory type-name type-arguments)))

(defn update-type-reference-node
  "**Parameters:**
   - `node`: `TypeReferenceNode`
   - `type-name`: `EntityName`
   - `type-arguments`: `NodeArray<TypeNode> | undefined`
   
   **Returns:** `TypeReferenceNode`"
  (^js [node-factory node type-name]
   (.updateTypeReferenceNode ^js node-factory node type-name))
  (^js [node-factory node type-name type-arguments]
   (.updateTypeReferenceNode ^js node-factory node type-name type-arguments)))

(defn create-function-type-node
  "**Parameters:**
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode`
   
   **Returns:** `FunctionTypeNode`"
  (^js [node-factory]
   (.createFunctionTypeNode ^js node-factory))
  (^js [node-factory type-parameters]
   (.createFunctionTypeNode ^js node-factory type-parameters))
  (^js [node-factory type-parameters parameters]
   (.createFunctionTypeNode ^js node-factory type-parameters parameters))
  (^js [node-factory type-parameters parameters type]
   (.createFunctionTypeNode ^js node-factory type-parameters parameters type)))

(defn update-function-type-node
  "**Parameters:**
   - `node`: `FunctionTypeNode`
   - `type-parameters`: `NodeArray<TypeParameterDeclaration> | undefined`
   - `parameters`: `NodeArray<ParameterDeclaration>`
   - `type`: `TypeNode`
   
   **Returns:** `FunctionTypeNode`"
  (^js [node-factory node]
   (.updateFunctionTypeNode ^js node-factory node))
  (^js [node-factory node type-parameters]
   (.updateFunctionTypeNode ^js node-factory node type-parameters))
  (^js [node-factory node type-parameters parameters]
   (.updateFunctionTypeNode ^js node-factory node type-parameters parameters))
  (^js [node-factory node type-parameters parameters type]
   (.updateFunctionTypeNode ^js node-factory node type-parameters parameters type)))

(defn create-constructor-type-node
  "**Parameters:**
   - `modifiers`: `readonly Modifier[] | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode`
   
   **Returns:** `ConstructorTypeNode`"
  (^js [node-factory]
   (.createConstructorTypeNode ^js node-factory))
  (^js [node-factory modifiers]
   (.createConstructorTypeNode ^js node-factory modifiers))
  (^js [node-factory modifiers type-parameters]
   (.createConstructorTypeNode ^js node-factory modifiers type-parameters))
  (^js [node-factory modifiers type-parameters parameters]
   (.createConstructorTypeNode ^js node-factory modifiers type-parameters parameters))
  (^js [node-factory modifiers type-parameters parameters type]
   (.createConstructorTypeNode ^js node-factory modifiers type-parameters parameters type)))

(defn update-constructor-type-node
  "**Parameters:**
   - `node`: `ConstructorTypeNode`
   - `modifiers`: `readonly Modifier[] | undefined`
   - `type-parameters`: `NodeArray<TypeParameterDeclaration> | undefined`
   - `parameters`: `NodeArray<ParameterDeclaration>`
   - `type`: `TypeNode`
   
   **Returns:** `ConstructorTypeNode`"
  (^js [node-factory node]
   (.updateConstructorTypeNode ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateConstructorTypeNode ^js node-factory node modifiers))
  (^js [node-factory node modifiers type-parameters]
   (.updateConstructorTypeNode ^js node-factory node modifiers type-parameters))
  (^js [node-factory node modifiers type-parameters parameters]
   (.updateConstructorTypeNode ^js node-factory node modifiers type-parameters parameters))
  (^js [node-factory node modifiers type-parameters parameters type]
   (.updateConstructorTypeNode ^js node-factory node modifiers type-parameters parameters type)))

(defn create-type-query-node
  "**Parameters:**
   - `expr-name`: `EntityName`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   
   **Returns:** `TypeQueryNode`"
  (^js [node-factory expr-name]
   (.createTypeQueryNode ^js node-factory expr-name))
  (^js [node-factory expr-name type-arguments]
   (.createTypeQueryNode ^js node-factory expr-name type-arguments)))

(defn update-type-query-node
  "**Parameters:**
   - `node`: `TypeQueryNode`
   - `expr-name`: `EntityName`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   
   **Returns:** `TypeQueryNode`"
  (^js [node-factory node expr-name]
   (.updateTypeQueryNode ^js node-factory node expr-name))
  (^js [node-factory node expr-name type-arguments]
   (.updateTypeQueryNode ^js node-factory node expr-name type-arguments)))

(defn create-type-literal-node
  "**Parameters:**
   - `members`: `readonly TypeElement[] | undefined`
   
   **Returns:** `TypeLiteralNode`"
  (^js [node-factory]
   (.createTypeLiteralNode ^js node-factory))
  (^js [node-factory members]
   (.createTypeLiteralNode ^js node-factory members)))

(defn update-type-literal-node
  "**Parameters:**
   - `node`: `TypeLiteralNode`
   - `members`: `NodeArray<TypeElement>`
   
   **Returns:** `TypeLiteralNode`"
  ^js [node-factory node members]
  (.updateTypeLiteralNode ^js node-factory node members))

(defn create-array-type-node
  "**Parameters:**
   - `element-type`: `TypeNode`
   
   **Returns:** `ArrayTypeNode`"
  ^js [node-factory element-type]
  (.createArrayTypeNode ^js node-factory element-type))

(defn update-array-type-node
  "**Parameters:**
   - `node`: `ArrayTypeNode`
   - `element-type`: `TypeNode`
   
   **Returns:** `ArrayTypeNode`"
  ^js [node-factory node element-type]
  (.updateArrayTypeNode ^js node-factory node element-type))

(defn create-tuple-type-node
  "**Parameters:**
   - `elements`: `readonly (TypeNode | NamedTupleMember)[]`
   
   **Returns:** `TupleTypeNode`"
  ^js [node-factory elements]
  (.createTupleTypeNode ^js node-factory elements))

(defn update-tuple-type-node
  "**Parameters:**
   - `node`: `TupleTypeNode`
   - `elements`: `readonly (TypeNode | NamedTupleMember)[]`
   
   **Returns:** `TupleTypeNode`"
  ^js [node-factory node elements]
  (.updateTupleTypeNode ^js node-factory node elements))

(defn create-named-tuple-member
  "**Parameters:**
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `name`: `Identifier`
   - `question-token`: `QuestionToken | undefined`
   - `type`: `TypeNode`
   
   **Returns:** `NamedTupleMember`"
  (^js [node-factory]
   (.createNamedTupleMember ^js node-factory))
  (^js [node-factory dot-dot-dot-token]
   (.createNamedTupleMember ^js node-factory dot-dot-dot-token))
  (^js [node-factory dot-dot-dot-token name]
   (.createNamedTupleMember ^js node-factory dot-dot-dot-token name))
  (^js [node-factory dot-dot-dot-token name question-token]
   (.createNamedTupleMember ^js node-factory dot-dot-dot-token name question-token))
  (^js [node-factory dot-dot-dot-token name question-token type]
   (.createNamedTupleMember ^js node-factory dot-dot-dot-token name question-token type)))

(defn update-named-tuple-member
  "**Parameters:**
   - `node`: `NamedTupleMember`
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `name`: `Identifier`
   - `question-token`: `QuestionToken | undefined`
   - `type`: `TypeNode`
   
   **Returns:** `NamedTupleMember`"
  (^js [node-factory node]
   (.updateNamedTupleMember ^js node-factory node))
  (^js [node-factory node dot-dot-dot-token]
   (.updateNamedTupleMember ^js node-factory node dot-dot-dot-token))
  (^js [node-factory node dot-dot-dot-token name]
   (.updateNamedTupleMember ^js node-factory node dot-dot-dot-token name))
  (^js [node-factory node dot-dot-dot-token name question-token]
   (.updateNamedTupleMember ^js node-factory node dot-dot-dot-token name question-token))
  (^js [node-factory node dot-dot-dot-token name question-token type]
   (.updateNamedTupleMember ^js node-factory node dot-dot-dot-token name question-token type)))

(defn create-optional-type-node
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `OptionalTypeNode`"
  ^js [node-factory type]
  (.createOptionalTypeNode ^js node-factory type))

(defn update-optional-type-node
  "**Parameters:**
   - `node`: `OptionalTypeNode`
   - `type`: `TypeNode`
   
   **Returns:** `OptionalTypeNode`"
  ^js [node-factory node type]
  (.updateOptionalTypeNode ^js node-factory node type))

(defn create-rest-type-node
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `RestTypeNode`"
  ^js [node-factory type]
  (.createRestTypeNode ^js node-factory type))

(defn update-rest-type-node
  "**Parameters:**
   - `node`: `RestTypeNode`
   - `type`: `TypeNode`
   
   **Returns:** `RestTypeNode`"
  ^js [node-factory node type]
  (.updateRestTypeNode ^js node-factory node type))

(defn create-union-type-node
  "**Parameters:**
   - `types`: `readonly TypeNode[]`
   
   **Returns:** `UnionTypeNode`"
  ^js [node-factory types]
  (.createUnionTypeNode ^js node-factory types))

(defn update-union-type-node
  "**Parameters:**
   - `node`: `UnionTypeNode`
   - `types`: `NodeArray<TypeNode>`
   
   **Returns:** `UnionTypeNode`"
  ^js [node-factory node types]
  (.updateUnionTypeNode ^js node-factory node types))

(defn create-intersection-type-node
  "**Parameters:**
   - `types`: `readonly TypeNode[]`
   
   **Returns:** `IntersectionTypeNode`"
  ^js [node-factory types]
  (.createIntersectionTypeNode ^js node-factory types))

(defn update-intersection-type-node
  "**Parameters:**
   - `node`: `IntersectionTypeNode`
   - `types`: `NodeArray<TypeNode>`
   
   **Returns:** `IntersectionTypeNode`"
  ^js [node-factory node types]
  (.updateIntersectionTypeNode ^js node-factory node types))

(defn create-conditional-type-node
  "**Parameters:**
   - `check-type`: `TypeNode`
   - `extends-type`: `TypeNode`
   - `true-type`: `TypeNode`
   - `false-type`: `TypeNode`
   
   **Returns:** `ConditionalTypeNode`"
  ^js [node-factory check-type extends-type true-type false-type]
  (.createConditionalTypeNode ^js node-factory check-type extends-type true-type false-type))

(defn update-conditional-type-node
  "**Parameters:**
   - `node`: `ConditionalTypeNode`
   - `check-type`: `TypeNode`
   - `extends-type`: `TypeNode`
   - `true-type`: `TypeNode`
   - `false-type`: `TypeNode`
   
   **Returns:** `ConditionalTypeNode`"
  ^js [node-factory node check-type extends-type true-type false-type]
  (.updateConditionalTypeNode ^js node-factory node check-type extends-type true-type false-type))

(defn create-infer-type-node
  "**Parameters:**
   - `type-parameter`: `TypeParameterDeclaration`
   
   **Returns:** `InferTypeNode`"
  ^js [node-factory type-parameter]
  (.createInferTypeNode ^js node-factory type-parameter))

(defn update-infer-type-node
  "**Parameters:**
   - `node`: `InferTypeNode`
   - `type-parameter`: `TypeParameterDeclaration`
   
   **Returns:** `InferTypeNode`"
  ^js [node-factory node type-parameter]
  (.updateInferTypeNode ^js node-factory node type-parameter))

(defn create-import-type-node
  "**Parameters:**
   - `argument`: `TypeNode`
   - `attributes`: `ImportAttributes | undefined`
   - `qualifier`: `EntityName | undefined`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `type-of?`: `boolean | undefined`
   
   **Returns:** `ImportTypeNode`"
  (^js [node-factory argument]
   (.createImportTypeNode ^js node-factory argument))
  (^js [node-factory argument attributes]
   (.createImportTypeNode ^js node-factory argument attributes))
  (^js [node-factory argument attributes qualifier]
   (.createImportTypeNode ^js node-factory argument attributes qualifier))
  (^js [node-factory argument attributes qualifier type-arguments]
   (.createImportTypeNode ^js node-factory argument attributes qualifier type-arguments))
  (^js [node-factory argument attributes qualifier type-arguments type-of?]
   (.createImportTypeNode ^js node-factory argument attributes qualifier type-arguments type-of?)))

(defn update-import-type-node
  "**Parameters:**
   - `node`: `ImportTypeNode`
   - `argument`: `TypeNode`
   - `attributes`: `ImportAttributes | undefined`
   - `qualifier`: `EntityName | undefined`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `type-of?`: `boolean | undefined`
   
   **Returns:** `ImportTypeNode`"
  (^js [node-factory node argument]
   (.updateImportTypeNode ^js node-factory node argument))
  (^js [node-factory node argument attributes]
   (.updateImportTypeNode ^js node-factory node argument attributes))
  (^js [node-factory node argument attributes qualifier]
   (.updateImportTypeNode ^js node-factory node argument attributes qualifier))
  (^js [node-factory node argument attributes qualifier type-arguments]
   (.updateImportTypeNode ^js node-factory node argument attributes qualifier type-arguments))
  (^js [node-factory node argument attributes qualifier type-arguments type-of?]
   (.updateImportTypeNode ^js node-factory node argument attributes qualifier type-arguments type-of?)))

(defn create-parenthesized-type
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `ParenthesizedTypeNode`"
  ^js [node-factory type]
  (.createParenthesizedType ^js node-factory type))

(defn update-parenthesized-type
  "**Parameters:**
   - `node`: `ParenthesizedTypeNode`
   - `type`: `TypeNode`
   
   **Returns:** `ParenthesizedTypeNode`"
  ^js [node-factory node type]
  (.updateParenthesizedType ^js node-factory node type))

(defn create-this-type-node
  "**Returns:** `ThisTypeNode`"
  ^js [node-factory]
  (.createThisTypeNode ^js node-factory))

(defn create-type-operator-node
  "**Parameters:**
   - `operator`: `SyntaxKind.KeyOfKeyword | SyntaxKind.ReadonlyKeyword | SyntaxKind.UniqueKeyword`
   - `type`: `TypeNode`
   
   **Returns:** `TypeOperatorNode`"
  ^js [node-factory operator type]
  (.createTypeOperatorNode ^js node-factory operator type))

(defn update-type-operator-node
  "**Parameters:**
   - `node`: `TypeOperatorNode`
   - `type`: `TypeNode`
   
   **Returns:** `TypeOperatorNode`"
  ^js [node-factory node type]
  (.updateTypeOperatorNode ^js node-factory node type))

(defn create-indexed-access-type-node
  "**Parameters:**
   - `object-type`: `TypeNode`
   - `index-type`: `TypeNode`
   
   **Returns:** `IndexedAccessTypeNode`"
  ^js [node-factory object-type index-type]
  (.createIndexedAccessTypeNode ^js node-factory object-type index-type))

(defn update-indexed-access-type-node
  "**Parameters:**
   - `node`: `IndexedAccessTypeNode`
   - `object-type`: `TypeNode`
   - `index-type`: `TypeNode`
   
   **Returns:** `IndexedAccessTypeNode`"
  ^js [node-factory node object-type index-type]
  (.updateIndexedAccessTypeNode ^js node-factory node object-type index-type))

(defn create-mapped-type-node
  "**Parameters:**
   - `readonly-token`: `ReadonlyKeyword | PlusToken | MinusToken | undefined`
   - `type-parameter`: `TypeParameterDeclaration`
   - `name-type`: `TypeNode | undefined`
   - `question-token`: `QuestionToken | PlusToken | MinusToken | undefined`
   - `type`: `TypeNode | undefined`
   - `members`: `NodeArray<TypeElement> | undefined`
   
   **Returns:** `MappedTypeNode`"
  (^js [node-factory]
   (.createMappedTypeNode ^js node-factory))
  (^js [node-factory readonly-token]
   (.createMappedTypeNode ^js node-factory readonly-token))
  (^js [node-factory readonly-token type-parameter]
   (.createMappedTypeNode ^js node-factory readonly-token type-parameter))
  (^js [node-factory readonly-token type-parameter name-type]
   (.createMappedTypeNode ^js node-factory readonly-token type-parameter name-type))
  (^js [node-factory readonly-token type-parameter name-type question-token]
   (.createMappedTypeNode ^js node-factory readonly-token type-parameter name-type question-token))
  (^js [node-factory readonly-token type-parameter name-type question-token type]
   (.createMappedTypeNode ^js node-factory readonly-token type-parameter name-type question-token type))
  (^js [node-factory readonly-token type-parameter name-type question-token type members]
   (.createMappedTypeNode ^js node-factory readonly-token type-parameter name-type question-token type members)))

(defn update-mapped-type-node
  "**Parameters:**
   - `node`: `MappedTypeNode`
   - `readonly-token`: `ReadonlyKeyword | PlusToken | MinusToken | undefined`
   - `type-parameter`: `TypeParameterDeclaration`
   - `name-type`: `TypeNode | undefined`
   - `question-token`: `QuestionToken | PlusToken | MinusToken | undefined`
   - `type`: `TypeNode | undefined`
   - `members`: `NodeArray<TypeElement> | undefined`
   
   **Returns:** `MappedTypeNode`"
  (^js [node-factory node]
   (.updateMappedTypeNode ^js node-factory node))
  (^js [node-factory node readonly-token]
   (.updateMappedTypeNode ^js node-factory node readonly-token))
  (^js [node-factory node readonly-token type-parameter]
   (.updateMappedTypeNode ^js node-factory node readonly-token type-parameter))
  (^js [node-factory node readonly-token type-parameter name-type]
   (.updateMappedTypeNode ^js node-factory node readonly-token type-parameter name-type))
  (^js [node-factory node readonly-token type-parameter name-type question-token]
   (.updateMappedTypeNode ^js node-factory node readonly-token type-parameter name-type question-token))
  (^js [node-factory node readonly-token type-parameter name-type question-token type]
   (.updateMappedTypeNode ^js node-factory node readonly-token type-parameter name-type question-token type))
  (^js [node-factory node readonly-token type-parameter name-type question-token type members]
   (.updateMappedTypeNode ^js node-factory node readonly-token type-parameter name-type question-token type members)))

(defn create-literal-type-node
  "**Parameters:**
   - `literal`: `LiteralExpression | NullLiteral | BooleanLiteral | PrefixUnaryExpression`
   
   **Returns:** `LiteralTypeNode`"
  ^js [node-factory literal]
  (.createLiteralTypeNode ^js node-factory literal))

(defn update-literal-type-node
  "**Parameters:**
   - `node`: `LiteralTypeNode`
   - `literal`: `LiteralExpression | NullLiteral | BooleanLiteral | PrefixUnaryExpression`
   
   **Returns:** `LiteralTypeNode`"
  ^js [node-factory node literal]
  (.updateLiteralTypeNode ^js node-factory node literal))

(defn create-template-literal-type
  "**Parameters:**
   - `head`: `TemplateHead`
   - `template-spans`: `readonly TemplateLiteralTypeSpan[]`
   
   **Returns:** `TemplateLiteralTypeNode`"
  ^js [node-factory head template-spans]
  (.createTemplateLiteralType ^js node-factory head template-spans))

(defn update-template-literal-type
  "**Parameters:**
   - `node`: `TemplateLiteralTypeNode`
   - `head`: `TemplateHead`
   - `template-spans`: `readonly TemplateLiteralTypeSpan[]`
   
   **Returns:** `TemplateLiteralTypeNode`"
  ^js [node-factory node head template-spans]
  (.updateTemplateLiteralType ^js node-factory node head template-spans))

(defn create-object-binding-pattern
  "**Parameters:**
   - `elements`: `readonly BindingElement[]`
   
   **Returns:** `ObjectBindingPattern`"
  ^js [node-factory elements]
  (.createObjectBindingPattern ^js node-factory elements))

(defn update-object-binding-pattern
  "**Parameters:**
   - `node`: `ObjectBindingPattern`
   - `elements`: `readonly BindingElement[]`
   
   **Returns:** `ObjectBindingPattern`"
  ^js [node-factory node elements]
  (.updateObjectBindingPattern ^js node-factory node elements))

(defn create-array-binding-pattern
  "**Parameters:**
   - `elements`: `readonly ArrayBindingElement[]`
   
   **Returns:** `ArrayBindingPattern`"
  ^js [node-factory elements]
  (.createArrayBindingPattern ^js node-factory elements))

(defn update-array-binding-pattern
  "**Parameters:**
   - `node`: `ArrayBindingPattern`
   - `elements`: `readonly ArrayBindingElement[]`
   
   **Returns:** `ArrayBindingPattern`"
  ^js [node-factory node elements]
  (.updateArrayBindingPattern ^js node-factory node elements))

(defn create-binding-element
  "**Parameters:**
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `property-name`: `string | PropertyName | undefined`
   - `name`: `string | BindingName`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `BindingElement`"
  (^js [node-factory]
   (.createBindingElement ^js node-factory))
  (^js [node-factory dot-dot-dot-token]
   (.createBindingElement ^js node-factory dot-dot-dot-token))
  (^js [node-factory dot-dot-dot-token property-name]
   (.createBindingElement ^js node-factory dot-dot-dot-token property-name))
  (^js [node-factory dot-dot-dot-token property-name name]
   (.createBindingElement ^js node-factory dot-dot-dot-token property-name name))
  (^js [node-factory dot-dot-dot-token property-name name initializer]
   (.createBindingElement ^js node-factory dot-dot-dot-token property-name name initializer)))

(defn update-binding-element
  "**Parameters:**
   - `node`: `BindingElement`
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `property-name`: `PropertyName | undefined`
   - `name`: `BindingName`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `BindingElement`"
  (^js [node-factory node]
   (.updateBindingElement ^js node-factory node))
  (^js [node-factory node dot-dot-dot-token]
   (.updateBindingElement ^js node-factory node dot-dot-dot-token))
  (^js [node-factory node dot-dot-dot-token property-name]
   (.updateBindingElement ^js node-factory node dot-dot-dot-token property-name))
  (^js [node-factory node dot-dot-dot-token property-name name]
   (.updateBindingElement ^js node-factory node dot-dot-dot-token property-name name))
  (^js [node-factory node dot-dot-dot-token property-name name initializer]
   (.updateBindingElement ^js node-factory node dot-dot-dot-token property-name name initializer)))

(defn create-array-literal-expression
  "**Parameters:**
   - `elements`: `readonly Expression[] | undefined`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ArrayLiteralExpression`"
  (^js [node-factory]
   (.createArrayLiteralExpression ^js node-factory))
  (^js [node-factory elements]
   (.createArrayLiteralExpression ^js node-factory elements))
  (^js [node-factory elements multi-line?]
   (.createArrayLiteralExpression ^js node-factory elements multi-line?)))

(defn update-array-literal-expression
  "**Parameters:**
   - `node`: `ArrayLiteralExpression`
   - `elements`: `readonly Expression[]`
   
   **Returns:** `ArrayLiteralExpression`"
  ^js [node-factory node elements]
  (.updateArrayLiteralExpression ^js node-factory node elements))

(defn create-object-literal-expression
  "**Parameters:**
   - `properties`: `readonly ObjectLiteralElementLike[] | undefined`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ObjectLiteralExpression`"
  (^js [node-factory]
   (.createObjectLiteralExpression ^js node-factory))
  (^js [node-factory properties]
   (.createObjectLiteralExpression ^js node-factory properties))
  (^js [node-factory properties multi-line?]
   (.createObjectLiteralExpression ^js node-factory properties multi-line?)))

(defn update-object-literal-expression
  "**Parameters:**
   - `node`: `ObjectLiteralExpression`
   - `properties`: `readonly ObjectLiteralElementLike[]`
   
   **Returns:** `ObjectLiteralExpression`"
  ^js [node-factory node properties]
  (.updateObjectLiteralExpression ^js node-factory node properties))

(defn create-property-access-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `name`: `string | MemberName`
   
   **Returns:** `PropertyAccessExpression`"
  ^js [node-factory expression name]
  (.createPropertyAccessExpression ^js node-factory expression name))

(defn update-property-access-expression
  "**Parameters:**
   - `node`: `PropertyAccessExpression`
   - `expression`: `Expression`
   - `name`: `MemberName`
   
   **Returns:** `PropertyAccessExpression`"
  ^js [node-factory node expression name]
  (.updatePropertyAccessExpression ^js node-factory node expression name))

(defn create-property-access-chain
  "**Parameters:**
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `name`: `string | MemberName`
   
   **Returns:** `PropertyAccessChain`"
  (^js [node-factory expression]
   (.createPropertyAccessChain ^js node-factory expression))
  (^js [node-factory expression question-dot-token]
   (.createPropertyAccessChain ^js node-factory expression question-dot-token))
  (^js [node-factory expression question-dot-token name]
   (.createPropertyAccessChain ^js node-factory expression question-dot-token name)))

(defn update-property-access-chain
  "**Parameters:**
   - `node`: `PropertyAccessChain`
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `name`: `MemberName`
   
   **Returns:** `PropertyAccessChain`"
  (^js [node-factory node expression]
   (.updatePropertyAccessChain ^js node-factory node expression))
  (^js [node-factory node expression question-dot-token]
   (.updatePropertyAccessChain ^js node-factory node expression question-dot-token))
  (^js [node-factory node expression question-dot-token name]
   (.updatePropertyAccessChain ^js node-factory node expression question-dot-token name)))

(defn create-element-access-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `index`: `number | Expression`
   
   **Returns:** `ElementAccessExpression`"
  ^js [node-factory expression index]
  (.createElementAccessExpression ^js node-factory expression index))

(defn update-element-access-expression
  "**Parameters:**
   - `node`: `ElementAccessExpression`
   - `expression`: `Expression`
   - `argument-expression`: `Expression`
   
   **Returns:** `ElementAccessExpression`"
  ^js [node-factory node expression argument-expression]
  (.updateElementAccessExpression ^js node-factory node expression argument-expression))

(defn create-element-access-chain
  "**Parameters:**
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `index`: `number | Expression`
   
   **Returns:** `ElementAccessChain`"
  (^js [node-factory expression]
   (.createElementAccessChain ^js node-factory expression))
  (^js [node-factory expression question-dot-token]
   (.createElementAccessChain ^js node-factory expression question-dot-token))
  (^js [node-factory expression question-dot-token index]
   (.createElementAccessChain ^js node-factory expression question-dot-token index)))

(defn update-element-access-chain
  "**Parameters:**
   - `node`: `ElementAccessChain`
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `argument-expression`: `Expression`
   
   **Returns:** `ElementAccessChain`"
  (^js [node-factory node expression]
   (.updateElementAccessChain ^js node-factory node expression))
  (^js [node-factory node expression question-dot-token]
   (.updateElementAccessChain ^js node-factory node expression question-dot-token))
  (^js [node-factory node expression question-dot-token argument-expression]
   (.updateElementAccessChain ^js node-factory node expression question-dot-token argument-expression)))

(defn create-call-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[] | undefined`
   
   **Returns:** `CallExpression`"
  (^js [node-factory expression]
   (.createCallExpression ^js node-factory expression))
  (^js [node-factory expression type-arguments]
   (.createCallExpression ^js node-factory expression type-arguments))
  (^js [node-factory expression type-arguments arguments-array]
   (.createCallExpression ^js node-factory expression type-arguments arguments-array)))

(defn update-call-expression
  "**Parameters:**
   - `node`: `CallExpression`
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[]`
   
   **Returns:** `CallExpression`"
  (^js [node-factory node expression]
   (.updateCallExpression ^js node-factory node expression))
  (^js [node-factory node expression type-arguments]
   (.updateCallExpression ^js node-factory node expression type-arguments))
  (^js [node-factory node expression type-arguments arguments-array]
   (.updateCallExpression ^js node-factory node expression type-arguments arguments-array)))

(defn create-call-chain
  "**Parameters:**
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[] | undefined`
   
   **Returns:** `CallChain`"
  (^js [node-factory expression]
   (.createCallChain ^js node-factory expression))
  (^js [node-factory expression question-dot-token]
   (.createCallChain ^js node-factory expression question-dot-token))
  (^js [node-factory expression question-dot-token type-arguments]
   (.createCallChain ^js node-factory expression question-dot-token type-arguments))
  (^js [node-factory expression question-dot-token type-arguments arguments-array]
   (.createCallChain ^js node-factory expression question-dot-token type-arguments arguments-array)))

(defn update-call-chain
  "**Parameters:**
   - `node`: `CallChain`
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[]`
   
   **Returns:** `CallChain`"
  (^js [node-factory node expression]
   (.updateCallChain ^js node-factory node expression))
  (^js [node-factory node expression question-dot-token]
   (.updateCallChain ^js node-factory node expression question-dot-token))
  (^js [node-factory node expression question-dot-token type-arguments]
   (.updateCallChain ^js node-factory node expression question-dot-token type-arguments))
  (^js [node-factory node expression question-dot-token type-arguments arguments-array]
   (.updateCallChain ^js node-factory node expression question-dot-token type-arguments arguments-array)))

(defn create-new-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[] | undefined`
   
   **Returns:** `NewExpression`"
  (^js [node-factory expression]
   (.createNewExpression ^js node-factory expression))
  (^js [node-factory expression type-arguments]
   (.createNewExpression ^js node-factory expression type-arguments))
  (^js [node-factory expression type-arguments arguments-array]
   (.createNewExpression ^js node-factory expression type-arguments arguments-array)))

(defn update-new-expression
  "**Parameters:**
   - `node`: `NewExpression`
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[] | undefined`
   
   **Returns:** `NewExpression`"
  (^js [node-factory node expression]
   (.updateNewExpression ^js node-factory node expression))
  (^js [node-factory node expression type-arguments]
   (.updateNewExpression ^js node-factory node expression type-arguments))
  (^js [node-factory node expression type-arguments arguments-array]
   (.updateNewExpression ^js node-factory node expression type-arguments arguments-array)))

(defn create-tagged-template-expression
  "**Parameters:**
   - `tag`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `template`: `TemplateLiteral`
   
   **Returns:** `TaggedTemplateExpression`"
  (^js [node-factory tag]
   (.createTaggedTemplateExpression ^js node-factory tag))
  (^js [node-factory tag type-arguments]
   (.createTaggedTemplateExpression ^js node-factory tag type-arguments))
  (^js [node-factory tag type-arguments template]
   (.createTaggedTemplateExpression ^js node-factory tag type-arguments template)))

(defn update-tagged-template-expression
  "**Parameters:**
   - `node`: `TaggedTemplateExpression`
   - `tag`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `template`: `TemplateLiteral`
   
   **Returns:** `TaggedTemplateExpression`"
  (^js [node-factory node tag]
   (.updateTaggedTemplateExpression ^js node-factory node tag))
  (^js [node-factory node tag type-arguments]
   (.updateTaggedTemplateExpression ^js node-factory node tag type-arguments))
  (^js [node-factory node tag type-arguments template]
   (.updateTaggedTemplateExpression ^js node-factory node tag type-arguments template)))

(defn create-type-assertion
  "**Parameters:**
   - `type`: `TypeNode`
   - `expression`: `Expression`
   
   **Returns:** `TypeAssertion`"
  ^js [node-factory type expression]
  (.createTypeAssertion ^js node-factory type expression))

(defn update-type-assertion
  "**Parameters:**
   - `node`: `TypeAssertion`
   - `type`: `TypeNode`
   - `expression`: `Expression`
   
   **Returns:** `TypeAssertion`"
  ^js [node-factory node type expression]
  (.updateTypeAssertion ^js node-factory node type expression))

(defn create-parenthesized-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ParenthesizedExpression`"
  ^js [node-factory expression]
  (.createParenthesizedExpression ^js node-factory expression))

(defn update-parenthesized-expression
  "**Parameters:**
   - `node`: `ParenthesizedExpression`
   - `expression`: `Expression`
   
   **Returns:** `ParenthesizedExpression`"
  ^js [node-factory node expression]
  (.updateParenthesizedExpression ^js node-factory node expression))

(defn create-function-expression
  "**Parameters:**
   - `modifiers`: `readonly Modifier[] | undefined`
   - `asterisk-token`: `AsteriskToken | undefined`
   - `name`: `string | Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[] | undefined`
   - `type`: `TypeNode | undefined`
   - `body`: `Block`
   
   **Returns:** `FunctionExpression`"
  (^js [node-factory]
   (.createFunctionExpression ^js node-factory))
  (^js [node-factory modifiers]
   (.createFunctionExpression ^js node-factory modifiers))
  (^js [node-factory modifiers asterisk-token]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token))
  (^js [node-factory modifiers asterisk-token name]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token name))
  (^js [node-factory modifiers asterisk-token name type-parameters]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token name type-parameters))
  (^js [node-factory modifiers asterisk-token name type-parameters parameters]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token name type-parameters parameters))
  (^js [node-factory modifiers asterisk-token name type-parameters parameters type]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token name type-parameters parameters type))
  (^js [node-factory modifiers asterisk-token name type-parameters parameters type body]
   (.createFunctionExpression ^js node-factory modifiers asterisk-token name type-parameters parameters type body)))

(defn update-function-expression
  "**Parameters:**
   - `node`: `FunctionExpression`
   - `modifiers`: `readonly Modifier[] | undefined`
   - `asterisk-token`: `AsteriskToken | undefined`
   - `name`: `Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `body`: `Block`
   
   **Returns:** `FunctionExpression`"
  (^js [node-factory node]
   (.updateFunctionExpression ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateFunctionExpression ^js node-factory node modifiers))
  (^js [node-factory node modifiers asterisk-token]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token))
  (^js [node-factory node modifiers asterisk-token name]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token name))
  (^js [node-factory node modifiers asterisk-token name type-parameters]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token name type-parameters))
  (^js [node-factory node modifiers asterisk-token name type-parameters parameters]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token name type-parameters parameters))
  (^js [node-factory node modifiers asterisk-token name type-parameters parameters type]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token name type-parameters parameters type))
  (^js [node-factory node modifiers asterisk-token name type-parameters parameters type body]
   (.updateFunctionExpression ^js node-factory node modifiers asterisk-token name type-parameters parameters type body)))

(defn create-arrow-function
  "**Parameters:**
   - `modifiers`: `readonly Modifier[] | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `equals-greater-than-token`: `EqualsGreaterThanToken | undefined`
   - `body`: `ConciseBody`
   
   **Returns:** `ArrowFunction`"
  (^js [node-factory]
   (.createArrowFunction ^js node-factory))
  (^js [node-factory modifiers]
   (.createArrowFunction ^js node-factory modifiers))
  (^js [node-factory modifiers type-parameters]
   (.createArrowFunction ^js node-factory modifiers type-parameters))
  (^js [node-factory modifiers type-parameters parameters]
   (.createArrowFunction ^js node-factory modifiers type-parameters parameters))
  (^js [node-factory modifiers type-parameters parameters type]
   (.createArrowFunction ^js node-factory modifiers type-parameters parameters type))
  (^js [node-factory modifiers type-parameters parameters type equals-greater-than-token]
   (.createArrowFunction ^js node-factory modifiers type-parameters parameters type equals-greater-than-token))
  (^js [node-factory modifiers type-parameters parameters type equals-greater-than-token body]
   (.createArrowFunction ^js node-factory modifiers type-parameters parameters type equals-greater-than-token body)))

(defn update-arrow-function
  "**Parameters:**
   - `node`: `ArrowFunction`
   - `modifiers`: `readonly Modifier[] | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `equals-greater-than-token`: `EqualsGreaterThanToken`
   - `body`: `ConciseBody`
   
   **Returns:** `ArrowFunction`"
  (^js [node-factory node]
   (.updateArrowFunction ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateArrowFunction ^js node-factory node modifiers))
  (^js [node-factory node modifiers type-parameters]
   (.updateArrowFunction ^js node-factory node modifiers type-parameters))
  (^js [node-factory node modifiers type-parameters parameters]
   (.updateArrowFunction ^js node-factory node modifiers type-parameters parameters))
  (^js [node-factory node modifiers type-parameters parameters type]
   (.updateArrowFunction ^js node-factory node modifiers type-parameters parameters type))
  (^js [node-factory node modifiers type-parameters parameters type equals-greater-than-token]
   (.updateArrowFunction ^js node-factory node modifiers type-parameters parameters type equals-greater-than-token))
  (^js [node-factory node modifiers type-parameters parameters type equals-greater-than-token body]
   (.updateArrowFunction ^js node-factory node modifiers type-parameters parameters type equals-greater-than-token body)))

(defn create-delete-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `DeleteExpression`"
  ^js [node-factory expression]
  (.createDeleteExpression ^js node-factory expression))

(defn update-delete-expression
  "**Parameters:**
   - `node`: `DeleteExpression`
   - `expression`: `Expression`
   
   **Returns:** `DeleteExpression`"
  ^js [node-factory node expression]
  (.updateDeleteExpression ^js node-factory node expression))

(defn create-type-of-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `TypeOfExpression`"
  ^js [node-factory expression]
  (.createTypeOfExpression ^js node-factory expression))

(defn update-type-of-expression
  "**Parameters:**
   - `node`: `TypeOfExpression`
   - `expression`: `Expression`
   
   **Returns:** `TypeOfExpression`"
  ^js [node-factory node expression]
  (.updateTypeOfExpression ^js node-factory node expression))

(defn create-void-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `VoidExpression`"
  ^js [node-factory expression]
  (.createVoidExpression ^js node-factory expression))

(defn update-void-expression
  "**Parameters:**
   - `node`: `VoidExpression`
   - `expression`: `Expression`
   
   **Returns:** `VoidExpression`"
  ^js [node-factory node expression]
  (.updateVoidExpression ^js node-factory node expression))

(defn create-await-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `AwaitExpression`"
  ^js [node-factory expression]
  (.createAwaitExpression ^js node-factory expression))

(defn update-await-expression
  "**Parameters:**
   - `node`: `AwaitExpression`
   - `expression`: `Expression`
   
   **Returns:** `AwaitExpression`"
  ^js [node-factory node expression]
  (.updateAwaitExpression ^js node-factory node expression))

(defn create-prefix-unary-expression
  "**Parameters:**
   - `operator`: `PrefixUnaryOperator`
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [node-factory operator operand]
  (.createPrefixUnaryExpression ^js node-factory operator operand))

(defn update-prefix-unary-expression
  "**Parameters:**
   - `node`: `PrefixUnaryExpression`
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [node-factory node operand]
  (.updatePrefixUnaryExpression ^js node-factory node operand))

(defn create-postfix-unary-expression
  "**Parameters:**
   - `operand`: `Expression`
   - `operator`: `PostfixUnaryOperator`
   
   **Returns:** `PostfixUnaryExpression`"
  ^js [node-factory operand operator]
  (.createPostfixUnaryExpression ^js node-factory operand operator))

(defn update-postfix-unary-expression
  "**Parameters:**
   - `node`: `PostfixUnaryExpression`
   - `operand`: `Expression`
   
   **Returns:** `PostfixUnaryExpression`"
  ^js [node-factory node operand]
  (.updatePostfixUnaryExpression ^js node-factory node operand))

(defn create-binary-expression
  "**Parameters:**
   - `left`: `Expression`
   - `operator`: `BinaryOperator | BinaryOperatorToken`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left operator right]
  (.createBinaryExpression ^js node-factory left operator right))

(defn update-binary-expression
  "**Parameters:**
   - `node`: `BinaryExpression`
   - `left`: `Expression`
   - `operator`: `BinaryOperator | BinaryOperatorToken`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory node left operator right]
  (.updateBinaryExpression ^js node-factory node left operator right))

(defn create-conditional-expression
  "**Parameters:**
   - `condition`: `Expression`
   - `question-token`: `QuestionToken | undefined`
   - `when-true`: `Expression`
   - `colon-token`: `ColonToken | undefined`
   - `when-false`: `Expression`
   
   **Returns:** `ConditionalExpression`"
  (^js [node-factory condition]
   (.createConditionalExpression ^js node-factory condition))
  (^js [node-factory condition question-token]
   (.createConditionalExpression ^js node-factory condition question-token))
  (^js [node-factory condition question-token when-true]
   (.createConditionalExpression ^js node-factory condition question-token when-true))
  (^js [node-factory condition question-token when-true colon-token]
   (.createConditionalExpression ^js node-factory condition question-token when-true colon-token))
  (^js [node-factory condition question-token when-true colon-token when-false]
   (.createConditionalExpression ^js node-factory condition question-token when-true colon-token when-false)))

(defn update-conditional-expression
  "**Parameters:**
   - `node`: `ConditionalExpression`
   - `condition`: `Expression`
   - `question-token`: `QuestionToken`
   - `when-true`: `Expression`
   - `colon-token`: `ColonToken`
   - `when-false`: `Expression`
   
   **Returns:** `ConditionalExpression`"
  ^js [node-factory node condition question-token when-true colon-token when-false]
  (.updateConditionalExpression ^js node-factory node condition question-token when-true colon-token when-false))

(defn create-template-expression
  "**Parameters:**
   - `head`: `TemplateHead`
   - `template-spans`: `readonly TemplateSpan[]`
   
   **Returns:** `TemplateExpression`"
  ^js [node-factory head template-spans]
  (.createTemplateExpression ^js node-factory head template-spans))

(defn update-template-expression
  "**Parameters:**
   - `node`: `TemplateExpression`
   - `head`: `TemplateHead`
   - `template-spans`: `readonly TemplateSpan[]`
   
   **Returns:** `TemplateExpression`"
  ^js [node-factory node head template-spans]
  (.updateTemplateExpression ^js node-factory node head template-spans))

(defn create-template-head
  "**Parameters:**
   - `text`: `string | undefined`
   - `raw-text`: `string`
   - `template-flags`: `TokenFlags | undefined`
   
   **Returns:** `TemplateHead`"
  (^js [node-factory]
   (.createTemplateHead ^js node-factory))
  (^js [node-factory text]
   (.createTemplateHead ^js node-factory text))
  (^js [node-factory text raw-text]
   (.createTemplateHead ^js node-factory text raw-text))
  (^js [node-factory text raw-text template-flags]
   (.createTemplateHead ^js node-factory text raw-text template-flags)))

(defn create-template-middle
  "**Parameters:**
   - `text`: `string | undefined`
   - `raw-text`: `string`
   - `template-flags`: `TokenFlags | undefined`
   
   **Returns:** `TemplateMiddle`"
  (^js [node-factory]
   (.createTemplateMiddle ^js node-factory))
  (^js [node-factory text]
   (.createTemplateMiddle ^js node-factory text))
  (^js [node-factory text raw-text]
   (.createTemplateMiddle ^js node-factory text raw-text))
  (^js [node-factory text raw-text template-flags]
   (.createTemplateMiddle ^js node-factory text raw-text template-flags)))

(defn create-template-tail
  "**Parameters:**
   - `text`: `string | undefined`
   - `raw-text`: `string`
   - `template-flags`: `TokenFlags | undefined`
   
   **Returns:** `TemplateTail`"
  (^js [node-factory]
   (.createTemplateTail ^js node-factory))
  (^js [node-factory text]
   (.createTemplateTail ^js node-factory text))
  (^js [node-factory text raw-text]
   (.createTemplateTail ^js node-factory text raw-text))
  (^js [node-factory text raw-text template-flags]
   (.createTemplateTail ^js node-factory text raw-text template-flags)))

(defn create-no-substitution-template-literal
  "**Parameters:**
   - `text`: `string | undefined`
   - `raw-text`: `string`
   
   **Returns:** `NoSubstitutionTemplateLiteral`"
  (^js [node-factory]
   (.createNoSubstitutionTemplateLiteral ^js node-factory))
  (^js [node-factory text]
   (.createNoSubstitutionTemplateLiteral ^js node-factory text))
  (^js [node-factory text raw-text]
   (.createNoSubstitutionTemplateLiteral ^js node-factory text raw-text)))

(defn create-yield-expression
  "**Parameters:**
   - `asterisk-token`: `undefined`
   - `expression`: `Expression | undefined`
   
   **Returns:** `YieldExpression`"
  (^js [node-factory]
   (.createYieldExpression ^js node-factory))
  (^js [node-factory asterisk-token]
   (.createYieldExpression ^js node-factory asterisk-token))
  (^js [node-factory asterisk-token expression]
   (.createYieldExpression ^js node-factory asterisk-token expression)))

(defn update-yield-expression
  "**Parameters:**
   - `node`: `YieldExpression`
   - `asterisk-token`: `AsteriskToken | undefined`
   - `expression`: `Expression | undefined`
   
   **Returns:** `YieldExpression`"
  (^js [node-factory node]
   (.updateYieldExpression ^js node-factory node))
  (^js [node-factory node asterisk-token]
   (.updateYieldExpression ^js node-factory node asterisk-token))
  (^js [node-factory node asterisk-token expression]
   (.updateYieldExpression ^js node-factory node asterisk-token expression)))

(defn create-spread-element
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `SpreadElement`"
  ^js [node-factory expression]
  (.createSpreadElement ^js node-factory expression))

(defn update-spread-element
  "**Parameters:**
   - `node`: `SpreadElement`
   - `expression`: `Expression`
   
   **Returns:** `SpreadElement`"
  ^js [node-factory node expression]
  (.updateSpreadElement ^js node-factory node expression))

(defn create-class-expression
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly ClassElement[]`
   
   **Returns:** `ClassExpression`"
  (^js [node-factory]
   (.createClassExpression ^js node-factory))
  (^js [node-factory modifiers]
   (.createClassExpression ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createClassExpression ^js node-factory modifiers name))
  (^js [node-factory modifiers name type-parameters]
   (.createClassExpression ^js node-factory modifiers name type-parameters))
  (^js [node-factory modifiers name type-parameters heritage-clauses]
   (.createClassExpression ^js node-factory modifiers name type-parameters heritage-clauses))
  (^js [node-factory modifiers name type-parameters heritage-clauses members]
   (.createClassExpression ^js node-factory modifiers name type-parameters heritage-clauses members)))

(defn update-class-expression
  "**Parameters:**
   - `node`: `ClassExpression`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly ClassElement[]`
   
   **Returns:** `ClassExpression`"
  (^js [node-factory node]
   (.updateClassExpression ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateClassExpression ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updateClassExpression ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name type-parameters]
   (.updateClassExpression ^js node-factory node modifiers name type-parameters))
  (^js [node-factory node modifiers name type-parameters heritage-clauses]
   (.updateClassExpression ^js node-factory node modifiers name type-parameters heritage-clauses))
  (^js [node-factory node modifiers name type-parameters heritage-clauses members]
   (.updateClassExpression ^js node-factory node modifiers name type-parameters heritage-clauses members)))

(defn create-omitted-expression
  "**Returns:** `OmittedExpression`"
  ^js [node-factory]
  (.createOmittedExpression ^js node-factory))

(defn create-expression-with-type-arguments
  "**Parameters:**
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   
   **Returns:** `ExpressionWithTypeArguments`"
  (^js [node-factory expression]
   (.createExpressionWithTypeArguments ^js node-factory expression))
  (^js [node-factory expression type-arguments]
   (.createExpressionWithTypeArguments ^js node-factory expression type-arguments)))

(defn update-expression-with-type-arguments
  "**Parameters:**
   - `node`: `ExpressionWithTypeArguments`
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   
   **Returns:** `ExpressionWithTypeArguments`"
  (^js [node-factory node expression]
   (.updateExpressionWithTypeArguments ^js node-factory node expression))
  (^js [node-factory node expression type-arguments]
   (.updateExpressionWithTypeArguments ^js node-factory node expression type-arguments)))

(defn create-as-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `type`: `TypeNode`
   
   **Returns:** `AsExpression`"
  ^js [node-factory expression type]
  (.createAsExpression ^js node-factory expression type))

(defn update-as-expression
  "**Parameters:**
   - `node`: `AsExpression`
   - `expression`: `Expression`
   - `type`: `TypeNode`
   
   **Returns:** `AsExpression`"
  ^js [node-factory node expression type]
  (.updateAsExpression ^js node-factory node expression type))

(defn create-non-null-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `NonNullExpression`"
  ^js [node-factory expression]
  (.createNonNullExpression ^js node-factory expression))

(defn update-non-null-expression
  "**Parameters:**
   - `node`: `NonNullExpression`
   - `expression`: `Expression`
   
   **Returns:** `NonNullExpression`"
  ^js [node-factory node expression]
  (.updateNonNullExpression ^js node-factory node expression))

(defn create-non-null-chain
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `NonNullChain`"
  ^js [node-factory expression]
  (.createNonNullChain ^js node-factory expression))

(defn update-non-null-chain
  "**Parameters:**
   - `node`: `NonNullChain`
   - `expression`: `Expression`
   
   **Returns:** `NonNullChain`"
  ^js [node-factory node expression]
  (.updateNonNullChain ^js node-factory node expression))

(defn create-meta-property
  "**Parameters:**
   - `keyword-token`: `SyntaxKind.ImportKeyword | SyntaxKind.NewKeyword`
   - `name`: `Identifier`
   
   **Returns:** `MetaProperty`"
  ^js [node-factory keyword-token name]
  (.createMetaProperty ^js node-factory keyword-token name))

(defn update-meta-property
  "**Parameters:**
   - `node`: `MetaProperty`
   - `name`: `Identifier`
   
   **Returns:** `MetaProperty`"
  ^js [node-factory node name]
  (.updateMetaProperty ^js node-factory node name))

(defn create-satisfies-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `type`: `TypeNode`
   
   **Returns:** `SatisfiesExpression`"
  ^js [node-factory expression type]
  (.createSatisfiesExpression ^js node-factory expression type))

(defn update-satisfies-expression
  "**Parameters:**
   - `node`: `SatisfiesExpression`
   - `expression`: `Expression`
   - `type`: `TypeNode`
   
   **Returns:** `SatisfiesExpression`"
  ^js [node-factory node expression type]
  (.updateSatisfiesExpression ^js node-factory node expression type))

(defn create-template-span
  "**Parameters:**
   - `expression`: `Expression`
   - `literal`: `TemplateMiddle | TemplateTail`
   
   **Returns:** `TemplateSpan`"
  ^js [node-factory expression literal]
  (.createTemplateSpan ^js node-factory expression literal))

(defn update-template-span
  "**Parameters:**
   - `node`: `TemplateSpan`
   - `expression`: `Expression`
   - `literal`: `TemplateMiddle | TemplateTail`
   
   **Returns:** `TemplateSpan`"
  ^js [node-factory node expression literal]
  (.updateTemplateSpan ^js node-factory node expression literal))

(defn create-semicolon-class-element
  "**Returns:** `SemicolonClassElement`"
  ^js [node-factory]
  (.createSemicolonClassElement ^js node-factory))

(defn create-block
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `Block`"
  (^js [node-factory statements]
   (.createBlock ^js node-factory statements))
  (^js [node-factory statements multi-line?]
   (.createBlock ^js node-factory statements multi-line?)))

(defn update-block
  "**Parameters:**
   - `node`: `Block`
   - `statements`: `readonly Statement[]`
   
   **Returns:** `Block`"
  ^js [node-factory node statements]
  (.updateBlock ^js node-factory node statements))

(defn create-variable-statement
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `declaration-list`: `VariableDeclarationList | readonly VariableDeclaration[]`
   
   **Returns:** `VariableStatement`"
  (^js [node-factory]
   (.createVariableStatement ^js node-factory))
  (^js [node-factory modifiers]
   (.createVariableStatement ^js node-factory modifiers))
  (^js [node-factory modifiers declaration-list]
   (.createVariableStatement ^js node-factory modifiers declaration-list)))

(defn update-variable-statement
  "**Parameters:**
   - `node`: `VariableStatement`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `declaration-list`: `VariableDeclarationList`
   
   **Returns:** `VariableStatement`"
  (^js [node-factory node]
   (.updateVariableStatement ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateVariableStatement ^js node-factory node modifiers))
  (^js [node-factory node modifiers declaration-list]
   (.updateVariableStatement ^js node-factory node modifiers declaration-list)))

(defn create-empty-statement
  "**Returns:** `EmptyStatement`"
  ^js [node-factory]
  (.createEmptyStatement ^js node-factory))

(defn create-expression-statement
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ExpressionStatement`"
  ^js [node-factory expression]
  (.createExpressionStatement ^js node-factory expression))

(defn update-expression-statement
  "**Parameters:**
   - `node`: `ExpressionStatement`
   - `expression`: `Expression`
   
   **Returns:** `ExpressionStatement`"
  ^js [node-factory node expression]
  (.updateExpressionStatement ^js node-factory node expression))

(defn create-if-statement
  "**Parameters:**
   - `expression`: `Expression`
   - `then-statement`: `Statement`
   - `else-statement`: `Statement | undefined`
   
   **Returns:** `IfStatement`"
  (^js [node-factory expression then-statement]
   (.createIfStatement ^js node-factory expression then-statement))
  (^js [node-factory expression then-statement else-statement]
   (.createIfStatement ^js node-factory expression then-statement else-statement)))

(defn update-if-statement
  "**Parameters:**
   - `node`: `IfStatement`
   - `expression`: `Expression`
   - `then-statement`: `Statement`
   - `else-statement`: `Statement | undefined`
   
   **Returns:** `IfStatement`"
  (^js [node-factory node expression then-statement]
   (.updateIfStatement ^js node-factory node expression then-statement))
  (^js [node-factory node expression then-statement else-statement]
   (.updateIfStatement ^js node-factory node expression then-statement else-statement)))

(defn create-do-statement
  "**Parameters:**
   - `statement`: `Statement`
   - `expression`: `Expression`
   
   **Returns:** `DoStatement`"
  ^js [node-factory statement expression]
  (.createDoStatement ^js node-factory statement expression))

(defn update-do-statement
  "**Parameters:**
   - `node`: `DoStatement`
   - `statement`: `Statement`
   - `expression`: `Expression`
   
   **Returns:** `DoStatement`"
  ^js [node-factory node statement expression]
  (.updateDoStatement ^js node-factory node statement expression))

(defn create-while-statement
  "**Parameters:**
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `WhileStatement`"
  ^js [node-factory expression statement]
  (.createWhileStatement ^js node-factory expression statement))

(defn update-while-statement
  "**Parameters:**
   - `node`: `WhileStatement`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `WhileStatement`"
  ^js [node-factory node expression statement]
  (.updateWhileStatement ^js node-factory node expression statement))

(defn create-for-statement
  "**Parameters:**
   - `initializer`: `ForInitializer | undefined`
   - `condition`: `Expression | undefined`
   - `incrementor`: `Expression | undefined`
   - `statement`: `Statement`
   
   **Returns:** `ForStatement`"
  (^js [node-factory]
   (.createForStatement ^js node-factory))
  (^js [node-factory initializer]
   (.createForStatement ^js node-factory initializer))
  (^js [node-factory initializer condition]
   (.createForStatement ^js node-factory initializer condition))
  (^js [node-factory initializer condition incrementor]
   (.createForStatement ^js node-factory initializer condition incrementor))
  (^js [node-factory initializer condition incrementor statement]
   (.createForStatement ^js node-factory initializer condition incrementor statement)))

(defn update-for-statement
  "**Parameters:**
   - `node`: `ForStatement`
   - `initializer`: `ForInitializer | undefined`
   - `condition`: `Expression | undefined`
   - `incrementor`: `Expression | undefined`
   - `statement`: `Statement`
   
   **Returns:** `ForStatement`"
  (^js [node-factory node]
   (.updateForStatement ^js node-factory node))
  (^js [node-factory node initializer]
   (.updateForStatement ^js node-factory node initializer))
  (^js [node-factory node initializer condition]
   (.updateForStatement ^js node-factory node initializer condition))
  (^js [node-factory node initializer condition incrementor]
   (.updateForStatement ^js node-factory node initializer condition incrementor))
  (^js [node-factory node initializer condition incrementor statement]
   (.updateForStatement ^js node-factory node initializer condition incrementor statement)))

(defn create-for-in-statement
  "**Parameters:**
   - `initializer`: `ForInitializer`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `ForInStatement`"
  ^js [node-factory initializer expression statement]
  (.createForInStatement ^js node-factory initializer expression statement))

(defn update-for-in-statement
  "**Parameters:**
   - `node`: `ForInStatement`
   - `initializer`: `ForInitializer`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `ForInStatement`"
  ^js [node-factory node initializer expression statement]
  (.updateForInStatement ^js node-factory node initializer expression statement))

(defn create-for-of-statement
  "**Parameters:**
   - `await-modifier`: `AwaitKeyword | undefined`
   - `initializer`: `ForInitializer`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `ForOfStatement`"
  (^js [node-factory]
   (.createForOfStatement ^js node-factory))
  (^js [node-factory await-modifier]
   (.createForOfStatement ^js node-factory await-modifier))
  (^js [node-factory await-modifier initializer]
   (.createForOfStatement ^js node-factory await-modifier initializer))
  (^js [node-factory await-modifier initializer expression]
   (.createForOfStatement ^js node-factory await-modifier initializer expression))
  (^js [node-factory await-modifier initializer expression statement]
   (.createForOfStatement ^js node-factory await-modifier initializer expression statement)))

(defn update-for-of-statement
  "**Parameters:**
   - `node`: `ForOfStatement`
   - `await-modifier`: `AwaitKeyword | undefined`
   - `initializer`: `ForInitializer`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `ForOfStatement`"
  (^js [node-factory node]
   (.updateForOfStatement ^js node-factory node))
  (^js [node-factory node await-modifier]
   (.updateForOfStatement ^js node-factory node await-modifier))
  (^js [node-factory node await-modifier initializer]
   (.updateForOfStatement ^js node-factory node await-modifier initializer))
  (^js [node-factory node await-modifier initializer expression]
   (.updateForOfStatement ^js node-factory node await-modifier initializer expression))
  (^js [node-factory node await-modifier initializer expression statement]
   (.updateForOfStatement ^js node-factory node await-modifier initializer expression statement)))

(defn create-continue-statement
  "**Parameters:**
   - `label`: `string | Identifier | undefined`
   
   **Returns:** `ContinueStatement`"
  (^js [node-factory]
   (.createContinueStatement ^js node-factory))
  (^js [node-factory label]
   (.createContinueStatement ^js node-factory label)))

(defn update-continue-statement
  "**Parameters:**
   - `node`: `ContinueStatement`
   - `label`: `Identifier | undefined`
   
   **Returns:** `ContinueStatement`"
  (^js [node-factory node]
   (.updateContinueStatement ^js node-factory node))
  (^js [node-factory node label]
   (.updateContinueStatement ^js node-factory node label)))

(defn create-break-statement
  "**Parameters:**
   - `label`: `string | Identifier | undefined`
   
   **Returns:** `BreakStatement`"
  (^js [node-factory]
   (.createBreakStatement ^js node-factory))
  (^js [node-factory label]
   (.createBreakStatement ^js node-factory label)))

(defn update-break-statement
  "**Parameters:**
   - `node`: `BreakStatement`
   - `label`: `Identifier | undefined`
   
   **Returns:** `BreakStatement`"
  (^js [node-factory node]
   (.updateBreakStatement ^js node-factory node))
  (^js [node-factory node label]
   (.updateBreakStatement ^js node-factory node label)))

(defn create-return-statement
  "**Parameters:**
   - `expression`: `Expression | undefined`
   
   **Returns:** `ReturnStatement`"
  (^js [node-factory]
   (.createReturnStatement ^js node-factory))
  (^js [node-factory expression]
   (.createReturnStatement ^js node-factory expression)))

(defn update-return-statement
  "**Parameters:**
   - `node`: `ReturnStatement`
   - `expression`: `Expression | undefined`
   
   **Returns:** `ReturnStatement`"
  (^js [node-factory node]
   (.updateReturnStatement ^js node-factory node))
  (^js [node-factory node expression]
   (.updateReturnStatement ^js node-factory node expression)))

(defn create-with-statement
  "**Parameters:**
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `WithStatement`"
  ^js [node-factory expression statement]
  (.createWithStatement ^js node-factory expression statement))

(defn update-with-statement
  "**Parameters:**
   - `node`: `WithStatement`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `WithStatement`"
  ^js [node-factory node expression statement]
  (.updateWithStatement ^js node-factory node expression statement))

(defn create-switch-statement
  "**Parameters:**
   - `expression`: `Expression`
   - `case-block`: `CaseBlock`
   
   **Returns:** `SwitchStatement`"
  ^js [node-factory expression case-block]
  (.createSwitchStatement ^js node-factory expression case-block))

(defn update-switch-statement
  "**Parameters:**
   - `node`: `SwitchStatement`
   - `expression`: `Expression`
   - `case-block`: `CaseBlock`
   
   **Returns:** `SwitchStatement`"
  ^js [node-factory node expression case-block]
  (.updateSwitchStatement ^js node-factory node expression case-block))

(defn create-labeled-statement
  "**Parameters:**
   - `label`: `string | Identifier`
   - `statement`: `Statement`
   
   **Returns:** `LabeledStatement`"
  ^js [node-factory label statement]
  (.createLabeledStatement ^js node-factory label statement))

(defn update-labeled-statement
  "**Parameters:**
   - `node`: `LabeledStatement`
   - `label`: `Identifier`
   - `statement`: `Statement`
   
   **Returns:** `LabeledStatement`"
  ^js [node-factory node label statement]
  (.updateLabeledStatement ^js node-factory node label statement))

(defn create-throw-statement
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ThrowStatement`"
  ^js [node-factory expression]
  (.createThrowStatement ^js node-factory expression))

(defn update-throw-statement
  "**Parameters:**
   - `node`: `ThrowStatement`
   - `expression`: `Expression`
   
   **Returns:** `ThrowStatement`"
  ^js [node-factory node expression]
  (.updateThrowStatement ^js node-factory node expression))

(defn create-try-statement
  "**Parameters:**
   - `try-block`: `Block`
   - `catch-clause`: `CatchClause | undefined`
   - `finally-block`: `Block | undefined`
   
   **Returns:** `TryStatement`"
  (^js [node-factory try-block]
   (.createTryStatement ^js node-factory try-block))
  (^js [node-factory try-block catch-clause]
   (.createTryStatement ^js node-factory try-block catch-clause))
  (^js [node-factory try-block catch-clause finally-block]
   (.createTryStatement ^js node-factory try-block catch-clause finally-block)))

(defn update-try-statement
  "**Parameters:**
   - `node`: `TryStatement`
   - `try-block`: `Block`
   - `catch-clause`: `CatchClause | undefined`
   - `finally-block`: `Block | undefined`
   
   **Returns:** `TryStatement`"
  (^js [node-factory node try-block]
   (.updateTryStatement ^js node-factory node try-block))
  (^js [node-factory node try-block catch-clause]
   (.updateTryStatement ^js node-factory node try-block catch-clause))
  (^js [node-factory node try-block catch-clause finally-block]
   (.updateTryStatement ^js node-factory node try-block catch-clause finally-block)))

(defn create-debugger-statement
  "**Returns:** `DebuggerStatement`"
  ^js [node-factory]
  (.createDebuggerStatement ^js node-factory))

(defn create-variable-declaration
  "**Parameters:**
   - `name`: `string | BindingName`
   - `exclamation-token`: `ExclamationToken | undefined`
   - `type`: `TypeNode | undefined`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `VariableDeclaration`"
  (^js [node-factory name]
   (.createVariableDeclaration ^js node-factory name))
  (^js [node-factory name exclamation-token]
   (.createVariableDeclaration ^js node-factory name exclamation-token))
  (^js [node-factory name exclamation-token type]
   (.createVariableDeclaration ^js node-factory name exclamation-token type))
  (^js [node-factory name exclamation-token type initializer]
   (.createVariableDeclaration ^js node-factory name exclamation-token type initializer)))

(defn update-variable-declaration
  "**Parameters:**
   - `node`: `VariableDeclaration`
   - `name`: `BindingName`
   - `exclamation-token`: `ExclamationToken | undefined`
   - `type`: `TypeNode | undefined`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `VariableDeclaration`"
  (^js [node-factory node name]
   (.updateVariableDeclaration ^js node-factory node name))
  (^js [node-factory node name exclamation-token]
   (.updateVariableDeclaration ^js node-factory node name exclamation-token))
  (^js [node-factory node name exclamation-token type]
   (.updateVariableDeclaration ^js node-factory node name exclamation-token type))
  (^js [node-factory node name exclamation-token type initializer]
   (.updateVariableDeclaration ^js node-factory node name exclamation-token type initializer)))

(defn create-variable-declaration-list
  "**Parameters:**
   - `declarations`: `readonly VariableDeclaration[]`
   - `flags`: `NodeFlags | undefined`
   
   **Returns:** `VariableDeclarationList`"
  (^js [node-factory declarations]
   (.createVariableDeclarationList ^js node-factory declarations))
  (^js [node-factory declarations flags]
   (.createVariableDeclarationList ^js node-factory declarations flags)))

(defn update-variable-declaration-list
  "**Parameters:**
   - `node`: `VariableDeclarationList`
   - `declarations`: `readonly VariableDeclaration[]`
   
   **Returns:** `VariableDeclarationList`"
  ^js [node-factory node declarations]
  (.updateVariableDeclarationList ^js node-factory node declarations))

(defn create-function-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `asterisk-token`: `AsteriskToken | undefined`
   - `name`: `string | Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `body`: `Block | undefined`
   
   **Returns:** `FunctionDeclaration`"
  (^js [node-factory]
   (.createFunctionDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createFunctionDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers asterisk-token]
   (.createFunctionDeclaration ^js node-factory modifiers asterisk-token))
  (^js [node-factory modifiers asterisk-token name]
   (.createFunctionDeclaration ^js node-factory modifiers asterisk-token name))
  (^js [node-factory modifiers asterisk-token name type-parameters]
   (.createFunctionDeclaration ^js node-factory modifiers asterisk-token name type-parameters))
  (^js [node-factory modifiers asterisk-token name type-parameters parameters]
   (.createFunctionDeclaration ^js node-factory modifiers asterisk-token name type-parameters parameters))
  (^js [node-factory modifiers asterisk-token name type-parameters parameters type]
   (.createFunctionDeclaration ^js node-factory modifiers asterisk-token name type-parameters parameters type))
  (^js [node-factory modifiers asterisk-token name type-parameters parameters type body]
   (.createFunctionDeclaration ^js node-factory modifiers asterisk-token name type-parameters parameters type body)))

(defn update-function-declaration
  "**Parameters:**
   - `node`: `FunctionDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `asterisk-token`: `AsteriskToken | undefined`
   - `name`: `Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `body`: `Block | undefined`
   
   **Returns:** `FunctionDeclaration`"
  (^js [node-factory node]
   (.updateFunctionDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateFunctionDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers asterisk-token]
   (.updateFunctionDeclaration ^js node-factory node modifiers asterisk-token))
  (^js [node-factory node modifiers asterisk-token name]
   (.updateFunctionDeclaration ^js node-factory node modifiers asterisk-token name))
  (^js [node-factory node modifiers asterisk-token name type-parameters]
   (.updateFunctionDeclaration ^js node-factory node modifiers asterisk-token name type-parameters))
  (^js [node-factory node modifiers asterisk-token name type-parameters parameters]
   (.updateFunctionDeclaration ^js node-factory node modifiers asterisk-token name type-parameters parameters))
  (^js [node-factory node modifiers asterisk-token name type-parameters parameters type]
   (.updateFunctionDeclaration ^js node-factory node modifiers asterisk-token name type-parameters parameters type))
  (^js [node-factory node modifiers asterisk-token name type-parameters parameters type body]
   (.updateFunctionDeclaration ^js node-factory node modifiers asterisk-token name type-parameters parameters type body)))

(defn create-class-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly ClassElement[]`
   
   **Returns:** `ClassDeclaration`"
  (^js [node-factory]
   (.createClassDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createClassDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createClassDeclaration ^js node-factory modifiers name))
  (^js [node-factory modifiers name type-parameters]
   (.createClassDeclaration ^js node-factory modifiers name type-parameters))
  (^js [node-factory modifiers name type-parameters heritage-clauses]
   (.createClassDeclaration ^js node-factory modifiers name type-parameters heritage-clauses))
  (^js [node-factory modifiers name type-parameters heritage-clauses members]
   (.createClassDeclaration ^js node-factory modifiers name type-parameters heritage-clauses members)))

(defn update-class-declaration
  "**Parameters:**
   - `node`: `ClassDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly ClassElement[]`
   
   **Returns:** `ClassDeclaration`"
  (^js [node-factory node]
   (.updateClassDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateClassDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updateClassDeclaration ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name type-parameters]
   (.updateClassDeclaration ^js node-factory node modifiers name type-parameters))
  (^js [node-factory node modifiers name type-parameters heritage-clauses]
   (.updateClassDeclaration ^js node-factory node modifiers name type-parameters heritage-clauses))
  (^js [node-factory node modifiers name type-parameters heritage-clauses members]
   (.updateClassDeclaration ^js node-factory node modifiers name type-parameters heritage-clauses members)))

(defn create-interface-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | Identifier`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly TypeElement[]`
   
   **Returns:** `InterfaceDeclaration`"
  (^js [node-factory]
   (.createInterfaceDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createInterfaceDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createInterfaceDeclaration ^js node-factory modifiers name))
  (^js [node-factory modifiers name type-parameters]
   (.createInterfaceDeclaration ^js node-factory modifiers name type-parameters))
  (^js [node-factory modifiers name type-parameters heritage-clauses]
   (.createInterfaceDeclaration ^js node-factory modifiers name type-parameters heritage-clauses))
  (^js [node-factory modifiers name type-parameters heritage-clauses members]
   (.createInterfaceDeclaration ^js node-factory modifiers name type-parameters heritage-clauses members)))

(defn update-interface-declaration
  "**Parameters:**
   - `node`: `InterfaceDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `Identifier`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly TypeElement[]`
   
   **Returns:** `InterfaceDeclaration`"
  (^js [node-factory node]
   (.updateInterfaceDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateInterfaceDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updateInterfaceDeclaration ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name type-parameters]
   (.updateInterfaceDeclaration ^js node-factory node modifiers name type-parameters))
  (^js [node-factory node modifiers name type-parameters heritage-clauses]
   (.updateInterfaceDeclaration ^js node-factory node modifiers name type-parameters heritage-clauses))
  (^js [node-factory node modifiers name type-parameters heritage-clauses members]
   (.updateInterfaceDeclaration ^js node-factory node modifiers name type-parameters heritage-clauses members)))

(defn create-type-alias-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | Identifier`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `type`: `TypeNode`
   
   **Returns:** `TypeAliasDeclaration`"
  (^js [node-factory]
   (.createTypeAliasDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createTypeAliasDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createTypeAliasDeclaration ^js node-factory modifiers name))
  (^js [node-factory modifiers name type-parameters]
   (.createTypeAliasDeclaration ^js node-factory modifiers name type-parameters))
  (^js [node-factory modifiers name type-parameters type]
   (.createTypeAliasDeclaration ^js node-factory modifiers name type-parameters type)))

(defn update-type-alias-declaration
  "**Parameters:**
   - `node`: `TypeAliasDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `Identifier`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `type`: `TypeNode`
   
   **Returns:** `TypeAliasDeclaration`"
  (^js [node-factory node]
   (.updateTypeAliasDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateTypeAliasDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updateTypeAliasDeclaration ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name type-parameters]
   (.updateTypeAliasDeclaration ^js node-factory node modifiers name type-parameters))
  (^js [node-factory node modifiers name type-parameters type]
   (.updateTypeAliasDeclaration ^js node-factory node modifiers name type-parameters type)))

(defn create-enum-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | Identifier`
   - `members`: `readonly EnumMember[]`
   
   **Returns:** `EnumDeclaration`"
  (^js [node-factory]
   (.createEnumDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createEnumDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createEnumDeclaration ^js node-factory modifiers name))
  (^js [node-factory modifiers name members]
   (.createEnumDeclaration ^js node-factory modifiers name members)))

(defn update-enum-declaration
  "**Parameters:**
   - `node`: `EnumDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `Identifier`
   - `members`: `readonly EnumMember[]`
   
   **Returns:** `EnumDeclaration`"
  (^js [node-factory node]
   (.updateEnumDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateEnumDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updateEnumDeclaration ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name members]
   (.updateEnumDeclaration ^js node-factory node modifiers name members)))

(defn create-module-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `ModuleName`
   - `body`: `ModuleBody | undefined`
   - `flags`: `NodeFlags | undefined`
   
   **Returns:** `ModuleDeclaration`"
  (^js [node-factory]
   (.createModuleDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createModuleDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers name]
   (.createModuleDeclaration ^js node-factory modifiers name))
  (^js [node-factory modifiers name body]
   (.createModuleDeclaration ^js node-factory modifiers name body))
  (^js [node-factory modifiers name body flags]
   (.createModuleDeclaration ^js node-factory modifiers name body flags)))

(defn update-module-declaration
  "**Parameters:**
   - `node`: `ModuleDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `ModuleName`
   - `body`: `ModuleBody | undefined`
   
   **Returns:** `ModuleDeclaration`"
  (^js [node-factory node]
   (.updateModuleDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateModuleDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers name]
   (.updateModuleDeclaration ^js node-factory node modifiers name))
  (^js [node-factory node modifiers name body]
   (.updateModuleDeclaration ^js node-factory node modifiers name body)))

(defn create-module-block
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   
   **Returns:** `ModuleBlock`"
  ^js [node-factory statements]
  (.createModuleBlock ^js node-factory statements))

(defn update-module-block
  "**Parameters:**
   - `node`: `ModuleBlock`
   - `statements`: `readonly Statement[]`
   
   **Returns:** `ModuleBlock`"
  ^js [node-factory node statements]
  (.updateModuleBlock ^js node-factory node statements))

(defn create-case-block
  "**Parameters:**
   - `clauses`: `readonly CaseOrDefaultClause[]`
   
   **Returns:** `CaseBlock`"
  ^js [node-factory clauses]
  (.createCaseBlock ^js node-factory clauses))

(defn update-case-block
  "**Parameters:**
   - `node`: `CaseBlock`
   - `clauses`: `readonly CaseOrDefaultClause[]`
   
   **Returns:** `CaseBlock`"
  ^js [node-factory node clauses]
  (.updateCaseBlock ^js node-factory node clauses))

(defn create-namespace-export-declaration
  "**Parameters:**
   - `name`: `string | Identifier`
   
   **Returns:** `NamespaceExportDeclaration`"
  ^js [node-factory name]
  (.createNamespaceExportDeclaration ^js node-factory name))

(defn update-namespace-export-declaration
  "**Parameters:**
   - `node`: `NamespaceExportDeclaration`
   - `name`: `Identifier`
   
   **Returns:** `NamespaceExportDeclaration`"
  ^js [node-factory node name]
  (.updateNamespaceExportDeclaration ^js node-factory node name))

(defn create-import-equals-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `type-only?`: `boolean`
   - `name`: `string | Identifier`
   - `module-reference`: `ModuleReference`
   
   **Returns:** `ImportEqualsDeclaration`"
  (^js [node-factory]
   (.createImportEqualsDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createImportEqualsDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers type-only?]
   (.createImportEqualsDeclaration ^js node-factory modifiers type-only?))
  (^js [node-factory modifiers type-only? name]
   (.createImportEqualsDeclaration ^js node-factory modifiers type-only? name))
  (^js [node-factory modifiers type-only? name module-reference]
   (.createImportEqualsDeclaration ^js node-factory modifiers type-only? name module-reference)))

(defn update-import-equals-declaration
  "**Parameters:**
   - `node`: `ImportEqualsDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `type-only?`: `boolean`
   - `name`: `Identifier`
   - `module-reference`: `ModuleReference`
   
   **Returns:** `ImportEqualsDeclaration`"
  (^js [node-factory node]
   (.updateImportEqualsDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateImportEqualsDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers type-only?]
   (.updateImportEqualsDeclaration ^js node-factory node modifiers type-only?))
  (^js [node-factory node modifiers type-only? name]
   (.updateImportEqualsDeclaration ^js node-factory node modifiers type-only? name))
  (^js [node-factory node modifiers type-only? name module-reference]
   (.updateImportEqualsDeclaration ^js node-factory node modifiers type-only? name module-reference)))

(defn create-import-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `import-clause`: `ImportClause | undefined`
   - `module-specifier`: `Expression`
   - `attributes`: `ImportAttributes | undefined`
   
   **Returns:** `ImportDeclaration`"
  (^js [node-factory]
   (.createImportDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createImportDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers import-clause]
   (.createImportDeclaration ^js node-factory modifiers import-clause))
  (^js [node-factory modifiers import-clause module-specifier]
   (.createImportDeclaration ^js node-factory modifiers import-clause module-specifier))
  (^js [node-factory modifiers import-clause module-specifier attributes]
   (.createImportDeclaration ^js node-factory modifiers import-clause module-specifier attributes)))

(defn update-import-declaration
  "**Parameters:**
   - `node`: `ImportDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `import-clause`: `ImportClause | undefined`
   - `module-specifier`: `Expression`
   - `attributes`: `ImportAttributes | undefined`
   
   **Returns:** `ImportDeclaration`"
  (^js [node-factory node]
   (.updateImportDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateImportDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers import-clause]
   (.updateImportDeclaration ^js node-factory node modifiers import-clause))
  (^js [node-factory node modifiers import-clause module-specifier]
   (.updateImportDeclaration ^js node-factory node modifiers import-clause module-specifier))
  (^js [node-factory node modifiers import-clause module-specifier attributes]
   (.updateImportDeclaration ^js node-factory node modifiers import-clause module-specifier attributes)))

(defn create-import-clause
  "**Parameters:**
   - `type-only?`: `boolean`
   - `name`: `Identifier | undefined`
   - `named-bindings`: `NamedImportBindings | undefined`
   
   **Returns:** `ImportClause`"
  (^js [node-factory type-only?]
   (.createImportClause ^js node-factory type-only?))
  (^js [node-factory type-only? name]
   (.createImportClause ^js node-factory type-only? name))
  (^js [node-factory type-only? name named-bindings]
   (.createImportClause ^js node-factory type-only? name named-bindings)))

(defn update-import-clause
  "**Parameters:**
   - `node`: `ImportClause`
   - `type-only?`: `boolean`
   - `name`: `Identifier | undefined`
   - `named-bindings`: `NamedImportBindings | undefined`
   
   **Returns:** `ImportClause`"
  (^js [node-factory node type-only?]
   (.updateImportClause ^js node-factory node type-only?))
  (^js [node-factory node type-only? name]
   (.updateImportClause ^js node-factory node type-only? name))
  (^js [node-factory node type-only? name named-bindings]
   (.updateImportClause ^js node-factory node type-only? name named-bindings)))

(defn create-assert-clause
  "**Parameters:**
   - `elements`: `NodeArray<AssertEntry>`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `AssertClause`"
  (^js [node-factory elements]
   (.createAssertClause ^js node-factory elements))
  (^js [node-factory elements multi-line?]
   (.createAssertClause ^js node-factory elements multi-line?)))

(defn update-assert-clause
  "**Parameters:**
   - `node`: `AssertClause`
   - `elements`: `NodeArray<AssertEntry>`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `AssertClause`"
  (^js [node-factory node elements]
   (.updateAssertClause ^js node-factory node elements))
  (^js [node-factory node elements multi-line?]
   (.updateAssertClause ^js node-factory node elements multi-line?)))

(defn create-assert-entry
  "**Parameters:**
   - `name`: `ImportAttributeName`
   - `value`: `Expression`
   
   **Returns:** `AssertEntry`"
  ^js [node-factory name value]
  (.createAssertEntry ^js node-factory name value))

(defn update-assert-entry
  "**Parameters:**
   - `node`: `AssertEntry`
   - `name`: `ImportAttributeName`
   - `value`: `Expression`
   
   **Returns:** `AssertEntry`"
  ^js [node-factory node name value]
  (.updateAssertEntry ^js node-factory node name value))

(defn create-import-type-assertion-container
  "**Parameters:**
   - `clause`: `AssertClause`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ImportTypeAssertionContainer`"
  (^js [node-factory clause]
   (.createImportTypeAssertionContainer ^js node-factory clause))
  (^js [node-factory clause multi-line?]
   (.createImportTypeAssertionContainer ^js node-factory clause multi-line?)))

(defn update-import-type-assertion-container
  "**Parameters:**
   - `node`: `ImportTypeAssertionContainer`
   - `clause`: `AssertClause`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ImportTypeAssertionContainer`"
  (^js [node-factory node clause]
   (.updateImportTypeAssertionContainer ^js node-factory node clause))
  (^js [node-factory node clause multi-line?]
   (.updateImportTypeAssertionContainer ^js node-factory node clause multi-line?)))

(defn create-import-attributes
  "**Parameters:**
   - `elements`: `NodeArray<ImportAttribute>`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ImportAttributes`"
  (^js [node-factory elements]
   (.createImportAttributes ^js node-factory elements))
  (^js [node-factory elements multi-line?]
   (.createImportAttributes ^js node-factory elements multi-line?)))

(defn update-import-attributes
  "**Parameters:**
   - `node`: `ImportAttributes`
   - `elements`: `NodeArray<ImportAttribute>`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ImportAttributes`"
  (^js [node-factory node elements]
   (.updateImportAttributes ^js node-factory node elements))
  (^js [node-factory node elements multi-line?]
   (.updateImportAttributes ^js node-factory node elements multi-line?)))

(defn create-import-attribute
  "**Parameters:**
   - `name`: `ImportAttributeName`
   - `value`: `Expression`
   
   **Returns:** `ImportAttribute`"
  ^js [node-factory name value]
  (.createImportAttribute ^js node-factory name value))

(defn update-import-attribute
  "**Parameters:**
   - `node`: `ImportAttribute`
   - `name`: `ImportAttributeName`
   - `value`: `Expression`
   
   **Returns:** `ImportAttribute`"
  ^js [node-factory node name value]
  (.updateImportAttribute ^js node-factory node name value))

(defn create-namespace-import
  "**Parameters:**
   - `name`: `Identifier`
   
   **Returns:** `NamespaceImport`"
  ^js [node-factory name]
  (.createNamespaceImport ^js node-factory name))

(defn update-namespace-import
  "**Parameters:**
   - `node`: `NamespaceImport`
   - `name`: `Identifier`
   
   **Returns:** `NamespaceImport`"
  ^js [node-factory node name]
  (.updateNamespaceImport ^js node-factory node name))

(defn create-namespace-export
  "**Parameters:**
   - `name`: `Identifier`
   
   **Returns:** `NamespaceExport`"
  ^js [node-factory name]
  (.createNamespaceExport ^js node-factory name))

(defn update-namespace-export
  "**Parameters:**
   - `node`: `NamespaceExport`
   - `name`: `Identifier`
   
   **Returns:** `NamespaceExport`"
  ^js [node-factory node name]
  (.updateNamespaceExport ^js node-factory node name))

(defn create-named-imports
  "**Parameters:**
   - `elements`: `readonly ImportSpecifier[]`
   
   **Returns:** `NamedImports`"
  ^js [node-factory elements]
  (.createNamedImports ^js node-factory elements))

(defn update-named-imports
  "**Parameters:**
   - `node`: `NamedImports`
   - `elements`: `readonly ImportSpecifier[]`
   
   **Returns:** `NamedImports`"
  ^js [node-factory node elements]
  (.updateNamedImports ^js node-factory node elements))

(defn create-import-specifier
  "**Parameters:**
   - `type-only?`: `boolean`
   - `property-name`: `Identifier | undefined`
   - `name`: `Identifier`
   
   **Returns:** `ImportSpecifier`"
  (^js [node-factory type-only?]
   (.createImportSpecifier ^js node-factory type-only?))
  (^js [node-factory type-only? property-name]
   (.createImportSpecifier ^js node-factory type-only? property-name))
  (^js [node-factory type-only? property-name name]
   (.createImportSpecifier ^js node-factory type-only? property-name name)))

(defn update-import-specifier
  "**Parameters:**
   - `node`: `ImportSpecifier`
   - `type-only?`: `boolean`
   - `property-name`: `Identifier | undefined`
   - `name`: `Identifier`
   
   **Returns:** `ImportSpecifier`"
  (^js [node-factory node type-only?]
   (.updateImportSpecifier ^js node-factory node type-only?))
  (^js [node-factory node type-only? property-name]
   (.updateImportSpecifier ^js node-factory node type-only? property-name))
  (^js [node-factory node type-only? property-name name]
   (.updateImportSpecifier ^js node-factory node type-only? property-name name)))

(defn create-export-assignment
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `export-equals?`: `boolean | undefined`
   - `expression`: `Expression`
   
   **Returns:** `ExportAssignment`"
  (^js [node-factory]
   (.createExportAssignment ^js node-factory))
  (^js [node-factory modifiers]
   (.createExportAssignment ^js node-factory modifiers))
  (^js [node-factory modifiers export-equals?]
   (.createExportAssignment ^js node-factory modifiers export-equals?))
  (^js [node-factory modifiers export-equals? expression]
   (.createExportAssignment ^js node-factory modifiers export-equals? expression)))

(defn update-export-assignment
  "**Parameters:**
   - `node`: `ExportAssignment`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `expression`: `Expression`
   
   **Returns:** `ExportAssignment`"
  (^js [node-factory node]
   (.updateExportAssignment ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateExportAssignment ^js node-factory node modifiers))
  (^js [node-factory node modifiers expression]
   (.updateExportAssignment ^js node-factory node modifiers expression)))

(defn create-export-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `type-only?`: `boolean`
   - `export-clause`: `NamedExportBindings | undefined`
   - `module-specifier`: `Expression | undefined`
   - `attributes`: `ImportAttributes | undefined`
   
   **Returns:** `ExportDeclaration`"
  (^js [node-factory]
   (.createExportDeclaration ^js node-factory))
  (^js [node-factory modifiers]
   (.createExportDeclaration ^js node-factory modifiers))
  (^js [node-factory modifiers type-only?]
   (.createExportDeclaration ^js node-factory modifiers type-only?))
  (^js [node-factory modifiers type-only? export-clause]
   (.createExportDeclaration ^js node-factory modifiers type-only? export-clause))
  (^js [node-factory modifiers type-only? export-clause module-specifier]
   (.createExportDeclaration ^js node-factory modifiers type-only? export-clause module-specifier))
  (^js [node-factory modifiers type-only? export-clause module-specifier attributes]
   (.createExportDeclaration ^js node-factory modifiers type-only? export-clause module-specifier attributes)))

(defn update-export-declaration
  "**Parameters:**
   - `node`: `ExportDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `type-only?`: `boolean`
   - `export-clause`: `NamedExportBindings | undefined`
   - `module-specifier`: `Expression | undefined`
   - `attributes`: `ImportAttributes | undefined`
   
   **Returns:** `ExportDeclaration`"
  (^js [node-factory node]
   (.updateExportDeclaration ^js node-factory node))
  (^js [node-factory node modifiers]
   (.updateExportDeclaration ^js node-factory node modifiers))
  (^js [node-factory node modifiers type-only?]
   (.updateExportDeclaration ^js node-factory node modifiers type-only?))
  (^js [node-factory node modifiers type-only? export-clause]
   (.updateExportDeclaration ^js node-factory node modifiers type-only? export-clause))
  (^js [node-factory node modifiers type-only? export-clause module-specifier]
   (.updateExportDeclaration ^js node-factory node modifiers type-only? export-clause module-specifier))
  (^js [node-factory node modifiers type-only? export-clause module-specifier attributes]
   (.updateExportDeclaration ^js node-factory node modifiers type-only? export-clause module-specifier attributes)))

(defn create-named-exports
  "**Parameters:**
   - `elements`: `readonly ExportSpecifier[]`
   
   **Returns:** `NamedExports`"
  ^js [node-factory elements]
  (.createNamedExports ^js node-factory elements))

(defn update-named-exports
  "**Parameters:**
   - `node`: `NamedExports`
   - `elements`: `readonly ExportSpecifier[]`
   
   **Returns:** `NamedExports`"
  ^js [node-factory node elements]
  (.updateNamedExports ^js node-factory node elements))

(defn create-export-specifier
  "**Parameters:**
   - `type-only?`: `boolean`
   - `property-name`: `string | Identifier | undefined`
   - `name`: `string | Identifier`
   
   **Returns:** `ExportSpecifier`"
  (^js [node-factory type-only?]
   (.createExportSpecifier ^js node-factory type-only?))
  (^js [node-factory type-only? property-name]
   (.createExportSpecifier ^js node-factory type-only? property-name))
  (^js [node-factory type-only? property-name name]
   (.createExportSpecifier ^js node-factory type-only? property-name name)))

(defn update-export-specifier
  "**Parameters:**
   - `node`: `ExportSpecifier`
   - `type-only?`: `boolean`
   - `property-name`: `Identifier | undefined`
   - `name`: `Identifier`
   
   **Returns:** `ExportSpecifier`"
  (^js [node-factory node type-only?]
   (.updateExportSpecifier ^js node-factory node type-only?))
  (^js [node-factory node type-only? property-name]
   (.updateExportSpecifier ^js node-factory node type-only? property-name))
  (^js [node-factory node type-only? property-name name]
   (.updateExportSpecifier ^js node-factory node type-only? property-name name)))

(defn create-external-module-reference
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ExternalModuleReference`"
  ^js [node-factory expression]
  (.createExternalModuleReference ^js node-factory expression))

(defn update-external-module-reference
  "**Parameters:**
   - `node`: `ExternalModuleReference`
   - `expression`: `Expression`
   
   **Returns:** `ExternalModuleReference`"
  ^js [node-factory node expression]
  (.updateExternalModuleReference ^js node-factory node expression))

(defn create-js-doc-all-type
  "**Returns:** `JSDocAllType`"
  ^js [node-factory]
  (.createJSDocAllType ^js node-factory))

(defn create-js-doc-unknown-type
  "**Returns:** `JSDocUnknownType`"
  ^js [node-factory]
  (.createJSDocUnknownType ^js node-factory))

(defn create-js-doc-non-nullable-type
  "**Parameters:**
   - `type`: `TypeNode`
   - `postfix?`: `boolean | undefined`
   
   **Returns:** `JSDocNonNullableType`"
  (^js [node-factory type]
   (.createJSDocNonNullableType ^js node-factory type))
  (^js [node-factory type postfix?]
   (.createJSDocNonNullableType ^js node-factory type postfix?)))

(defn update-js-doc-non-nullable-type
  "**Parameters:**
   - `node`: `JSDocNonNullableType`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocNonNullableType`"
  ^js [node-factory node type]
  (.updateJSDocNonNullableType ^js node-factory node type))

(defn create-js-doc-nullable-type
  "**Parameters:**
   - `type`: `TypeNode`
   - `postfix?`: `boolean | undefined`
   
   **Returns:** `JSDocNullableType`"
  (^js [node-factory type]
   (.createJSDocNullableType ^js node-factory type))
  (^js [node-factory type postfix?]
   (.createJSDocNullableType ^js node-factory type postfix?)))

(defn update-js-doc-nullable-type
  "**Parameters:**
   - `node`: `JSDocNullableType`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocNullableType`"
  ^js [node-factory node type]
  (.updateJSDocNullableType ^js node-factory node type))

(defn create-js-doc-optional-type
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `JSDocOptionalType`"
  ^js [node-factory type]
  (.createJSDocOptionalType ^js node-factory type))

(defn update-js-doc-optional-type
  "**Parameters:**
   - `node`: `JSDocOptionalType`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocOptionalType`"
  ^js [node-factory node type]
  (.updateJSDocOptionalType ^js node-factory node type))

(defn create-js-doc-function-type
  "**Parameters:**
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `JSDocFunctionType`"
  (^js [node-factory parameters]
   (.createJSDocFunctionType ^js node-factory parameters))
  (^js [node-factory parameters type]
   (.createJSDocFunctionType ^js node-factory parameters type)))

(defn update-js-doc-function-type
  "**Parameters:**
   - `node`: `JSDocFunctionType`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `JSDocFunctionType`"
  (^js [node-factory node parameters]
   (.updateJSDocFunctionType ^js node-factory node parameters))
  (^js [node-factory node parameters type]
   (.updateJSDocFunctionType ^js node-factory node parameters type)))

(defn create-js-doc-variadic-type
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `JSDocVariadicType`"
  ^js [node-factory type]
  (.createJSDocVariadicType ^js node-factory type))

(defn update-js-doc-variadic-type
  "**Parameters:**
   - `node`: `JSDocVariadicType`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocVariadicType`"
  ^js [node-factory node type]
  (.updateJSDocVariadicType ^js node-factory node type))

(defn create-js-doc-namepath-type
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `JSDocNamepathType`"
  ^js [node-factory type]
  (.createJSDocNamepathType ^js node-factory type))

(defn update-js-doc-namepath-type
  "**Parameters:**
   - `node`: `JSDocNamepathType`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocNamepathType`"
  ^js [node-factory node type]
  (.updateJSDocNamepathType ^js node-factory node type))

(defn create-js-doc-type-expression
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `JSDocTypeExpression`"
  ^js [node-factory type]
  (.createJSDocTypeExpression ^js node-factory type))

(defn update-js-doc-type-expression
  "**Parameters:**
   - `node`: `JSDocTypeExpression`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocTypeExpression`"
  ^js [node-factory node type]
  (.updateJSDocTypeExpression ^js node-factory node type))

(defn create-js-doc-name-reference
  "**Parameters:**
   - `name`: `EntityName | JSDocMemberName`
   
   **Returns:** `JSDocNameReference`"
  ^js [node-factory name]
  (.createJSDocNameReference ^js node-factory name))

(defn update-js-doc-name-reference
  "**Parameters:**
   - `node`: `JSDocNameReference`
   - `name`: `EntityName | JSDocMemberName`
   
   **Returns:** `JSDocNameReference`"
  ^js [node-factory node name]
  (.updateJSDocNameReference ^js node-factory node name))

(defn create-js-doc-member-name
  "**Parameters:**
   - `left`: `EntityName | JSDocMemberName`
   - `right`: `Identifier`
   
   **Returns:** `JSDocMemberName`"
  ^js [node-factory left right]
  (.createJSDocMemberName ^js node-factory left right))

(defn update-js-doc-member-name
  "**Parameters:**
   - `node`: `JSDocMemberName`
   - `left`: `EntityName | JSDocMemberName`
   - `right`: `Identifier`
   
   **Returns:** `JSDocMemberName`"
  ^js [node-factory node left right]
  (.updateJSDocMemberName ^js node-factory node left right))

(defn create-js-doc-link
  "**Parameters:**
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLink`"
  (^js [node-factory]
   (.createJSDocLink ^js node-factory))
  (^js [node-factory name]
   (.createJSDocLink ^js node-factory name))
  (^js [node-factory name text]
   (.createJSDocLink ^js node-factory name text)))

(defn update-js-doc-link
  "**Parameters:**
   - `node`: `JSDocLink`
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLink`"
  (^js [node-factory node]
   (.updateJSDocLink ^js node-factory node))
  (^js [node-factory node name]
   (.updateJSDocLink ^js node-factory node name))
  (^js [node-factory node name text]
   (.updateJSDocLink ^js node-factory node name text)))

(defn create-js-doc-link-code
  "**Parameters:**
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLinkCode`"
  (^js [node-factory]
   (.createJSDocLinkCode ^js node-factory))
  (^js [node-factory name]
   (.createJSDocLinkCode ^js node-factory name))
  (^js [node-factory name text]
   (.createJSDocLinkCode ^js node-factory name text)))

(defn update-js-doc-link-code
  "**Parameters:**
   - `node`: `JSDocLinkCode`
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLinkCode`"
  (^js [node-factory node]
   (.updateJSDocLinkCode ^js node-factory node))
  (^js [node-factory node name]
   (.updateJSDocLinkCode ^js node-factory node name))
  (^js [node-factory node name text]
   (.updateJSDocLinkCode ^js node-factory node name text)))

(defn create-js-doc-link-plain
  "**Parameters:**
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLinkPlain`"
  (^js [node-factory]
   (.createJSDocLinkPlain ^js node-factory))
  (^js [node-factory name]
   (.createJSDocLinkPlain ^js node-factory name))
  (^js [node-factory name text]
   (.createJSDocLinkPlain ^js node-factory name text)))

(defn update-js-doc-link-plain
  "**Parameters:**
   - `node`: `JSDocLinkPlain`
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLinkPlain`"
  (^js [node-factory node]
   (.updateJSDocLinkPlain ^js node-factory node))
  (^js [node-factory node name]
   (.updateJSDocLinkPlain ^js node-factory node name))
  (^js [node-factory node name text]
   (.updateJSDocLinkPlain ^js node-factory node name text)))

(defn create-js-doc-type-literal
  "**Parameters:**
   - `js-doc-property-tags`: `readonly JSDocPropertyLikeTag[] | undefined`
   - `array-type?`: `boolean | undefined`
   
   **Returns:** `JSDocTypeLiteral`"
  (^js [node-factory]
   (.createJSDocTypeLiteral ^js node-factory))
  (^js [node-factory js-doc-property-tags]
   (.createJSDocTypeLiteral ^js node-factory js-doc-property-tags))
  (^js [node-factory js-doc-property-tags array-type?]
   (.createJSDocTypeLiteral ^js node-factory js-doc-property-tags array-type?)))

(defn update-js-doc-type-literal
  "**Parameters:**
   - `node`: `JSDocTypeLiteral`
   - `js-doc-property-tags`: `readonly JSDocPropertyLikeTag[] | undefined`
   - `array-type?`: `boolean | undefined`
   
   **Returns:** `JSDocTypeLiteral`"
  (^js [node-factory node]
   (.updateJSDocTypeLiteral ^js node-factory node))
  (^js [node-factory node js-doc-property-tags]
   (.updateJSDocTypeLiteral ^js node-factory node js-doc-property-tags))
  (^js [node-factory node js-doc-property-tags array-type?]
   (.updateJSDocTypeLiteral ^js node-factory node js-doc-property-tags array-type?)))

(defn create-js-doc-signature
  "**Parameters:**
   - `type-parameters`: `readonly JSDocTemplateTag[] | undefined`
   - `parameters`: `readonly JSDocParameterTag[]`
   - `type`: `JSDocReturnTag | undefined`
   
   **Returns:** `JSDocSignature`"
  (^js [node-factory]
   (.createJSDocSignature ^js node-factory))
  (^js [node-factory type-parameters]
   (.createJSDocSignature ^js node-factory type-parameters))
  (^js [node-factory type-parameters parameters]
   (.createJSDocSignature ^js node-factory type-parameters parameters))
  (^js [node-factory type-parameters parameters type]
   (.createJSDocSignature ^js node-factory type-parameters parameters type)))

(defn update-js-doc-signature
  "**Parameters:**
   - `node`: `JSDocSignature`
   - `type-parameters`: `readonly JSDocTemplateTag[] | undefined`
   - `parameters`: `readonly JSDocParameterTag[]`
   - `type`: `JSDocReturnTag | undefined`
   
   **Returns:** `JSDocSignature`"
  (^js [node-factory node]
   (.updateJSDocSignature ^js node-factory node))
  (^js [node-factory node type-parameters]
   (.updateJSDocSignature ^js node-factory node type-parameters))
  (^js [node-factory node type-parameters parameters]
   (.updateJSDocSignature ^js node-factory node type-parameters parameters))
  (^js [node-factory node type-parameters parameters type]
   (.updateJSDocSignature ^js node-factory node type-parameters parameters type)))

(defn create-js-doc-template-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `constraint`: `JSDocTypeExpression | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[]`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTemplateTag`"
  (^js [node-factory]
   (.createJSDocTemplateTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocTemplateTag ^js node-factory tag-name))
  (^js [node-factory tag-name constraint]
   (.createJSDocTemplateTag ^js node-factory tag-name constraint))
  (^js [node-factory tag-name constraint type-parameters]
   (.createJSDocTemplateTag ^js node-factory tag-name constraint type-parameters))
  (^js [node-factory tag-name constraint type-parameters comment]
   (.createJSDocTemplateTag ^js node-factory tag-name constraint type-parameters comment)))

(defn update-js-doc-template-tag
  "**Parameters:**
   - `node`: `JSDocTemplateTag`
   - `tag-name`: `Identifier | undefined`
   - `constraint`: `JSDocTypeExpression | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[]`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTemplateTag`"
  (^js [node-factory node]
   (.updateJSDocTemplateTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocTemplateTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name constraint]
   (.updateJSDocTemplateTag ^js node-factory node tag-name constraint))
  (^js [node-factory node tag-name constraint type-parameters]
   (.updateJSDocTemplateTag ^js node-factory node tag-name constraint type-parameters))
  (^js [node-factory node tag-name constraint type-parameters comment]
   (.updateJSDocTemplateTag ^js node-factory node tag-name constraint type-parameters comment)))

(defn create-js-doc-typedef-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | JSDocTypeLiteral | undefined`
   - `full-name`: `Identifier | JSDocNamespaceDeclaration | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTypedefTag`"
  (^js [node-factory]
   (.createJSDocTypedefTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocTypedefTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocTypedefTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression full-name]
   (.createJSDocTypedefTag ^js node-factory tag-name type-expression full-name))
  (^js [node-factory tag-name type-expression full-name comment]
   (.createJSDocTypedefTag ^js node-factory tag-name type-expression full-name comment)))

(defn update-js-doc-typedef-tag
  "**Parameters:**
   - `node`: `JSDocTypedefTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | JSDocTypeLiteral | undefined`
   - `full-name`: `Identifier | JSDocNamespaceDeclaration | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTypedefTag`"
  (^js [node-factory node]
   (.updateJSDocTypedefTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocTypedefTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocTypedefTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression full-name]
   (.updateJSDocTypedefTag ^js node-factory node tag-name type-expression full-name))
  (^js [node-factory node tag-name type-expression full-name comment]
   (.updateJSDocTypedefTag ^js node-factory node tag-name type-expression full-name comment)))

(defn create-js-doc-parameter-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `name`: `EntityName`
   - `bracketed?`: `boolean`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `name-first?`: `boolean | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocParameterTag`"
  (^js [node-factory]
   (.createJSDocParameterTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocParameterTag ^js node-factory tag-name))
  (^js [node-factory tag-name name]
   (.createJSDocParameterTag ^js node-factory tag-name name))
  (^js [node-factory tag-name name bracketed?]
   (.createJSDocParameterTag ^js node-factory tag-name name bracketed?))
  (^js [node-factory tag-name name bracketed? type-expression]
   (.createJSDocParameterTag ^js node-factory tag-name name bracketed? type-expression))
  (^js [node-factory tag-name name bracketed? type-expression name-first?]
   (.createJSDocParameterTag ^js node-factory tag-name name bracketed? type-expression name-first?))
  (^js [node-factory tag-name name bracketed? type-expression name-first? comment]
   (.createJSDocParameterTag ^js node-factory tag-name name bracketed? type-expression name-first? comment)))

(defn update-js-doc-parameter-tag
  "**Parameters:**
   - `node`: `JSDocParameterTag`
   - `tag-name`: `Identifier | undefined`
   - `name`: `EntityName`
   - `bracketed?`: `boolean`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `name-first?`: `boolean`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocParameterTag`"
  (^js [node-factory node]
   (.updateJSDocParameterTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocParameterTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name name]
   (.updateJSDocParameterTag ^js node-factory node tag-name name))
  (^js [node-factory node tag-name name bracketed?]
   (.updateJSDocParameterTag ^js node-factory node tag-name name bracketed?))
  (^js [node-factory node tag-name name bracketed? type-expression]
   (.updateJSDocParameterTag ^js node-factory node tag-name name bracketed? type-expression))
  (^js [node-factory node tag-name name bracketed? type-expression name-first?]
   (.updateJSDocParameterTag ^js node-factory node tag-name name bracketed? type-expression name-first?))
  (^js [node-factory node tag-name name bracketed? type-expression name-first? comment]
   (.updateJSDocParameterTag ^js node-factory node tag-name name bracketed? type-expression name-first? comment)))

(defn create-js-doc-property-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `name`: `EntityName`
   - `bracketed?`: `boolean`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `name-first?`: `boolean | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocPropertyTag`"
  (^js [node-factory]
   (.createJSDocPropertyTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocPropertyTag ^js node-factory tag-name))
  (^js [node-factory tag-name name]
   (.createJSDocPropertyTag ^js node-factory tag-name name))
  (^js [node-factory tag-name name bracketed?]
   (.createJSDocPropertyTag ^js node-factory tag-name name bracketed?))
  (^js [node-factory tag-name name bracketed? type-expression]
   (.createJSDocPropertyTag ^js node-factory tag-name name bracketed? type-expression))
  (^js [node-factory tag-name name bracketed? type-expression name-first?]
   (.createJSDocPropertyTag ^js node-factory tag-name name bracketed? type-expression name-first?))
  (^js [node-factory tag-name name bracketed? type-expression name-first? comment]
   (.createJSDocPropertyTag ^js node-factory tag-name name bracketed? type-expression name-first? comment)))

(defn update-js-doc-property-tag
  "**Parameters:**
   - `node`: `JSDocPropertyTag`
   - `tag-name`: `Identifier | undefined`
   - `name`: `EntityName`
   - `bracketed?`: `boolean`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `name-first?`: `boolean`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocPropertyTag`"
  (^js [node-factory node]
   (.updateJSDocPropertyTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocPropertyTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name name]
   (.updateJSDocPropertyTag ^js node-factory node tag-name name))
  (^js [node-factory node tag-name name bracketed?]
   (.updateJSDocPropertyTag ^js node-factory node tag-name name bracketed?))
  (^js [node-factory node tag-name name bracketed? type-expression]
   (.updateJSDocPropertyTag ^js node-factory node tag-name name bracketed? type-expression))
  (^js [node-factory node tag-name name bracketed? type-expression name-first?]
   (.updateJSDocPropertyTag ^js node-factory node tag-name name bracketed? type-expression name-first?))
  (^js [node-factory node tag-name name bracketed? type-expression name-first? comment]
   (.updateJSDocPropertyTag ^js node-factory node tag-name name bracketed? type-expression name-first? comment)))

(defn create-js-doc-type-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTypeTag`"
  (^js [node-factory]
   (.createJSDocTypeTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocTypeTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocTypeTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression comment]
   (.createJSDocTypeTag ^js node-factory tag-name type-expression comment)))

(defn update-js-doc-type-tag
  "**Parameters:**
   - `node`: `JSDocTypeTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTypeTag`"
  (^js [node-factory node]
   (.updateJSDocTypeTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocTypeTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocTypeTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression comment]
   (.updateJSDocTypeTag ^js node-factory node tag-name type-expression comment)))

(defn create-js-doc-see-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `name-expression`: `JSDocNameReference | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocSeeTag`"
  (^js [node-factory]
   (.createJSDocSeeTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocSeeTag ^js node-factory tag-name))
  (^js [node-factory tag-name name-expression]
   (.createJSDocSeeTag ^js node-factory tag-name name-expression))
  (^js [node-factory tag-name name-expression comment]
   (.createJSDocSeeTag ^js node-factory tag-name name-expression comment)))

(defn update-js-doc-see-tag
  "**Parameters:**
   - `node`: `JSDocSeeTag`
   - `tag-name`: `Identifier | undefined`
   - `name-expression`: `JSDocNameReference | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocSeeTag`"
  (^js [node-factory node]
   (.updateJSDocSeeTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocSeeTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name name-expression]
   (.updateJSDocSeeTag ^js node-factory node tag-name name-expression))
  (^js [node-factory node tag-name name-expression comment]
   (.updateJSDocSeeTag ^js node-factory node tag-name name-expression comment)))

(defn create-js-doc-return-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocReturnTag`"
  (^js [node-factory]
   (.createJSDocReturnTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocReturnTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocReturnTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression comment]
   (.createJSDocReturnTag ^js node-factory tag-name type-expression comment)))

(defn update-js-doc-return-tag
  "**Parameters:**
   - `node`: `JSDocReturnTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocReturnTag`"
  (^js [node-factory node]
   (.updateJSDocReturnTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocReturnTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocReturnTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression comment]
   (.updateJSDocReturnTag ^js node-factory node tag-name type-expression comment)))

(defn create-js-doc-this-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocThisTag`"
  (^js [node-factory]
   (.createJSDocThisTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocThisTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocThisTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression comment]
   (.createJSDocThisTag ^js node-factory tag-name type-expression comment)))

(defn update-js-doc-this-tag
  "**Parameters:**
   - `node`: `JSDocThisTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocThisTag`"
  (^js [node-factory node]
   (.updateJSDocThisTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocThisTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocThisTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression comment]
   (.updateJSDocThisTag ^js node-factory node tag-name type-expression comment)))

(defn create-js-doc-enum-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocEnumTag`"
  (^js [node-factory]
   (.createJSDocEnumTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocEnumTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocEnumTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression comment]
   (.createJSDocEnumTag ^js node-factory tag-name type-expression comment)))

(defn update-js-doc-enum-tag
  "**Parameters:**
   - `node`: `JSDocEnumTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocEnumTag`"
  (^js [node-factory node]
   (.updateJSDocEnumTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocEnumTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocEnumTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression comment]
   (.updateJSDocEnumTag ^js node-factory node tag-name type-expression comment)))

(defn create-js-doc-callback-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocSignature`
   - `full-name`: `Identifier | JSDocNamespaceDeclaration | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocCallbackTag`"
  (^js [node-factory]
   (.createJSDocCallbackTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocCallbackTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocCallbackTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression full-name]
   (.createJSDocCallbackTag ^js node-factory tag-name type-expression full-name))
  (^js [node-factory tag-name type-expression full-name comment]
   (.createJSDocCallbackTag ^js node-factory tag-name type-expression full-name comment)))

(defn update-js-doc-callback-tag
  "**Parameters:**
   - `node`: `JSDocCallbackTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocSignature`
   - `full-name`: `Identifier | JSDocNamespaceDeclaration | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocCallbackTag`"
  (^js [node-factory node]
   (.updateJSDocCallbackTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocCallbackTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocCallbackTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression full-name]
   (.updateJSDocCallbackTag ^js node-factory node tag-name type-expression full-name))
  (^js [node-factory node tag-name type-expression full-name comment]
   (.updateJSDocCallbackTag ^js node-factory node tag-name type-expression full-name comment)))

(defn create-js-doc-overload-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocSignature`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocOverloadTag`"
  (^js [node-factory]
   (.createJSDocOverloadTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocOverloadTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocOverloadTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression comment]
   (.createJSDocOverloadTag ^js node-factory tag-name type-expression comment)))

(defn update-js-doc-overload-tag
  "**Parameters:**
   - `node`: `JSDocOverloadTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocSignature`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocOverloadTag`"
  (^js [node-factory node]
   (.updateJSDocOverloadTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocOverloadTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocOverloadTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression comment]
   (.updateJSDocOverloadTag ^js node-factory node tag-name type-expression comment)))

(defn create-js-doc-augments-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `class-name`: `ExpressionWithTypeArguments & { readonly expression: Identifier | PropertyAccessEntityNameExpression; }`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocAugmentsTag`"
  (^js [node-factory]
   (.createJSDocAugmentsTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocAugmentsTag ^js node-factory tag-name))
  (^js [node-factory tag-name class-name]
   (.createJSDocAugmentsTag ^js node-factory tag-name class-name))
  (^js [node-factory tag-name class-name comment]
   (.createJSDocAugmentsTag ^js node-factory tag-name class-name comment)))

(defn update-js-doc-augments-tag
  "**Parameters:**
   - `node`: `JSDocAugmentsTag`
   - `tag-name`: `Identifier | undefined`
   - `class-name`: `ExpressionWithTypeArguments & { readonly expression: Identifier | PropertyAccessEntityNameExpression; }`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocAugmentsTag`"
  (^js [node-factory node]
   (.updateJSDocAugmentsTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocAugmentsTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name class-name]
   (.updateJSDocAugmentsTag ^js node-factory node tag-name class-name))
  (^js [node-factory node tag-name class-name comment]
   (.updateJSDocAugmentsTag ^js node-factory node tag-name class-name comment)))

(defn create-js-doc-implements-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `class-name`: `ExpressionWithTypeArguments & { readonly expression: Identifier | PropertyAccessEntityNameExpression; }`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocImplementsTag`"
  (^js [node-factory]
   (.createJSDocImplementsTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocImplementsTag ^js node-factory tag-name))
  (^js [node-factory tag-name class-name]
   (.createJSDocImplementsTag ^js node-factory tag-name class-name))
  (^js [node-factory tag-name class-name comment]
   (.createJSDocImplementsTag ^js node-factory tag-name class-name comment)))

(defn update-js-doc-implements-tag
  "**Parameters:**
   - `node`: `JSDocImplementsTag`
   - `tag-name`: `Identifier | undefined`
   - `class-name`: `ExpressionWithTypeArguments & { readonly expression: Identifier | PropertyAccessEntityNameExpression; }`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocImplementsTag`"
  (^js [node-factory node]
   (.updateJSDocImplementsTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocImplementsTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name class-name]
   (.updateJSDocImplementsTag ^js node-factory node tag-name class-name))
  (^js [node-factory node tag-name class-name comment]
   (.updateJSDocImplementsTag ^js node-factory node tag-name class-name comment)))

(defn create-js-doc-author-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocAuthorTag`"
  (^js [node-factory]
   (.createJSDocAuthorTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocAuthorTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocAuthorTag ^js node-factory tag-name comment)))

(defn update-js-doc-author-tag
  "**Parameters:**
   - `node`: `JSDocAuthorTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocAuthorTag`"
  (^js [node-factory node]
   (.updateJSDocAuthorTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocAuthorTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocAuthorTag ^js node-factory node tag-name comment)))

(defn create-js-doc-class-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocClassTag`"
  (^js [node-factory]
   (.createJSDocClassTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocClassTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocClassTag ^js node-factory tag-name comment)))

(defn update-js-doc-class-tag
  "**Parameters:**
   - `node`: `JSDocClassTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocClassTag`"
  (^js [node-factory node]
   (.updateJSDocClassTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocClassTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocClassTag ^js node-factory node tag-name comment)))

(defn create-js-doc-public-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocPublicTag`"
  (^js [node-factory]
   (.createJSDocPublicTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocPublicTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocPublicTag ^js node-factory tag-name comment)))

(defn update-js-doc-public-tag
  "**Parameters:**
   - `node`: `JSDocPublicTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocPublicTag`"
  (^js [node-factory node]
   (.updateJSDocPublicTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocPublicTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocPublicTag ^js node-factory node tag-name comment)))

(defn create-js-doc-private-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocPrivateTag`"
  (^js [node-factory]
   (.createJSDocPrivateTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocPrivateTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocPrivateTag ^js node-factory tag-name comment)))

(defn update-js-doc-private-tag
  "**Parameters:**
   - `node`: `JSDocPrivateTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocPrivateTag`"
  (^js [node-factory node]
   (.updateJSDocPrivateTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocPrivateTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocPrivateTag ^js node-factory node tag-name comment)))

(defn create-js-doc-protected-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocProtectedTag`"
  (^js [node-factory]
   (.createJSDocProtectedTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocProtectedTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocProtectedTag ^js node-factory tag-name comment)))

(defn update-js-doc-protected-tag
  "**Parameters:**
   - `node`: `JSDocProtectedTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocProtectedTag`"
  (^js [node-factory node]
   (.updateJSDocProtectedTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocProtectedTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocProtectedTag ^js node-factory node tag-name comment)))

(defn create-js-doc-readonly-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocReadonlyTag`"
  (^js [node-factory]
   (.createJSDocReadonlyTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocReadonlyTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocReadonlyTag ^js node-factory tag-name comment)))

(defn update-js-doc-readonly-tag
  "**Parameters:**
   - `node`: `JSDocReadonlyTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocReadonlyTag`"
  (^js [node-factory node]
   (.updateJSDocReadonlyTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocReadonlyTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocReadonlyTag ^js node-factory node tag-name comment)))

(defn create-js-doc-unknown-tag
  "**Parameters:**
   - `tag-name`: `Identifier`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocUnknownTag`"
  (^js [node-factory tag-name]
   (.createJSDocUnknownTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocUnknownTag ^js node-factory tag-name comment)))

(defn update-js-doc-unknown-tag
  "**Parameters:**
   - `node`: `JSDocUnknownTag`
   - `tag-name`: `Identifier`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocUnknownTag`"
  (^js [node-factory node tag-name]
   (.updateJSDocUnknownTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocUnknownTag ^js node-factory node tag-name comment)))

(defn create-js-doc-deprecated-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocDeprecatedTag`"
  (^js [node-factory]
   (.createJSDocDeprecatedTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocDeprecatedTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocDeprecatedTag ^js node-factory tag-name comment)))

(defn update-js-doc-deprecated-tag
  "**Parameters:**
   - `node`: `JSDocDeprecatedTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocDeprecatedTag`"
  (^js [node-factory node]
   (.updateJSDocDeprecatedTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocDeprecatedTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocDeprecatedTag ^js node-factory node tag-name comment)))

(defn create-js-doc-override-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocOverrideTag`"
  (^js [node-factory]
   (.createJSDocOverrideTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocOverrideTag ^js node-factory tag-name))
  (^js [node-factory tag-name comment]
   (.createJSDocOverrideTag ^js node-factory tag-name comment)))

(defn update-js-doc-override-tag
  "**Parameters:**
   - `node`: `JSDocOverrideTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocOverrideTag`"
  (^js [node-factory node]
   (.updateJSDocOverrideTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocOverrideTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name comment]
   (.updateJSDocOverrideTag ^js node-factory node tag-name comment)))

(defn create-js-doc-throws-tag
  "**Parameters:**
   - `tag-name`: `Identifier`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocThrowsTag`"
  (^js [node-factory tag-name]
   (.createJSDocThrowsTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocThrowsTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression comment]
   (.createJSDocThrowsTag ^js node-factory tag-name type-expression comment)))

(defn update-js-doc-throws-tag
  "**Parameters:**
   - `node`: `JSDocThrowsTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocThrowsTag`"
  (^js [node-factory node]
   (.updateJSDocThrowsTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocThrowsTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocThrowsTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression comment]
   (.updateJSDocThrowsTag ^js node-factory node tag-name type-expression comment)))

(defn create-js-doc-satisfies-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocSatisfiesTag`"
  (^js [node-factory]
   (.createJSDocSatisfiesTag ^js node-factory))
  (^js [node-factory tag-name]
   (.createJSDocSatisfiesTag ^js node-factory tag-name))
  (^js [node-factory tag-name type-expression]
   (.createJSDocSatisfiesTag ^js node-factory tag-name type-expression))
  (^js [node-factory tag-name type-expression comment]
   (.createJSDocSatisfiesTag ^js node-factory tag-name type-expression comment)))

(defn update-js-doc-satisfies-tag
  "**Parameters:**
   - `node`: `JSDocSatisfiesTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocSatisfiesTag`"
  (^js [node-factory node]
   (.updateJSDocSatisfiesTag ^js node-factory node))
  (^js [node-factory node tag-name]
   (.updateJSDocSatisfiesTag ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-expression]
   (.updateJSDocSatisfiesTag ^js node-factory node tag-name type-expression))
  (^js [node-factory node tag-name type-expression comment]
   (.updateJSDocSatisfiesTag ^js node-factory node tag-name type-expression comment)))

(defn create-js-doc-text
  "**Parameters:**
   - `text`: `string`
   
   **Returns:** `JSDocText`"
  ^js [node-factory text]
  (.createJSDocText ^js node-factory text))

(defn update-js-doc-text
  "**Parameters:**
   - `node`: `JSDocText`
   - `text`: `string`
   
   **Returns:** `JSDocText`"
  ^js [node-factory node text]
  (.updateJSDocText ^js node-factory node text))

(defn create-js-doc-comment
  "**Parameters:**
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   - `tags`: `readonly JSDocTag[] | undefined`
   
   **Returns:** `JSDoc`"
  (^js [node-factory]
   (.createJSDocComment ^js node-factory))
  (^js [node-factory comment]
   (.createJSDocComment ^js node-factory comment))
  (^js [node-factory comment tags]
   (.createJSDocComment ^js node-factory comment tags)))

(defn update-js-doc-comment
  "**Parameters:**
   - `node`: `JSDoc`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   - `tags`: `readonly JSDocTag[] | undefined`
   
   **Returns:** `JSDoc`"
  (^js [node-factory node]
   (.updateJSDocComment ^js node-factory node))
  (^js [node-factory node comment]
   (.updateJSDocComment ^js node-factory node comment))
  (^js [node-factory node comment tags]
   (.updateJSDocComment ^js node-factory node comment tags)))

(defn create-jsx-element
  "**Parameters:**
   - `opening-element`: `JsxOpeningElement`
   - `children`: `readonly JsxChild[]`
   - `closing-element`: `JsxClosingElement`
   
   **Returns:** `JsxElement`"
  ^js [node-factory opening-element children closing-element]
  (.createJsxElement ^js node-factory opening-element children closing-element))

(defn update-jsx-element
  "**Parameters:**
   - `node`: `JsxElement`
   - `opening-element`: `JsxOpeningElement`
   - `children`: `readonly JsxChild[]`
   - `closing-element`: `JsxClosingElement`
   
   **Returns:** `JsxElement`"
  ^js [node-factory node opening-element children closing-element]
  (.updateJsxElement ^js node-factory node opening-element children closing-element))

(defn create-jsx-self-closing-element
  "**Parameters:**
   - `tag-name`: `JsxTagNameExpression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `attributes`: `JsxAttributes`
   
   **Returns:** `JsxSelfClosingElement`"
  (^js [node-factory tag-name]
   (.createJsxSelfClosingElement ^js node-factory tag-name))
  (^js [node-factory tag-name type-arguments]
   (.createJsxSelfClosingElement ^js node-factory tag-name type-arguments))
  (^js [node-factory tag-name type-arguments attributes]
   (.createJsxSelfClosingElement ^js node-factory tag-name type-arguments attributes)))

(defn update-jsx-self-closing-element
  "**Parameters:**
   - `node`: `JsxSelfClosingElement`
   - `tag-name`: `JsxTagNameExpression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `attributes`: `JsxAttributes`
   
   **Returns:** `JsxSelfClosingElement`"
  (^js [node-factory node tag-name]
   (.updateJsxSelfClosingElement ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-arguments]
   (.updateJsxSelfClosingElement ^js node-factory node tag-name type-arguments))
  (^js [node-factory node tag-name type-arguments attributes]
   (.updateJsxSelfClosingElement ^js node-factory node tag-name type-arguments attributes)))

(defn create-jsx-opening-element
  "**Parameters:**
   - `tag-name`: `JsxTagNameExpression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `attributes`: `JsxAttributes`
   
   **Returns:** `JsxOpeningElement`"
  (^js [node-factory tag-name]
   (.createJsxOpeningElement ^js node-factory tag-name))
  (^js [node-factory tag-name type-arguments]
   (.createJsxOpeningElement ^js node-factory tag-name type-arguments))
  (^js [node-factory tag-name type-arguments attributes]
   (.createJsxOpeningElement ^js node-factory tag-name type-arguments attributes)))

(defn update-jsx-opening-element
  "**Parameters:**
   - `node`: `JsxOpeningElement`
   - `tag-name`: `JsxTagNameExpression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `attributes`: `JsxAttributes`
   
   **Returns:** `JsxOpeningElement`"
  (^js [node-factory node tag-name]
   (.updateJsxOpeningElement ^js node-factory node tag-name))
  (^js [node-factory node tag-name type-arguments]
   (.updateJsxOpeningElement ^js node-factory node tag-name type-arguments))
  (^js [node-factory node tag-name type-arguments attributes]
   (.updateJsxOpeningElement ^js node-factory node tag-name type-arguments attributes)))

(defn create-jsx-closing-element
  "**Parameters:**
   - `tag-name`: `JsxTagNameExpression`
   
   **Returns:** `JsxClosingElement`"
  ^js [node-factory tag-name]
  (.createJsxClosingElement ^js node-factory tag-name))

(defn update-jsx-closing-element
  "**Parameters:**
   - `node`: `JsxClosingElement`
   - `tag-name`: `JsxTagNameExpression`
   
   **Returns:** `JsxClosingElement`"
  ^js [node-factory node tag-name]
  (.updateJsxClosingElement ^js node-factory node tag-name))

(defn create-jsx-fragment
  "**Parameters:**
   - `opening-fragment`: `JsxOpeningFragment`
   - `children`: `readonly JsxChild[]`
   - `closing-fragment`: `JsxClosingFragment`
   
   **Returns:** `JsxFragment`"
  ^js [node-factory opening-fragment children closing-fragment]
  (.createJsxFragment ^js node-factory opening-fragment children closing-fragment))

(defn create-jsx-text
  "**Parameters:**
   - `text`: `string`
   - `contains-only-trivia-white-spaces?`: `boolean | undefined`
   
   **Returns:** `JsxText`"
  (^js [node-factory text]
   (.createJsxText ^js node-factory text))
  (^js [node-factory text contains-only-trivia-white-spaces?]
   (.createJsxText ^js node-factory text contains-only-trivia-white-spaces?)))

(defn update-jsx-text
  "**Parameters:**
   - `node`: `JsxText`
   - `text`: `string`
   - `contains-only-trivia-white-spaces?`: `boolean | undefined`
   
   **Returns:** `JsxText`"
  (^js [node-factory node text]
   (.updateJsxText ^js node-factory node text))
  (^js [node-factory node text contains-only-trivia-white-spaces?]
   (.updateJsxText ^js node-factory node text contains-only-trivia-white-spaces?)))

(defn create-jsx-opening-fragment
  "**Returns:** `JsxOpeningFragment`"
  ^js [node-factory]
  (.createJsxOpeningFragment ^js node-factory))

(defn create-jsx-jsx-closing-fragment
  "**Returns:** `JsxClosingFragment`"
  ^js [node-factory]
  (.createJsxJsxClosingFragment ^js node-factory))

(defn update-jsx-fragment
  "**Parameters:**
   - `node`: `JsxFragment`
   - `opening-fragment`: `JsxOpeningFragment`
   - `children`: `readonly JsxChild[]`
   - `closing-fragment`: `JsxClosingFragment`
   
   **Returns:** `JsxFragment`"
  ^js [node-factory node opening-fragment children closing-fragment]
  (.updateJsxFragment ^js node-factory node opening-fragment children closing-fragment))

(defn create-jsx-attribute
  "**Parameters:**
   - `name`: `JsxAttributeName`
   - `initializer`: `JsxAttributeValue | undefined`
   
   **Returns:** `JsxAttribute`"
  (^js [node-factory name]
   (.createJsxAttribute ^js node-factory name))
  (^js [node-factory name initializer]
   (.createJsxAttribute ^js node-factory name initializer)))

(defn update-jsx-attribute
  "**Parameters:**
   - `node`: `JsxAttribute`
   - `name`: `JsxAttributeName`
   - `initializer`: `JsxAttributeValue | undefined`
   
   **Returns:** `JsxAttribute`"
  (^js [node-factory node name]
   (.updateJsxAttribute ^js node-factory node name))
  (^js [node-factory node name initializer]
   (.updateJsxAttribute ^js node-factory node name initializer)))

(defn create-jsx-attributes
  "**Parameters:**
   - `properties`: `readonly JsxAttributeLike[]`
   
   **Returns:** `JsxAttributes`"
  ^js [node-factory properties]
  (.createJsxAttributes ^js node-factory properties))

(defn update-jsx-attributes
  "**Parameters:**
   - `node`: `JsxAttributes`
   - `properties`: `readonly JsxAttributeLike[]`
   
   **Returns:** `JsxAttributes`"
  ^js [node-factory node properties]
  (.updateJsxAttributes ^js node-factory node properties))

(defn create-jsx-spread-attribute
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `JsxSpreadAttribute`"
  ^js [node-factory expression]
  (.createJsxSpreadAttribute ^js node-factory expression))

(defn update-jsx-spread-attribute
  "**Parameters:**
   - `node`: `JsxSpreadAttribute`
   - `expression`: `Expression`
   
   **Returns:** `JsxSpreadAttribute`"
  ^js [node-factory node expression]
  (.updateJsxSpreadAttribute ^js node-factory node expression))

(defn create-jsx-expression
  "**Parameters:**
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `expression`: `Expression | undefined`
   
   **Returns:** `JsxExpression`"
  (^js [node-factory]
   (.createJsxExpression ^js node-factory))
  (^js [node-factory dot-dot-dot-token]
   (.createJsxExpression ^js node-factory dot-dot-dot-token))
  (^js [node-factory dot-dot-dot-token expression]
   (.createJsxExpression ^js node-factory dot-dot-dot-token expression)))

(defn update-jsx-expression
  "**Parameters:**
   - `node`: `JsxExpression`
   - `expression`: `Expression | undefined`
   
   **Returns:** `JsxExpression`"
  (^js [node-factory node]
   (.updateJsxExpression ^js node-factory node))
  (^js [node-factory node expression]
   (.updateJsxExpression ^js node-factory node expression)))

(defn create-jsx-namespaced-name
  "**Parameters:**
   - `namespace`: `Identifier`
   - `name`: `Identifier`
   
   **Returns:** `JsxNamespacedName`"
  ^js [node-factory namespace name]
  (.createJsxNamespacedName ^js node-factory namespace name))

(defn update-jsx-namespaced-name
  "**Parameters:**
   - `node`: `JsxNamespacedName`
   - `namespace`: `Identifier`
   - `name`: `Identifier`
   
   **Returns:** `JsxNamespacedName`"
  ^js [node-factory node namespace name]
  (.updateJsxNamespacedName ^js node-factory node namespace name))

(defn create-case-clause
  "**Parameters:**
   - `expression`: `Expression`
   - `statements`: `readonly Statement[]`
   
   **Returns:** `CaseClause`"
  ^js [node-factory expression statements]
  (.createCaseClause ^js node-factory expression statements))

(defn update-case-clause
  "**Parameters:**
   - `node`: `CaseClause`
   - `expression`: `Expression`
   - `statements`: `readonly Statement[]`
   
   **Returns:** `CaseClause`"
  ^js [node-factory node expression statements]
  (.updateCaseClause ^js node-factory node expression statements))

(defn create-default-clause
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   
   **Returns:** `DefaultClause`"
  ^js [node-factory statements]
  (.createDefaultClause ^js node-factory statements))

(defn update-default-clause
  "**Parameters:**
   - `node`: `DefaultClause`
   - `statements`: `readonly Statement[]`
   
   **Returns:** `DefaultClause`"
  ^js [node-factory node statements]
  (.updateDefaultClause ^js node-factory node statements))

(defn create-heritage-clause
  "**Parameters:**
   - `token`: `SyntaxKind.ExtendsKeyword | SyntaxKind.ImplementsKeyword`
   - `types`: `readonly ExpressionWithTypeArguments[]`
   
   **Returns:** `HeritageClause`"
  ^js [node-factory token types]
  (.createHeritageClause ^js node-factory token types))

(defn update-heritage-clause
  "**Parameters:**
   - `node`: `HeritageClause`
   - `types`: `readonly ExpressionWithTypeArguments[]`
   
   **Returns:** `HeritageClause`"
  ^js [node-factory node types]
  (.updateHeritageClause ^js node-factory node types))

(defn create-catch-clause
  "**Parameters:**
   - `variable-declaration`: `string | VariableDeclaration | BindingName | undefined`
   - `block`: `Block`
   
   **Returns:** `CatchClause`"
  (^js [node-factory]
   (.createCatchClause ^js node-factory))
  (^js [node-factory variable-declaration]
   (.createCatchClause ^js node-factory variable-declaration))
  (^js [node-factory variable-declaration block]
   (.createCatchClause ^js node-factory variable-declaration block)))

(defn update-catch-clause
  "**Parameters:**
   - `node`: `CatchClause`
   - `variable-declaration`: `VariableDeclaration | undefined`
   - `block`: `Block`
   
   **Returns:** `CatchClause`"
  (^js [node-factory node]
   (.updateCatchClause ^js node-factory node))
  (^js [node-factory node variable-declaration]
   (.updateCatchClause ^js node-factory node variable-declaration))
  (^js [node-factory node variable-declaration block]
   (.updateCatchClause ^js node-factory node variable-declaration block)))

(defn create-property-assignment
  "**Parameters:**
   - `name`: `string | PropertyName`
   - `initializer`: `Expression`
   
   **Returns:** `PropertyAssignment`"
  ^js [node-factory name initializer]
  (.createPropertyAssignment ^js node-factory name initializer))

(defn update-property-assignment
  "**Parameters:**
   - `node`: `PropertyAssignment`
   - `name`: `PropertyName`
   - `initializer`: `Expression`
   
   **Returns:** `PropertyAssignment`"
  ^js [node-factory node name initializer]
  (.updatePropertyAssignment ^js node-factory node name initializer))

(defn create-shorthand-property-assignment
  "**Parameters:**
   - `name`: `string | Identifier`
   - `object-assignment-initializer`: `Expression | undefined`
   
   **Returns:** `ShorthandPropertyAssignment`"
  (^js [node-factory name]
   (.createShorthandPropertyAssignment ^js node-factory name))
  (^js [node-factory name object-assignment-initializer]
   (.createShorthandPropertyAssignment ^js node-factory name object-assignment-initializer)))

(defn update-shorthand-property-assignment
  "**Parameters:**
   - `node`: `ShorthandPropertyAssignment`
   - `name`: `Identifier`
   - `object-assignment-initializer`: `Expression | undefined`
   
   **Returns:** `ShorthandPropertyAssignment`"
  (^js [node-factory node name]
   (.updateShorthandPropertyAssignment ^js node-factory node name))
  (^js [node-factory node name object-assignment-initializer]
   (.updateShorthandPropertyAssignment ^js node-factory node name object-assignment-initializer)))

(defn create-spread-assignment
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `SpreadAssignment`"
  ^js [node-factory expression]
  (.createSpreadAssignment ^js node-factory expression))

(defn update-spread-assignment
  "**Parameters:**
   - `node`: `SpreadAssignment`
   - `expression`: `Expression`
   
   **Returns:** `SpreadAssignment`"
  ^js [node-factory node expression]
  (.updateSpreadAssignment ^js node-factory node expression))

(defn create-enum-member
  "**Parameters:**
   - `name`: `string | PropertyName`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `EnumMember`"
  (^js [node-factory name]
   (.createEnumMember ^js node-factory name))
  (^js [node-factory name initializer]
   (.createEnumMember ^js node-factory name initializer)))

(defn update-enum-member
  "**Parameters:**
   - `node`: `EnumMember`
   - `name`: `PropertyName`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `EnumMember`"
  (^js [node-factory node name]
   (.updateEnumMember ^js node-factory node name))
  (^js [node-factory node name initializer]
   (.updateEnumMember ^js node-factory node name initializer)))

(defn create-source-file
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   - `end-of-file-token`: `EndOfFileToken`
   - `flags`: `NodeFlags`
   
   **Returns:** `SourceFile`"
  ^js [node-factory statements end-of-file-token flags]
  (.createSourceFile ^js node-factory statements end-of-file-token flags))

(defn update-source-file
  "**Parameters:**
   - `node`: `SourceFile`
   - `statements`: `readonly Statement[]`
   - `declaration-file?`: `boolean | undefined`
   - `referenced-files`: `readonly FileReference[] | undefined`
   - `type-references`: `readonly FileReference[] | undefined`
   - `has-no-default-lib?`: `boolean | undefined`
   - `lib-references`: `readonly FileReference[] | undefined`
   
   **Returns:** `SourceFile`"
  (^js [node-factory node statements]
   (.updateSourceFile ^js node-factory node statements))
  (^js [node-factory node statements declaration-file?]
   (.updateSourceFile ^js node-factory node statements declaration-file?))
  (^js [node-factory node statements declaration-file? referenced-files]
   (.updateSourceFile ^js node-factory node statements declaration-file? referenced-files))
  (^js [node-factory node statements declaration-file? referenced-files type-references]
   (.updateSourceFile ^js node-factory node statements declaration-file? referenced-files type-references))
  (^js [node-factory node statements declaration-file? referenced-files type-references has-no-default-lib?]
   (.updateSourceFile ^js node-factory node statements declaration-file? referenced-files type-references has-no-default-lib?))
  (^js [node-factory node statements declaration-file? referenced-files type-references has-no-default-lib? lib-references]
   (.updateSourceFile ^js node-factory node statements declaration-file? referenced-files type-references has-no-default-lib? lib-references)))

(defn create-not-emitted-statement
  "**Parameters:**
   - `original`: `Node`
   
   **Returns:** `NotEmittedStatement`"
  ^js [node-factory original]
  (.createNotEmittedStatement ^js node-factory original))

(defn create-partially-emitted-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `original`: `Node | undefined`
   
   **Returns:** `PartiallyEmittedExpression`"
  (^js [node-factory expression]
   (.createPartiallyEmittedExpression ^js node-factory expression))
  (^js [node-factory expression original]
   (.createPartiallyEmittedExpression ^js node-factory expression original)))

(defn update-partially-emitted-expression
  "**Parameters:**
   - `node`: `PartiallyEmittedExpression`
   - `expression`: `Expression`
   
   **Returns:** `PartiallyEmittedExpression`"
  ^js [node-factory node expression]
  (.updatePartiallyEmittedExpression ^js node-factory node expression))

(defn create-comma-list-expression
  "**Parameters:**
   - `elements`: `readonly Expression[]`
   
   **Returns:** `CommaListExpression`"
  ^js [node-factory elements]
  (.createCommaListExpression ^js node-factory elements))

(defn update-comma-list-expression
  "**Parameters:**
   - `node`: `CommaListExpression`
   - `elements`: `readonly Expression[]`
   
   **Returns:** `CommaListExpression`"
  ^js [node-factory node elements]
  (.updateCommaListExpression ^js node-factory node elements))

(defn create-bundle
  "**Parameters:**
   - `source-files`: `readonly SourceFile[]`
   - `prepends`: `readonly (UnparsedSource | InputFiles)[] | undefined`
   
   **Returns:** `Bundle`"
  (^js [node-factory source-files]
   (.createBundle ^js node-factory source-files))
  (^js [node-factory source-files prepends]
   (.createBundle ^js node-factory source-files prepends)))

(defn update-bundle
  "**Parameters:**
   - `node`: `Bundle`
   - `source-files`: `readonly SourceFile[]`
   - `prepends`: `readonly (UnparsedSource | InputFiles)[] | undefined`
   
   **Returns:** `Bundle`"
  (^js [node-factory node source-files]
   (.updateBundle ^js node-factory node source-files))
  (^js [node-factory node source-files prepends]
   (.updateBundle ^js node-factory node source-files prepends)))

(defn create-comma
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createComma ^js node-factory left right))

(defn create-assignment
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `AssignmentExpression<EqualsToken>`"
  ^js [node-factory left right]
  (.createAssignment ^js node-factory left right))

(defn create-logical-or
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createLogicalOr ^js node-factory left right))

(defn create-logical-and
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createLogicalAnd ^js node-factory left right))

(defn create-bitwise-or
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createBitwiseOr ^js node-factory left right))

(defn create-bitwise-xor
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createBitwiseXor ^js node-factory left right))

(defn create-bitwise-and
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createBitwiseAnd ^js node-factory left right))

(defn create-strict-equality
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createStrictEquality ^js node-factory left right))

(defn create-strict-inequality
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createStrictInequality ^js node-factory left right))

(defn create-equality
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createEquality ^js node-factory left right))

(defn create-inequality
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createInequality ^js node-factory left right))

(defn create-less-than
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createLessThan ^js node-factory left right))

(defn create-less-than-equals
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createLessThanEquals ^js node-factory left right))

(defn create-greater-than
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createGreaterThan ^js node-factory left right))

(defn create-greater-than-equals
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createGreaterThanEquals ^js node-factory left right))

(defn create-left-shift
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createLeftShift ^js node-factory left right))

(defn create-right-shift
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createRightShift ^js node-factory left right))

(defn create-unsigned-right-shift
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createUnsignedRightShift ^js node-factory left right))

(defn create-add
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createAdd ^js node-factory left right))

(defn create-subtract
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createSubtract ^js node-factory left right))

(defn create-multiply
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createMultiply ^js node-factory left right))

(defn create-divide
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createDivide ^js node-factory left right))

(defn create-modulo
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createModulo ^js node-factory left right))

(defn create-exponent
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node-factory left right]
  (.createExponent ^js node-factory left right))

(defn create-prefix-plus
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [node-factory operand]
  (.createPrefixPlus ^js node-factory operand))

(defn create-prefix-minus
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [node-factory operand]
  (.createPrefixMinus ^js node-factory operand))

(defn create-prefix-increment
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [node-factory operand]
  (.createPrefixIncrement ^js node-factory operand))

(defn create-prefix-decrement
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [node-factory operand]
  (.createPrefixDecrement ^js node-factory operand))

(defn create-bitwise-not
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [node-factory operand]
  (.createBitwiseNot ^js node-factory operand))

(defn create-logical-not
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [node-factory operand]
  (.createLogicalNot ^js node-factory operand))

(defn create-postfix-increment
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PostfixUnaryExpression`"
  ^js [node-factory operand]
  (.createPostfixIncrement ^js node-factory operand))

(defn create-postfix-decrement
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PostfixUnaryExpression`"
  ^js [node-factory operand]
  (.createPostfixDecrement ^js node-factory operand))

(defn create-immediately-invoked-function-expression
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   - `param`: `ParameterDeclaration`
   - `param-value`: `Expression`
   
   **Returns:** `CallExpression`"
  (^js [node-factory statements]
   (.createImmediatelyInvokedFunctionExpression ^js node-factory statements))
  (^js [node-factory statements param param-value]
   (.createImmediatelyInvokedFunctionExpression ^js node-factory statements param param-value)))

(defn create-immediately-invoked-arrow-function
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   - `param`: `ParameterDeclaration`
   - `param-value`: `Expression`
   
   **Returns:** `ImmediatelyInvokedArrowFunction`"
  (^js [node-factory statements]
   (.createImmediatelyInvokedArrowFunction ^js node-factory statements))
  (^js [node-factory statements param param-value]
   (.createImmediatelyInvokedArrowFunction ^js node-factory statements param param-value)))

(defn create-void-zero
  "**Returns:** `VoidExpression`"
  ^js [node-factory]
  (.createVoidZero ^js node-factory))

(defn create-export-default
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ExportAssignment`"
  ^js [node-factory expression]
  (.createExportDefault ^js node-factory expression))

(defn create-external-module-export
  "**Parameters:**
   - `export-name`: `Identifier`
   
   **Returns:** `ExportDeclaration`"
  ^js [node-factory export-name]
  (.createExternalModuleExport ^js node-factory export-name))

(defn restore-outer-expressions
  "**Parameters:**
   - `outer-expression`: `Expression | undefined`
   - `inner-expression`: `Expression`
   - `kinds`: `OuterExpressionKinds | undefined`
   
   **Returns:** `Expression`"
  (^js [node-factory]
   (.restoreOuterExpressions ^js node-factory))
  (^js [node-factory outer-expression]
   (.restoreOuterExpressions ^js node-factory outer-expression))
  (^js [node-factory outer-expression inner-expression]
   (.restoreOuterExpressions ^js node-factory outer-expression inner-expression))
  (^js [node-factory outer-expression inner-expression kinds]
   (.restoreOuterExpressions ^js node-factory outer-expression inner-expression kinds)))

(defn replace-modifiers
  "Updates a node that may contain modifiers, replacing only the modifiers of the node.
   
   **Parameters:**
   - `node`: `T`
   - `modifiers`: `ModifierFlags | readonly Modifier[] | undefined`
   
   **Returns:** `T`"
  (^js [node-factory node]
   (.replaceModifiers ^js node-factory node))
  (^js [node-factory node modifiers]
   (.replaceModifiers ^js node-factory node modifiers)))

(defn replace-decorators-and-modifiers
  "Updates a node that may contain decorators or modifiers, replacing only the decorators and modifiers of the node.
   
   **Parameters:**
   - `node`: `T`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   
   **Returns:** `T`"
  (^js [node-factory node]
   (.replaceDecoratorsAndModifiers ^js node-factory node))
  (^js [node-factory node modifiers]
   (.replaceDecoratorsAndModifiers ^js node-factory node modifiers)))

(defn replace-property-name
  "Updates a node that contains a property name, replacing only the name of the node.
   
   **Parameters:**
   - `node`: `T`
   - `name`: `T[\"name\"]`
   
   **Returns:** `T`"
  ^js [node-factory node name]
  (.replacePropertyName ^js node-factory node name))
