(ns dots.typescript.factory
  (:require ["typescript" :as typescript]))

(defn create-node-array
  "**Parameters:**
   - `elements`: `readonly T[] | undefined`
   - `has-trailing-comma?`: `boolean | undefined`
   
   **Returns:** `NodeArray<T>`"
  (^js []
   (.createNodeArray typescript/factory))
  (^js [elements]
   (.createNodeArray typescript/factory elements))
  (^js [elements has-trailing-comma?]
   (.createNodeArray typescript/factory elements has-trailing-comma?)))

(defn create-numeric-literal
  "**Parameters:**
   - `value`: `string | number`
   - `numeric-literal-flags`: `TokenFlags | undefined`
   
   **Returns:** `NumericLiteral`"
  (^js [value]
   (.createNumericLiteral typescript/factory value))
  (^js [value numeric-literal-flags]
   (.createNumericLiteral typescript/factory value numeric-literal-flags)))

(defn create-big-int-literal
  "**Parameters:**
   - `value`: `string | PseudoBigInt`
   
   **Returns:** `BigIntLiteral`"
  ^js [value]
  (.createBigIntLiteral typescript/factory value))

(defn create-string-literal
  "**Parameters:**
   - `text`: `string`
   - `single-quote?`: `boolean | undefined`
   
   **Returns:** `StringLiteral`"
  (^js [text]
   (.createStringLiteral typescript/factory text))
  (^js [text single-quote?]
   (.createStringLiteral typescript/factory text single-quote?)))

(defn create-string-literal-from-node
  "**Parameters:**
   - `source-node`: `PrivateIdentifier | PropertyNameLiteral`
   - `single-quote?`: `boolean | undefined`
   
   **Returns:** `StringLiteral`"
  (^js [source-node]
   (.createStringLiteralFromNode typescript/factory source-node))
  (^js [source-node single-quote?]
   (.createStringLiteralFromNode typescript/factory source-node single-quote?)))

(defn create-regular-expression-literal
  "**Parameters:**
   - `text`: `string`
   
   **Returns:** `RegularExpressionLiteral`"
  ^js [text]
  (.createRegularExpressionLiteral typescript/factory text))

(defn create-identifier
  "**Parameters:**
   - `text`: `string`
   
   **Returns:** `Identifier`"
  ^js [text]
  (.createIdentifier typescript/factory text))

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
  (^js []
   (.createTempVariable typescript/factory))
  (^js [record-temp-variable]
   (.createTempVariable typescript/factory record-temp-variable))
  (^js [record-temp-variable reserved-in-nested-scopes?]
   (.createTempVariable typescript/factory record-temp-variable reserved-in-nested-scopes?)))

(defn create-loop-variable
  "Create a unique temporary variable for use in a loop.
   
   **Parameters:**
   - `reserved-in-nested-scopes?`: `boolean | undefined` - When `true`, reserves the temporary variable name in all nested scopes
   during emit so that the variable can be referenced in a nested function body. This is an alternative to
   setting `EmitFlags.ReuseTempVariableScope` on the nested function itself.
   
   **Returns:** `Identifier`"
  (^js []
   (.createLoopVariable typescript/factory))
  (^js [reserved-in-nested-scopes?]
   (.createLoopVariable typescript/factory reserved-in-nested-scopes?)))

(defn create-unique-name
  "Create a unique name based on the supplied text.
   
   **Parameters:**
   - `text`: `string`
   - `flags`: `GeneratedIdentifierFlags | undefined`
   
   **Returns:** `Identifier`"
  (^js [text]
   (.createUniqueName typescript/factory text))
  (^js [text flags]
   (.createUniqueName typescript/factory text flags)))

(defn generated-name-for-node
  "Create a unique name generated for a node.
   
   **Parameters:**
   - `node`: `Node | undefined`
   - `flags`: `GeneratedIdentifierFlags | undefined`
   
   **Returns:** `Identifier`"
  (^js []
   (.getGeneratedNameForNode typescript/factory))
  (^js [node]
   (.getGeneratedNameForNode typescript/factory node))
  (^js [node flags]
   (.getGeneratedNameForNode typescript/factory node flags)))

(defn create-private-identifier
  "**Parameters:**
   - `text`: `string`
   
   **Returns:** `PrivateIdentifier`"
  ^js [text]
  (.createPrivateIdentifier typescript/factory text))

(defn create-unique-private-name
  "**Parameters:**
   - `text`: `string | undefined`
   
   **Returns:** `PrivateIdentifier`"
  (^js []
   (.createUniquePrivateName typescript/factory))
  (^js [text]
   (.createUniquePrivateName typescript/factory text)))

(defn generated-private-name-for-node
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `PrivateIdentifier`"
  ^js [node]
  (.getGeneratedPrivateNameForNode typescript/factory node))

(defn create-token
  "**Parameters:**
   - `token`: `TKind`
   
   **Returns:** `KeywordToken<TKind>`"
  ^js [token]
  (.createToken typescript/factory token))

(defn create-super
  "**Returns:** `SuperExpression`"
  ^js []
  (.createSuper typescript/factory))

(defn create-this
  "**Returns:** `ThisExpression`"
  ^js []
  (.createThis typescript/factory))

(defn create-null
  "**Returns:** `NullLiteral`"
  ^js []
  (.createNull typescript/factory))

(defn create-true
  "**Returns:** `TrueLiteral`"
  ^js []
  (.createTrue typescript/factory))

(defn create-false
  "**Returns:** `FalseLiteral`"
  ^js []
  (.createFalse typescript/factory))

(defn create-modifier
  "**Parameters:**
   - `kind`: `T`
   
   **Returns:** `ModifierToken<T>`"
  ^js [kind]
  (.createModifier typescript/factory kind))

(defn create-modifiers-from-modifier-flags
  "**Parameters:**
   - `flags`: `ModifierFlags`
   
   **Returns:** `Modifier[] | undefined`"
  ^js [flags]
  (.createModifiersFromModifierFlags typescript/factory flags))

(defn create-qualified-name
  "**Parameters:**
   - `left`: `EntityName`
   - `right`: `string | Identifier`
   
   **Returns:** `QualifiedName`"
  ^js [left right]
  (.createQualifiedName typescript/factory left right))

(defn update-qualified-name
  "**Parameters:**
   - `node`: `QualifiedName`
   - `left`: `EntityName`
   - `right`: `Identifier`
   
   **Returns:** `QualifiedName`"
  ^js [node left right]
  (.updateQualifiedName typescript/factory node left right))

(defn create-computed-property-name
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ComputedPropertyName`"
  ^js [expression]
  (.createComputedPropertyName typescript/factory expression))

(defn update-computed-property-name
  "**Parameters:**
   - `node`: `ComputedPropertyName`
   - `expression`: `Expression`
   
   **Returns:** `ComputedPropertyName`"
  ^js [node expression]
  (.updateComputedPropertyName typescript/factory node expression))

(defn create-type-parameter-declaration
  "**Parameters:**
   - `modifiers`: `readonly Modifier[] | undefined`
   - `name`: `string | Identifier`
   - `constraint`: `TypeNode | undefined`
   - `default-type`: `TypeNode | undefined`
   
   **Returns:** `TypeParameterDeclaration`"
  (^js []
   (.createTypeParameterDeclaration typescript/factory))
  (^js [modifiers]
   (.createTypeParameterDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createTypeParameterDeclaration typescript/factory modifiers name))
  (^js [modifiers name constraint]
   (.createTypeParameterDeclaration typescript/factory modifiers name constraint))
  (^js [modifiers name constraint default-type]
   (.createTypeParameterDeclaration typescript/factory modifiers name constraint default-type)))

(defn update-type-parameter-declaration
  "**Parameters:**
   - `node`: `TypeParameterDeclaration`
   - `modifiers`: `readonly Modifier[] | undefined`
   - `name`: `Identifier`
   - `constraint`: `TypeNode | undefined`
   - `default-type`: `TypeNode | undefined`
   
   **Returns:** `TypeParameterDeclaration`"
  (^js [node]
   (.updateTypeParameterDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateTypeParameterDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateTypeParameterDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name constraint]
   (.updateTypeParameterDeclaration typescript/factory node modifiers name constraint))
  (^js [node modifiers name constraint default-type]
   (.updateTypeParameterDeclaration typescript/factory node modifiers name constraint default-type)))

(defn create-parameter-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `name`: `string | BindingName`
   - `question-token`: `QuestionToken | undefined`
   - `type`: `TypeNode | undefined`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `ParameterDeclaration`"
  (^js []
   (.createParameterDeclaration typescript/factory))
  (^js [modifiers]
   (.createParameterDeclaration typescript/factory modifiers))
  (^js [modifiers dot-dot-dot-token]
   (.createParameterDeclaration typescript/factory modifiers dot-dot-dot-token))
  (^js [modifiers dot-dot-dot-token name]
   (.createParameterDeclaration typescript/factory modifiers dot-dot-dot-token name))
  (^js [modifiers dot-dot-dot-token name question-token]
   (.createParameterDeclaration typescript/factory modifiers dot-dot-dot-token name question-token))
  (^js [modifiers dot-dot-dot-token name question-token type]
   (.createParameterDeclaration typescript/factory modifiers dot-dot-dot-token name question-token type))
  (^js [modifiers dot-dot-dot-token name question-token type initializer]
   (.createParameterDeclaration typescript/factory modifiers dot-dot-dot-token name question-token type initializer)))

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
  (^js [node]
   (.updateParameterDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateParameterDeclaration typescript/factory node modifiers))
  (^js [node modifiers dot-dot-dot-token]
   (.updateParameterDeclaration typescript/factory node modifiers dot-dot-dot-token))
  (^js [node modifiers dot-dot-dot-token name]
   (.updateParameterDeclaration typescript/factory node modifiers dot-dot-dot-token name))
  (^js [node modifiers dot-dot-dot-token name question-token]
   (.updateParameterDeclaration typescript/factory node modifiers dot-dot-dot-token name question-token))
  (^js [node modifiers dot-dot-dot-token name question-token type]
   (.updateParameterDeclaration typescript/factory node modifiers dot-dot-dot-token name question-token type))
  (^js [node modifiers dot-dot-dot-token name question-token type initializer]
   (.updateParameterDeclaration typescript/factory node modifiers dot-dot-dot-token name question-token type initializer)))

(defn create-decorator
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `Decorator`"
  ^js [expression]
  (.createDecorator typescript/factory expression))

(defn update-decorator
  "**Parameters:**
   - `node`: `Decorator`
   - `expression`: `Expression`
   
   **Returns:** `Decorator`"
  ^js [node expression]
  (.updateDecorator typescript/factory node expression))

(defn create-property-signature
  "**Parameters:**
   - `modifiers`: `readonly Modifier[] | undefined`
   - `name`: `string | PropertyName`
   - `question-token`: `QuestionToken | undefined`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `PropertySignature`"
  (^js []
   (.createPropertySignature typescript/factory))
  (^js [modifiers]
   (.createPropertySignature typescript/factory modifiers))
  (^js [modifiers name]
   (.createPropertySignature typescript/factory modifiers name))
  (^js [modifiers name question-token]
   (.createPropertySignature typescript/factory modifiers name question-token))
  (^js [modifiers name question-token type]
   (.createPropertySignature typescript/factory modifiers name question-token type)))

(defn update-property-signature
  "**Parameters:**
   - `node`: `PropertySignature`
   - `modifiers`: `readonly Modifier[] | undefined`
   - `name`: `PropertyName`
   - `question-token`: `QuestionToken | undefined`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `PropertySignature`"
  (^js [node]
   (.updatePropertySignature typescript/factory node))
  (^js [node modifiers]
   (.updatePropertySignature typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updatePropertySignature typescript/factory node modifiers name))
  (^js [node modifiers name question-token]
   (.updatePropertySignature typescript/factory node modifiers name question-token))
  (^js [node modifiers name question-token type]
   (.updatePropertySignature typescript/factory node modifiers name question-token type)))

(defn create-property-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | PropertyName`
   - `question-or-exclamation-token`: `QuestionToken | ExclamationToken | undefined`
   - `type`: `TypeNode | undefined`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `PropertyDeclaration`"
  (^js []
   (.createPropertyDeclaration typescript/factory))
  (^js [modifiers]
   (.createPropertyDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createPropertyDeclaration typescript/factory modifiers name))
  (^js [modifiers name question-or-exclamation-token]
   (.createPropertyDeclaration typescript/factory modifiers name question-or-exclamation-token))
  (^js [modifiers name question-or-exclamation-token type]
   (.createPropertyDeclaration typescript/factory modifiers name question-or-exclamation-token type))
  (^js [modifiers name question-or-exclamation-token type initializer]
   (.createPropertyDeclaration typescript/factory modifiers name question-or-exclamation-token type initializer)))

(defn update-property-declaration
  "**Parameters:**
   - `node`: `PropertyDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | PropertyName`
   - `question-or-exclamation-token`: `QuestionToken | ExclamationToken | undefined`
   - `type`: `TypeNode | undefined`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `PropertyDeclaration`"
  (^js [node]
   (.updatePropertyDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updatePropertyDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updatePropertyDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name question-or-exclamation-token]
   (.updatePropertyDeclaration typescript/factory node modifiers name question-or-exclamation-token))
  (^js [node modifiers name question-or-exclamation-token type]
   (.updatePropertyDeclaration typescript/factory node modifiers name question-or-exclamation-token type))
  (^js [node modifiers name question-or-exclamation-token type initializer]
   (.updatePropertyDeclaration typescript/factory node modifiers name question-or-exclamation-token type initializer)))

(defn create-method-signature
  "**Parameters:**
   - `modifiers`: `readonly Modifier[] | undefined`
   - `name`: `string | PropertyName`
   - `question-token`: `QuestionToken | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `MethodSignature`"
  (^js []
   (.createMethodSignature typescript/factory))
  (^js [modifiers]
   (.createMethodSignature typescript/factory modifiers))
  (^js [modifiers name]
   (.createMethodSignature typescript/factory modifiers name))
  (^js [modifiers name question-token]
   (.createMethodSignature typescript/factory modifiers name question-token))
  (^js [modifiers name question-token type-parameters]
   (.createMethodSignature typescript/factory modifiers name question-token type-parameters))
  (^js [modifiers name question-token type-parameters parameters]
   (.createMethodSignature typescript/factory modifiers name question-token type-parameters parameters))
  (^js [modifiers name question-token type-parameters parameters type]
   (.createMethodSignature typescript/factory modifiers name question-token type-parameters parameters type)))

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
  (^js [node]
   (.updateMethodSignature typescript/factory node))
  (^js [node modifiers]
   (.updateMethodSignature typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateMethodSignature typescript/factory node modifiers name))
  (^js [node modifiers name question-token]
   (.updateMethodSignature typescript/factory node modifiers name question-token))
  (^js [node modifiers name question-token type-parameters]
   (.updateMethodSignature typescript/factory node modifiers name question-token type-parameters))
  (^js [node modifiers name question-token type-parameters parameters]
   (.updateMethodSignature typescript/factory node modifiers name question-token type-parameters parameters))
  (^js [node modifiers name question-token type-parameters parameters type]
   (.updateMethodSignature typescript/factory node modifiers name question-token type-parameters parameters type)))

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
  (^js []
   (.createMethodDeclaration typescript/factory))
  (^js [modifiers]
   (.createMethodDeclaration typescript/factory modifiers))
  (^js [modifiers asterisk-token]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token))
  (^js [modifiers asterisk-token name]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name))
  (^js [modifiers asterisk-token name question-token]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name question-token))
  (^js [modifiers asterisk-token name question-token type-parameters]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name question-token type-parameters))
  (^js [modifiers asterisk-token name question-token type-parameters parameters]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name question-token type-parameters parameters))
  (^js [modifiers asterisk-token name question-token type-parameters parameters type]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name question-token type-parameters parameters type))
  (^js [modifiers asterisk-token name question-token type-parameters parameters type body]
   (.createMethodDeclaration typescript/factory modifiers asterisk-token name question-token type-parameters parameters type body)))

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
  (^js [node]
   (.updateMethodDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateMethodDeclaration typescript/factory node modifiers))
  (^js [node modifiers asterisk-token]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token))
  (^js [node modifiers asterisk-token name]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name))
  (^js [node modifiers asterisk-token name question-token]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name question-token))
  (^js [node modifiers asterisk-token name question-token type-parameters]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name question-token type-parameters))
  (^js [node modifiers asterisk-token name question-token type-parameters parameters]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name question-token type-parameters parameters))
  (^js [node modifiers asterisk-token name question-token type-parameters parameters type]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name question-token type-parameters parameters type))
  (^js [node modifiers asterisk-token name question-token type-parameters parameters type body]
   (.updateMethodDeclaration typescript/factory node modifiers asterisk-token name question-token type-parameters parameters type body)))

(defn create-constructor-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `body`: `Block | undefined`
   
   **Returns:** `ConstructorDeclaration`"
  (^js []
   (.createConstructorDeclaration typescript/factory))
  (^js [modifiers]
   (.createConstructorDeclaration typescript/factory modifiers))
  (^js [modifiers parameters]
   (.createConstructorDeclaration typescript/factory modifiers parameters))
  (^js [modifiers parameters body]
   (.createConstructorDeclaration typescript/factory modifiers parameters body)))

(defn update-constructor-declaration
  "**Parameters:**
   - `node`: `ConstructorDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `body`: `Block | undefined`
   
   **Returns:** `ConstructorDeclaration`"
  (^js [node]
   (.updateConstructorDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateConstructorDeclaration typescript/factory node modifiers))
  (^js [node modifiers parameters]
   (.updateConstructorDeclaration typescript/factory node modifiers parameters))
  (^js [node modifiers parameters body]
   (.updateConstructorDeclaration typescript/factory node modifiers parameters body)))

(defn create-get-accessor-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | PropertyName`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `body`: `Block | undefined`
   
   **Returns:** `GetAccessorDeclaration`"
  (^js []
   (.createGetAccessorDeclaration typescript/factory))
  (^js [modifiers]
   (.createGetAccessorDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createGetAccessorDeclaration typescript/factory modifiers name))
  (^js [modifiers name parameters]
   (.createGetAccessorDeclaration typescript/factory modifiers name parameters))
  (^js [modifiers name parameters type]
   (.createGetAccessorDeclaration typescript/factory modifiers name parameters type))
  (^js [modifiers name parameters type body]
   (.createGetAccessorDeclaration typescript/factory modifiers name parameters type body)))

(defn update-get-accessor-declaration
  "**Parameters:**
   - `node`: `GetAccessorDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `PropertyName`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `body`: `Block | undefined`
   
   **Returns:** `GetAccessorDeclaration`"
  (^js [node]
   (.updateGetAccessorDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateGetAccessorDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateGetAccessorDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name parameters]
   (.updateGetAccessorDeclaration typescript/factory node modifiers name parameters))
  (^js [node modifiers name parameters type]
   (.updateGetAccessorDeclaration typescript/factory node modifiers name parameters type))
  (^js [node modifiers name parameters type body]
   (.updateGetAccessorDeclaration typescript/factory node modifiers name parameters type body)))

(defn create-set-accessor-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | PropertyName`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `body`: `Block | undefined`
   
   **Returns:** `SetAccessorDeclaration`"
  (^js []
   (.createSetAccessorDeclaration typescript/factory))
  (^js [modifiers]
   (.createSetAccessorDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createSetAccessorDeclaration typescript/factory modifiers name))
  (^js [modifiers name parameters]
   (.createSetAccessorDeclaration typescript/factory modifiers name parameters))
  (^js [modifiers name parameters body]
   (.createSetAccessorDeclaration typescript/factory modifiers name parameters body)))

(defn update-set-accessor-declaration
  "**Parameters:**
   - `node`: `SetAccessorDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `PropertyName`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `body`: `Block | undefined`
   
   **Returns:** `SetAccessorDeclaration`"
  (^js [node]
   (.updateSetAccessorDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateSetAccessorDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateSetAccessorDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name parameters]
   (.updateSetAccessorDeclaration typescript/factory node modifiers name parameters))
  (^js [node modifiers name parameters body]
   (.updateSetAccessorDeclaration typescript/factory node modifiers name parameters body)))

(defn create-call-signature
  "**Parameters:**
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `CallSignatureDeclaration`"
  (^js []
   (.createCallSignature typescript/factory))
  (^js [type-parameters]
   (.createCallSignature typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createCallSignature typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createCallSignature typescript/factory type-parameters parameters type)))

(defn update-call-signature
  "**Parameters:**
   - `node`: `CallSignatureDeclaration`
   - `type-parameters`: `NodeArray<TypeParameterDeclaration> | undefined`
   - `parameters`: `NodeArray<ParameterDeclaration>`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `CallSignatureDeclaration`"
  (^js [node]
   (.updateCallSignature typescript/factory node))
  (^js [node type-parameters]
   (.updateCallSignature typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateCallSignature typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateCallSignature typescript/factory node type-parameters parameters type)))

(defn create-construct-signature
  "**Parameters:**
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `ConstructSignatureDeclaration`"
  (^js []
   (.createConstructSignature typescript/factory))
  (^js [type-parameters]
   (.createConstructSignature typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createConstructSignature typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createConstructSignature typescript/factory type-parameters parameters type)))

(defn update-construct-signature
  "**Parameters:**
   - `node`: `ConstructSignatureDeclaration`
   - `type-parameters`: `NodeArray<TypeParameterDeclaration> | undefined`
   - `parameters`: `NodeArray<ParameterDeclaration>`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `ConstructSignatureDeclaration`"
  (^js [node]
   (.updateConstructSignature typescript/factory node))
  (^js [node type-parameters]
   (.updateConstructSignature typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateConstructSignature typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateConstructSignature typescript/factory node type-parameters parameters type)))

(defn create-index-signature
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode`
   
   **Returns:** `IndexSignatureDeclaration`"
  (^js []
   (.createIndexSignature typescript/factory))
  (^js [modifiers]
   (.createIndexSignature typescript/factory modifiers))
  (^js [modifiers parameters]
   (.createIndexSignature typescript/factory modifiers parameters))
  (^js [modifiers parameters type]
   (.createIndexSignature typescript/factory modifiers parameters type)))

(defn update-index-signature
  "**Parameters:**
   - `node`: `IndexSignatureDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode`
   
   **Returns:** `IndexSignatureDeclaration`"
  (^js [node]
   (.updateIndexSignature typescript/factory node))
  (^js [node modifiers]
   (.updateIndexSignature typescript/factory node modifiers))
  (^js [node modifiers parameters]
   (.updateIndexSignature typescript/factory node modifiers parameters))
  (^js [node modifiers parameters type]
   (.updateIndexSignature typescript/factory node modifiers parameters type)))

(defn create-template-literal-type-span
  "**Parameters:**
   - `type`: `TypeNode`
   - `literal`: `TemplateMiddle | TemplateTail`
   
   **Returns:** `TemplateLiteralTypeSpan`"
  ^js [type literal]
  (.createTemplateLiteralTypeSpan typescript/factory type literal))

(defn update-template-literal-type-span
  "**Parameters:**
   - `node`: `TemplateLiteralTypeSpan`
   - `type`: `TypeNode`
   - `literal`: `TemplateMiddle | TemplateTail`
   
   **Returns:** `TemplateLiteralTypeSpan`"
  ^js [node type literal]
  (.updateTemplateLiteralTypeSpan typescript/factory node type literal))

(defn create-class-static-block-declaration
  "**Parameters:**
   - `body`: `Block`
   
   **Returns:** `ClassStaticBlockDeclaration`"
  ^js [body]
  (.createClassStaticBlockDeclaration typescript/factory body))

(defn update-class-static-block-declaration
  "**Parameters:**
   - `node`: `ClassStaticBlockDeclaration`
   - `body`: `Block`
   
   **Returns:** `ClassStaticBlockDeclaration`"
  ^js [node body]
  (.updateClassStaticBlockDeclaration typescript/factory node body))

(defn create-keyword-type-node
  "**Parameters:**
   - `kind`: `TKind`
   
   **Returns:** `KeywordTypeNode<TKind>`"
  ^js [kind]
  (.createKeywordTypeNode typescript/factory kind))

(defn create-type-predicate-node
  "**Parameters:**
   - `asserts-modifier`: `AssertsKeyword | undefined`
   - `parameter-name`: `string | Identifier | ThisTypeNode`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `TypePredicateNode`"
  (^js []
   (.createTypePredicateNode typescript/factory))
  (^js [asserts-modifier]
   (.createTypePredicateNode typescript/factory asserts-modifier))
  (^js [asserts-modifier parameter-name]
   (.createTypePredicateNode typescript/factory asserts-modifier parameter-name))
  (^js [asserts-modifier parameter-name type]
   (.createTypePredicateNode typescript/factory asserts-modifier parameter-name type)))

(defn update-type-predicate-node
  "**Parameters:**
   - `node`: `TypePredicateNode`
   - `asserts-modifier`: `AssertsKeyword | undefined`
   - `parameter-name`: `Identifier | ThisTypeNode`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `TypePredicateNode`"
  (^js [node]
   (.updateTypePredicateNode typescript/factory node))
  (^js [node asserts-modifier]
   (.updateTypePredicateNode typescript/factory node asserts-modifier))
  (^js [node asserts-modifier parameter-name]
   (.updateTypePredicateNode typescript/factory node asserts-modifier parameter-name))
  (^js [node asserts-modifier parameter-name type]
   (.updateTypePredicateNode typescript/factory node asserts-modifier parameter-name type)))

(defn create-type-reference-node
  "**Parameters:**
   - `type-name`: `string | EntityName`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   
   **Returns:** `TypeReferenceNode`"
  (^js [type-name]
   (.createTypeReferenceNode typescript/factory type-name))
  (^js [type-name type-arguments]
   (.createTypeReferenceNode typescript/factory type-name type-arguments)))

(defn update-type-reference-node
  "**Parameters:**
   - `node`: `TypeReferenceNode`
   - `type-name`: `EntityName`
   - `type-arguments`: `NodeArray<TypeNode> | undefined`
   
   **Returns:** `TypeReferenceNode`"
  (^js [node type-name]
   (.updateTypeReferenceNode typescript/factory node type-name))
  (^js [node type-name type-arguments]
   (.updateTypeReferenceNode typescript/factory node type-name type-arguments)))

(defn create-function-type-node
  "**Parameters:**
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode`
   
   **Returns:** `FunctionTypeNode`"
  (^js []
   (.createFunctionTypeNode typescript/factory))
  (^js [type-parameters]
   (.createFunctionTypeNode typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createFunctionTypeNode typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createFunctionTypeNode typescript/factory type-parameters parameters type)))

(defn update-function-type-node
  "**Parameters:**
   - `node`: `FunctionTypeNode`
   - `type-parameters`: `NodeArray<TypeParameterDeclaration> | undefined`
   - `parameters`: `NodeArray<ParameterDeclaration>`
   - `type`: `TypeNode`
   
   **Returns:** `FunctionTypeNode`"
  (^js [node]
   (.updateFunctionTypeNode typescript/factory node))
  (^js [node type-parameters]
   (.updateFunctionTypeNode typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateFunctionTypeNode typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateFunctionTypeNode typescript/factory node type-parameters parameters type)))

(defn create-constructor-type-node
  "**Parameters:**
   - `modifiers`: `readonly Modifier[] | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode`
   
   **Returns:** `ConstructorTypeNode`"
  (^js []
   (.createConstructorTypeNode typescript/factory))
  (^js [modifiers]
   (.createConstructorTypeNode typescript/factory modifiers))
  (^js [modifiers type-parameters]
   (.createConstructorTypeNode typescript/factory modifiers type-parameters))
  (^js [modifiers type-parameters parameters]
   (.createConstructorTypeNode typescript/factory modifiers type-parameters parameters))
  (^js [modifiers type-parameters parameters type]
   (.createConstructorTypeNode typescript/factory modifiers type-parameters parameters type)))

(defn update-constructor-type-node
  "**Parameters:**
   - `node`: `ConstructorTypeNode`
   - `modifiers`: `readonly Modifier[] | undefined`
   - `type-parameters`: `NodeArray<TypeParameterDeclaration> | undefined`
   - `parameters`: `NodeArray<ParameterDeclaration>`
   - `type`: `TypeNode`
   
   **Returns:** `ConstructorTypeNode`"
  (^js [node]
   (.updateConstructorTypeNode typescript/factory node))
  (^js [node modifiers]
   (.updateConstructorTypeNode typescript/factory node modifiers))
  (^js [node modifiers type-parameters]
   (.updateConstructorTypeNode typescript/factory node modifiers type-parameters))
  (^js [node modifiers type-parameters parameters]
   (.updateConstructorTypeNode typescript/factory node modifiers type-parameters parameters))
  (^js [node modifiers type-parameters parameters type]
   (.updateConstructorTypeNode typescript/factory node modifiers type-parameters parameters type)))

(defn create-type-query-node
  "**Parameters:**
   - `expr-name`: `EntityName`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   
   **Returns:** `TypeQueryNode`"
  (^js [expr-name]
   (.createTypeQueryNode typescript/factory expr-name))
  (^js [expr-name type-arguments]
   (.createTypeQueryNode typescript/factory expr-name type-arguments)))

(defn update-type-query-node
  "**Parameters:**
   - `node`: `TypeQueryNode`
   - `expr-name`: `EntityName`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   
   **Returns:** `TypeQueryNode`"
  (^js [node expr-name]
   (.updateTypeQueryNode typescript/factory node expr-name))
  (^js [node expr-name type-arguments]
   (.updateTypeQueryNode typescript/factory node expr-name type-arguments)))

(defn create-type-literal-node
  "**Parameters:**
   - `members`: `readonly TypeElement[] | undefined`
   
   **Returns:** `TypeLiteralNode`"
  (^js []
   (.createTypeLiteralNode typescript/factory))
  (^js [members]
   (.createTypeLiteralNode typescript/factory members)))

(defn update-type-literal-node
  "**Parameters:**
   - `node`: `TypeLiteralNode`
   - `members`: `NodeArray<TypeElement>`
   
   **Returns:** `TypeLiteralNode`"
  ^js [node members]
  (.updateTypeLiteralNode typescript/factory node members))

(defn create-array-type-node
  "**Parameters:**
   - `element-type`: `TypeNode`
   
   **Returns:** `ArrayTypeNode`"
  ^js [element-type]
  (.createArrayTypeNode typescript/factory element-type))

(defn update-array-type-node
  "**Parameters:**
   - `node`: `ArrayTypeNode`
   - `element-type`: `TypeNode`
   
   **Returns:** `ArrayTypeNode`"
  ^js [node element-type]
  (.updateArrayTypeNode typescript/factory node element-type))

(defn create-tuple-type-node
  "**Parameters:**
   - `elements`: `readonly (TypeNode | NamedTupleMember)[]`
   
   **Returns:** `TupleTypeNode`"
  ^js [elements]
  (.createTupleTypeNode typescript/factory elements))

(defn update-tuple-type-node
  "**Parameters:**
   - `node`: `TupleTypeNode`
   - `elements`: `readonly (TypeNode | NamedTupleMember)[]`
   
   **Returns:** `TupleTypeNode`"
  ^js [node elements]
  (.updateTupleTypeNode typescript/factory node elements))

(defn create-named-tuple-member
  "**Parameters:**
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `name`: `Identifier`
   - `question-token`: `QuestionToken | undefined`
   - `type`: `TypeNode`
   
   **Returns:** `NamedTupleMember`"
  (^js []
   (.createNamedTupleMember typescript/factory))
  (^js [dot-dot-dot-token]
   (.createNamedTupleMember typescript/factory dot-dot-dot-token))
  (^js [dot-dot-dot-token name]
   (.createNamedTupleMember typescript/factory dot-dot-dot-token name))
  (^js [dot-dot-dot-token name question-token]
   (.createNamedTupleMember typescript/factory dot-dot-dot-token name question-token))
  (^js [dot-dot-dot-token name question-token type]
   (.createNamedTupleMember typescript/factory dot-dot-dot-token name question-token type)))

(defn update-named-tuple-member
  "**Parameters:**
   - `node`: `NamedTupleMember`
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `name`: `Identifier`
   - `question-token`: `QuestionToken | undefined`
   - `type`: `TypeNode`
   
   **Returns:** `NamedTupleMember`"
  (^js [node]
   (.updateNamedTupleMember typescript/factory node))
  (^js [node dot-dot-dot-token]
   (.updateNamedTupleMember typescript/factory node dot-dot-dot-token))
  (^js [node dot-dot-dot-token name]
   (.updateNamedTupleMember typescript/factory node dot-dot-dot-token name))
  (^js [node dot-dot-dot-token name question-token]
   (.updateNamedTupleMember typescript/factory node dot-dot-dot-token name question-token))
  (^js [node dot-dot-dot-token name question-token type]
   (.updateNamedTupleMember typescript/factory node dot-dot-dot-token name question-token type)))

(defn create-optional-type-node
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `OptionalTypeNode`"
  ^js [type]
  (.createOptionalTypeNode typescript/factory type))

(defn update-optional-type-node
  "**Parameters:**
   - `node`: `OptionalTypeNode`
   - `type`: `TypeNode`
   
   **Returns:** `OptionalTypeNode`"
  ^js [node type]
  (.updateOptionalTypeNode typescript/factory node type))

(defn create-rest-type-node
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `RestTypeNode`"
  ^js [type]
  (.createRestTypeNode typescript/factory type))

(defn update-rest-type-node
  "**Parameters:**
   - `node`: `RestTypeNode`
   - `type`: `TypeNode`
   
   **Returns:** `RestTypeNode`"
  ^js [node type]
  (.updateRestTypeNode typescript/factory node type))

(defn create-union-type-node
  "**Parameters:**
   - `types`: `readonly TypeNode[]`
   
   **Returns:** `UnionTypeNode`"
  ^js [types]
  (.createUnionTypeNode typescript/factory types))

(defn update-union-type-node
  "**Parameters:**
   - `node`: `UnionTypeNode`
   - `types`: `NodeArray<TypeNode>`
   
   **Returns:** `UnionTypeNode`"
  ^js [node types]
  (.updateUnionTypeNode typescript/factory node types))

(defn create-intersection-type-node
  "**Parameters:**
   - `types`: `readonly TypeNode[]`
   
   **Returns:** `IntersectionTypeNode`"
  ^js [types]
  (.createIntersectionTypeNode typescript/factory types))

(defn update-intersection-type-node
  "**Parameters:**
   - `node`: `IntersectionTypeNode`
   - `types`: `NodeArray<TypeNode>`
   
   **Returns:** `IntersectionTypeNode`"
  ^js [node types]
  (.updateIntersectionTypeNode typescript/factory node types))

(defn create-conditional-type-node
  "**Parameters:**
   - `check-type`: `TypeNode`
   - `extends-type`: `TypeNode`
   - `true-type`: `TypeNode`
   - `false-type`: `TypeNode`
   
   **Returns:** `ConditionalTypeNode`"
  ^js [check-type extends-type true-type false-type]
  (.createConditionalTypeNode typescript/factory check-type extends-type true-type false-type))

(defn update-conditional-type-node
  "**Parameters:**
   - `node`: `ConditionalTypeNode`
   - `check-type`: `TypeNode`
   - `extends-type`: `TypeNode`
   - `true-type`: `TypeNode`
   - `false-type`: `TypeNode`
   
   **Returns:** `ConditionalTypeNode`"
  ^js [node check-type extends-type true-type false-type]
  (.updateConditionalTypeNode typescript/factory node check-type extends-type true-type false-type))

(defn create-infer-type-node
  "**Parameters:**
   - `type-parameter`: `TypeParameterDeclaration`
   
   **Returns:** `InferTypeNode`"
  ^js [type-parameter]
  (.createInferTypeNode typescript/factory type-parameter))

(defn update-infer-type-node
  "**Parameters:**
   - `node`: `InferTypeNode`
   - `type-parameter`: `TypeParameterDeclaration`
   
   **Returns:** `InferTypeNode`"
  ^js [node type-parameter]
  (.updateInferTypeNode typescript/factory node type-parameter))

(defn create-import-type-node
  "**Parameters:**
   - `argument`: `TypeNode`
   - `attributes`: `ImportAttributes | undefined`
   - `qualifier`: `EntityName | undefined`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `type-of?`: `boolean | undefined`
   
   **Returns:** `ImportTypeNode`"
  (^js [argument]
   (.createImportTypeNode typescript/factory argument))
  (^js [argument attributes]
   (.createImportTypeNode typescript/factory argument attributes))
  (^js [argument attributes qualifier]
   (.createImportTypeNode typescript/factory argument attributes qualifier))
  (^js [argument attributes qualifier type-arguments]
   (.createImportTypeNode typescript/factory argument attributes qualifier type-arguments))
  (^js [argument attributes qualifier type-arguments type-of?]
   (.createImportTypeNode typescript/factory argument attributes qualifier type-arguments type-of?)))

(defn update-import-type-node
  "**Parameters:**
   - `node`: `ImportTypeNode`
   - `argument`: `TypeNode`
   - `attributes`: `ImportAttributes | undefined`
   - `qualifier`: `EntityName | undefined`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `type-of?`: `boolean | undefined`
   
   **Returns:** `ImportTypeNode`"
  (^js [node argument]
   (.updateImportTypeNode typescript/factory node argument))
  (^js [node argument attributes]
   (.updateImportTypeNode typescript/factory node argument attributes))
  (^js [node argument attributes qualifier]
   (.updateImportTypeNode typescript/factory node argument attributes qualifier))
  (^js [node argument attributes qualifier type-arguments]
   (.updateImportTypeNode typescript/factory node argument attributes qualifier type-arguments))
  (^js [node argument attributes qualifier type-arguments type-of?]
   (.updateImportTypeNode typescript/factory node argument attributes qualifier type-arguments type-of?)))

(defn create-parenthesized-type
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `ParenthesizedTypeNode`"
  ^js [type]
  (.createParenthesizedType typescript/factory type))

(defn update-parenthesized-type
  "**Parameters:**
   - `node`: `ParenthesizedTypeNode`
   - `type`: `TypeNode`
   
   **Returns:** `ParenthesizedTypeNode`"
  ^js [node type]
  (.updateParenthesizedType typescript/factory node type))

(defn create-this-type-node
  "**Returns:** `ThisTypeNode`"
  ^js []
  (.createThisTypeNode typescript/factory))

(defn create-type-operator-node
  "**Parameters:**
   - `operator`: `SyntaxKind.KeyOfKeyword | SyntaxKind.ReadonlyKeyword | SyntaxKind.UniqueKeyword`
   - `type`: `TypeNode`
   
   **Returns:** `TypeOperatorNode`"
  ^js [operator type]
  (.createTypeOperatorNode typescript/factory operator type))

(defn update-type-operator-node
  "**Parameters:**
   - `node`: `TypeOperatorNode`
   - `type`: `TypeNode`
   
   **Returns:** `TypeOperatorNode`"
  ^js [node type]
  (.updateTypeOperatorNode typescript/factory node type))

(defn create-indexed-access-type-node
  "**Parameters:**
   - `object-type`: `TypeNode`
   - `index-type`: `TypeNode`
   
   **Returns:** `IndexedAccessTypeNode`"
  ^js [object-type index-type]
  (.createIndexedAccessTypeNode typescript/factory object-type index-type))

(defn update-indexed-access-type-node
  "**Parameters:**
   - `node`: `IndexedAccessTypeNode`
   - `object-type`: `TypeNode`
   - `index-type`: `TypeNode`
   
   **Returns:** `IndexedAccessTypeNode`"
  ^js [node object-type index-type]
  (.updateIndexedAccessTypeNode typescript/factory node object-type index-type))

(defn create-mapped-type-node
  "**Parameters:**
   - `readonly-token`: `ReadonlyKeyword | PlusToken | MinusToken | undefined`
   - `type-parameter`: `TypeParameterDeclaration`
   - `name-type`: `TypeNode | undefined`
   - `question-token`: `QuestionToken | PlusToken | MinusToken | undefined`
   - `type`: `TypeNode | undefined`
   - `members`: `NodeArray<TypeElement> | undefined`
   
   **Returns:** `MappedTypeNode`"
  (^js []
   (.createMappedTypeNode typescript/factory))
  (^js [readonly-token]
   (.createMappedTypeNode typescript/factory readonly-token))
  (^js [readonly-token type-parameter]
   (.createMappedTypeNode typescript/factory readonly-token type-parameter))
  (^js [readonly-token type-parameter name-type]
   (.createMappedTypeNode typescript/factory readonly-token type-parameter name-type))
  (^js [readonly-token type-parameter name-type question-token]
   (.createMappedTypeNode typescript/factory readonly-token type-parameter name-type question-token))
  (^js [readonly-token type-parameter name-type question-token type]
   (.createMappedTypeNode typescript/factory readonly-token type-parameter name-type question-token type))
  (^js [readonly-token type-parameter name-type question-token type members]
   (.createMappedTypeNode typescript/factory readonly-token type-parameter name-type question-token type members)))

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
  (^js [node]
   (.updateMappedTypeNode typescript/factory node))
  (^js [node readonly-token]
   (.updateMappedTypeNode typescript/factory node readonly-token))
  (^js [node readonly-token type-parameter]
   (.updateMappedTypeNode typescript/factory node readonly-token type-parameter))
  (^js [node readonly-token type-parameter name-type]
   (.updateMappedTypeNode typescript/factory node readonly-token type-parameter name-type))
  (^js [node readonly-token type-parameter name-type question-token]
   (.updateMappedTypeNode typescript/factory node readonly-token type-parameter name-type question-token))
  (^js [node readonly-token type-parameter name-type question-token type]
   (.updateMappedTypeNode typescript/factory node readonly-token type-parameter name-type question-token type))
  (^js [node readonly-token type-parameter name-type question-token type members]
   (.updateMappedTypeNode typescript/factory node readonly-token type-parameter name-type question-token type members)))

(defn create-literal-type-node
  "**Parameters:**
   - `literal`: `LiteralExpression | NullLiteral | BooleanLiteral | PrefixUnaryExpression`
   
   **Returns:** `LiteralTypeNode`"
  ^js [literal]
  (.createLiteralTypeNode typescript/factory literal))

(defn update-literal-type-node
  "**Parameters:**
   - `node`: `LiteralTypeNode`
   - `literal`: `LiteralExpression | NullLiteral | BooleanLiteral | PrefixUnaryExpression`
   
   **Returns:** `LiteralTypeNode`"
  ^js [node literal]
  (.updateLiteralTypeNode typescript/factory node literal))

(defn create-template-literal-type
  "**Parameters:**
   - `head`: `TemplateHead`
   - `template-spans`: `readonly TemplateLiteralTypeSpan[]`
   
   **Returns:** `TemplateLiteralTypeNode`"
  ^js [head template-spans]
  (.createTemplateLiteralType typescript/factory head template-spans))

(defn update-template-literal-type
  "**Parameters:**
   - `node`: `TemplateLiteralTypeNode`
   - `head`: `TemplateHead`
   - `template-spans`: `readonly TemplateLiteralTypeSpan[]`
   
   **Returns:** `TemplateLiteralTypeNode`"
  ^js [node head template-spans]
  (.updateTemplateLiteralType typescript/factory node head template-spans))

(defn create-object-binding-pattern
  "**Parameters:**
   - `elements`: `readonly BindingElement[]`
   
   **Returns:** `ObjectBindingPattern`"
  ^js [elements]
  (.createObjectBindingPattern typescript/factory elements))

(defn update-object-binding-pattern
  "**Parameters:**
   - `node`: `ObjectBindingPattern`
   - `elements`: `readonly BindingElement[]`
   
   **Returns:** `ObjectBindingPattern`"
  ^js [node elements]
  (.updateObjectBindingPattern typescript/factory node elements))

(defn create-array-binding-pattern
  "**Parameters:**
   - `elements`: `readonly ArrayBindingElement[]`
   
   **Returns:** `ArrayBindingPattern`"
  ^js [elements]
  (.createArrayBindingPattern typescript/factory elements))

(defn update-array-binding-pattern
  "**Parameters:**
   - `node`: `ArrayBindingPattern`
   - `elements`: `readonly ArrayBindingElement[]`
   
   **Returns:** `ArrayBindingPattern`"
  ^js [node elements]
  (.updateArrayBindingPattern typescript/factory node elements))

(defn create-binding-element
  "**Parameters:**
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `property-name`: `string | PropertyName | undefined`
   - `name`: `string | BindingName`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `BindingElement`"
  (^js []
   (.createBindingElement typescript/factory))
  (^js [dot-dot-dot-token]
   (.createBindingElement typescript/factory dot-dot-dot-token))
  (^js [dot-dot-dot-token property-name]
   (.createBindingElement typescript/factory dot-dot-dot-token property-name))
  (^js [dot-dot-dot-token property-name name]
   (.createBindingElement typescript/factory dot-dot-dot-token property-name name))
  (^js [dot-dot-dot-token property-name name initializer]
   (.createBindingElement typescript/factory dot-dot-dot-token property-name name initializer)))

(defn update-binding-element
  "**Parameters:**
   - `node`: `BindingElement`
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `property-name`: `PropertyName | undefined`
   - `name`: `BindingName`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `BindingElement`"
  (^js [node]
   (.updateBindingElement typescript/factory node))
  (^js [node dot-dot-dot-token]
   (.updateBindingElement typescript/factory node dot-dot-dot-token))
  (^js [node dot-dot-dot-token property-name]
   (.updateBindingElement typescript/factory node dot-dot-dot-token property-name))
  (^js [node dot-dot-dot-token property-name name]
   (.updateBindingElement typescript/factory node dot-dot-dot-token property-name name))
  (^js [node dot-dot-dot-token property-name name initializer]
   (.updateBindingElement typescript/factory node dot-dot-dot-token property-name name initializer)))

(defn create-array-literal-expression
  "**Parameters:**
   - `elements`: `readonly Expression[] | undefined`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ArrayLiteralExpression`"
  (^js []
   (.createArrayLiteralExpression typescript/factory))
  (^js [elements]
   (.createArrayLiteralExpression typescript/factory elements))
  (^js [elements multi-line?]
   (.createArrayLiteralExpression typescript/factory elements multi-line?)))

(defn update-array-literal-expression
  "**Parameters:**
   - `node`: `ArrayLiteralExpression`
   - `elements`: `readonly Expression[]`
   
   **Returns:** `ArrayLiteralExpression`"
  ^js [node elements]
  (.updateArrayLiteralExpression typescript/factory node elements))

(defn create-object-literal-expression
  "**Parameters:**
   - `properties`: `readonly ObjectLiteralElementLike[] | undefined`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ObjectLiteralExpression`"
  (^js []
   (.createObjectLiteralExpression typescript/factory))
  (^js [properties]
   (.createObjectLiteralExpression typescript/factory properties))
  (^js [properties multi-line?]
   (.createObjectLiteralExpression typescript/factory properties multi-line?)))

(defn update-object-literal-expression
  "**Parameters:**
   - `node`: `ObjectLiteralExpression`
   - `properties`: `readonly ObjectLiteralElementLike[]`
   
   **Returns:** `ObjectLiteralExpression`"
  ^js [node properties]
  (.updateObjectLiteralExpression typescript/factory node properties))

(defn create-property-access-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `name`: `string | MemberName`
   
   **Returns:** `PropertyAccessExpression`"
  ^js [expression name]
  (.createPropertyAccessExpression typescript/factory expression name))

(defn update-property-access-expression
  "**Parameters:**
   - `node`: `PropertyAccessExpression`
   - `expression`: `Expression`
   - `name`: `MemberName`
   
   **Returns:** `PropertyAccessExpression`"
  ^js [node expression name]
  (.updatePropertyAccessExpression typescript/factory node expression name))

(defn create-property-access-chain
  "**Parameters:**
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `name`: `string | MemberName`
   
   **Returns:** `PropertyAccessChain`"
  (^js [expression]
   (.createPropertyAccessChain typescript/factory expression))
  (^js [expression question-dot-token]
   (.createPropertyAccessChain typescript/factory expression question-dot-token))
  (^js [expression question-dot-token name]
   (.createPropertyAccessChain typescript/factory expression question-dot-token name)))

(defn update-property-access-chain
  "**Parameters:**
   - `node`: `PropertyAccessChain`
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `name`: `MemberName`
   
   **Returns:** `PropertyAccessChain`"
  (^js [node expression]
   (.updatePropertyAccessChain typescript/factory node expression))
  (^js [node expression question-dot-token]
   (.updatePropertyAccessChain typescript/factory node expression question-dot-token))
  (^js [node expression question-dot-token name]
   (.updatePropertyAccessChain typescript/factory node expression question-dot-token name)))

(defn create-element-access-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `index`: `number | Expression`
   
   **Returns:** `ElementAccessExpression`"
  ^js [expression index]
  (.createElementAccessExpression typescript/factory expression index))

(defn update-element-access-expression
  "**Parameters:**
   - `node`: `ElementAccessExpression`
   - `expression`: `Expression`
   - `argument-expression`: `Expression`
   
   **Returns:** `ElementAccessExpression`"
  ^js [node expression argument-expression]
  (.updateElementAccessExpression typescript/factory node expression argument-expression))

(defn create-element-access-chain
  "**Parameters:**
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `index`: `number | Expression`
   
   **Returns:** `ElementAccessChain`"
  (^js [expression]
   (.createElementAccessChain typescript/factory expression))
  (^js [expression question-dot-token]
   (.createElementAccessChain typescript/factory expression question-dot-token))
  (^js [expression question-dot-token index]
   (.createElementAccessChain typescript/factory expression question-dot-token index)))

(defn update-element-access-chain
  "**Parameters:**
   - `node`: `ElementAccessChain`
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `argument-expression`: `Expression`
   
   **Returns:** `ElementAccessChain`"
  (^js [node expression]
   (.updateElementAccessChain typescript/factory node expression))
  (^js [node expression question-dot-token]
   (.updateElementAccessChain typescript/factory node expression question-dot-token))
  (^js [node expression question-dot-token argument-expression]
   (.updateElementAccessChain typescript/factory node expression question-dot-token argument-expression)))

(defn create-call-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[] | undefined`
   
   **Returns:** `CallExpression`"
  (^js [expression]
   (.createCallExpression typescript/factory expression))
  (^js [expression type-arguments]
   (.createCallExpression typescript/factory expression type-arguments))
  (^js [expression type-arguments arguments-array]
   (.createCallExpression typescript/factory expression type-arguments arguments-array)))

(defn update-call-expression
  "**Parameters:**
   - `node`: `CallExpression`
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[]`
   
   **Returns:** `CallExpression`"
  (^js [node expression]
   (.updateCallExpression typescript/factory node expression))
  (^js [node expression type-arguments]
   (.updateCallExpression typescript/factory node expression type-arguments))
  (^js [node expression type-arguments arguments-array]
   (.updateCallExpression typescript/factory node expression type-arguments arguments-array)))

(defn create-call-chain
  "**Parameters:**
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[] | undefined`
   
   **Returns:** `CallChain`"
  (^js [expression]
   (.createCallChain typescript/factory expression))
  (^js [expression question-dot-token]
   (.createCallChain typescript/factory expression question-dot-token))
  (^js [expression question-dot-token type-arguments]
   (.createCallChain typescript/factory expression question-dot-token type-arguments))
  (^js [expression question-dot-token type-arguments arguments-array]
   (.createCallChain typescript/factory expression question-dot-token type-arguments arguments-array)))

(defn update-call-chain
  "**Parameters:**
   - `node`: `CallChain`
   - `expression`: `Expression`
   - `question-dot-token`: `QuestionDotToken | undefined`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[]`
   
   **Returns:** `CallChain`"
  (^js [node expression]
   (.updateCallChain typescript/factory node expression))
  (^js [node expression question-dot-token]
   (.updateCallChain typescript/factory node expression question-dot-token))
  (^js [node expression question-dot-token type-arguments]
   (.updateCallChain typescript/factory node expression question-dot-token type-arguments))
  (^js [node expression question-dot-token type-arguments arguments-array]
   (.updateCallChain typescript/factory node expression question-dot-token type-arguments arguments-array)))

(defn create-new-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[] | undefined`
   
   **Returns:** `NewExpression`"
  (^js [expression]
   (.createNewExpression typescript/factory expression))
  (^js [expression type-arguments]
   (.createNewExpression typescript/factory expression type-arguments))
  (^js [expression type-arguments arguments-array]
   (.createNewExpression typescript/factory expression type-arguments arguments-array)))

(defn update-new-expression
  "**Parameters:**
   - `node`: `NewExpression`
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `arguments-array`: `readonly Expression[] | undefined`
   
   **Returns:** `NewExpression`"
  (^js [node expression]
   (.updateNewExpression typescript/factory node expression))
  (^js [node expression type-arguments]
   (.updateNewExpression typescript/factory node expression type-arguments))
  (^js [node expression type-arguments arguments-array]
   (.updateNewExpression typescript/factory node expression type-arguments arguments-array)))

(defn create-tagged-template-expression
  "**Parameters:**
   - `tag`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `template`: `TemplateLiteral`
   
   **Returns:** `TaggedTemplateExpression`"
  (^js [tag]
   (.createTaggedTemplateExpression typescript/factory tag))
  (^js [tag type-arguments]
   (.createTaggedTemplateExpression typescript/factory tag type-arguments))
  (^js [tag type-arguments template]
   (.createTaggedTemplateExpression typescript/factory tag type-arguments template)))

(defn update-tagged-template-expression
  "**Parameters:**
   - `node`: `TaggedTemplateExpression`
   - `tag`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `template`: `TemplateLiteral`
   
   **Returns:** `TaggedTemplateExpression`"
  (^js [node tag]
   (.updateTaggedTemplateExpression typescript/factory node tag))
  (^js [node tag type-arguments]
   (.updateTaggedTemplateExpression typescript/factory node tag type-arguments))
  (^js [node tag type-arguments template]
   (.updateTaggedTemplateExpression typescript/factory node tag type-arguments template)))

(defn create-type-assertion
  "**Parameters:**
   - `type`: `TypeNode`
   - `expression`: `Expression`
   
   **Returns:** `TypeAssertion`"
  ^js [type expression]
  (.createTypeAssertion typescript/factory type expression))

(defn update-type-assertion
  "**Parameters:**
   - `node`: `TypeAssertion`
   - `type`: `TypeNode`
   - `expression`: `Expression`
   
   **Returns:** `TypeAssertion`"
  ^js [node type expression]
  (.updateTypeAssertion typescript/factory node type expression))

(defn create-parenthesized-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ParenthesizedExpression`"
  ^js [expression]
  (.createParenthesizedExpression typescript/factory expression))

(defn update-parenthesized-expression
  "**Parameters:**
   - `node`: `ParenthesizedExpression`
   - `expression`: `Expression`
   
   **Returns:** `ParenthesizedExpression`"
  ^js [node expression]
  (.updateParenthesizedExpression typescript/factory node expression))

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
  (^js []
   (.createFunctionExpression typescript/factory))
  (^js [modifiers]
   (.createFunctionExpression typescript/factory modifiers))
  (^js [modifiers asterisk-token]
   (.createFunctionExpression typescript/factory modifiers asterisk-token))
  (^js [modifiers asterisk-token name]
   (.createFunctionExpression typescript/factory modifiers asterisk-token name))
  (^js [modifiers asterisk-token name type-parameters]
   (.createFunctionExpression typescript/factory modifiers asterisk-token name type-parameters))
  (^js [modifiers asterisk-token name type-parameters parameters]
   (.createFunctionExpression typescript/factory modifiers asterisk-token name type-parameters parameters))
  (^js [modifiers asterisk-token name type-parameters parameters type]
   (.createFunctionExpression typescript/factory modifiers asterisk-token name type-parameters parameters type))
  (^js [modifiers asterisk-token name type-parameters parameters type body]
   (.createFunctionExpression typescript/factory modifiers asterisk-token name type-parameters parameters type body)))

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
  (^js [node]
   (.updateFunctionExpression typescript/factory node))
  (^js [node modifiers]
   (.updateFunctionExpression typescript/factory node modifiers))
  (^js [node modifiers asterisk-token]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token))
  (^js [node modifiers asterisk-token name]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token name))
  (^js [node modifiers asterisk-token name type-parameters]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token name type-parameters))
  (^js [node modifiers asterisk-token name type-parameters parameters]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token name type-parameters parameters))
  (^js [node modifiers asterisk-token name type-parameters parameters type]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token name type-parameters parameters type))
  (^js [node modifiers asterisk-token name type-parameters parameters type body]
   (.updateFunctionExpression typescript/factory node modifiers asterisk-token name type-parameters parameters type body)))

(defn create-arrow-function
  "**Parameters:**
   - `modifiers`: `readonly Modifier[] | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   - `equals-greater-than-token`: `EqualsGreaterThanToken | undefined`
   - `body`: `ConciseBody`
   
   **Returns:** `ArrowFunction`"
  (^js []
   (.createArrowFunction typescript/factory))
  (^js [modifiers]
   (.createArrowFunction typescript/factory modifiers))
  (^js [modifiers type-parameters]
   (.createArrowFunction typescript/factory modifiers type-parameters))
  (^js [modifiers type-parameters parameters]
   (.createArrowFunction typescript/factory modifiers type-parameters parameters))
  (^js [modifiers type-parameters parameters type]
   (.createArrowFunction typescript/factory modifiers type-parameters parameters type))
  (^js [modifiers type-parameters parameters type equals-greater-than-token]
   (.createArrowFunction typescript/factory modifiers type-parameters parameters type equals-greater-than-token))
  (^js [modifiers type-parameters parameters type equals-greater-than-token body]
   (.createArrowFunction typescript/factory modifiers type-parameters parameters type equals-greater-than-token body)))

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
  (^js [node]
   (.updateArrowFunction typescript/factory node))
  (^js [node modifiers]
   (.updateArrowFunction typescript/factory node modifiers))
  (^js [node modifiers type-parameters]
   (.updateArrowFunction typescript/factory node modifiers type-parameters))
  (^js [node modifiers type-parameters parameters]
   (.updateArrowFunction typescript/factory node modifiers type-parameters parameters))
  (^js [node modifiers type-parameters parameters type]
   (.updateArrowFunction typescript/factory node modifiers type-parameters parameters type))
  (^js [node modifiers type-parameters parameters type equals-greater-than-token]
   (.updateArrowFunction typescript/factory node modifiers type-parameters parameters type equals-greater-than-token))
  (^js [node modifiers type-parameters parameters type equals-greater-than-token body]
   (.updateArrowFunction typescript/factory node modifiers type-parameters parameters type equals-greater-than-token body)))

(defn create-delete-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `DeleteExpression`"
  ^js [expression]
  (.createDeleteExpression typescript/factory expression))

(defn update-delete-expression
  "**Parameters:**
   - `node`: `DeleteExpression`
   - `expression`: `Expression`
   
   **Returns:** `DeleteExpression`"
  ^js [node expression]
  (.updateDeleteExpression typescript/factory node expression))

(defn create-type-of-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `TypeOfExpression`"
  ^js [expression]
  (.createTypeOfExpression typescript/factory expression))

(defn update-type-of-expression
  "**Parameters:**
   - `node`: `TypeOfExpression`
   - `expression`: `Expression`
   
   **Returns:** `TypeOfExpression`"
  ^js [node expression]
  (.updateTypeOfExpression typescript/factory node expression))

(defn create-void-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `VoidExpression`"
  ^js [expression]
  (.createVoidExpression typescript/factory expression))

(defn update-void-expression
  "**Parameters:**
   - `node`: `VoidExpression`
   - `expression`: `Expression`
   
   **Returns:** `VoidExpression`"
  ^js [node expression]
  (.updateVoidExpression typescript/factory node expression))

(defn create-await-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `AwaitExpression`"
  ^js [expression]
  (.createAwaitExpression typescript/factory expression))

(defn update-await-expression
  "**Parameters:**
   - `node`: `AwaitExpression`
   - `expression`: `Expression`
   
   **Returns:** `AwaitExpression`"
  ^js [node expression]
  (.updateAwaitExpression typescript/factory node expression))

(defn create-prefix-unary-expression
  "**Parameters:**
   - `operator`: `PrefixUnaryOperator`
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [operator operand]
  (.createPrefixUnaryExpression typescript/factory operator operand))

(defn update-prefix-unary-expression
  "**Parameters:**
   - `node`: `PrefixUnaryExpression`
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [node operand]
  (.updatePrefixUnaryExpression typescript/factory node operand))

(defn create-postfix-unary-expression
  "**Parameters:**
   - `operand`: `Expression`
   - `operator`: `PostfixUnaryOperator`
   
   **Returns:** `PostfixUnaryExpression`"
  ^js [operand operator]
  (.createPostfixUnaryExpression typescript/factory operand operator))

(defn update-postfix-unary-expression
  "**Parameters:**
   - `node`: `PostfixUnaryExpression`
   - `operand`: `Expression`
   
   **Returns:** `PostfixUnaryExpression`"
  ^js [node operand]
  (.updatePostfixUnaryExpression typescript/factory node operand))

(defn create-binary-expression
  "**Parameters:**
   - `left`: `Expression`
   - `operator`: `BinaryOperator | BinaryOperatorToken`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left operator right]
  (.createBinaryExpression typescript/factory left operator right))

(defn update-binary-expression
  "**Parameters:**
   - `node`: `BinaryExpression`
   - `left`: `Expression`
   - `operator`: `BinaryOperator | BinaryOperatorToken`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [node left operator right]
  (.updateBinaryExpression typescript/factory node left operator right))

(defn create-conditional-expression
  "**Parameters:**
   - `condition`: `Expression`
   - `question-token`: `QuestionToken | undefined`
   - `when-true`: `Expression`
   - `colon-token`: `ColonToken | undefined`
   - `when-false`: `Expression`
   
   **Returns:** `ConditionalExpression`"
  (^js [condition]
   (.createConditionalExpression typescript/factory condition))
  (^js [condition question-token]
   (.createConditionalExpression typescript/factory condition question-token))
  (^js [condition question-token when-true]
   (.createConditionalExpression typescript/factory condition question-token when-true))
  (^js [condition question-token when-true colon-token]
   (.createConditionalExpression typescript/factory condition question-token when-true colon-token))
  (^js [condition question-token when-true colon-token when-false]
   (.createConditionalExpression typescript/factory condition question-token when-true colon-token when-false)))

(defn update-conditional-expression
  "**Parameters:**
   - `node`: `ConditionalExpression`
   - `condition`: `Expression`
   - `question-token`: `QuestionToken`
   - `when-true`: `Expression`
   - `colon-token`: `ColonToken`
   - `when-false`: `Expression`
   
   **Returns:** `ConditionalExpression`"
  ^js [node condition question-token when-true colon-token when-false]
  (.updateConditionalExpression typescript/factory node condition question-token when-true colon-token when-false))

(defn create-template-expression
  "**Parameters:**
   - `head`: `TemplateHead`
   - `template-spans`: `readonly TemplateSpan[]`
   
   **Returns:** `TemplateExpression`"
  ^js [head template-spans]
  (.createTemplateExpression typescript/factory head template-spans))

(defn update-template-expression
  "**Parameters:**
   - `node`: `TemplateExpression`
   - `head`: `TemplateHead`
   - `template-spans`: `readonly TemplateSpan[]`
   
   **Returns:** `TemplateExpression`"
  ^js [node head template-spans]
  (.updateTemplateExpression typescript/factory node head template-spans))

(defn create-template-head
  "**Parameters:**
   - `text`: `string | undefined`
   - `raw-text`: `string`
   - `template-flags`: `TokenFlags | undefined`
   
   **Returns:** `TemplateHead`"
  (^js []
   (.createTemplateHead typescript/factory))
  (^js [text]
   (.createTemplateHead typescript/factory text))
  (^js [text raw-text]
   (.createTemplateHead typescript/factory text raw-text))
  (^js [text raw-text template-flags]
   (.createTemplateHead typescript/factory text raw-text template-flags)))

(defn create-template-middle
  "**Parameters:**
   - `text`: `string | undefined`
   - `raw-text`: `string`
   - `template-flags`: `TokenFlags | undefined`
   
   **Returns:** `TemplateMiddle`"
  (^js []
   (.createTemplateMiddle typescript/factory))
  (^js [text]
   (.createTemplateMiddle typescript/factory text))
  (^js [text raw-text]
   (.createTemplateMiddle typescript/factory text raw-text))
  (^js [text raw-text template-flags]
   (.createTemplateMiddle typescript/factory text raw-text template-flags)))

(defn create-template-tail
  "**Parameters:**
   - `text`: `string | undefined`
   - `raw-text`: `string`
   - `template-flags`: `TokenFlags | undefined`
   
   **Returns:** `TemplateTail`"
  (^js []
   (.createTemplateTail typescript/factory))
  (^js [text]
   (.createTemplateTail typescript/factory text))
  (^js [text raw-text]
   (.createTemplateTail typescript/factory text raw-text))
  (^js [text raw-text template-flags]
   (.createTemplateTail typescript/factory text raw-text template-flags)))

(defn create-no-substitution-template-literal
  "**Parameters:**
   - `text`: `string | undefined`
   - `raw-text`: `string`
   
   **Returns:** `NoSubstitutionTemplateLiteral`"
  (^js []
   (.createNoSubstitutionTemplateLiteral typescript/factory))
  (^js [text]
   (.createNoSubstitutionTemplateLiteral typescript/factory text))
  (^js [text raw-text]
   (.createNoSubstitutionTemplateLiteral typescript/factory text raw-text)))

(defn create-yield-expression
  "**Parameters:**
   - `asterisk-token`: `undefined`
   - `expression`: `Expression | undefined`
   
   **Returns:** `YieldExpression`"
  (^js []
   (.createYieldExpression typescript/factory))
  (^js [asterisk-token]
   (.createYieldExpression typescript/factory asterisk-token))
  (^js [asterisk-token expression]
   (.createYieldExpression typescript/factory asterisk-token expression)))

(defn update-yield-expression
  "**Parameters:**
   - `node`: `YieldExpression`
   - `asterisk-token`: `AsteriskToken | undefined`
   - `expression`: `Expression | undefined`
   
   **Returns:** `YieldExpression`"
  (^js [node]
   (.updateYieldExpression typescript/factory node))
  (^js [node asterisk-token]
   (.updateYieldExpression typescript/factory node asterisk-token))
  (^js [node asterisk-token expression]
   (.updateYieldExpression typescript/factory node asterisk-token expression)))

(defn create-spread-element
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `SpreadElement`"
  ^js [expression]
  (.createSpreadElement typescript/factory expression))

(defn update-spread-element
  "**Parameters:**
   - `node`: `SpreadElement`
   - `expression`: `Expression`
   
   **Returns:** `SpreadElement`"
  ^js [node expression]
  (.updateSpreadElement typescript/factory node expression))

(defn create-class-expression
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly ClassElement[]`
   
   **Returns:** `ClassExpression`"
  (^js []
   (.createClassExpression typescript/factory))
  (^js [modifiers]
   (.createClassExpression typescript/factory modifiers))
  (^js [modifiers name]
   (.createClassExpression typescript/factory modifiers name))
  (^js [modifiers name type-parameters]
   (.createClassExpression typescript/factory modifiers name type-parameters))
  (^js [modifiers name type-parameters heritage-clauses]
   (.createClassExpression typescript/factory modifiers name type-parameters heritage-clauses))
  (^js [modifiers name type-parameters heritage-clauses members]
   (.createClassExpression typescript/factory modifiers name type-parameters heritage-clauses members)))

(defn update-class-expression
  "**Parameters:**
   - `node`: `ClassExpression`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly ClassElement[]`
   
   **Returns:** `ClassExpression`"
  (^js [node]
   (.updateClassExpression typescript/factory node))
  (^js [node modifiers]
   (.updateClassExpression typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateClassExpression typescript/factory node modifiers name))
  (^js [node modifiers name type-parameters]
   (.updateClassExpression typescript/factory node modifiers name type-parameters))
  (^js [node modifiers name type-parameters heritage-clauses]
   (.updateClassExpression typescript/factory node modifiers name type-parameters heritage-clauses))
  (^js [node modifiers name type-parameters heritage-clauses members]
   (.updateClassExpression typescript/factory node modifiers name type-parameters heritage-clauses members)))

(defn create-omitted-expression
  "**Returns:** `OmittedExpression`"
  ^js []
  (.createOmittedExpression typescript/factory))

(defn create-expression-with-type-arguments
  "**Parameters:**
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   
   **Returns:** `ExpressionWithTypeArguments`"
  (^js [expression]
   (.createExpressionWithTypeArguments typescript/factory expression))
  (^js [expression type-arguments]
   (.createExpressionWithTypeArguments typescript/factory expression type-arguments)))

(defn update-expression-with-type-arguments
  "**Parameters:**
   - `node`: `ExpressionWithTypeArguments`
   - `expression`: `Expression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   
   **Returns:** `ExpressionWithTypeArguments`"
  (^js [node expression]
   (.updateExpressionWithTypeArguments typescript/factory node expression))
  (^js [node expression type-arguments]
   (.updateExpressionWithTypeArguments typescript/factory node expression type-arguments)))

(defn create-as-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `type`: `TypeNode`
   
   **Returns:** `AsExpression`"
  ^js [expression type]
  (.createAsExpression typescript/factory expression type))

(defn update-as-expression
  "**Parameters:**
   - `node`: `AsExpression`
   - `expression`: `Expression`
   - `type`: `TypeNode`
   
   **Returns:** `AsExpression`"
  ^js [node expression type]
  (.updateAsExpression typescript/factory node expression type))

(defn create-non-null-expression
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `NonNullExpression`"
  ^js [expression]
  (.createNonNullExpression typescript/factory expression))

(defn update-non-null-expression
  "**Parameters:**
   - `node`: `NonNullExpression`
   - `expression`: `Expression`
   
   **Returns:** `NonNullExpression`"
  ^js [node expression]
  (.updateNonNullExpression typescript/factory node expression))

(defn create-non-null-chain
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `NonNullChain`"
  ^js [expression]
  (.createNonNullChain typescript/factory expression))

(defn update-non-null-chain
  "**Parameters:**
   - `node`: `NonNullChain`
   - `expression`: `Expression`
   
   **Returns:** `NonNullChain`"
  ^js [node expression]
  (.updateNonNullChain typescript/factory node expression))

(defn create-meta-property
  "**Parameters:**
   - `keyword-token`: `SyntaxKind.ImportKeyword | SyntaxKind.NewKeyword`
   - `name`: `Identifier`
   
   **Returns:** `MetaProperty`"
  ^js [keyword-token name]
  (.createMetaProperty typescript/factory keyword-token name))

(defn update-meta-property
  "**Parameters:**
   - `node`: `MetaProperty`
   - `name`: `Identifier`
   
   **Returns:** `MetaProperty`"
  ^js [node name]
  (.updateMetaProperty typescript/factory node name))

(defn create-satisfies-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `type`: `TypeNode`
   
   **Returns:** `SatisfiesExpression`"
  ^js [expression type]
  (.createSatisfiesExpression typescript/factory expression type))

(defn update-satisfies-expression
  "**Parameters:**
   - `node`: `SatisfiesExpression`
   - `expression`: `Expression`
   - `type`: `TypeNode`
   
   **Returns:** `SatisfiesExpression`"
  ^js [node expression type]
  (.updateSatisfiesExpression typescript/factory node expression type))

(defn create-template-span
  "**Parameters:**
   - `expression`: `Expression`
   - `literal`: `TemplateMiddle | TemplateTail`
   
   **Returns:** `TemplateSpan`"
  ^js [expression literal]
  (.createTemplateSpan typescript/factory expression literal))

(defn update-template-span
  "**Parameters:**
   - `node`: `TemplateSpan`
   - `expression`: `Expression`
   - `literal`: `TemplateMiddle | TemplateTail`
   
   **Returns:** `TemplateSpan`"
  ^js [node expression literal]
  (.updateTemplateSpan typescript/factory node expression literal))

(defn create-semicolon-class-element
  "**Returns:** `SemicolonClassElement`"
  ^js []
  (.createSemicolonClassElement typescript/factory))

(defn create-block
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `Block`"
  (^js [statements]
   (.createBlock typescript/factory statements))
  (^js [statements multi-line?]
   (.createBlock typescript/factory statements multi-line?)))

(defn update-block
  "**Parameters:**
   - `node`: `Block`
   - `statements`: `readonly Statement[]`
   
   **Returns:** `Block`"
  ^js [node statements]
  (.updateBlock typescript/factory node statements))

(defn create-variable-statement
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `declaration-list`: `VariableDeclarationList | readonly VariableDeclaration[]`
   
   **Returns:** `VariableStatement`"
  (^js []
   (.createVariableStatement typescript/factory))
  (^js [modifiers]
   (.createVariableStatement typescript/factory modifiers))
  (^js [modifiers declaration-list]
   (.createVariableStatement typescript/factory modifiers declaration-list)))

(defn update-variable-statement
  "**Parameters:**
   - `node`: `VariableStatement`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `declaration-list`: `VariableDeclarationList`
   
   **Returns:** `VariableStatement`"
  (^js [node]
   (.updateVariableStatement typescript/factory node))
  (^js [node modifiers]
   (.updateVariableStatement typescript/factory node modifiers))
  (^js [node modifiers declaration-list]
   (.updateVariableStatement typescript/factory node modifiers declaration-list)))

(defn create-empty-statement
  "**Returns:** `EmptyStatement`"
  ^js []
  (.createEmptyStatement typescript/factory))

(defn create-expression-statement
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ExpressionStatement`"
  ^js [expression]
  (.createExpressionStatement typescript/factory expression))

(defn update-expression-statement
  "**Parameters:**
   - `node`: `ExpressionStatement`
   - `expression`: `Expression`
   
   **Returns:** `ExpressionStatement`"
  ^js [node expression]
  (.updateExpressionStatement typescript/factory node expression))

(defn create-if-statement
  "**Parameters:**
   - `expression`: `Expression`
   - `then-statement`: `Statement`
   - `else-statement`: `Statement | undefined`
   
   **Returns:** `IfStatement`"
  (^js [expression then-statement]
   (.createIfStatement typescript/factory expression then-statement))
  (^js [expression then-statement else-statement]
   (.createIfStatement typescript/factory expression then-statement else-statement)))

(defn update-if-statement
  "**Parameters:**
   - `node`: `IfStatement`
   - `expression`: `Expression`
   - `then-statement`: `Statement`
   - `else-statement`: `Statement | undefined`
   
   **Returns:** `IfStatement`"
  (^js [node expression then-statement]
   (.updateIfStatement typescript/factory node expression then-statement))
  (^js [node expression then-statement else-statement]
   (.updateIfStatement typescript/factory node expression then-statement else-statement)))

(defn create-do-statement
  "**Parameters:**
   - `statement`: `Statement`
   - `expression`: `Expression`
   
   **Returns:** `DoStatement`"
  ^js [statement expression]
  (.createDoStatement typescript/factory statement expression))

(defn update-do-statement
  "**Parameters:**
   - `node`: `DoStatement`
   - `statement`: `Statement`
   - `expression`: `Expression`
   
   **Returns:** `DoStatement`"
  ^js [node statement expression]
  (.updateDoStatement typescript/factory node statement expression))

(defn create-while-statement
  "**Parameters:**
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `WhileStatement`"
  ^js [expression statement]
  (.createWhileStatement typescript/factory expression statement))

(defn update-while-statement
  "**Parameters:**
   - `node`: `WhileStatement`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `WhileStatement`"
  ^js [node expression statement]
  (.updateWhileStatement typescript/factory node expression statement))

(defn create-for-statement
  "**Parameters:**
   - `initializer`: `ForInitializer | undefined`
   - `condition`: `Expression | undefined`
   - `incrementor`: `Expression | undefined`
   - `statement`: `Statement`
   
   **Returns:** `ForStatement`"
  (^js []
   (.createForStatement typescript/factory))
  (^js [initializer]
   (.createForStatement typescript/factory initializer))
  (^js [initializer condition]
   (.createForStatement typescript/factory initializer condition))
  (^js [initializer condition incrementor]
   (.createForStatement typescript/factory initializer condition incrementor))
  (^js [initializer condition incrementor statement]
   (.createForStatement typescript/factory initializer condition incrementor statement)))

(defn update-for-statement
  "**Parameters:**
   - `node`: `ForStatement`
   - `initializer`: `ForInitializer | undefined`
   - `condition`: `Expression | undefined`
   - `incrementor`: `Expression | undefined`
   - `statement`: `Statement`
   
   **Returns:** `ForStatement`"
  (^js [node]
   (.updateForStatement typescript/factory node))
  (^js [node initializer]
   (.updateForStatement typescript/factory node initializer))
  (^js [node initializer condition]
   (.updateForStatement typescript/factory node initializer condition))
  (^js [node initializer condition incrementor]
   (.updateForStatement typescript/factory node initializer condition incrementor))
  (^js [node initializer condition incrementor statement]
   (.updateForStatement typescript/factory node initializer condition incrementor statement)))

(defn create-for-in-statement
  "**Parameters:**
   - `initializer`: `ForInitializer`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `ForInStatement`"
  ^js [initializer expression statement]
  (.createForInStatement typescript/factory initializer expression statement))

(defn update-for-in-statement
  "**Parameters:**
   - `node`: `ForInStatement`
   - `initializer`: `ForInitializer`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `ForInStatement`"
  ^js [node initializer expression statement]
  (.updateForInStatement typescript/factory node initializer expression statement))

(defn create-for-of-statement
  "**Parameters:**
   - `await-modifier`: `AwaitKeyword | undefined`
   - `initializer`: `ForInitializer`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `ForOfStatement`"
  (^js []
   (.createForOfStatement typescript/factory))
  (^js [await-modifier]
   (.createForOfStatement typescript/factory await-modifier))
  (^js [await-modifier initializer]
   (.createForOfStatement typescript/factory await-modifier initializer))
  (^js [await-modifier initializer expression]
   (.createForOfStatement typescript/factory await-modifier initializer expression))
  (^js [await-modifier initializer expression statement]
   (.createForOfStatement typescript/factory await-modifier initializer expression statement)))

(defn update-for-of-statement
  "**Parameters:**
   - `node`: `ForOfStatement`
   - `await-modifier`: `AwaitKeyword | undefined`
   - `initializer`: `ForInitializer`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `ForOfStatement`"
  (^js [node]
   (.updateForOfStatement typescript/factory node))
  (^js [node await-modifier]
   (.updateForOfStatement typescript/factory node await-modifier))
  (^js [node await-modifier initializer]
   (.updateForOfStatement typescript/factory node await-modifier initializer))
  (^js [node await-modifier initializer expression]
   (.updateForOfStatement typescript/factory node await-modifier initializer expression))
  (^js [node await-modifier initializer expression statement]
   (.updateForOfStatement typescript/factory node await-modifier initializer expression statement)))

(defn create-continue-statement
  "**Parameters:**
   - `label`: `string | Identifier | undefined`
   
   **Returns:** `ContinueStatement`"
  (^js []
   (.createContinueStatement typescript/factory))
  (^js [label]
   (.createContinueStatement typescript/factory label)))

(defn update-continue-statement
  "**Parameters:**
   - `node`: `ContinueStatement`
   - `label`: `Identifier | undefined`
   
   **Returns:** `ContinueStatement`"
  (^js [node]
   (.updateContinueStatement typescript/factory node))
  (^js [node label]
   (.updateContinueStatement typescript/factory node label)))

(defn create-break-statement
  "**Parameters:**
   - `label`: `string | Identifier | undefined`
   
   **Returns:** `BreakStatement`"
  (^js []
   (.createBreakStatement typescript/factory))
  (^js [label]
   (.createBreakStatement typescript/factory label)))

(defn update-break-statement
  "**Parameters:**
   - `node`: `BreakStatement`
   - `label`: `Identifier | undefined`
   
   **Returns:** `BreakStatement`"
  (^js [node]
   (.updateBreakStatement typescript/factory node))
  (^js [node label]
   (.updateBreakStatement typescript/factory node label)))

(defn create-return-statement
  "**Parameters:**
   - `expression`: `Expression | undefined`
   
   **Returns:** `ReturnStatement`"
  (^js []
   (.createReturnStatement typescript/factory))
  (^js [expression]
   (.createReturnStatement typescript/factory expression)))

(defn update-return-statement
  "**Parameters:**
   - `node`: `ReturnStatement`
   - `expression`: `Expression | undefined`
   
   **Returns:** `ReturnStatement`"
  (^js [node]
   (.updateReturnStatement typescript/factory node))
  (^js [node expression]
   (.updateReturnStatement typescript/factory node expression)))

(defn create-with-statement
  "**Parameters:**
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `WithStatement`"
  ^js [expression statement]
  (.createWithStatement typescript/factory expression statement))

(defn update-with-statement
  "**Parameters:**
   - `node`: `WithStatement`
   - `expression`: `Expression`
   - `statement`: `Statement`
   
   **Returns:** `WithStatement`"
  ^js [node expression statement]
  (.updateWithStatement typescript/factory node expression statement))

(defn create-switch-statement
  "**Parameters:**
   - `expression`: `Expression`
   - `case-block`: `CaseBlock`
   
   **Returns:** `SwitchStatement`"
  ^js [expression case-block]
  (.createSwitchStatement typescript/factory expression case-block))

(defn update-switch-statement
  "**Parameters:**
   - `node`: `SwitchStatement`
   - `expression`: `Expression`
   - `case-block`: `CaseBlock`
   
   **Returns:** `SwitchStatement`"
  ^js [node expression case-block]
  (.updateSwitchStatement typescript/factory node expression case-block))

(defn create-labeled-statement
  "**Parameters:**
   - `label`: `string | Identifier`
   - `statement`: `Statement`
   
   **Returns:** `LabeledStatement`"
  ^js [label statement]
  (.createLabeledStatement typescript/factory label statement))

(defn update-labeled-statement
  "**Parameters:**
   - `node`: `LabeledStatement`
   - `label`: `Identifier`
   - `statement`: `Statement`
   
   **Returns:** `LabeledStatement`"
  ^js [node label statement]
  (.updateLabeledStatement typescript/factory node label statement))

(defn create-throw-statement
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ThrowStatement`"
  ^js [expression]
  (.createThrowStatement typescript/factory expression))

(defn update-throw-statement
  "**Parameters:**
   - `node`: `ThrowStatement`
   - `expression`: `Expression`
   
   **Returns:** `ThrowStatement`"
  ^js [node expression]
  (.updateThrowStatement typescript/factory node expression))

(defn create-try-statement
  "**Parameters:**
   - `try-block`: `Block`
   - `catch-clause`: `CatchClause | undefined`
   - `finally-block`: `Block | undefined`
   
   **Returns:** `TryStatement`"
  (^js [try-block]
   (.createTryStatement typescript/factory try-block))
  (^js [try-block catch-clause]
   (.createTryStatement typescript/factory try-block catch-clause))
  (^js [try-block catch-clause finally-block]
   (.createTryStatement typescript/factory try-block catch-clause finally-block)))

(defn update-try-statement
  "**Parameters:**
   - `node`: `TryStatement`
   - `try-block`: `Block`
   - `catch-clause`: `CatchClause | undefined`
   - `finally-block`: `Block | undefined`
   
   **Returns:** `TryStatement`"
  (^js [node try-block]
   (.updateTryStatement typescript/factory node try-block))
  (^js [node try-block catch-clause]
   (.updateTryStatement typescript/factory node try-block catch-clause))
  (^js [node try-block catch-clause finally-block]
   (.updateTryStatement typescript/factory node try-block catch-clause finally-block)))

(defn create-debugger-statement
  "**Returns:** `DebuggerStatement`"
  ^js []
  (.createDebuggerStatement typescript/factory))

(defn create-variable-declaration
  "**Parameters:**
   - `name`: `string | BindingName`
   - `exclamation-token`: `ExclamationToken | undefined`
   - `type`: `TypeNode | undefined`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `VariableDeclaration`"
  (^js [name]
   (.createVariableDeclaration typescript/factory name))
  (^js [name exclamation-token]
   (.createVariableDeclaration typescript/factory name exclamation-token))
  (^js [name exclamation-token type]
   (.createVariableDeclaration typescript/factory name exclamation-token type))
  (^js [name exclamation-token type initializer]
   (.createVariableDeclaration typescript/factory name exclamation-token type initializer)))

(defn update-variable-declaration
  "**Parameters:**
   - `node`: `VariableDeclaration`
   - `name`: `BindingName`
   - `exclamation-token`: `ExclamationToken | undefined`
   - `type`: `TypeNode | undefined`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `VariableDeclaration`"
  (^js [node name]
   (.updateVariableDeclaration typescript/factory node name))
  (^js [node name exclamation-token]
   (.updateVariableDeclaration typescript/factory node name exclamation-token))
  (^js [node name exclamation-token type]
   (.updateVariableDeclaration typescript/factory node name exclamation-token type))
  (^js [node name exclamation-token type initializer]
   (.updateVariableDeclaration typescript/factory node name exclamation-token type initializer)))

(defn create-variable-declaration-list
  "**Parameters:**
   - `declarations`: `readonly VariableDeclaration[]`
   - `flags`: `NodeFlags | undefined`
   
   **Returns:** `VariableDeclarationList`"
  (^js [declarations]
   (.createVariableDeclarationList typescript/factory declarations))
  (^js [declarations flags]
   (.createVariableDeclarationList typescript/factory declarations flags)))

(defn update-variable-declaration-list
  "**Parameters:**
   - `node`: `VariableDeclarationList`
   - `declarations`: `readonly VariableDeclaration[]`
   
   **Returns:** `VariableDeclarationList`"
  ^js [node declarations]
  (.updateVariableDeclarationList typescript/factory node declarations))

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
  (^js []
   (.createFunctionDeclaration typescript/factory))
  (^js [modifiers]
   (.createFunctionDeclaration typescript/factory modifiers))
  (^js [modifiers asterisk-token]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token))
  (^js [modifiers asterisk-token name]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token name))
  (^js [modifiers asterisk-token name type-parameters]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token name type-parameters))
  (^js [modifiers asterisk-token name type-parameters parameters]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token name type-parameters parameters))
  (^js [modifiers asterisk-token name type-parameters parameters type]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token name type-parameters parameters type))
  (^js [modifiers asterisk-token name type-parameters parameters type body]
   (.createFunctionDeclaration typescript/factory modifiers asterisk-token name type-parameters parameters type body)))

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
  (^js [node]
   (.updateFunctionDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateFunctionDeclaration typescript/factory node modifiers))
  (^js [node modifiers asterisk-token]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token))
  (^js [node modifiers asterisk-token name]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token name))
  (^js [node modifiers asterisk-token name type-parameters]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token name type-parameters))
  (^js [node modifiers asterisk-token name type-parameters parameters]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token name type-parameters parameters))
  (^js [node modifiers asterisk-token name type-parameters parameters type]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token name type-parameters parameters type))
  (^js [node modifiers asterisk-token name type-parameters parameters type body]
   (.updateFunctionDeclaration typescript/factory node modifiers asterisk-token name type-parameters parameters type body)))

(defn create-class-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly ClassElement[]`
   
   **Returns:** `ClassDeclaration`"
  (^js []
   (.createClassDeclaration typescript/factory))
  (^js [modifiers]
   (.createClassDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createClassDeclaration typescript/factory modifiers name))
  (^js [modifiers name type-parameters]
   (.createClassDeclaration typescript/factory modifiers name type-parameters))
  (^js [modifiers name type-parameters heritage-clauses]
   (.createClassDeclaration typescript/factory modifiers name type-parameters heritage-clauses))
  (^js [modifiers name type-parameters heritage-clauses members]
   (.createClassDeclaration typescript/factory modifiers name type-parameters heritage-clauses members)))

(defn update-class-declaration
  "**Parameters:**
   - `node`: `ClassDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `Identifier | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly ClassElement[]`
   
   **Returns:** `ClassDeclaration`"
  (^js [node]
   (.updateClassDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateClassDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateClassDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name type-parameters]
   (.updateClassDeclaration typescript/factory node modifiers name type-parameters))
  (^js [node modifiers name type-parameters heritage-clauses]
   (.updateClassDeclaration typescript/factory node modifiers name type-parameters heritage-clauses))
  (^js [node modifiers name type-parameters heritage-clauses members]
   (.updateClassDeclaration typescript/factory node modifiers name type-parameters heritage-clauses members)))

(defn create-interface-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | Identifier`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly TypeElement[]`
   
   **Returns:** `InterfaceDeclaration`"
  (^js []
   (.createInterfaceDeclaration typescript/factory))
  (^js [modifiers]
   (.createInterfaceDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createInterfaceDeclaration typescript/factory modifiers name))
  (^js [modifiers name type-parameters]
   (.createInterfaceDeclaration typescript/factory modifiers name type-parameters))
  (^js [modifiers name type-parameters heritage-clauses]
   (.createInterfaceDeclaration typescript/factory modifiers name type-parameters heritage-clauses))
  (^js [modifiers name type-parameters heritage-clauses members]
   (.createInterfaceDeclaration typescript/factory modifiers name type-parameters heritage-clauses members)))

(defn update-interface-declaration
  "**Parameters:**
   - `node`: `InterfaceDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `Identifier`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `heritage-clauses`: `readonly HeritageClause[] | undefined`
   - `members`: `readonly TypeElement[]`
   
   **Returns:** `InterfaceDeclaration`"
  (^js [node]
   (.updateInterfaceDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateInterfaceDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateInterfaceDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name type-parameters]
   (.updateInterfaceDeclaration typescript/factory node modifiers name type-parameters))
  (^js [node modifiers name type-parameters heritage-clauses]
   (.updateInterfaceDeclaration typescript/factory node modifiers name type-parameters heritage-clauses))
  (^js [node modifiers name type-parameters heritage-clauses members]
   (.updateInterfaceDeclaration typescript/factory node modifiers name type-parameters heritage-clauses members)))

(defn create-type-alias-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | Identifier`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `type`: `TypeNode`
   
   **Returns:** `TypeAliasDeclaration`"
  (^js []
   (.createTypeAliasDeclaration typescript/factory))
  (^js [modifiers]
   (.createTypeAliasDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createTypeAliasDeclaration typescript/factory modifiers name))
  (^js [modifiers name type-parameters]
   (.createTypeAliasDeclaration typescript/factory modifiers name type-parameters))
  (^js [modifiers name type-parameters type]
   (.createTypeAliasDeclaration typescript/factory modifiers name type-parameters type)))

(defn update-type-alias-declaration
  "**Parameters:**
   - `node`: `TypeAliasDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `Identifier`
   - `type-parameters`: `readonly TypeParameterDeclaration[] | undefined`
   - `type`: `TypeNode`
   
   **Returns:** `TypeAliasDeclaration`"
  (^js [node]
   (.updateTypeAliasDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateTypeAliasDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateTypeAliasDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name type-parameters]
   (.updateTypeAliasDeclaration typescript/factory node modifiers name type-parameters))
  (^js [node modifiers name type-parameters type]
   (.updateTypeAliasDeclaration typescript/factory node modifiers name type-parameters type)))

(defn create-enum-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `string | Identifier`
   - `members`: `readonly EnumMember[]`
   
   **Returns:** `EnumDeclaration`"
  (^js []
   (.createEnumDeclaration typescript/factory))
  (^js [modifiers]
   (.createEnumDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createEnumDeclaration typescript/factory modifiers name))
  (^js [modifiers name members]
   (.createEnumDeclaration typescript/factory modifiers name members)))

(defn update-enum-declaration
  "**Parameters:**
   - `node`: `EnumDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `Identifier`
   - `members`: `readonly EnumMember[]`
   
   **Returns:** `EnumDeclaration`"
  (^js [node]
   (.updateEnumDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateEnumDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateEnumDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name members]
   (.updateEnumDeclaration typescript/factory node modifiers name members)))

(defn create-module-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `ModuleName`
   - `body`: `ModuleBody | undefined`
   - `flags`: `NodeFlags | undefined`
   
   **Returns:** `ModuleDeclaration`"
  (^js []
   (.createModuleDeclaration typescript/factory))
  (^js [modifiers]
   (.createModuleDeclaration typescript/factory modifiers))
  (^js [modifiers name]
   (.createModuleDeclaration typescript/factory modifiers name))
  (^js [modifiers name body]
   (.createModuleDeclaration typescript/factory modifiers name body))
  (^js [modifiers name body flags]
   (.createModuleDeclaration typescript/factory modifiers name body flags)))

(defn update-module-declaration
  "**Parameters:**
   - `node`: `ModuleDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `name`: `ModuleName`
   - `body`: `ModuleBody | undefined`
   
   **Returns:** `ModuleDeclaration`"
  (^js [node]
   (.updateModuleDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateModuleDeclaration typescript/factory node modifiers))
  (^js [node modifiers name]
   (.updateModuleDeclaration typescript/factory node modifiers name))
  (^js [node modifiers name body]
   (.updateModuleDeclaration typescript/factory node modifiers name body)))

(defn create-module-block
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   
   **Returns:** `ModuleBlock`"
  ^js [statements]
  (.createModuleBlock typescript/factory statements))

(defn update-module-block
  "**Parameters:**
   - `node`: `ModuleBlock`
   - `statements`: `readonly Statement[]`
   
   **Returns:** `ModuleBlock`"
  ^js [node statements]
  (.updateModuleBlock typescript/factory node statements))

(defn create-case-block
  "**Parameters:**
   - `clauses`: `readonly CaseOrDefaultClause[]`
   
   **Returns:** `CaseBlock`"
  ^js [clauses]
  (.createCaseBlock typescript/factory clauses))

(defn update-case-block
  "**Parameters:**
   - `node`: `CaseBlock`
   - `clauses`: `readonly CaseOrDefaultClause[]`
   
   **Returns:** `CaseBlock`"
  ^js [node clauses]
  (.updateCaseBlock typescript/factory node clauses))

(defn create-namespace-export-declaration
  "**Parameters:**
   - `name`: `string | Identifier`
   
   **Returns:** `NamespaceExportDeclaration`"
  ^js [name]
  (.createNamespaceExportDeclaration typescript/factory name))

(defn update-namespace-export-declaration
  "**Parameters:**
   - `node`: `NamespaceExportDeclaration`
   - `name`: `Identifier`
   
   **Returns:** `NamespaceExportDeclaration`"
  ^js [node name]
  (.updateNamespaceExportDeclaration typescript/factory node name))

(defn create-import-equals-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `type-only?`: `boolean`
   - `name`: `string | Identifier`
   - `module-reference`: `ModuleReference`
   
   **Returns:** `ImportEqualsDeclaration`"
  (^js []
   (.createImportEqualsDeclaration typescript/factory))
  (^js [modifiers]
   (.createImportEqualsDeclaration typescript/factory modifiers))
  (^js [modifiers type-only?]
   (.createImportEqualsDeclaration typescript/factory modifiers type-only?))
  (^js [modifiers type-only? name]
   (.createImportEqualsDeclaration typescript/factory modifiers type-only? name))
  (^js [modifiers type-only? name module-reference]
   (.createImportEqualsDeclaration typescript/factory modifiers type-only? name module-reference)))

(defn update-import-equals-declaration
  "**Parameters:**
   - `node`: `ImportEqualsDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `type-only?`: `boolean`
   - `name`: `Identifier`
   - `module-reference`: `ModuleReference`
   
   **Returns:** `ImportEqualsDeclaration`"
  (^js [node]
   (.updateImportEqualsDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateImportEqualsDeclaration typescript/factory node modifiers))
  (^js [node modifiers type-only?]
   (.updateImportEqualsDeclaration typescript/factory node modifiers type-only?))
  (^js [node modifiers type-only? name]
   (.updateImportEqualsDeclaration typescript/factory node modifiers type-only? name))
  (^js [node modifiers type-only? name module-reference]
   (.updateImportEqualsDeclaration typescript/factory node modifiers type-only? name module-reference)))

(defn create-import-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `import-clause`: `ImportClause | undefined`
   - `module-specifier`: `Expression`
   - `attributes`: `ImportAttributes | undefined`
   
   **Returns:** `ImportDeclaration`"
  (^js []
   (.createImportDeclaration typescript/factory))
  (^js [modifiers]
   (.createImportDeclaration typescript/factory modifiers))
  (^js [modifiers import-clause]
   (.createImportDeclaration typescript/factory modifiers import-clause))
  (^js [modifiers import-clause module-specifier]
   (.createImportDeclaration typescript/factory modifiers import-clause module-specifier))
  (^js [modifiers import-clause module-specifier attributes]
   (.createImportDeclaration typescript/factory modifiers import-clause module-specifier attributes)))

(defn update-import-declaration
  "**Parameters:**
   - `node`: `ImportDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `import-clause`: `ImportClause | undefined`
   - `module-specifier`: `Expression`
   - `attributes`: `ImportAttributes | undefined`
   
   **Returns:** `ImportDeclaration`"
  (^js [node]
   (.updateImportDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateImportDeclaration typescript/factory node modifiers))
  (^js [node modifiers import-clause]
   (.updateImportDeclaration typescript/factory node modifiers import-clause))
  (^js [node modifiers import-clause module-specifier]
   (.updateImportDeclaration typescript/factory node modifiers import-clause module-specifier))
  (^js [node modifiers import-clause module-specifier attributes]
   (.updateImportDeclaration typescript/factory node modifiers import-clause module-specifier attributes)))

(defn create-import-clause
  "**Parameters:**
   - `type-only?`: `boolean`
   - `name`: `Identifier | undefined`
   - `named-bindings`: `NamedImportBindings | undefined`
   
   **Returns:** `ImportClause`"
  (^js [type-only?]
   (.createImportClause typescript/factory type-only?))
  (^js [type-only? name]
   (.createImportClause typescript/factory type-only? name))
  (^js [type-only? name named-bindings]
   (.createImportClause typescript/factory type-only? name named-bindings)))

(defn update-import-clause
  "**Parameters:**
   - `node`: `ImportClause`
   - `type-only?`: `boolean`
   - `name`: `Identifier | undefined`
   - `named-bindings`: `NamedImportBindings | undefined`
   
   **Returns:** `ImportClause`"
  (^js [node type-only?]
   (.updateImportClause typescript/factory node type-only?))
  (^js [node type-only? name]
   (.updateImportClause typescript/factory node type-only? name))
  (^js [node type-only? name named-bindings]
   (.updateImportClause typescript/factory node type-only? name named-bindings)))

(defn create-assert-clause
  "**Parameters:**
   - `elements`: `NodeArray<AssertEntry>`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `AssertClause`"
  (^js [elements]
   (.createAssertClause typescript/factory elements))
  (^js [elements multi-line?]
   (.createAssertClause typescript/factory elements multi-line?)))

(defn update-assert-clause
  "**Parameters:**
   - `node`: `AssertClause`
   - `elements`: `NodeArray<AssertEntry>`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `AssertClause`"
  (^js [node elements]
   (.updateAssertClause typescript/factory node elements))
  (^js [node elements multi-line?]
   (.updateAssertClause typescript/factory node elements multi-line?)))

(defn create-assert-entry
  "**Parameters:**
   - `name`: `ImportAttributeName`
   - `value`: `Expression`
   
   **Returns:** `AssertEntry`"
  ^js [name value]
  (.createAssertEntry typescript/factory name value))

(defn update-assert-entry
  "**Parameters:**
   - `node`: `AssertEntry`
   - `name`: `ImportAttributeName`
   - `value`: `Expression`
   
   **Returns:** `AssertEntry`"
  ^js [node name value]
  (.updateAssertEntry typescript/factory node name value))

(defn create-import-type-assertion-container
  "**Parameters:**
   - `clause`: `AssertClause`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ImportTypeAssertionContainer`"
  (^js [clause]
   (.createImportTypeAssertionContainer typescript/factory clause))
  (^js [clause multi-line?]
   (.createImportTypeAssertionContainer typescript/factory clause multi-line?)))

(defn update-import-type-assertion-container
  "**Parameters:**
   - `node`: `ImportTypeAssertionContainer`
   - `clause`: `AssertClause`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ImportTypeAssertionContainer`"
  (^js [node clause]
   (.updateImportTypeAssertionContainer typescript/factory node clause))
  (^js [node clause multi-line?]
   (.updateImportTypeAssertionContainer typescript/factory node clause multi-line?)))

(defn create-import-attributes
  "**Parameters:**
   - `elements`: `NodeArray<ImportAttribute>`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ImportAttributes`"
  (^js [elements]
   (.createImportAttributes typescript/factory elements))
  (^js [elements multi-line?]
   (.createImportAttributes typescript/factory elements multi-line?)))

(defn update-import-attributes
  "**Parameters:**
   - `node`: `ImportAttributes`
   - `elements`: `NodeArray<ImportAttribute>`
   - `multi-line?`: `boolean | undefined`
   
   **Returns:** `ImportAttributes`"
  (^js [node elements]
   (.updateImportAttributes typescript/factory node elements))
  (^js [node elements multi-line?]
   (.updateImportAttributes typescript/factory node elements multi-line?)))

(defn create-import-attribute
  "**Parameters:**
   - `name`: `ImportAttributeName`
   - `value`: `Expression`
   
   **Returns:** `ImportAttribute`"
  ^js [name value]
  (.createImportAttribute typescript/factory name value))

(defn update-import-attribute
  "**Parameters:**
   - `node`: `ImportAttribute`
   - `name`: `ImportAttributeName`
   - `value`: `Expression`
   
   **Returns:** `ImportAttribute`"
  ^js [node name value]
  (.updateImportAttribute typescript/factory node name value))

(defn create-namespace-import
  "**Parameters:**
   - `name`: `Identifier`
   
   **Returns:** `NamespaceImport`"
  ^js [name]
  (.createNamespaceImport typescript/factory name))

(defn update-namespace-import
  "**Parameters:**
   - `node`: `NamespaceImport`
   - `name`: `Identifier`
   
   **Returns:** `NamespaceImport`"
  ^js [node name]
  (.updateNamespaceImport typescript/factory node name))

(defn create-namespace-export
  "**Parameters:**
   - `name`: `Identifier`
   
   **Returns:** `NamespaceExport`"
  ^js [name]
  (.createNamespaceExport typescript/factory name))

(defn update-namespace-export
  "**Parameters:**
   - `node`: `NamespaceExport`
   - `name`: `Identifier`
   
   **Returns:** `NamespaceExport`"
  ^js [node name]
  (.updateNamespaceExport typescript/factory node name))

(defn create-named-imports
  "**Parameters:**
   - `elements`: `readonly ImportSpecifier[]`
   
   **Returns:** `NamedImports`"
  ^js [elements]
  (.createNamedImports typescript/factory elements))

(defn update-named-imports
  "**Parameters:**
   - `node`: `NamedImports`
   - `elements`: `readonly ImportSpecifier[]`
   
   **Returns:** `NamedImports`"
  ^js [node elements]
  (.updateNamedImports typescript/factory node elements))

(defn create-import-specifier
  "**Parameters:**
   - `type-only?`: `boolean`
   - `property-name`: `Identifier | undefined`
   - `name`: `Identifier`
   
   **Returns:** `ImportSpecifier`"
  (^js [type-only?]
   (.createImportSpecifier typescript/factory type-only?))
  (^js [type-only? property-name]
   (.createImportSpecifier typescript/factory type-only? property-name))
  (^js [type-only? property-name name]
   (.createImportSpecifier typescript/factory type-only? property-name name)))

(defn update-import-specifier
  "**Parameters:**
   - `node`: `ImportSpecifier`
   - `type-only?`: `boolean`
   - `property-name`: `Identifier | undefined`
   - `name`: `Identifier`
   
   **Returns:** `ImportSpecifier`"
  (^js [node type-only?]
   (.updateImportSpecifier typescript/factory node type-only?))
  (^js [node type-only? property-name]
   (.updateImportSpecifier typescript/factory node type-only? property-name))
  (^js [node type-only? property-name name]
   (.updateImportSpecifier typescript/factory node type-only? property-name name)))

(defn create-export-assignment
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `export-equals?`: `boolean | undefined`
   - `expression`: `Expression`
   
   **Returns:** `ExportAssignment`"
  (^js []
   (.createExportAssignment typescript/factory))
  (^js [modifiers]
   (.createExportAssignment typescript/factory modifiers))
  (^js [modifiers export-equals?]
   (.createExportAssignment typescript/factory modifiers export-equals?))
  (^js [modifiers export-equals? expression]
   (.createExportAssignment typescript/factory modifiers export-equals? expression)))

(defn update-export-assignment
  "**Parameters:**
   - `node`: `ExportAssignment`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `expression`: `Expression`
   
   **Returns:** `ExportAssignment`"
  (^js [node]
   (.updateExportAssignment typescript/factory node))
  (^js [node modifiers]
   (.updateExportAssignment typescript/factory node modifiers))
  (^js [node modifiers expression]
   (.updateExportAssignment typescript/factory node modifiers expression)))

(defn create-export-declaration
  "**Parameters:**
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `type-only?`: `boolean`
   - `export-clause`: `NamedExportBindings | undefined`
   - `module-specifier`: `Expression | undefined`
   - `attributes`: `ImportAttributes | undefined`
   
   **Returns:** `ExportDeclaration`"
  (^js []
   (.createExportDeclaration typescript/factory))
  (^js [modifiers]
   (.createExportDeclaration typescript/factory modifiers))
  (^js [modifiers type-only?]
   (.createExportDeclaration typescript/factory modifiers type-only?))
  (^js [modifiers type-only? export-clause]
   (.createExportDeclaration typescript/factory modifiers type-only? export-clause))
  (^js [modifiers type-only? export-clause module-specifier]
   (.createExportDeclaration typescript/factory modifiers type-only? export-clause module-specifier))
  (^js [modifiers type-only? export-clause module-specifier attributes]
   (.createExportDeclaration typescript/factory modifiers type-only? export-clause module-specifier attributes)))

(defn update-export-declaration
  "**Parameters:**
   - `node`: `ExportDeclaration`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   - `type-only?`: `boolean`
   - `export-clause`: `NamedExportBindings | undefined`
   - `module-specifier`: `Expression | undefined`
   - `attributes`: `ImportAttributes | undefined`
   
   **Returns:** `ExportDeclaration`"
  (^js [node]
   (.updateExportDeclaration typescript/factory node))
  (^js [node modifiers]
   (.updateExportDeclaration typescript/factory node modifiers))
  (^js [node modifiers type-only?]
   (.updateExportDeclaration typescript/factory node modifiers type-only?))
  (^js [node modifiers type-only? export-clause]
   (.updateExportDeclaration typescript/factory node modifiers type-only? export-clause))
  (^js [node modifiers type-only? export-clause module-specifier]
   (.updateExportDeclaration typescript/factory node modifiers type-only? export-clause module-specifier))
  (^js [node modifiers type-only? export-clause module-specifier attributes]
   (.updateExportDeclaration typescript/factory node modifiers type-only? export-clause module-specifier attributes)))

(defn create-named-exports
  "**Parameters:**
   - `elements`: `readonly ExportSpecifier[]`
   
   **Returns:** `NamedExports`"
  ^js [elements]
  (.createNamedExports typescript/factory elements))

(defn update-named-exports
  "**Parameters:**
   - `node`: `NamedExports`
   - `elements`: `readonly ExportSpecifier[]`
   
   **Returns:** `NamedExports`"
  ^js [node elements]
  (.updateNamedExports typescript/factory node elements))

(defn create-export-specifier
  "**Parameters:**
   - `type-only?`: `boolean`
   - `property-name`: `string | Identifier | undefined`
   - `name`: `string | Identifier`
   
   **Returns:** `ExportSpecifier`"
  (^js [type-only?]
   (.createExportSpecifier typescript/factory type-only?))
  (^js [type-only? property-name]
   (.createExportSpecifier typescript/factory type-only? property-name))
  (^js [type-only? property-name name]
   (.createExportSpecifier typescript/factory type-only? property-name name)))

(defn update-export-specifier
  "**Parameters:**
   - `node`: `ExportSpecifier`
   - `type-only?`: `boolean`
   - `property-name`: `Identifier | undefined`
   - `name`: `Identifier`
   
   **Returns:** `ExportSpecifier`"
  (^js [node type-only?]
   (.updateExportSpecifier typescript/factory node type-only?))
  (^js [node type-only? property-name]
   (.updateExportSpecifier typescript/factory node type-only? property-name))
  (^js [node type-only? property-name name]
   (.updateExportSpecifier typescript/factory node type-only? property-name name)))

(defn create-external-module-reference
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ExternalModuleReference`"
  ^js [expression]
  (.createExternalModuleReference typescript/factory expression))

(defn update-external-module-reference
  "**Parameters:**
   - `node`: `ExternalModuleReference`
   - `expression`: `Expression`
   
   **Returns:** `ExternalModuleReference`"
  ^js [node expression]
  (.updateExternalModuleReference typescript/factory node expression))

(defn create-js-doc-all-type
  "**Returns:** `JSDocAllType`"
  ^js []
  (.createJSDocAllType typescript/factory))

(defn create-js-doc-unknown-type
  "**Returns:** `JSDocUnknownType`"
  ^js []
  (.createJSDocUnknownType typescript/factory))

(defn create-js-doc-non-nullable-type
  "**Parameters:**
   - `type`: `TypeNode`
   - `postfix?`: `boolean | undefined`
   
   **Returns:** `JSDocNonNullableType`"
  (^js [type]
   (.createJSDocNonNullableType typescript/factory type))
  (^js [type postfix?]
   (.createJSDocNonNullableType typescript/factory type postfix?)))

(defn update-js-doc-non-nullable-type
  "**Parameters:**
   - `node`: `JSDocNonNullableType`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocNonNullableType`"
  ^js [node type]
  (.updateJSDocNonNullableType typescript/factory node type))

(defn create-js-doc-nullable-type
  "**Parameters:**
   - `type`: `TypeNode`
   - `postfix?`: `boolean | undefined`
   
   **Returns:** `JSDocNullableType`"
  (^js [type]
   (.createJSDocNullableType typescript/factory type))
  (^js [type postfix?]
   (.createJSDocNullableType typescript/factory type postfix?)))

(defn update-js-doc-nullable-type
  "**Parameters:**
   - `node`: `JSDocNullableType`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocNullableType`"
  ^js [node type]
  (.updateJSDocNullableType typescript/factory node type))

(defn create-js-doc-optional-type
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `JSDocOptionalType`"
  ^js [type]
  (.createJSDocOptionalType typescript/factory type))

(defn update-js-doc-optional-type
  "**Parameters:**
   - `node`: `JSDocOptionalType`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocOptionalType`"
  ^js [node type]
  (.updateJSDocOptionalType typescript/factory node type))

(defn create-js-doc-function-type
  "**Parameters:**
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `JSDocFunctionType`"
  (^js [parameters]
   (.createJSDocFunctionType typescript/factory parameters))
  (^js [parameters type]
   (.createJSDocFunctionType typescript/factory parameters type)))

(defn update-js-doc-function-type
  "**Parameters:**
   - `node`: `JSDocFunctionType`
   - `parameters`: `readonly ParameterDeclaration[]`
   - `type`: `TypeNode | undefined`
   
   **Returns:** `JSDocFunctionType`"
  (^js [node parameters]
   (.updateJSDocFunctionType typescript/factory node parameters))
  (^js [node parameters type]
   (.updateJSDocFunctionType typescript/factory node parameters type)))

(defn create-js-doc-variadic-type
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `JSDocVariadicType`"
  ^js [type]
  (.createJSDocVariadicType typescript/factory type))

(defn update-js-doc-variadic-type
  "**Parameters:**
   - `node`: `JSDocVariadicType`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocVariadicType`"
  ^js [node type]
  (.updateJSDocVariadicType typescript/factory node type))

(defn create-js-doc-namepath-type
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `JSDocNamepathType`"
  ^js [type]
  (.createJSDocNamepathType typescript/factory type))

(defn update-js-doc-namepath-type
  "**Parameters:**
   - `node`: `JSDocNamepathType`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocNamepathType`"
  ^js [node type]
  (.updateJSDocNamepathType typescript/factory node type))

(defn create-js-doc-type-expression
  "**Parameters:**
   - `type`: `TypeNode`
   
   **Returns:** `JSDocTypeExpression`"
  ^js [type]
  (.createJSDocTypeExpression typescript/factory type))

(defn update-js-doc-type-expression
  "**Parameters:**
   - `node`: `JSDocTypeExpression`
   - `type`: `TypeNode`
   
   **Returns:** `JSDocTypeExpression`"
  ^js [node type]
  (.updateJSDocTypeExpression typescript/factory node type))

(defn create-js-doc-name-reference
  "**Parameters:**
   - `name`: `EntityName | JSDocMemberName`
   
   **Returns:** `JSDocNameReference`"
  ^js [name]
  (.createJSDocNameReference typescript/factory name))

(defn update-js-doc-name-reference
  "**Parameters:**
   - `node`: `JSDocNameReference`
   - `name`: `EntityName | JSDocMemberName`
   
   **Returns:** `JSDocNameReference`"
  ^js [node name]
  (.updateJSDocNameReference typescript/factory node name))

(defn create-js-doc-member-name
  "**Parameters:**
   - `left`: `EntityName | JSDocMemberName`
   - `right`: `Identifier`
   
   **Returns:** `JSDocMemberName`"
  ^js [left right]
  (.createJSDocMemberName typescript/factory left right))

(defn update-js-doc-member-name
  "**Parameters:**
   - `node`: `JSDocMemberName`
   - `left`: `EntityName | JSDocMemberName`
   - `right`: `Identifier`
   
   **Returns:** `JSDocMemberName`"
  ^js [node left right]
  (.updateJSDocMemberName typescript/factory node left right))

(defn create-js-doc-link
  "**Parameters:**
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLink`"
  (^js []
   (.createJSDocLink typescript/factory))
  (^js [name]
   (.createJSDocLink typescript/factory name))
  (^js [name text]
   (.createJSDocLink typescript/factory name text)))

(defn update-js-doc-link
  "**Parameters:**
   - `node`: `JSDocLink`
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLink`"
  (^js [node]
   (.updateJSDocLink typescript/factory node))
  (^js [node name]
   (.updateJSDocLink typescript/factory node name))
  (^js [node name text]
   (.updateJSDocLink typescript/factory node name text)))

(defn create-js-doc-link-code
  "**Parameters:**
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLinkCode`"
  (^js []
   (.createJSDocLinkCode typescript/factory))
  (^js [name]
   (.createJSDocLinkCode typescript/factory name))
  (^js [name text]
   (.createJSDocLinkCode typescript/factory name text)))

(defn update-js-doc-link-code
  "**Parameters:**
   - `node`: `JSDocLinkCode`
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLinkCode`"
  (^js [node]
   (.updateJSDocLinkCode typescript/factory node))
  (^js [node name]
   (.updateJSDocLinkCode typescript/factory node name))
  (^js [node name text]
   (.updateJSDocLinkCode typescript/factory node name text)))

(defn create-js-doc-link-plain
  "**Parameters:**
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLinkPlain`"
  (^js []
   (.createJSDocLinkPlain typescript/factory))
  (^js [name]
   (.createJSDocLinkPlain typescript/factory name))
  (^js [name text]
   (.createJSDocLinkPlain typescript/factory name text)))

(defn update-js-doc-link-plain
  "**Parameters:**
   - `node`: `JSDocLinkPlain`
   - `name`: `EntityName | JSDocMemberName | undefined`
   - `text`: `string`
   
   **Returns:** `JSDocLinkPlain`"
  (^js [node]
   (.updateJSDocLinkPlain typescript/factory node))
  (^js [node name]
   (.updateJSDocLinkPlain typescript/factory node name))
  (^js [node name text]
   (.updateJSDocLinkPlain typescript/factory node name text)))

(defn create-js-doc-type-literal
  "**Parameters:**
   - `js-doc-property-tags`: `readonly JSDocPropertyLikeTag[] | undefined`
   - `array-type?`: `boolean | undefined`
   
   **Returns:** `JSDocTypeLiteral`"
  (^js []
   (.createJSDocTypeLiteral typescript/factory))
  (^js [js-doc-property-tags]
   (.createJSDocTypeLiteral typescript/factory js-doc-property-tags))
  (^js [js-doc-property-tags array-type?]
   (.createJSDocTypeLiteral typescript/factory js-doc-property-tags array-type?)))

(defn update-js-doc-type-literal
  "**Parameters:**
   - `node`: `JSDocTypeLiteral`
   - `js-doc-property-tags`: `readonly JSDocPropertyLikeTag[] | undefined`
   - `array-type?`: `boolean | undefined`
   
   **Returns:** `JSDocTypeLiteral`"
  (^js [node]
   (.updateJSDocTypeLiteral typescript/factory node))
  (^js [node js-doc-property-tags]
   (.updateJSDocTypeLiteral typescript/factory node js-doc-property-tags))
  (^js [node js-doc-property-tags array-type?]
   (.updateJSDocTypeLiteral typescript/factory node js-doc-property-tags array-type?)))

(defn create-js-doc-signature
  "**Parameters:**
   - `type-parameters`: `readonly JSDocTemplateTag[] | undefined`
   - `parameters`: `readonly JSDocParameterTag[]`
   - `type`: `JSDocReturnTag | undefined`
   
   **Returns:** `JSDocSignature`"
  (^js []
   (.createJSDocSignature typescript/factory))
  (^js [type-parameters]
   (.createJSDocSignature typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createJSDocSignature typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createJSDocSignature typescript/factory type-parameters parameters type)))

(defn update-js-doc-signature
  "**Parameters:**
   - `node`: `JSDocSignature`
   - `type-parameters`: `readonly JSDocTemplateTag[] | undefined`
   - `parameters`: `readonly JSDocParameterTag[]`
   - `type`: `JSDocReturnTag | undefined`
   
   **Returns:** `JSDocSignature`"
  (^js [node]
   (.updateJSDocSignature typescript/factory node))
  (^js [node type-parameters]
   (.updateJSDocSignature typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateJSDocSignature typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateJSDocSignature typescript/factory node type-parameters parameters type)))

(defn create-js-doc-template-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `constraint`: `JSDocTypeExpression | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[]`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTemplateTag`"
  (^js []
   (.createJSDocTemplateTag typescript/factory))
  (^js [tag-name]
   (.createJSDocTemplateTag typescript/factory tag-name))
  (^js [tag-name constraint]
   (.createJSDocTemplateTag typescript/factory tag-name constraint))
  (^js [tag-name constraint type-parameters]
   (.createJSDocTemplateTag typescript/factory tag-name constraint type-parameters))
  (^js [tag-name constraint type-parameters comment]
   (.createJSDocTemplateTag typescript/factory tag-name constraint type-parameters comment)))

(defn update-js-doc-template-tag
  "**Parameters:**
   - `node`: `JSDocTemplateTag`
   - `tag-name`: `Identifier | undefined`
   - `constraint`: `JSDocTypeExpression | undefined`
   - `type-parameters`: `readonly TypeParameterDeclaration[]`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTemplateTag`"
  (^js [node]
   (.updateJSDocTemplateTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocTemplateTag typescript/factory node tag-name))
  (^js [node tag-name constraint]
   (.updateJSDocTemplateTag typescript/factory node tag-name constraint))
  (^js [node tag-name constraint type-parameters]
   (.updateJSDocTemplateTag typescript/factory node tag-name constraint type-parameters))
  (^js [node tag-name constraint type-parameters comment]
   (.updateJSDocTemplateTag typescript/factory node tag-name constraint type-parameters comment)))

(defn create-js-doc-typedef-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | JSDocTypeLiteral | undefined`
   - `full-name`: `Identifier | JSDocNamespaceDeclaration | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTypedefTag`"
  (^js []
   (.createJSDocTypedefTag typescript/factory))
  (^js [tag-name]
   (.createJSDocTypedefTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocTypedefTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression full-name]
   (.createJSDocTypedefTag typescript/factory tag-name type-expression full-name))
  (^js [tag-name type-expression full-name comment]
   (.createJSDocTypedefTag typescript/factory tag-name type-expression full-name comment)))

(defn update-js-doc-typedef-tag
  "**Parameters:**
   - `node`: `JSDocTypedefTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | JSDocTypeLiteral | undefined`
   - `full-name`: `Identifier | JSDocNamespaceDeclaration | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTypedefTag`"
  (^js [node]
   (.updateJSDocTypedefTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocTypedefTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocTypedefTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression full-name]
   (.updateJSDocTypedefTag typescript/factory node tag-name type-expression full-name))
  (^js [node tag-name type-expression full-name comment]
   (.updateJSDocTypedefTag typescript/factory node tag-name type-expression full-name comment)))

(defn create-js-doc-parameter-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `name`: `EntityName`
   - `bracketed?`: `boolean`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `name-first?`: `boolean | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocParameterTag`"
  (^js []
   (.createJSDocParameterTag typescript/factory))
  (^js [tag-name]
   (.createJSDocParameterTag typescript/factory tag-name))
  (^js [tag-name name]
   (.createJSDocParameterTag typescript/factory tag-name name))
  (^js [tag-name name bracketed?]
   (.createJSDocParameterTag typescript/factory tag-name name bracketed?))
  (^js [tag-name name bracketed? type-expression]
   (.createJSDocParameterTag typescript/factory tag-name name bracketed? type-expression))
  (^js [tag-name name bracketed? type-expression name-first?]
   (.createJSDocParameterTag typescript/factory tag-name name bracketed? type-expression name-first?))
  (^js [tag-name name bracketed? type-expression name-first? comment]
   (.createJSDocParameterTag typescript/factory tag-name name bracketed? type-expression name-first? comment)))

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
  (^js [node]
   (.updateJSDocParameterTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocParameterTag typescript/factory node tag-name))
  (^js [node tag-name name]
   (.updateJSDocParameterTag typescript/factory node tag-name name))
  (^js [node tag-name name bracketed?]
   (.updateJSDocParameterTag typescript/factory node tag-name name bracketed?))
  (^js [node tag-name name bracketed? type-expression]
   (.updateJSDocParameterTag typescript/factory node tag-name name bracketed? type-expression))
  (^js [node tag-name name bracketed? type-expression name-first?]
   (.updateJSDocParameterTag typescript/factory node tag-name name bracketed? type-expression name-first?))
  (^js [node tag-name name bracketed? type-expression name-first? comment]
   (.updateJSDocParameterTag typescript/factory node tag-name name bracketed? type-expression name-first? comment)))

(defn create-js-doc-property-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `name`: `EntityName`
   - `bracketed?`: `boolean`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `name-first?`: `boolean | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocPropertyTag`"
  (^js []
   (.createJSDocPropertyTag typescript/factory))
  (^js [tag-name]
   (.createJSDocPropertyTag typescript/factory tag-name))
  (^js [tag-name name]
   (.createJSDocPropertyTag typescript/factory tag-name name))
  (^js [tag-name name bracketed?]
   (.createJSDocPropertyTag typescript/factory tag-name name bracketed?))
  (^js [tag-name name bracketed? type-expression]
   (.createJSDocPropertyTag typescript/factory tag-name name bracketed? type-expression))
  (^js [tag-name name bracketed? type-expression name-first?]
   (.createJSDocPropertyTag typescript/factory tag-name name bracketed? type-expression name-first?))
  (^js [tag-name name bracketed? type-expression name-first? comment]
   (.createJSDocPropertyTag typescript/factory tag-name name bracketed? type-expression name-first? comment)))

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
  (^js [node]
   (.updateJSDocPropertyTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocPropertyTag typescript/factory node tag-name))
  (^js [node tag-name name]
   (.updateJSDocPropertyTag typescript/factory node tag-name name))
  (^js [node tag-name name bracketed?]
   (.updateJSDocPropertyTag typescript/factory node tag-name name bracketed?))
  (^js [node tag-name name bracketed? type-expression]
   (.updateJSDocPropertyTag typescript/factory node tag-name name bracketed? type-expression))
  (^js [node tag-name name bracketed? type-expression name-first?]
   (.updateJSDocPropertyTag typescript/factory node tag-name name bracketed? type-expression name-first?))
  (^js [node tag-name name bracketed? type-expression name-first? comment]
   (.updateJSDocPropertyTag typescript/factory node tag-name name bracketed? type-expression name-first? comment)))

(defn create-js-doc-type-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTypeTag`"
  (^js []
   (.createJSDocTypeTag typescript/factory))
  (^js [tag-name]
   (.createJSDocTypeTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocTypeTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocTypeTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-type-tag
  "**Parameters:**
   - `node`: `JSDocTypeTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocTypeTag`"
  (^js [node]
   (.updateJSDocTypeTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocTypeTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocTypeTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocTypeTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-see-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `name-expression`: `JSDocNameReference | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocSeeTag`"
  (^js []
   (.createJSDocSeeTag typescript/factory))
  (^js [tag-name]
   (.createJSDocSeeTag typescript/factory tag-name))
  (^js [tag-name name-expression]
   (.createJSDocSeeTag typescript/factory tag-name name-expression))
  (^js [tag-name name-expression comment]
   (.createJSDocSeeTag typescript/factory tag-name name-expression comment)))

(defn update-js-doc-see-tag
  "**Parameters:**
   - `node`: `JSDocSeeTag`
   - `tag-name`: `Identifier | undefined`
   - `name-expression`: `JSDocNameReference | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocSeeTag`"
  (^js [node]
   (.updateJSDocSeeTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocSeeTag typescript/factory node tag-name))
  (^js [node tag-name name-expression]
   (.updateJSDocSeeTag typescript/factory node tag-name name-expression))
  (^js [node tag-name name-expression comment]
   (.updateJSDocSeeTag typescript/factory node tag-name name-expression comment)))

(defn create-js-doc-return-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocReturnTag`"
  (^js []
   (.createJSDocReturnTag typescript/factory))
  (^js [tag-name]
   (.createJSDocReturnTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocReturnTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocReturnTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-return-tag
  "**Parameters:**
   - `node`: `JSDocReturnTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocReturnTag`"
  (^js [node]
   (.updateJSDocReturnTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocReturnTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocReturnTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocReturnTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-this-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocThisTag`"
  (^js []
   (.createJSDocThisTag typescript/factory))
  (^js [tag-name]
   (.createJSDocThisTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocThisTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocThisTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-this-tag
  "**Parameters:**
   - `node`: `JSDocThisTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocThisTag`"
  (^js [node]
   (.updateJSDocThisTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocThisTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocThisTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocThisTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-enum-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocEnumTag`"
  (^js []
   (.createJSDocEnumTag typescript/factory))
  (^js [tag-name]
   (.createJSDocEnumTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocEnumTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocEnumTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-enum-tag
  "**Parameters:**
   - `node`: `JSDocEnumTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocEnumTag`"
  (^js [node]
   (.updateJSDocEnumTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocEnumTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocEnumTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocEnumTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-callback-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocSignature`
   - `full-name`: `Identifier | JSDocNamespaceDeclaration | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocCallbackTag`"
  (^js []
   (.createJSDocCallbackTag typescript/factory))
  (^js [tag-name]
   (.createJSDocCallbackTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocCallbackTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression full-name]
   (.createJSDocCallbackTag typescript/factory tag-name type-expression full-name))
  (^js [tag-name type-expression full-name comment]
   (.createJSDocCallbackTag typescript/factory tag-name type-expression full-name comment)))

(defn update-js-doc-callback-tag
  "**Parameters:**
   - `node`: `JSDocCallbackTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocSignature`
   - `full-name`: `Identifier | JSDocNamespaceDeclaration | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocCallbackTag`"
  (^js [node]
   (.updateJSDocCallbackTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocCallbackTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocCallbackTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression full-name]
   (.updateJSDocCallbackTag typescript/factory node tag-name type-expression full-name))
  (^js [node tag-name type-expression full-name comment]
   (.updateJSDocCallbackTag typescript/factory node tag-name type-expression full-name comment)))

(defn create-js-doc-overload-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocSignature`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocOverloadTag`"
  (^js []
   (.createJSDocOverloadTag typescript/factory))
  (^js [tag-name]
   (.createJSDocOverloadTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocOverloadTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocOverloadTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-overload-tag
  "**Parameters:**
   - `node`: `JSDocOverloadTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocSignature`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocOverloadTag`"
  (^js [node]
   (.updateJSDocOverloadTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocOverloadTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocOverloadTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocOverloadTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-augments-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `class-name`: `ExpressionWithTypeArguments & { readonly expression: Identifier | PropertyAccessEntityNameExpression; }`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocAugmentsTag`"
  (^js []
   (.createJSDocAugmentsTag typescript/factory))
  (^js [tag-name]
   (.createJSDocAugmentsTag typescript/factory tag-name))
  (^js [tag-name class-name]
   (.createJSDocAugmentsTag typescript/factory tag-name class-name))
  (^js [tag-name class-name comment]
   (.createJSDocAugmentsTag typescript/factory tag-name class-name comment)))

(defn update-js-doc-augments-tag
  "**Parameters:**
   - `node`: `JSDocAugmentsTag`
   - `tag-name`: `Identifier | undefined`
   - `class-name`: `ExpressionWithTypeArguments & { readonly expression: Identifier | PropertyAccessEntityNameExpression; }`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocAugmentsTag`"
  (^js [node]
   (.updateJSDocAugmentsTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocAugmentsTag typescript/factory node tag-name))
  (^js [node tag-name class-name]
   (.updateJSDocAugmentsTag typescript/factory node tag-name class-name))
  (^js [node tag-name class-name comment]
   (.updateJSDocAugmentsTag typescript/factory node tag-name class-name comment)))

(defn create-js-doc-implements-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `class-name`: `ExpressionWithTypeArguments & { readonly expression: Identifier | PropertyAccessEntityNameExpression; }`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocImplementsTag`"
  (^js []
   (.createJSDocImplementsTag typescript/factory))
  (^js [tag-name]
   (.createJSDocImplementsTag typescript/factory tag-name))
  (^js [tag-name class-name]
   (.createJSDocImplementsTag typescript/factory tag-name class-name))
  (^js [tag-name class-name comment]
   (.createJSDocImplementsTag typescript/factory tag-name class-name comment)))

(defn update-js-doc-implements-tag
  "**Parameters:**
   - `node`: `JSDocImplementsTag`
   - `tag-name`: `Identifier | undefined`
   - `class-name`: `ExpressionWithTypeArguments & { readonly expression: Identifier | PropertyAccessEntityNameExpression; }`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocImplementsTag`"
  (^js [node]
   (.updateJSDocImplementsTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocImplementsTag typescript/factory node tag-name))
  (^js [node tag-name class-name]
   (.updateJSDocImplementsTag typescript/factory node tag-name class-name))
  (^js [node tag-name class-name comment]
   (.updateJSDocImplementsTag typescript/factory node tag-name class-name comment)))

(defn create-js-doc-author-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocAuthorTag`"
  (^js []
   (.createJSDocAuthorTag typescript/factory))
  (^js [tag-name]
   (.createJSDocAuthorTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocAuthorTag typescript/factory tag-name comment)))

(defn update-js-doc-author-tag
  "**Parameters:**
   - `node`: `JSDocAuthorTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocAuthorTag`"
  (^js [node]
   (.updateJSDocAuthorTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocAuthorTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocAuthorTag typescript/factory node tag-name comment)))

(defn create-js-doc-class-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocClassTag`"
  (^js []
   (.createJSDocClassTag typescript/factory))
  (^js [tag-name]
   (.createJSDocClassTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocClassTag typescript/factory tag-name comment)))

(defn update-js-doc-class-tag
  "**Parameters:**
   - `node`: `JSDocClassTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocClassTag`"
  (^js [node]
   (.updateJSDocClassTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocClassTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocClassTag typescript/factory node tag-name comment)))

(defn create-js-doc-public-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocPublicTag`"
  (^js []
   (.createJSDocPublicTag typescript/factory))
  (^js [tag-name]
   (.createJSDocPublicTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocPublicTag typescript/factory tag-name comment)))

(defn update-js-doc-public-tag
  "**Parameters:**
   - `node`: `JSDocPublicTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocPublicTag`"
  (^js [node]
   (.updateJSDocPublicTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocPublicTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocPublicTag typescript/factory node tag-name comment)))

(defn create-js-doc-private-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocPrivateTag`"
  (^js []
   (.createJSDocPrivateTag typescript/factory))
  (^js [tag-name]
   (.createJSDocPrivateTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocPrivateTag typescript/factory tag-name comment)))

(defn update-js-doc-private-tag
  "**Parameters:**
   - `node`: `JSDocPrivateTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocPrivateTag`"
  (^js [node]
   (.updateJSDocPrivateTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocPrivateTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocPrivateTag typescript/factory node tag-name comment)))

(defn create-js-doc-protected-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocProtectedTag`"
  (^js []
   (.createJSDocProtectedTag typescript/factory))
  (^js [tag-name]
   (.createJSDocProtectedTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocProtectedTag typescript/factory tag-name comment)))

(defn update-js-doc-protected-tag
  "**Parameters:**
   - `node`: `JSDocProtectedTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocProtectedTag`"
  (^js [node]
   (.updateJSDocProtectedTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocProtectedTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocProtectedTag typescript/factory node tag-name comment)))

(defn create-js-doc-readonly-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocReadonlyTag`"
  (^js []
   (.createJSDocReadonlyTag typescript/factory))
  (^js [tag-name]
   (.createJSDocReadonlyTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocReadonlyTag typescript/factory tag-name comment)))

(defn update-js-doc-readonly-tag
  "**Parameters:**
   - `node`: `JSDocReadonlyTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocReadonlyTag`"
  (^js [node]
   (.updateJSDocReadonlyTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocReadonlyTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocReadonlyTag typescript/factory node tag-name comment)))

(defn create-js-doc-unknown-tag
  "**Parameters:**
   - `tag-name`: `Identifier`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocUnknownTag`"
  (^js [tag-name]
   (.createJSDocUnknownTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocUnknownTag typescript/factory tag-name comment)))

(defn update-js-doc-unknown-tag
  "**Parameters:**
   - `node`: `JSDocUnknownTag`
   - `tag-name`: `Identifier`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocUnknownTag`"
  (^js [node tag-name]
   (.updateJSDocUnknownTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocUnknownTag typescript/factory node tag-name comment)))

(defn create-js-doc-deprecated-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocDeprecatedTag`"
  (^js []
   (.createJSDocDeprecatedTag typescript/factory))
  (^js [tag-name]
   (.createJSDocDeprecatedTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocDeprecatedTag typescript/factory tag-name comment)))

(defn update-js-doc-deprecated-tag
  "**Parameters:**
   - `node`: `JSDocDeprecatedTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocDeprecatedTag`"
  (^js [node]
   (.updateJSDocDeprecatedTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocDeprecatedTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocDeprecatedTag typescript/factory node tag-name comment)))

(defn create-js-doc-override-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocOverrideTag`"
  (^js []
   (.createJSDocOverrideTag typescript/factory))
  (^js [tag-name]
   (.createJSDocOverrideTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocOverrideTag typescript/factory tag-name comment)))

(defn update-js-doc-override-tag
  "**Parameters:**
   - `node`: `JSDocOverrideTag`
   - `tag-name`: `Identifier | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocOverrideTag`"
  (^js [node]
   (.updateJSDocOverrideTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocOverrideTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocOverrideTag typescript/factory node tag-name comment)))

(defn create-js-doc-throws-tag
  "**Parameters:**
   - `tag-name`: `Identifier`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocThrowsTag`"
  (^js [tag-name]
   (.createJSDocThrowsTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocThrowsTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocThrowsTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-throws-tag
  "**Parameters:**
   - `node`: `JSDocThrowsTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression | undefined`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocThrowsTag`"
  (^js [node]
   (.updateJSDocThrowsTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocThrowsTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocThrowsTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocThrowsTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-satisfies-tag
  "**Parameters:**
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocSatisfiesTag`"
  (^js []
   (.createJSDocSatisfiesTag typescript/factory))
  (^js [tag-name]
   (.createJSDocSatisfiesTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocSatisfiesTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocSatisfiesTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-satisfies-tag
  "**Parameters:**
   - `node`: `JSDocSatisfiesTag`
   - `tag-name`: `Identifier | undefined`
   - `type-expression`: `JSDocTypeExpression`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `JSDocSatisfiesTag`"
  (^js [node]
   (.updateJSDocSatisfiesTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocSatisfiesTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocSatisfiesTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocSatisfiesTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-text
  "**Parameters:**
   - `text`: `string`
   
   **Returns:** `JSDocText`"
  ^js [text]
  (.createJSDocText typescript/factory text))

(defn update-js-doc-text
  "**Parameters:**
   - `node`: `JSDocText`
   - `text`: `string`
   
   **Returns:** `JSDocText`"
  ^js [node text]
  (.updateJSDocText typescript/factory node text))

(defn create-js-doc-comment
  "**Parameters:**
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   - `tags`: `readonly JSDocTag[] | undefined`
   
   **Returns:** `JSDoc`"
  (^js []
   (.createJSDocComment typescript/factory))
  (^js [comment]
   (.createJSDocComment typescript/factory comment))
  (^js [comment tags]
   (.createJSDocComment typescript/factory comment tags)))

(defn update-js-doc-comment
  "**Parameters:**
   - `node`: `JSDoc`
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   - `tags`: `readonly JSDocTag[] | undefined`
   
   **Returns:** `JSDoc`"
  (^js [node]
   (.updateJSDocComment typescript/factory node))
  (^js [node comment]
   (.updateJSDocComment typescript/factory node comment))
  (^js [node comment tags]
   (.updateJSDocComment typescript/factory node comment tags)))

(defn create-jsx-element
  "**Parameters:**
   - `opening-element`: `JsxOpeningElement`
   - `children`: `readonly JsxChild[]`
   - `closing-element`: `JsxClosingElement`
   
   **Returns:** `JsxElement`"
  ^js [opening-element children closing-element]
  (.createJsxElement typescript/factory opening-element children closing-element))

(defn update-jsx-element
  "**Parameters:**
   - `node`: `JsxElement`
   - `opening-element`: `JsxOpeningElement`
   - `children`: `readonly JsxChild[]`
   - `closing-element`: `JsxClosingElement`
   
   **Returns:** `JsxElement`"
  ^js [node opening-element children closing-element]
  (.updateJsxElement typescript/factory node opening-element children closing-element))

(defn create-jsx-self-closing-element
  "**Parameters:**
   - `tag-name`: `JsxTagNameExpression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `attributes`: `JsxAttributes`
   
   **Returns:** `JsxSelfClosingElement`"
  (^js [tag-name]
   (.createJsxSelfClosingElement typescript/factory tag-name))
  (^js [tag-name type-arguments]
   (.createJsxSelfClosingElement typescript/factory tag-name type-arguments))
  (^js [tag-name type-arguments attributes]
   (.createJsxSelfClosingElement typescript/factory tag-name type-arguments attributes)))

(defn update-jsx-self-closing-element
  "**Parameters:**
   - `node`: `JsxSelfClosingElement`
   - `tag-name`: `JsxTagNameExpression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `attributes`: `JsxAttributes`
   
   **Returns:** `JsxSelfClosingElement`"
  (^js [node tag-name]
   (.updateJsxSelfClosingElement typescript/factory node tag-name))
  (^js [node tag-name type-arguments]
   (.updateJsxSelfClosingElement typescript/factory node tag-name type-arguments))
  (^js [node tag-name type-arguments attributes]
   (.updateJsxSelfClosingElement typescript/factory node tag-name type-arguments attributes)))

(defn create-jsx-opening-element
  "**Parameters:**
   - `tag-name`: `JsxTagNameExpression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `attributes`: `JsxAttributes`
   
   **Returns:** `JsxOpeningElement`"
  (^js [tag-name]
   (.createJsxOpeningElement typescript/factory tag-name))
  (^js [tag-name type-arguments]
   (.createJsxOpeningElement typescript/factory tag-name type-arguments))
  (^js [tag-name type-arguments attributes]
   (.createJsxOpeningElement typescript/factory tag-name type-arguments attributes)))

(defn update-jsx-opening-element
  "**Parameters:**
   - `node`: `JsxOpeningElement`
   - `tag-name`: `JsxTagNameExpression`
   - `type-arguments`: `readonly TypeNode[] | undefined`
   - `attributes`: `JsxAttributes`
   
   **Returns:** `JsxOpeningElement`"
  (^js [node tag-name]
   (.updateJsxOpeningElement typescript/factory node tag-name))
  (^js [node tag-name type-arguments]
   (.updateJsxOpeningElement typescript/factory node tag-name type-arguments))
  (^js [node tag-name type-arguments attributes]
   (.updateJsxOpeningElement typescript/factory node tag-name type-arguments attributes)))

(defn create-jsx-closing-element
  "**Parameters:**
   - `tag-name`: `JsxTagNameExpression`
   
   **Returns:** `JsxClosingElement`"
  ^js [tag-name]
  (.createJsxClosingElement typescript/factory tag-name))

(defn update-jsx-closing-element
  "**Parameters:**
   - `node`: `JsxClosingElement`
   - `tag-name`: `JsxTagNameExpression`
   
   **Returns:** `JsxClosingElement`"
  ^js [node tag-name]
  (.updateJsxClosingElement typescript/factory node tag-name))

(defn create-jsx-fragment
  "**Parameters:**
   - `opening-fragment`: `JsxOpeningFragment`
   - `children`: `readonly JsxChild[]`
   - `closing-fragment`: `JsxClosingFragment`
   
   **Returns:** `JsxFragment`"
  ^js [opening-fragment children closing-fragment]
  (.createJsxFragment typescript/factory opening-fragment children closing-fragment))

(defn create-jsx-text
  "**Parameters:**
   - `text`: `string`
   - `contains-only-trivia-white-spaces?`: `boolean | undefined`
   
   **Returns:** `JsxText`"
  (^js [text]
   (.createJsxText typescript/factory text))
  (^js [text contains-only-trivia-white-spaces?]
   (.createJsxText typescript/factory text contains-only-trivia-white-spaces?)))

(defn update-jsx-text
  "**Parameters:**
   - `node`: `JsxText`
   - `text`: `string`
   - `contains-only-trivia-white-spaces?`: `boolean | undefined`
   
   **Returns:** `JsxText`"
  (^js [node text]
   (.updateJsxText typescript/factory node text))
  (^js [node text contains-only-trivia-white-spaces?]
   (.updateJsxText typescript/factory node text contains-only-trivia-white-spaces?)))

(defn create-jsx-opening-fragment
  "**Returns:** `JsxOpeningFragment`"
  ^js []
  (.createJsxOpeningFragment typescript/factory))

(defn create-jsx-jsx-closing-fragment
  "**Returns:** `JsxClosingFragment`"
  ^js []
  (.createJsxJsxClosingFragment typescript/factory))

(defn update-jsx-fragment
  "**Parameters:**
   - `node`: `JsxFragment`
   - `opening-fragment`: `JsxOpeningFragment`
   - `children`: `readonly JsxChild[]`
   - `closing-fragment`: `JsxClosingFragment`
   
   **Returns:** `JsxFragment`"
  ^js [node opening-fragment children closing-fragment]
  (.updateJsxFragment typescript/factory node opening-fragment children closing-fragment))

(defn create-jsx-attribute
  "**Parameters:**
   - `name`: `JsxAttributeName`
   - `initializer`: `JsxAttributeValue | undefined`
   
   **Returns:** `JsxAttribute`"
  (^js [name]
   (.createJsxAttribute typescript/factory name))
  (^js [name initializer]
   (.createJsxAttribute typescript/factory name initializer)))

(defn update-jsx-attribute
  "**Parameters:**
   - `node`: `JsxAttribute`
   - `name`: `JsxAttributeName`
   - `initializer`: `JsxAttributeValue | undefined`
   
   **Returns:** `JsxAttribute`"
  (^js [node name]
   (.updateJsxAttribute typescript/factory node name))
  (^js [node name initializer]
   (.updateJsxAttribute typescript/factory node name initializer)))

(defn create-jsx-attributes
  "**Parameters:**
   - `properties`: `readonly JsxAttributeLike[]`
   
   **Returns:** `JsxAttributes`"
  ^js [properties]
  (.createJsxAttributes typescript/factory properties))

(defn update-jsx-attributes
  "**Parameters:**
   - `node`: `JsxAttributes`
   - `properties`: `readonly JsxAttributeLike[]`
   
   **Returns:** `JsxAttributes`"
  ^js [node properties]
  (.updateJsxAttributes typescript/factory node properties))

(defn create-jsx-spread-attribute
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `JsxSpreadAttribute`"
  ^js [expression]
  (.createJsxSpreadAttribute typescript/factory expression))

(defn update-jsx-spread-attribute
  "**Parameters:**
   - `node`: `JsxSpreadAttribute`
   - `expression`: `Expression`
   
   **Returns:** `JsxSpreadAttribute`"
  ^js [node expression]
  (.updateJsxSpreadAttribute typescript/factory node expression))

(defn create-jsx-expression
  "**Parameters:**
   - `dot-dot-dot-token`: `DotDotDotToken | undefined`
   - `expression`: `Expression | undefined`
   
   **Returns:** `JsxExpression`"
  (^js []
   (.createJsxExpression typescript/factory))
  (^js [dot-dot-dot-token]
   (.createJsxExpression typescript/factory dot-dot-dot-token))
  (^js [dot-dot-dot-token expression]
   (.createJsxExpression typescript/factory dot-dot-dot-token expression)))

(defn update-jsx-expression
  "**Parameters:**
   - `node`: `JsxExpression`
   - `expression`: `Expression | undefined`
   
   **Returns:** `JsxExpression`"
  (^js [node]
   (.updateJsxExpression typescript/factory node))
  (^js [node expression]
   (.updateJsxExpression typescript/factory node expression)))

(defn create-jsx-namespaced-name
  "**Parameters:**
   - `namespace`: `Identifier`
   - `name`: `Identifier`
   
   **Returns:** `JsxNamespacedName`"
  ^js [namespace name]
  (.createJsxNamespacedName typescript/factory namespace name))

(defn update-jsx-namespaced-name
  "**Parameters:**
   - `node`: `JsxNamespacedName`
   - `namespace`: `Identifier`
   - `name`: `Identifier`
   
   **Returns:** `JsxNamespacedName`"
  ^js [node namespace name]
  (.updateJsxNamespacedName typescript/factory node namespace name))

(defn create-case-clause
  "**Parameters:**
   - `expression`: `Expression`
   - `statements`: `readonly Statement[]`
   
   **Returns:** `CaseClause`"
  ^js [expression statements]
  (.createCaseClause typescript/factory expression statements))

(defn update-case-clause
  "**Parameters:**
   - `node`: `CaseClause`
   - `expression`: `Expression`
   - `statements`: `readonly Statement[]`
   
   **Returns:** `CaseClause`"
  ^js [node expression statements]
  (.updateCaseClause typescript/factory node expression statements))

(defn create-default-clause
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   
   **Returns:** `DefaultClause`"
  ^js [statements]
  (.createDefaultClause typescript/factory statements))

(defn update-default-clause
  "**Parameters:**
   - `node`: `DefaultClause`
   - `statements`: `readonly Statement[]`
   
   **Returns:** `DefaultClause`"
  ^js [node statements]
  (.updateDefaultClause typescript/factory node statements))

(defn create-heritage-clause
  "**Parameters:**
   - `token`: `SyntaxKind.ExtendsKeyword | SyntaxKind.ImplementsKeyword`
   - `types`: `readonly ExpressionWithTypeArguments[]`
   
   **Returns:** `HeritageClause`"
  ^js [token types]
  (.createHeritageClause typescript/factory token types))

(defn update-heritage-clause
  "**Parameters:**
   - `node`: `HeritageClause`
   - `types`: `readonly ExpressionWithTypeArguments[]`
   
   **Returns:** `HeritageClause`"
  ^js [node types]
  (.updateHeritageClause typescript/factory node types))

(defn create-catch-clause
  "**Parameters:**
   - `variable-declaration`: `string | VariableDeclaration | BindingName | undefined`
   - `block`: `Block`
   
   **Returns:** `CatchClause`"
  (^js []
   (.createCatchClause typescript/factory))
  (^js [variable-declaration]
   (.createCatchClause typescript/factory variable-declaration))
  (^js [variable-declaration block]
   (.createCatchClause typescript/factory variable-declaration block)))

(defn update-catch-clause
  "**Parameters:**
   - `node`: `CatchClause`
   - `variable-declaration`: `VariableDeclaration | undefined`
   - `block`: `Block`
   
   **Returns:** `CatchClause`"
  (^js [node]
   (.updateCatchClause typescript/factory node))
  (^js [node variable-declaration]
   (.updateCatchClause typescript/factory node variable-declaration))
  (^js [node variable-declaration block]
   (.updateCatchClause typescript/factory node variable-declaration block)))

(defn create-property-assignment
  "**Parameters:**
   - `name`: `string | PropertyName`
   - `initializer`: `Expression`
   
   **Returns:** `PropertyAssignment`"
  ^js [name initializer]
  (.createPropertyAssignment typescript/factory name initializer))

(defn update-property-assignment
  "**Parameters:**
   - `node`: `PropertyAssignment`
   - `name`: `PropertyName`
   - `initializer`: `Expression`
   
   **Returns:** `PropertyAssignment`"
  ^js [node name initializer]
  (.updatePropertyAssignment typescript/factory node name initializer))

(defn create-shorthand-property-assignment
  "**Parameters:**
   - `name`: `string | Identifier`
   - `object-assignment-initializer`: `Expression | undefined`
   
   **Returns:** `ShorthandPropertyAssignment`"
  (^js [name]
   (.createShorthandPropertyAssignment typescript/factory name))
  (^js [name object-assignment-initializer]
   (.createShorthandPropertyAssignment typescript/factory name object-assignment-initializer)))

(defn update-shorthand-property-assignment
  "**Parameters:**
   - `node`: `ShorthandPropertyAssignment`
   - `name`: `Identifier`
   - `object-assignment-initializer`: `Expression | undefined`
   
   **Returns:** `ShorthandPropertyAssignment`"
  (^js [node name]
   (.updateShorthandPropertyAssignment typescript/factory node name))
  (^js [node name object-assignment-initializer]
   (.updateShorthandPropertyAssignment typescript/factory node name object-assignment-initializer)))

(defn create-spread-assignment
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `SpreadAssignment`"
  ^js [expression]
  (.createSpreadAssignment typescript/factory expression))

(defn update-spread-assignment
  "**Parameters:**
   - `node`: `SpreadAssignment`
   - `expression`: `Expression`
   
   **Returns:** `SpreadAssignment`"
  ^js [node expression]
  (.updateSpreadAssignment typescript/factory node expression))

(defn create-enum-member
  "**Parameters:**
   - `name`: `string | PropertyName`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `EnumMember`"
  (^js [name]
   (.createEnumMember typescript/factory name))
  (^js [name initializer]
   (.createEnumMember typescript/factory name initializer)))

(defn update-enum-member
  "**Parameters:**
   - `node`: `EnumMember`
   - `name`: `PropertyName`
   - `initializer`: `Expression | undefined`
   
   **Returns:** `EnumMember`"
  (^js [node name]
   (.updateEnumMember typescript/factory node name))
  (^js [node name initializer]
   (.updateEnumMember typescript/factory node name initializer)))

(defn create-source-file
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   - `end-of-file-token`: `EndOfFileToken`
   - `flags`: `NodeFlags`
   
   **Returns:** `SourceFile`"
  ^js [statements end-of-file-token flags]
  (.createSourceFile typescript/factory statements end-of-file-token flags))

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
  (^js [node statements]
   (.updateSourceFile typescript/factory node statements))
  (^js [node statements declaration-file?]
   (.updateSourceFile typescript/factory node statements declaration-file?))
  (^js [node statements declaration-file? referenced-files]
   (.updateSourceFile typescript/factory node statements declaration-file? referenced-files))
  (^js [node statements declaration-file? referenced-files type-references]
   (.updateSourceFile typescript/factory node statements declaration-file? referenced-files type-references))
  (^js [node statements declaration-file? referenced-files type-references has-no-default-lib?]
   (.updateSourceFile typescript/factory node statements declaration-file? referenced-files type-references has-no-default-lib?))
  (^js [node statements declaration-file? referenced-files type-references has-no-default-lib? lib-references]
   (.updateSourceFile typescript/factory node statements declaration-file? referenced-files type-references has-no-default-lib? lib-references)))

(defn create-not-emitted-statement
  "**Parameters:**
   - `original`: `Node`
   
   **Returns:** `NotEmittedStatement`"
  ^js [original]
  (.createNotEmittedStatement typescript/factory original))

(defn create-partially-emitted-expression
  "**Parameters:**
   - `expression`: `Expression`
   - `original`: `Node | undefined`
   
   **Returns:** `PartiallyEmittedExpression`"
  (^js [expression]
   (.createPartiallyEmittedExpression typescript/factory expression))
  (^js [expression original]
   (.createPartiallyEmittedExpression typescript/factory expression original)))

(defn update-partially-emitted-expression
  "**Parameters:**
   - `node`: `PartiallyEmittedExpression`
   - `expression`: `Expression`
   
   **Returns:** `PartiallyEmittedExpression`"
  ^js [node expression]
  (.updatePartiallyEmittedExpression typescript/factory node expression))

(defn create-comma-list-expression
  "**Parameters:**
   - `elements`: `readonly Expression[]`
   
   **Returns:** `CommaListExpression`"
  ^js [elements]
  (.createCommaListExpression typescript/factory elements))

(defn update-comma-list-expression
  "**Parameters:**
   - `node`: `CommaListExpression`
   - `elements`: `readonly Expression[]`
   
   **Returns:** `CommaListExpression`"
  ^js [node elements]
  (.updateCommaListExpression typescript/factory node elements))

(defn create-bundle
  "**Parameters:**
   - `source-files`: `readonly SourceFile[]`
   - `prepends`: `readonly (UnparsedSource | InputFiles)[] | undefined`
   
   **Returns:** `Bundle`"
  (^js [source-files]
   (.createBundle typescript/factory source-files))
  (^js [source-files prepends]
   (.createBundle typescript/factory source-files prepends)))

(defn update-bundle
  "**Parameters:**
   - `node`: `Bundle`
   - `source-files`: `readonly SourceFile[]`
   - `prepends`: `readonly (UnparsedSource | InputFiles)[] | undefined`
   
   **Returns:** `Bundle`"
  (^js [node source-files]
   (.updateBundle typescript/factory node source-files))
  (^js [node source-files prepends]
   (.updateBundle typescript/factory node source-files prepends)))

(defn create-comma
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createComma typescript/factory left right))

(defn create-assignment
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `AssignmentExpression<EqualsToken>`"
  ^js [left right]
  (.createAssignment typescript/factory left right))

(defn create-logical-or
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createLogicalOr typescript/factory left right))

(defn create-logical-and
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createLogicalAnd typescript/factory left right))

(defn create-bitwise-or
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createBitwiseOr typescript/factory left right))

(defn create-bitwise-xor
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createBitwiseXor typescript/factory left right))

(defn create-bitwise-and
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createBitwiseAnd typescript/factory left right))

(defn create-strict-equality
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createStrictEquality typescript/factory left right))

(defn create-strict-inequality
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createStrictInequality typescript/factory left right))

(defn create-equality
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createEquality typescript/factory left right))

(defn create-inequality
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createInequality typescript/factory left right))

(defn create-less-than
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createLessThan typescript/factory left right))

(defn create-less-than-equals
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createLessThanEquals typescript/factory left right))

(defn create-greater-than
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createGreaterThan typescript/factory left right))

(defn create-greater-than-equals
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createGreaterThanEquals typescript/factory left right))

(defn create-left-shift
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createLeftShift typescript/factory left right))

(defn create-right-shift
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createRightShift typescript/factory left right))

(defn create-unsigned-right-shift
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createUnsignedRightShift typescript/factory left right))

(defn create-add
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createAdd typescript/factory left right))

(defn create-subtract
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createSubtract typescript/factory left right))

(defn create-multiply
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createMultiply typescript/factory left right))

(defn create-divide
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createDivide typescript/factory left right))

(defn create-modulo
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createModulo typescript/factory left right))

(defn create-exponent
  "**Parameters:**
   - `left`: `Expression`
   - `right`: `Expression`
   
   **Returns:** `BinaryExpression`"
  ^js [left right]
  (.createExponent typescript/factory left right))

(defn create-prefix-plus
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [operand]
  (.createPrefixPlus typescript/factory operand))

(defn create-prefix-minus
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [operand]
  (.createPrefixMinus typescript/factory operand))

(defn create-prefix-increment
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [operand]
  (.createPrefixIncrement typescript/factory operand))

(defn create-prefix-decrement
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [operand]
  (.createPrefixDecrement typescript/factory operand))

(defn create-bitwise-not
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [operand]
  (.createBitwiseNot typescript/factory operand))

(defn create-logical-not
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PrefixUnaryExpression`"
  ^js [operand]
  (.createLogicalNot typescript/factory operand))

(defn create-postfix-increment
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PostfixUnaryExpression`"
  ^js [operand]
  (.createPostfixIncrement typescript/factory operand))

(defn create-postfix-decrement
  "**Parameters:**
   - `operand`: `Expression`
   
   **Returns:** `PostfixUnaryExpression`"
  ^js [operand]
  (.createPostfixDecrement typescript/factory operand))

(defn create-immediately-invoked-function-expression
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   - `param`: `ParameterDeclaration`
   - `param-value`: `Expression`
   
   **Returns:** `CallExpression`"
  (^js [statements]
   (.createImmediatelyInvokedFunctionExpression typescript/factory statements))
  (^js [statements param param-value]
   (.createImmediatelyInvokedFunctionExpression typescript/factory statements param param-value)))

(defn create-immediately-invoked-arrow-function
  "**Parameters:**
   - `statements`: `readonly Statement[]`
   - `param`: `ParameterDeclaration`
   - `param-value`: `Expression`
   
   **Returns:** `ImmediatelyInvokedArrowFunction`"
  (^js [statements]
   (.createImmediatelyInvokedArrowFunction typescript/factory statements))
  (^js [statements param param-value]
   (.createImmediatelyInvokedArrowFunction typescript/factory statements param param-value)))

(defn create-void-zero
  "**Returns:** `VoidExpression`"
  ^js []
  (.createVoidZero typescript/factory))

(defn create-export-default
  "**Parameters:**
   - `expression`: `Expression`
   
   **Returns:** `ExportAssignment`"
  ^js [expression]
  (.createExportDefault typescript/factory expression))

(defn create-external-module-export
  "**Parameters:**
   - `export-name`: `Identifier`
   
   **Returns:** `ExportDeclaration`"
  ^js [export-name]
  (.createExternalModuleExport typescript/factory export-name))

(defn restore-outer-expressions
  "**Parameters:**
   - `outer-expression`: `Expression | undefined`
   - `inner-expression`: `Expression`
   - `kinds`: `OuterExpressionKinds | undefined`
   
   **Returns:** `Expression`"
  (^js []
   (.restoreOuterExpressions typescript/factory))
  (^js [outer-expression]
   (.restoreOuterExpressions typescript/factory outer-expression))
  (^js [outer-expression inner-expression]
   (.restoreOuterExpressions typescript/factory outer-expression inner-expression))
  (^js [outer-expression inner-expression kinds]
   (.restoreOuterExpressions typescript/factory outer-expression inner-expression kinds)))

(defn replace-modifiers
  "Updates a node that may contain modifiers, replacing only the modifiers of the node.
   
   **Parameters:**
   - `node`: `T`
   - `modifiers`: `ModifierFlags | readonly Modifier[] | undefined`
   
   **Returns:** `T`"
  (^js [node]
   (.replaceModifiers typescript/factory node))
  (^js [node modifiers]
   (.replaceModifiers typescript/factory node modifiers)))

(defn replace-decorators-and-modifiers
  "Updates a node that may contain decorators or modifiers, replacing only the decorators and modifiers of the node.
   
   **Parameters:**
   - `node`: `T`
   - `modifiers`: `readonly ModifierLike[] | undefined`
   
   **Returns:** `T`"
  (^js [node]
   (.replaceDecoratorsAndModifiers typescript/factory node))
  (^js [node modifiers]
   (.replaceDecoratorsAndModifiers typescript/factory node modifiers)))

(defn replace-property-name
  "Updates a node that contains a property name, replacing only the name of the node.
   
   **Parameters:**
   - `node`: `T`
   - `name`: `T[\"name\"]`
   
   **Returns:** `T`"
  ^js [node name]
  (.replacePropertyName typescript/factory node name))
