(ns dots.typescript.factory
  (:require ["typescript" :as typescript]))

(defn create-node-array
  (^js []
   (.createNodeArray typescript/factory))
  (^js [elements]
   (.createNodeArray typescript/factory elements))
  (^js [elements has-trailing-comma?]
   (.createNodeArray typescript/factory elements has-trailing-comma?)))

(defn create-numeric-literal
  (^js [value]
   (.createNumericLiteral typescript/factory value))
  (^js [value numeric-literal-flags]
   (.createNumericLiteral typescript/factory value numeric-literal-flags)))

(defn create-big-int-literal
  ^js [value]
  (.createBigIntLiteral typescript/factory value))

(defn create-string-literal
  (^js [text]
   (.createStringLiteral typescript/factory text))
  (^js [text single-quote?]
   (.createStringLiteral typescript/factory text single-quote?)))

(defn create-string-literal-from-node
  (^js [source-node]
   (.createStringLiteralFromNode typescript/factory source-node))
  (^js [source-node single-quote?]
   (.createStringLiteralFromNode typescript/factory source-node single-quote?)))

(defn create-regular-expression-literal
  ^js [text]
  (.createRegularExpressionLiteral typescript/factory text))

(defn create-identifier
  ^js [text]
  (.createIdentifier typescript/factory text))

(defn create-temp-variable
  "Create a unique temporary variable."
  (^js []
   (.createTempVariable typescript/factory))
  (^js [record-temp-variable]
   (.createTempVariable typescript/factory record-temp-variable))
  (^js [record-temp-variable reserved-in-nested-scopes?]
   (.createTempVariable typescript/factory record-temp-variable reserved-in-nested-scopes?)))

(defn create-loop-variable
  "Create a unique temporary variable for use in a loop."
  (^js []
   (.createLoopVariable typescript/factory))
  (^js [reserved-in-nested-scopes?]
   (.createLoopVariable typescript/factory reserved-in-nested-scopes?)))

(defn create-unique-name
  "Create a unique name based on the supplied text."
  (^js [text]
   (.createUniqueName typescript/factory text))
  (^js [text flags]
   (.createUniqueName typescript/factory text flags)))

(defn generated-name-for-node
  "Create a unique name generated for a node."
  (^js []
   (.getGeneratedNameForNode typescript/factory))
  (^js [node]
   (.getGeneratedNameForNode typescript/factory node))
  (^js [node flags]
   (.getGeneratedNameForNode typescript/factory node flags)))

(defn create-private-identifier
  ^js [text]
  (.createPrivateIdentifier typescript/factory text))

(defn create-token
  ^js [token]
  (.createToken typescript/factory token))

(defn create-super
  ^js []
  (.createSuper typescript/factory))

(defn create-this
  ^js []
  (.createThis typescript/factory))

(defn create-null
  ^js []
  (.createNull typescript/factory))

(defn create-true
  ^js []
  (.createTrue typescript/factory))

(defn create-false
  ^js []
  (.createFalse typescript/factory))

(defn create-modifier
  ^js [kind]
  (.createModifier typescript/factory kind))

(defn create-modifiers-from-modifier-flags
  ^js [flags]
  (.createModifiersFromModifierFlags typescript/factory flags))

(defn create-qualified-name
  ^js [left right]
  (.createQualifiedName typescript/factory left right))

(defn update-qualified-name
  ^js [node left right]
  (.updateQualifiedName typescript/factory node left right))

(defn create-computed-property-name
  ^js [expression]
  (.createComputedPropertyName typescript/factory expression))

(defn update-computed-property-name
  ^js [node expression]
  (.updateComputedPropertyName typescript/factory node expression))

(defn create-type-parameter-declaration
  {:arglists '([]
               [modifiers]
               [modifiers name]
               [modifiers name constraint]
               [modifiers name constraint default-type]
               [name]
               [name constraint]
               [name constraint default-type])}
  (^js []
   (.createTypeParameterDeclaration typescript/factory))
  (^js [a]
   (.createTypeParameterDeclaration typescript/factory a))
  (^js [a b]
   (.createTypeParameterDeclaration typescript/factory a b))
  (^js [a b c]
   (.createTypeParameterDeclaration typescript/factory a b c))
  (^js [modifiers name constraint default-type]
   (.createTypeParameterDeclaration typescript/factory modifiers name constraint default-type)))

(defn update-type-parameter-declaration
  {:arglists '([node]
               [node modifiers]
               [node modifiers name]
               [node modifiers name constraint]
               [node modifiers name constraint default-type]
               [node name]
               [node name constraint]
               [node name constraint default-type])}
  (^js [node]
   (.updateTypeParameterDeclaration typescript/factory node))
  (^js [a b]
   (.updateTypeParameterDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateTypeParameterDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateTypeParameterDeclaration typescript/factory a b c d))
  (^js [node modifiers name constraint default-type]
   (.updateTypeParameterDeclaration typescript/factory node modifiers name constraint default-type)))

(defn create-parameter-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers dot-dot-dot-token]
               [decorators modifiers dot-dot-dot-token name]
               [decorators modifiers dot-dot-dot-token name question-token]
               [decorators modifiers dot-dot-dot-token name question-token type]
               [decorators modifiers dot-dot-dot-token name question-token type initializer]
               [modifiers]
               [modifiers dot-dot-dot-token]
               [modifiers dot-dot-dot-token name]
               [modifiers dot-dot-dot-token name question-token]
               [modifiers dot-dot-dot-token name question-token type]
               [modifiers dot-dot-dot-token name question-token type initializer])}
  (^js []
   (.createParameterDeclaration typescript/factory))
  (^js [a]
   (.createParameterDeclaration typescript/factory a))
  (^js [a b]
   (.createParameterDeclaration typescript/factory a b))
  (^js [a b c]
   (.createParameterDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createParameterDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.createParameterDeclaration typescript/factory a b c d e))
  (^js [a b c d e f]
   (.createParameterDeclaration typescript/factory a b c d e f))
  (^js [decorators modifiers dot-dot-dot-token name question-token type initializer]
   (.createParameterDeclaration typescript/factory decorators modifiers dot-dot-dot-token name question-token type initializer)))

(defn update-parameter-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers dot-dot-dot-token]
               [node decorators modifiers dot-dot-dot-token name]
               [node decorators modifiers dot-dot-dot-token name question-token]
               [node decorators modifiers dot-dot-dot-token name question-token type]
               [node decorators modifiers dot-dot-dot-token name question-token type initializer]
               [node modifiers]
               [node modifiers dot-dot-dot-token]
               [node modifiers dot-dot-dot-token name]
               [node modifiers dot-dot-dot-token name question-token]
               [node modifiers dot-dot-dot-token name question-token type]
               [node modifiers dot-dot-dot-token name question-token type initializer])}
  (^js [node]
   (.updateParameterDeclaration typescript/factory node))
  (^js [a b]
   (.updateParameterDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateParameterDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateParameterDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updateParameterDeclaration typescript/factory a b c d e))
  (^js [a b c d e f]
   (.updateParameterDeclaration typescript/factory a b c d e f))
  (^js [a b c d e f g]
   (.updateParameterDeclaration typescript/factory a b c d e f g))
  (^js [node decorators modifiers dot-dot-dot-token name question-token type initializer]
   (.updateParameterDeclaration typescript/factory node decorators modifiers dot-dot-dot-token name question-token type initializer)))

(defn create-decorator
  ^js [expression]
  (.createDecorator typescript/factory expression))

(defn update-decorator
  ^js [node expression]
  (.updateDecorator typescript/factory node expression))

(defn create-property-signature
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
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers name]
               [decorators modifiers name question-or-exclamation-token]
               [decorators modifiers name question-or-exclamation-token type]
               [decorators modifiers name question-or-exclamation-token type initializer]
               [modifiers]
               [modifiers name]
               [modifiers name question-or-exclamation-token]
               [modifiers name question-or-exclamation-token type]
               [modifiers name question-or-exclamation-token type initializer])}
  (^js []
   (.createPropertyDeclaration typescript/factory))
  (^js [a]
   (.createPropertyDeclaration typescript/factory a))
  (^js [a b]
   (.createPropertyDeclaration typescript/factory a b))
  (^js [a b c]
   (.createPropertyDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createPropertyDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.createPropertyDeclaration typescript/factory a b c d e))
  (^js [decorators modifiers name question-or-exclamation-token type initializer]
   (.createPropertyDeclaration typescript/factory decorators modifiers name question-or-exclamation-token type initializer)))

(defn update-property-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers name]
               [node decorators modifiers name question-or-exclamation-token]
               [node decorators modifiers name question-or-exclamation-token type]
               [node decorators modifiers name question-or-exclamation-token type initializer]
               [node modifiers]
               [node modifiers name]
               [node modifiers name question-or-exclamation-token]
               [node modifiers name question-or-exclamation-token type]
               [node modifiers name question-or-exclamation-token type initializer])}
  (^js [node]
   (.updatePropertyDeclaration typescript/factory node))
  (^js [a b]
   (.updatePropertyDeclaration typescript/factory a b))
  (^js [a b c]
   (.updatePropertyDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updatePropertyDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updatePropertyDeclaration typescript/factory a b c d e))
  (^js [a b c d e f]
   (.updatePropertyDeclaration typescript/factory a b c d e f))
  (^js [node decorators modifiers name question-or-exclamation-token type initializer]
   (.updatePropertyDeclaration typescript/factory node decorators modifiers name question-or-exclamation-token type initializer)))

(defn create-method-signature
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
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers asterisk-token]
               [decorators modifiers asterisk-token name]
               [decorators modifiers asterisk-token name question-token]
               [decorators modifiers asterisk-token name question-token type-parameters]
               [decorators modifiers asterisk-token name question-token type-parameters parameters]
               [decorators modifiers asterisk-token name question-token type-parameters parameters type]
               [decorators modifiers asterisk-token name question-token type-parameters parameters type body]
               [modifiers]
               [modifiers asterisk-token]
               [modifiers asterisk-token name]
               [modifiers asterisk-token name question-token]
               [modifiers asterisk-token name question-token type-parameters]
               [modifiers asterisk-token name question-token type-parameters parameters]
               [modifiers asterisk-token name question-token type-parameters parameters type]
               [modifiers asterisk-token name question-token type-parameters parameters type body])}
  (^js []
   (.createMethodDeclaration typescript/factory))
  (^js [a]
   (.createMethodDeclaration typescript/factory a))
  (^js [a b]
   (.createMethodDeclaration typescript/factory a b))
  (^js [a b c]
   (.createMethodDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createMethodDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.createMethodDeclaration typescript/factory a b c d e))
  (^js [a b c d e f]
   (.createMethodDeclaration typescript/factory a b c d e f))
  (^js [a b c d e f g]
   (.createMethodDeclaration typescript/factory a b c d e f g))
  (^js [a b c d e f g h]
   (.createMethodDeclaration typescript/factory a b c d e f g h))
  (^js [decorators modifiers asterisk-token name question-token type-parameters parameters type body]
   (.createMethodDeclaration typescript/factory decorators modifiers asterisk-token name question-token type-parameters parameters type body)))

(defn update-method-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers asterisk-token]
               [node decorators modifiers asterisk-token name]
               [node decorators modifiers asterisk-token name question-token]
               [node decorators modifiers asterisk-token name question-token type-parameters]
               [node decorators modifiers asterisk-token name question-token type-parameters parameters]
               [node decorators modifiers asterisk-token name question-token type-parameters parameters type]
               [node decorators modifiers asterisk-token name question-token type-parameters parameters type body]
               [node modifiers]
               [node modifiers asterisk-token]
               [node modifiers asterisk-token name]
               [node modifiers asterisk-token name question-token]
               [node modifiers asterisk-token name question-token type-parameters]
               [node modifiers asterisk-token name question-token type-parameters parameters]
               [node modifiers asterisk-token name question-token type-parameters parameters type]
               [node modifiers asterisk-token name question-token type-parameters parameters type body])}
  (^js [node]
   (.updateMethodDeclaration typescript/factory node))
  (^js [a b]
   (.updateMethodDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateMethodDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateMethodDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updateMethodDeclaration typescript/factory a b c d e))
  (^js [a b c d e f]
   (.updateMethodDeclaration typescript/factory a b c d e f))
  (^js [a b c d e f g]
   (.updateMethodDeclaration typescript/factory a b c d e f g))
  (^js [a b c d e f g h]
   (.updateMethodDeclaration typescript/factory a b c d e f g h))
  (^js [a b c d e f g h i]
   (.updateMethodDeclaration typescript/factory a b c d e f g h i))
  (^js [node decorators modifiers asterisk-token name question-token type-parameters parameters type body]
   (.updateMethodDeclaration typescript/factory node decorators modifiers asterisk-token name question-token type-parameters parameters type body)))

(defn create-constructor-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers parameters]
               [decorators modifiers parameters body]
               [modifiers]
               [modifiers parameters]
               [modifiers parameters body])}
  (^js []
   (.createConstructorDeclaration typescript/factory))
  (^js [a]
   (.createConstructorDeclaration typescript/factory a))
  (^js [a b]
   (.createConstructorDeclaration typescript/factory a b))
  (^js [a b c]
   (.createConstructorDeclaration typescript/factory a b c))
  (^js [decorators modifiers parameters body]
   (.createConstructorDeclaration typescript/factory decorators modifiers parameters body)))

(defn update-constructor-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers parameters]
               [node decorators modifiers parameters body]
               [node modifiers]
               [node modifiers parameters]
               [node modifiers parameters body])}
  (^js [node]
   (.updateConstructorDeclaration typescript/factory node))
  (^js [a b]
   (.updateConstructorDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateConstructorDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateConstructorDeclaration typescript/factory a b c d))
  (^js [node decorators modifiers parameters body]
   (.updateConstructorDeclaration typescript/factory node decorators modifiers parameters body)))

(defn create-get-accessor-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers name]
               [decorators modifiers name parameters]
               [decorators modifiers name parameters type]
               [decorators modifiers name parameters type body]
               [modifiers]
               [modifiers name]
               [modifiers name parameters]
               [modifiers name parameters type]
               [modifiers name parameters type body])}
  (^js []
   (.createGetAccessorDeclaration typescript/factory))
  (^js [a]
   (.createGetAccessorDeclaration typescript/factory a))
  (^js [a b]
   (.createGetAccessorDeclaration typescript/factory a b))
  (^js [a b c]
   (.createGetAccessorDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createGetAccessorDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.createGetAccessorDeclaration typescript/factory a b c d e))
  (^js [decorators modifiers name parameters type body]
   (.createGetAccessorDeclaration typescript/factory decorators modifiers name parameters type body)))

(defn update-get-accessor-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers name]
               [node decorators modifiers name parameters]
               [node decorators modifiers name parameters type]
               [node decorators modifiers name parameters type body]
               [node modifiers]
               [node modifiers name]
               [node modifiers name parameters]
               [node modifiers name parameters type]
               [node modifiers name parameters type body])}
  (^js [node]
   (.updateGetAccessorDeclaration typescript/factory node))
  (^js [a b]
   (.updateGetAccessorDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateGetAccessorDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateGetAccessorDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updateGetAccessorDeclaration typescript/factory a b c d e))
  (^js [a b c d e f]
   (.updateGetAccessorDeclaration typescript/factory a b c d e f))
  (^js [node decorators modifiers name parameters type body]
   (.updateGetAccessorDeclaration typescript/factory node decorators modifiers name parameters type body)))

(defn create-set-accessor-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers name]
               [decorators modifiers name parameters]
               [decorators modifiers name parameters body]
               [modifiers]
               [modifiers name]
               [modifiers name parameters]
               [modifiers name parameters body])}
  (^js []
   (.createSetAccessorDeclaration typescript/factory))
  (^js [a]
   (.createSetAccessorDeclaration typescript/factory a))
  (^js [a b]
   (.createSetAccessorDeclaration typescript/factory a b))
  (^js [a b c]
   (.createSetAccessorDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createSetAccessorDeclaration typescript/factory a b c d))
  (^js [decorators modifiers name parameters body]
   (.createSetAccessorDeclaration typescript/factory decorators modifiers name parameters body)))

(defn update-set-accessor-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers name]
               [node decorators modifiers name parameters]
               [node decorators modifiers name parameters body]
               [node modifiers]
               [node modifiers name]
               [node modifiers name parameters]
               [node modifiers name parameters body])}
  (^js [node]
   (.updateSetAccessorDeclaration typescript/factory node))
  (^js [a b]
   (.updateSetAccessorDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateSetAccessorDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateSetAccessorDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updateSetAccessorDeclaration typescript/factory a b c d e))
  (^js [node decorators modifiers name parameters body]
   (.updateSetAccessorDeclaration typescript/factory node decorators modifiers name parameters body)))

(defn create-call-signature
  (^js []
   (.createCallSignature typescript/factory))
  (^js [type-parameters]
   (.createCallSignature typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createCallSignature typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createCallSignature typescript/factory type-parameters parameters type)))

(defn update-call-signature
  (^js [node]
   (.updateCallSignature typescript/factory node))
  (^js [node type-parameters]
   (.updateCallSignature typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateCallSignature typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateCallSignature typescript/factory node type-parameters parameters type)))

(defn create-construct-signature
  (^js []
   (.createConstructSignature typescript/factory))
  (^js [type-parameters]
   (.createConstructSignature typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createConstructSignature typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createConstructSignature typescript/factory type-parameters parameters type)))

(defn update-construct-signature
  (^js [node]
   (.updateConstructSignature typescript/factory node))
  (^js [node type-parameters]
   (.updateConstructSignature typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateConstructSignature typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateConstructSignature typescript/factory node type-parameters parameters type)))

(defn create-index-signature
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers parameters]
               [decorators modifiers parameters type]
               [modifiers]
               [modifiers parameters]
               [modifiers parameters type])}
  (^js []
   (.createIndexSignature typescript/factory))
  (^js [a]
   (.createIndexSignature typescript/factory a))
  (^js [a b]
   (.createIndexSignature typescript/factory a b))
  (^js [a b c]
   (.createIndexSignature typescript/factory a b c))
  (^js [decorators modifiers parameters type]
   (.createIndexSignature typescript/factory decorators modifiers parameters type)))

(defn update-index-signature
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers parameters]
               [node decorators modifiers parameters type]
               [node modifiers]
               [node modifiers parameters]
               [node modifiers parameters type])}
  (^js [node]
   (.updateIndexSignature typescript/factory node))
  (^js [a b]
   (.updateIndexSignature typescript/factory a b))
  (^js [a b c]
   (.updateIndexSignature typescript/factory a b c))
  (^js [a b c d]
   (.updateIndexSignature typescript/factory a b c d))
  (^js [node decorators modifiers parameters type]
   (.updateIndexSignature typescript/factory node decorators modifiers parameters type)))

(defn create-template-literal-type-span
  ^js [type literal]
  (.createTemplateLiteralTypeSpan typescript/factory type literal))

(defn update-template-literal-type-span
  ^js [node type literal]
  (.updateTemplateLiteralTypeSpan typescript/factory node type literal))

(defn create-class-static-block-declaration
  {:arglists '([]
               [body]
               [decorators]
               [decorators modifiers]
               [decorators modifiers body])}
  (^js []
   (.createClassStaticBlockDeclaration typescript/factory))
  (^js [a]
   (.createClassStaticBlockDeclaration typescript/factory a))
  (^js [decorators modifiers]
   (.createClassStaticBlockDeclaration typescript/factory decorators modifiers))
  (^js [decorators modifiers body]
   (.createClassStaticBlockDeclaration typescript/factory decorators modifiers body)))

(defn update-class-static-block-declaration
  {:arglists '([node]
               [node body]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers body])}
  (^js [node]
   (.updateClassStaticBlockDeclaration typescript/factory node))
  (^js [a b]
   (.updateClassStaticBlockDeclaration typescript/factory a b))
  (^js [node decorators modifiers]
   (.updateClassStaticBlockDeclaration typescript/factory node decorators modifiers))
  (^js [node decorators modifiers body]
   (.updateClassStaticBlockDeclaration typescript/factory node decorators modifiers body)))

(defn create-keyword-type-node
  ^js [kind]
  (.createKeywordTypeNode typescript/factory kind))

(defn create-type-predicate-node
  (^js []
   (.createTypePredicateNode typescript/factory))
  (^js [asserts-modifier]
   (.createTypePredicateNode typescript/factory asserts-modifier))
  (^js [asserts-modifier parameter-name]
   (.createTypePredicateNode typescript/factory asserts-modifier parameter-name))
  (^js [asserts-modifier parameter-name type]
   (.createTypePredicateNode typescript/factory asserts-modifier parameter-name type)))

(defn update-type-predicate-node
  (^js [node]
   (.updateTypePredicateNode typescript/factory node))
  (^js [node asserts-modifier]
   (.updateTypePredicateNode typescript/factory node asserts-modifier))
  (^js [node asserts-modifier parameter-name]
   (.updateTypePredicateNode typescript/factory node asserts-modifier parameter-name))
  (^js [node asserts-modifier parameter-name type]
   (.updateTypePredicateNode typescript/factory node asserts-modifier parameter-name type)))

(defn create-type-reference-node
  (^js [type-name]
   (.createTypeReferenceNode typescript/factory type-name))
  (^js [type-name type-arguments]
   (.createTypeReferenceNode typescript/factory type-name type-arguments)))

(defn update-type-reference-node
  (^js [node type-name]
   (.updateTypeReferenceNode typescript/factory node type-name))
  (^js [node type-name type-arguments]
   (.updateTypeReferenceNode typescript/factory node type-name type-arguments)))

(defn create-function-type-node
  (^js []
   (.createFunctionTypeNode typescript/factory))
  (^js [type-parameters]
   (.createFunctionTypeNode typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createFunctionTypeNode typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createFunctionTypeNode typescript/factory type-parameters parameters type)))

(defn update-function-type-node
  (^js [node]
   (.updateFunctionTypeNode typescript/factory node))
  (^js [node type-parameters]
   (.updateFunctionTypeNode typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateFunctionTypeNode typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateFunctionTypeNode typescript/factory node type-parameters parameters type)))

(defn create-constructor-type-node
  {:arglists '([]
               [modifiers]
               [modifiers type-parameters]
               [modifiers type-parameters parameters]
               [modifiers type-parameters parameters type]
               [type-parameters]
               [type-parameters parameters]
               [type-parameters parameters type])}
  (^js []
   (.createConstructorTypeNode typescript/factory))
  (^js [a]
   (.createConstructorTypeNode typescript/factory a))
  (^js [a b]
   (.createConstructorTypeNode typescript/factory a b))
  (^js [a b c]
   (.createConstructorTypeNode typescript/factory a b c))
  (^js [modifiers type-parameters parameters type]
   (.createConstructorTypeNode typescript/factory modifiers type-parameters parameters type)))

(defn update-constructor-type-node
  {:arglists '([node]
               [node modifiers]
               [node modifiers type-parameters]
               [node modifiers type-parameters parameters]
               [node modifiers type-parameters parameters type]
               [node type-parameters]
               [node type-parameters parameters]
               [node type-parameters parameters type])}
  (^js [node]
   (.updateConstructorTypeNode typescript/factory node))
  (^js [a b]
   (.updateConstructorTypeNode typescript/factory a b))
  (^js [a b c]
   (.updateConstructorTypeNode typescript/factory a b c))
  (^js [a b c d]
   (.updateConstructorTypeNode typescript/factory a b c d))
  (^js [node modifiers type-parameters parameters type]
   (.updateConstructorTypeNode typescript/factory node modifiers type-parameters parameters type)))

(defn create-type-query-node
  (^js [expr-name]
   (.createTypeQueryNode typescript/factory expr-name))
  (^js [expr-name type-arguments]
   (.createTypeQueryNode typescript/factory expr-name type-arguments)))

(defn update-type-query-node
  (^js [node expr-name]
   (.updateTypeQueryNode typescript/factory node expr-name))
  (^js [node expr-name type-arguments]
   (.updateTypeQueryNode typescript/factory node expr-name type-arguments)))

(defn create-type-literal-node
  (^js []
   (.createTypeLiteralNode typescript/factory))
  (^js [members]
   (.createTypeLiteralNode typescript/factory members)))

(defn update-type-literal-node
  ^js [node members]
  (.updateTypeLiteralNode typescript/factory node members))

(defn create-array-type-node
  ^js [element-type]
  (.createArrayTypeNode typescript/factory element-type))

(defn update-array-type-node
  ^js [node element-type]
  (.updateArrayTypeNode typescript/factory node element-type))

(defn create-tuple-type-node
  ^js [elements]
  (.createTupleTypeNode typescript/factory elements))

(defn update-tuple-type-node
  ^js [node elements]
  (.updateTupleTypeNode typescript/factory node elements))

(defn create-named-tuple-member
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
  ^js [type]
  (.createOptionalTypeNode typescript/factory type))

(defn update-optional-type-node
  ^js [node type]
  (.updateOptionalTypeNode typescript/factory node type))

(defn create-rest-type-node
  ^js [type]
  (.createRestTypeNode typescript/factory type))

(defn update-rest-type-node
  ^js [node type]
  (.updateRestTypeNode typescript/factory node type))

(defn create-union-type-node
  ^js [types]
  (.createUnionTypeNode typescript/factory types))

(defn update-union-type-node
  ^js [node types]
  (.updateUnionTypeNode typescript/factory node types))

(defn create-intersection-type-node
  ^js [types]
  (.createIntersectionTypeNode typescript/factory types))

(defn update-intersection-type-node
  ^js [node types]
  (.updateIntersectionTypeNode typescript/factory node types))

(defn create-conditional-type-node
  ^js [check-type extends-type true-type false-type]
  (.createConditionalTypeNode typescript/factory check-type extends-type true-type false-type))

(defn update-conditional-type-node
  ^js [node check-type extends-type true-type false-type]
  (.updateConditionalTypeNode typescript/factory node check-type extends-type true-type false-type))

(defn create-infer-type-node
  ^js [type-parameter]
  (.createInferTypeNode typescript/factory type-parameter))

(defn update-infer-type-node
  ^js [node type-parameter]
  (.updateInferTypeNode typescript/factory node type-parameter))

(defn create-import-type-node
  {:arglists '([argument]
               [argument assertions]
               [argument assertions qualifier]
               [argument assertions qualifier type-arguments]
               [argument assertions qualifier type-arguments type-of?]
               [argument qualifier]
               [argument qualifier type-arguments]
               [argument qualifier type-arguments type-of?])}
  (^js [argument]
   (.createImportTypeNode typescript/factory argument))
  (^js [a b]
   (.createImportTypeNode typescript/factory a b))
  (^js [a b c]
   (.createImportTypeNode typescript/factory a b c))
  (^js [a b c d]
   (.createImportTypeNode typescript/factory a b c d))
  (^js [argument assertions qualifier type-arguments type-of?]
   (.createImportTypeNode typescript/factory argument assertions qualifier type-arguments type-of?)))

(defn update-import-type-node
  {:arglists '([node argument]
               [node argument assertions]
               [node argument assertions qualifier]
               [node argument assertions qualifier type-arguments]
               [node argument assertions qualifier type-arguments type-of?]
               [node argument qualifier]
               [node argument qualifier type-arguments]
               [node argument qualifier type-arguments type-of?])}
  (^js [node argument]
   (.updateImportTypeNode typescript/factory node argument))
  (^js [a b c]
   (.updateImportTypeNode typescript/factory a b c))
  (^js [a b c d]
   (.updateImportTypeNode typescript/factory a b c d))
  (^js [a b c d e]
   (.updateImportTypeNode typescript/factory a b c d e))
  (^js [node argument assertions qualifier type-arguments type-of?]
   (.updateImportTypeNode typescript/factory node argument assertions qualifier type-arguments type-of?)))

(defn create-parenthesized-type
  ^js [type]
  (.createParenthesizedType typescript/factory type))

(defn update-parenthesized-type
  ^js [node type]
  (.updateParenthesizedType typescript/factory node type))

(defn create-this-type-node
  ^js []
  (.createThisTypeNode typescript/factory))

(defn create-type-operator-node
  ^js [operator type]
  (.createTypeOperatorNode typescript/factory operator type))

(defn update-type-operator-node
  ^js [node type]
  (.updateTypeOperatorNode typescript/factory node type))

(defn create-indexed-access-type-node
  ^js [object-type index-type]
  (.createIndexedAccessTypeNode typescript/factory object-type index-type))

(defn update-indexed-access-type-node
  ^js [node object-type index-type]
  (.updateIndexedAccessTypeNode typescript/factory node object-type index-type))

(defn create-mapped-type-node
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
  ^js [literal]
  (.createLiteralTypeNode typescript/factory literal))

(defn update-literal-type-node
  ^js [node literal]
  (.updateLiteralTypeNode typescript/factory node literal))

(defn create-template-literal-type
  ^js [head template-spans]
  (.createTemplateLiteralType typescript/factory head template-spans))

(defn update-template-literal-type
  ^js [node head template-spans]
  (.updateTemplateLiteralType typescript/factory node head template-spans))

(defn create-object-binding-pattern
  ^js [elements]
  (.createObjectBindingPattern typescript/factory elements))

(defn update-object-binding-pattern
  ^js [node elements]
  (.updateObjectBindingPattern typescript/factory node elements))

(defn create-array-binding-pattern
  ^js [elements]
  (.createArrayBindingPattern typescript/factory elements))

(defn update-array-binding-pattern
  ^js [node elements]
  (.updateArrayBindingPattern typescript/factory node elements))

(defn create-binding-element
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
  (^js []
   (.createArrayLiteralExpression typescript/factory))
  (^js [elements]
   (.createArrayLiteralExpression typescript/factory elements))
  (^js [elements multi-line?]
   (.createArrayLiteralExpression typescript/factory elements multi-line?)))

(defn update-array-literal-expression
  ^js [node elements]
  (.updateArrayLiteralExpression typescript/factory node elements))

(defn create-object-literal-expression
  (^js []
   (.createObjectLiteralExpression typescript/factory))
  (^js [properties]
   (.createObjectLiteralExpression typescript/factory properties))
  (^js [properties multi-line?]
   (.createObjectLiteralExpression typescript/factory properties multi-line?)))

(defn update-object-literal-expression
  ^js [node properties]
  (.updateObjectLiteralExpression typescript/factory node properties))

(defn create-property-access-expression
  ^js [expression name]
  (.createPropertyAccessExpression typescript/factory expression name))

(defn update-property-access-expression
  ^js [node expression name]
  (.updatePropertyAccessExpression typescript/factory node expression name))

(defn create-property-access-chain
  (^js [expression]
   (.createPropertyAccessChain typescript/factory expression))
  (^js [expression question-dot-token]
   (.createPropertyAccessChain typescript/factory expression question-dot-token))
  (^js [expression question-dot-token name]
   (.createPropertyAccessChain typescript/factory expression question-dot-token name)))

(defn update-property-access-chain
  (^js [node expression]
   (.updatePropertyAccessChain typescript/factory node expression))
  (^js [node expression question-dot-token]
   (.updatePropertyAccessChain typescript/factory node expression question-dot-token))
  (^js [node expression question-dot-token name]
   (.updatePropertyAccessChain typescript/factory node expression question-dot-token name)))

(defn create-element-access-expression
  ^js [expression index]
  (.createElementAccessExpression typescript/factory expression index))

(defn update-element-access-expression
  ^js [node expression argument-expression]
  (.updateElementAccessExpression typescript/factory node expression argument-expression))

(defn create-element-access-chain
  (^js [expression]
   (.createElementAccessChain typescript/factory expression))
  (^js [expression question-dot-token]
   (.createElementAccessChain typescript/factory expression question-dot-token))
  (^js [expression question-dot-token index]
   (.createElementAccessChain typescript/factory expression question-dot-token index)))

(defn update-element-access-chain
  (^js [node expression]
   (.updateElementAccessChain typescript/factory node expression))
  (^js [node expression question-dot-token]
   (.updateElementAccessChain typescript/factory node expression question-dot-token))
  (^js [node expression question-dot-token argument-expression]
   (.updateElementAccessChain typescript/factory node expression question-dot-token argument-expression)))

(defn create-call-expression
  (^js [expression]
   (.createCallExpression typescript/factory expression))
  (^js [expression type-arguments]
   (.createCallExpression typescript/factory expression type-arguments))
  (^js [expression type-arguments arguments-array]
   (.createCallExpression typescript/factory expression type-arguments arguments-array)))

(defn update-call-expression
  (^js [node expression]
   (.updateCallExpression typescript/factory node expression))
  (^js [node expression type-arguments]
   (.updateCallExpression typescript/factory node expression type-arguments))
  (^js [node expression type-arguments arguments-array]
   (.updateCallExpression typescript/factory node expression type-arguments arguments-array)))

(defn create-call-chain
  (^js [expression]
   (.createCallChain typescript/factory expression))
  (^js [expression question-dot-token]
   (.createCallChain typescript/factory expression question-dot-token))
  (^js [expression question-dot-token type-arguments]
   (.createCallChain typescript/factory expression question-dot-token type-arguments))
  (^js [expression question-dot-token type-arguments arguments-array]
   (.createCallChain typescript/factory expression question-dot-token type-arguments arguments-array)))

(defn update-call-chain
  (^js [node expression]
   (.updateCallChain typescript/factory node expression))
  (^js [node expression question-dot-token]
   (.updateCallChain typescript/factory node expression question-dot-token))
  (^js [node expression question-dot-token type-arguments]
   (.updateCallChain typescript/factory node expression question-dot-token type-arguments))
  (^js [node expression question-dot-token type-arguments arguments-array]
   (.updateCallChain typescript/factory node expression question-dot-token type-arguments arguments-array)))

(defn create-new-expression
  (^js [expression]
   (.createNewExpression typescript/factory expression))
  (^js [expression type-arguments]
   (.createNewExpression typescript/factory expression type-arguments))
  (^js [expression type-arguments arguments-array]
   (.createNewExpression typescript/factory expression type-arguments arguments-array)))

(defn update-new-expression
  (^js [node expression]
   (.updateNewExpression typescript/factory node expression))
  (^js [node expression type-arguments]
   (.updateNewExpression typescript/factory node expression type-arguments))
  (^js [node expression type-arguments arguments-array]
   (.updateNewExpression typescript/factory node expression type-arguments arguments-array)))

(defn create-tagged-template-expression
  (^js [tag]
   (.createTaggedTemplateExpression typescript/factory tag))
  (^js [tag type-arguments]
   (.createTaggedTemplateExpression typescript/factory tag type-arguments))
  (^js [tag type-arguments template]
   (.createTaggedTemplateExpression typescript/factory tag type-arguments template)))

(defn update-tagged-template-expression
  (^js [node tag]
   (.updateTaggedTemplateExpression typescript/factory node tag))
  (^js [node tag type-arguments]
   (.updateTaggedTemplateExpression typescript/factory node tag type-arguments))
  (^js [node tag type-arguments template]
   (.updateTaggedTemplateExpression typescript/factory node tag type-arguments template)))

(defn create-type-assertion
  ^js [type expression]
  (.createTypeAssertion typescript/factory type expression))

(defn update-type-assertion
  ^js [node type expression]
  (.updateTypeAssertion typescript/factory node type expression))

(defn create-parenthesized-expression
  ^js [expression]
  (.createParenthesizedExpression typescript/factory expression))

(defn update-parenthesized-expression
  ^js [node expression]
  (.updateParenthesizedExpression typescript/factory node expression))

(defn create-function-expression
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
  ^js [expression]
  (.createDeleteExpression typescript/factory expression))

(defn update-delete-expression
  ^js [node expression]
  (.updateDeleteExpression typescript/factory node expression))

(defn create-type-of-expression
  ^js [expression]
  (.createTypeOfExpression typescript/factory expression))

(defn update-type-of-expression
  ^js [node expression]
  (.updateTypeOfExpression typescript/factory node expression))

(defn create-void-expression
  ^js [expression]
  (.createVoidExpression typescript/factory expression))

(defn update-void-expression
  ^js [node expression]
  (.updateVoidExpression typescript/factory node expression))

(defn create-await-expression
  ^js [expression]
  (.createAwaitExpression typescript/factory expression))

(defn update-await-expression
  ^js [node expression]
  (.updateAwaitExpression typescript/factory node expression))

(defn create-prefix-unary-expression
  ^js [operator operand]
  (.createPrefixUnaryExpression typescript/factory operator operand))

(defn update-prefix-unary-expression
  ^js [node operand]
  (.updatePrefixUnaryExpression typescript/factory node operand))

(defn create-postfix-unary-expression
  ^js [operand operator]
  (.createPostfixUnaryExpression typescript/factory operand operator))

(defn update-postfix-unary-expression
  ^js [node operand]
  (.updatePostfixUnaryExpression typescript/factory node operand))

(defn create-binary-expression
  ^js [left operator right]
  (.createBinaryExpression typescript/factory left operator right))

(defn update-binary-expression
  ^js [node left operator right]
  (.updateBinaryExpression typescript/factory node left operator right))

(defn create-conditional-expression
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
  ^js [node condition question-token when-true colon-token when-false]
  (.updateConditionalExpression typescript/factory node condition question-token when-true colon-token when-false))

(defn create-template-expression
  ^js [head template-spans]
  (.createTemplateExpression typescript/factory head template-spans))

(defn update-template-expression
  ^js [node head template-spans]
  (.updateTemplateExpression typescript/factory node head template-spans))

(defn create-template-head
  (^js []
   (.createTemplateHead typescript/factory))
  (^js [text]
   (.createTemplateHead typescript/factory text))
  (^js [text raw-text]
   (.createTemplateHead typescript/factory text raw-text))
  (^js [text raw-text template-flags]
   (.createTemplateHead typescript/factory text raw-text template-flags)))

(defn create-template-middle
  (^js []
   (.createTemplateMiddle typescript/factory))
  (^js [text]
   (.createTemplateMiddle typescript/factory text))
  (^js [text raw-text]
   (.createTemplateMiddle typescript/factory text raw-text))
  (^js [text raw-text template-flags]
   (.createTemplateMiddle typescript/factory text raw-text template-flags)))

(defn create-template-tail
  (^js []
   (.createTemplateTail typescript/factory))
  (^js [text]
   (.createTemplateTail typescript/factory text))
  (^js [text raw-text]
   (.createTemplateTail typescript/factory text raw-text))
  (^js [text raw-text template-flags]
   (.createTemplateTail typescript/factory text raw-text template-flags)))

(defn create-no-substitution-template-literal
  (^js []
   (.createNoSubstitutionTemplateLiteral typescript/factory))
  (^js [text]
   (.createNoSubstitutionTemplateLiteral typescript/factory text))
  (^js [text raw-text]
   (.createNoSubstitutionTemplateLiteral typescript/factory text raw-text)))

(defn create-yield-expression
  (^js []
   (.createYieldExpression typescript/factory))
  (^js [asterisk-token]
   (.createYieldExpression typescript/factory asterisk-token))
  (^js [asterisk-token expression]
   (.createYieldExpression typescript/factory asterisk-token expression)))

(defn update-yield-expression
  (^js [node]
   (.updateYieldExpression typescript/factory node))
  (^js [node asterisk-token]
   (.updateYieldExpression typescript/factory node asterisk-token))
  (^js [node asterisk-token expression]
   (.updateYieldExpression typescript/factory node asterisk-token expression)))

(defn create-spread-element
  ^js [expression]
  (.createSpreadElement typescript/factory expression))

(defn update-spread-element
  ^js [node expression]
  (.updateSpreadElement typescript/factory node expression))

(defn create-class-expression
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers name]
               [decorators modifiers name type-parameters]
               [decorators modifiers name type-parameters heritage-clauses]
               [decorators modifiers name type-parameters heritage-clauses members]
               [modifiers]
               [modifiers name]
               [modifiers name type-parameters]
               [modifiers name type-parameters heritage-clauses]
               [modifiers name type-parameters heritage-clauses members])}
  (^js []
   (.createClassExpression typescript/factory))
  (^js [a]
   (.createClassExpression typescript/factory a))
  (^js [a b]
   (.createClassExpression typescript/factory a b))
  (^js [a b c]
   (.createClassExpression typescript/factory a b c))
  (^js [a b c d]
   (.createClassExpression typescript/factory a b c d))
  (^js [a b c d e]
   (.createClassExpression typescript/factory a b c d e))
  (^js [decorators modifiers name type-parameters heritage-clauses members]
   (.createClassExpression typescript/factory decorators modifiers name type-parameters heritage-clauses members)))

(defn update-class-expression
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers name]
               [node decorators modifiers name type-parameters]
               [node decorators modifiers name type-parameters heritage-clauses]
               [node decorators modifiers name type-parameters heritage-clauses members]
               [node modifiers]
               [node modifiers name]
               [node modifiers name type-parameters]
               [node modifiers name type-parameters heritage-clauses]
               [node modifiers name type-parameters heritage-clauses members])}
  (^js [node]
   (.updateClassExpression typescript/factory node))
  (^js [a b]
   (.updateClassExpression typescript/factory a b))
  (^js [a b c]
   (.updateClassExpression typescript/factory a b c))
  (^js [a b c d]
   (.updateClassExpression typescript/factory a b c d))
  (^js [a b c d e]
   (.updateClassExpression typescript/factory a b c d e))
  (^js [a b c d e f]
   (.updateClassExpression typescript/factory a b c d e f))
  (^js [node decorators modifiers name type-parameters heritage-clauses members]
   (.updateClassExpression typescript/factory node decorators modifiers name type-parameters heritage-clauses members)))

(defn create-omitted-expression
  ^js []
  (.createOmittedExpression typescript/factory))

(defn create-expression-with-type-arguments
  (^js [expression]
   (.createExpressionWithTypeArguments typescript/factory expression))
  (^js [expression type-arguments]
   (.createExpressionWithTypeArguments typescript/factory expression type-arguments)))

(defn update-expression-with-type-arguments
  (^js [node expression]
   (.updateExpressionWithTypeArguments typescript/factory node expression))
  (^js [node expression type-arguments]
   (.updateExpressionWithTypeArguments typescript/factory node expression type-arguments)))

(defn create-as-expression
  ^js [expression type]
  (.createAsExpression typescript/factory expression type))

(defn update-as-expression
  ^js [node expression type]
  (.updateAsExpression typescript/factory node expression type))

(defn create-non-null-expression
  ^js [expression]
  (.createNonNullExpression typescript/factory expression))

(defn update-non-null-expression
  ^js [node expression]
  (.updateNonNullExpression typescript/factory node expression))

(defn create-non-null-chain
  ^js [expression]
  (.createNonNullChain typescript/factory expression))

(defn update-non-null-chain
  ^js [node expression]
  (.updateNonNullChain typescript/factory node expression))

(defn create-meta-property
  ^js [keyword-token name]
  (.createMetaProperty typescript/factory keyword-token name))

(defn update-meta-property
  ^js [node name]
  (.updateMetaProperty typescript/factory node name))

(defn create-template-span
  ^js [expression literal]
  (.createTemplateSpan typescript/factory expression literal))

(defn update-template-span
  ^js [node expression literal]
  (.updateTemplateSpan typescript/factory node expression literal))

(defn create-semicolon-class-element
  ^js []
  (.createSemicolonClassElement typescript/factory))

(defn create-block
  (^js [statements]
   (.createBlock typescript/factory statements))
  (^js [statements multi-line?]
   (.createBlock typescript/factory statements multi-line?)))

(defn update-block
  ^js [node statements]
  (.updateBlock typescript/factory node statements))

(defn create-variable-statement
  (^js []
   (.createVariableStatement typescript/factory))
  (^js [modifiers]
   (.createVariableStatement typescript/factory modifiers))
  (^js [modifiers declaration-list]
   (.createVariableStatement typescript/factory modifiers declaration-list)))

(defn update-variable-statement
  (^js [node]
   (.updateVariableStatement typescript/factory node))
  (^js [node modifiers]
   (.updateVariableStatement typescript/factory node modifiers))
  (^js [node modifiers declaration-list]
   (.updateVariableStatement typescript/factory node modifiers declaration-list)))

(defn create-empty-statement
  ^js []
  (.createEmptyStatement typescript/factory))

(defn create-expression-statement
  ^js [expression]
  (.createExpressionStatement typescript/factory expression))

(defn update-expression-statement
  ^js [node expression]
  (.updateExpressionStatement typescript/factory node expression))

(defn create-if-statement
  (^js [expression then-statement]
   (.createIfStatement typescript/factory expression then-statement))
  (^js [expression then-statement else-statement]
   (.createIfStatement typescript/factory expression then-statement else-statement)))

(defn update-if-statement
  (^js [node expression then-statement]
   (.updateIfStatement typescript/factory node expression then-statement))
  (^js [node expression then-statement else-statement]
   (.updateIfStatement typescript/factory node expression then-statement else-statement)))

(defn create-do-statement
  ^js [statement expression]
  (.createDoStatement typescript/factory statement expression))

(defn update-do-statement
  ^js [node statement expression]
  (.updateDoStatement typescript/factory node statement expression))

(defn create-while-statement
  ^js [expression statement]
  (.createWhileStatement typescript/factory expression statement))

(defn update-while-statement
  ^js [node expression statement]
  (.updateWhileStatement typescript/factory node expression statement))

(defn create-for-statement
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
  ^js [initializer expression statement]
  (.createForInStatement typescript/factory initializer expression statement))

(defn update-for-in-statement
  ^js [node initializer expression statement]
  (.updateForInStatement typescript/factory node initializer expression statement))

(defn create-for-of-statement
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
  (^js []
   (.createContinueStatement typescript/factory))
  (^js [label]
   (.createContinueStatement typescript/factory label)))

(defn update-continue-statement
  (^js [node]
   (.updateContinueStatement typescript/factory node))
  (^js [node label]
   (.updateContinueStatement typescript/factory node label)))

(defn create-break-statement
  (^js []
   (.createBreakStatement typescript/factory))
  (^js [label]
   (.createBreakStatement typescript/factory label)))

(defn update-break-statement
  (^js [node]
   (.updateBreakStatement typescript/factory node))
  (^js [node label]
   (.updateBreakStatement typescript/factory node label)))

(defn create-return-statement
  (^js []
   (.createReturnStatement typescript/factory))
  (^js [expression]
   (.createReturnStatement typescript/factory expression)))

(defn update-return-statement
  (^js [node]
   (.updateReturnStatement typescript/factory node))
  (^js [node expression]
   (.updateReturnStatement typescript/factory node expression)))

(defn create-with-statement
  ^js [expression statement]
  (.createWithStatement typescript/factory expression statement))

(defn update-with-statement
  ^js [node expression statement]
  (.updateWithStatement typescript/factory node expression statement))

(defn create-switch-statement
  ^js [expression case-block]
  (.createSwitchStatement typescript/factory expression case-block))

(defn update-switch-statement
  ^js [node expression case-block]
  (.updateSwitchStatement typescript/factory node expression case-block))

(defn create-labeled-statement
  ^js [label statement]
  (.createLabeledStatement typescript/factory label statement))

(defn update-labeled-statement
  ^js [node label statement]
  (.updateLabeledStatement typescript/factory node label statement))

(defn create-throw-statement
  ^js [expression]
  (.createThrowStatement typescript/factory expression))

(defn update-throw-statement
  ^js [node expression]
  (.updateThrowStatement typescript/factory node expression))

(defn create-try-statement
  (^js [try-block]
   (.createTryStatement typescript/factory try-block))
  (^js [try-block catch-clause]
   (.createTryStatement typescript/factory try-block catch-clause))
  (^js [try-block catch-clause finally-block]
   (.createTryStatement typescript/factory try-block catch-clause finally-block)))

(defn update-try-statement
  (^js [node try-block]
   (.updateTryStatement typescript/factory node try-block))
  (^js [node try-block catch-clause]
   (.updateTryStatement typescript/factory node try-block catch-clause))
  (^js [node try-block catch-clause finally-block]
   (.updateTryStatement typescript/factory node try-block catch-clause finally-block)))

(defn create-debugger-statement
  ^js []
  (.createDebuggerStatement typescript/factory))

(defn create-variable-declaration
  (^js [name]
   (.createVariableDeclaration typescript/factory name))
  (^js [name exclamation-token]
   (.createVariableDeclaration typescript/factory name exclamation-token))
  (^js [name exclamation-token type]
   (.createVariableDeclaration typescript/factory name exclamation-token type))
  (^js [name exclamation-token type initializer]
   (.createVariableDeclaration typescript/factory name exclamation-token type initializer)))

(defn update-variable-declaration
  (^js [node name]
   (.updateVariableDeclaration typescript/factory node name))
  (^js [node name exclamation-token]
   (.updateVariableDeclaration typescript/factory node name exclamation-token))
  (^js [node name exclamation-token type]
   (.updateVariableDeclaration typescript/factory node name exclamation-token type))
  (^js [node name exclamation-token type initializer]
   (.updateVariableDeclaration typescript/factory node name exclamation-token type initializer)))

(defn create-variable-declaration-list
  (^js [declarations]
   (.createVariableDeclarationList typescript/factory declarations))
  (^js [declarations flags]
   (.createVariableDeclarationList typescript/factory declarations flags)))

(defn update-variable-declaration-list
  ^js [node declarations]
  (.updateVariableDeclarationList typescript/factory node declarations))

(defn create-function-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers asterisk-token]
               [decorators modifiers asterisk-token name]
               [decorators modifiers asterisk-token name type-parameters]
               [decorators modifiers asterisk-token name type-parameters parameters]
               [decorators modifiers asterisk-token name type-parameters parameters type]
               [decorators modifiers asterisk-token name type-parameters parameters type body]
               [modifiers]
               [modifiers asterisk-token]
               [modifiers asterisk-token name]
               [modifiers asterisk-token name type-parameters]
               [modifiers asterisk-token name type-parameters parameters]
               [modifiers asterisk-token name type-parameters parameters type]
               [modifiers asterisk-token name type-parameters parameters type body])}
  (^js []
   (.createFunctionDeclaration typescript/factory))
  (^js [a]
   (.createFunctionDeclaration typescript/factory a))
  (^js [a b]
   (.createFunctionDeclaration typescript/factory a b))
  (^js [a b c]
   (.createFunctionDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createFunctionDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.createFunctionDeclaration typescript/factory a b c d e))
  (^js [a b c d e f]
   (.createFunctionDeclaration typescript/factory a b c d e f))
  (^js [a b c d e f g]
   (.createFunctionDeclaration typescript/factory a b c d e f g))
  (^js [decorators modifiers asterisk-token name type-parameters parameters type body]
   (.createFunctionDeclaration typescript/factory decorators modifiers asterisk-token name type-parameters parameters type body)))

(defn update-function-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers asterisk-token]
               [node decorators modifiers asterisk-token name]
               [node decorators modifiers asterisk-token name type-parameters]
               [node decorators modifiers asterisk-token name type-parameters parameters]
               [node decorators modifiers asterisk-token name type-parameters parameters type]
               [node decorators modifiers asterisk-token name type-parameters parameters type body]
               [node modifiers]
               [node modifiers asterisk-token]
               [node modifiers asterisk-token name]
               [node modifiers asterisk-token name type-parameters]
               [node modifiers asterisk-token name type-parameters parameters]
               [node modifiers asterisk-token name type-parameters parameters type]
               [node modifiers asterisk-token name type-parameters parameters type body])}
  (^js [node]
   (.updateFunctionDeclaration typescript/factory node))
  (^js [a b]
   (.updateFunctionDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateFunctionDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateFunctionDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updateFunctionDeclaration typescript/factory a b c d e))
  (^js [a b c d e f]
   (.updateFunctionDeclaration typescript/factory a b c d e f))
  (^js [a b c d e f g]
   (.updateFunctionDeclaration typescript/factory a b c d e f g))
  (^js [a b c d e f g h]
   (.updateFunctionDeclaration typescript/factory a b c d e f g h))
  (^js [node decorators modifiers asterisk-token name type-parameters parameters type body]
   (.updateFunctionDeclaration typescript/factory node decorators modifiers asterisk-token name type-parameters parameters type body)))

(defn create-class-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers name]
               [decorators modifiers name type-parameters]
               [decorators modifiers name type-parameters heritage-clauses]
               [decorators modifiers name type-parameters heritage-clauses members]
               [modifiers]
               [modifiers name]
               [modifiers name type-parameters]
               [modifiers name type-parameters heritage-clauses]
               [modifiers name type-parameters heritage-clauses members])}
  (^js []
   (.createClassDeclaration typescript/factory))
  (^js [a]
   (.createClassDeclaration typescript/factory a))
  (^js [a b]
   (.createClassDeclaration typescript/factory a b))
  (^js [a b c]
   (.createClassDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createClassDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.createClassDeclaration typescript/factory a b c d e))
  (^js [decorators modifiers name type-parameters heritage-clauses members]
   (.createClassDeclaration typescript/factory decorators modifiers name type-parameters heritage-clauses members)))

(defn update-class-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers name]
               [node decorators modifiers name type-parameters]
               [node decorators modifiers name type-parameters heritage-clauses]
               [node decorators modifiers name type-parameters heritage-clauses members]
               [node modifiers]
               [node modifiers name]
               [node modifiers name type-parameters]
               [node modifiers name type-parameters heritage-clauses]
               [node modifiers name type-parameters heritage-clauses members])}
  (^js [node]
   (.updateClassDeclaration typescript/factory node))
  (^js [a b]
   (.updateClassDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateClassDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateClassDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updateClassDeclaration typescript/factory a b c d e))
  (^js [a b c d e f]
   (.updateClassDeclaration typescript/factory a b c d e f))
  (^js [node decorators modifiers name type-parameters heritage-clauses members]
   (.updateClassDeclaration typescript/factory node decorators modifiers name type-parameters heritage-clauses members)))

(defn create-interface-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers name]
               [decorators modifiers name type-parameters]
               [decorators modifiers name type-parameters heritage-clauses]
               [decorators modifiers name type-parameters heritage-clauses members]
               [modifiers]
               [modifiers name]
               [modifiers name type-parameters]
               [modifiers name type-parameters heritage-clauses]
               [modifiers name type-parameters heritage-clauses members])}
  (^js []
   (.createInterfaceDeclaration typescript/factory))
  (^js [a]
   (.createInterfaceDeclaration typescript/factory a))
  (^js [a b]
   (.createInterfaceDeclaration typescript/factory a b))
  (^js [a b c]
   (.createInterfaceDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createInterfaceDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.createInterfaceDeclaration typescript/factory a b c d e))
  (^js [decorators modifiers name type-parameters heritage-clauses members]
   (.createInterfaceDeclaration typescript/factory decorators modifiers name type-parameters heritage-clauses members)))

(defn update-interface-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers name]
               [node decorators modifiers name type-parameters]
               [node decorators modifiers name type-parameters heritage-clauses]
               [node decorators modifiers name type-parameters heritage-clauses members]
               [node modifiers]
               [node modifiers name]
               [node modifiers name type-parameters]
               [node modifiers name type-parameters heritage-clauses]
               [node modifiers name type-parameters heritage-clauses members])}
  (^js [node]
   (.updateInterfaceDeclaration typescript/factory node))
  (^js [a b]
   (.updateInterfaceDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateInterfaceDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateInterfaceDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updateInterfaceDeclaration typescript/factory a b c d e))
  (^js [a b c d e f]
   (.updateInterfaceDeclaration typescript/factory a b c d e f))
  (^js [node decorators modifiers name type-parameters heritage-clauses members]
   (.updateInterfaceDeclaration typescript/factory node decorators modifiers name type-parameters heritage-clauses members)))

(defn create-type-alias-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers name]
               [decorators modifiers name type-parameters]
               [decorators modifiers name type-parameters type]
               [modifiers]
               [modifiers name]
               [modifiers name type-parameters]
               [modifiers name type-parameters type])}
  (^js []
   (.createTypeAliasDeclaration typescript/factory))
  (^js [a]
   (.createTypeAliasDeclaration typescript/factory a))
  (^js [a b]
   (.createTypeAliasDeclaration typescript/factory a b))
  (^js [a b c]
   (.createTypeAliasDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createTypeAliasDeclaration typescript/factory a b c d))
  (^js [decorators modifiers name type-parameters type]
   (.createTypeAliasDeclaration typescript/factory decorators modifiers name type-parameters type)))

(defn update-type-alias-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers name]
               [node decorators modifiers name type-parameters]
               [node decorators modifiers name type-parameters type]
               [node modifiers]
               [node modifiers name]
               [node modifiers name type-parameters]
               [node modifiers name type-parameters type])}
  (^js [node]
   (.updateTypeAliasDeclaration typescript/factory node))
  (^js [a b]
   (.updateTypeAliasDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateTypeAliasDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateTypeAliasDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updateTypeAliasDeclaration typescript/factory a b c d e))
  (^js [node decorators modifiers name type-parameters type]
   (.updateTypeAliasDeclaration typescript/factory node decorators modifiers name type-parameters type)))

(defn create-enum-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers name]
               [decorators modifiers name members]
               [modifiers]
               [modifiers name]
               [modifiers name members])}
  (^js []
   (.createEnumDeclaration typescript/factory))
  (^js [a]
   (.createEnumDeclaration typescript/factory a))
  (^js [a b]
   (.createEnumDeclaration typescript/factory a b))
  (^js [a b c]
   (.createEnumDeclaration typescript/factory a b c))
  (^js [decorators modifiers name members]
   (.createEnumDeclaration typescript/factory decorators modifiers name members)))

(defn update-enum-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers name]
               [node decorators modifiers name members]
               [node modifiers]
               [node modifiers name]
               [node modifiers name members])}
  (^js [node]
   (.updateEnumDeclaration typescript/factory node))
  (^js [a b]
   (.updateEnumDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateEnumDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateEnumDeclaration typescript/factory a b c d))
  (^js [node decorators modifiers name members]
   (.updateEnumDeclaration typescript/factory node decorators modifiers name members)))

(defn create-module-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers name]
               [decorators modifiers name body]
               [decorators modifiers name body flags]
               [modifiers]
               [modifiers name]
               [modifiers name body]
               [modifiers name body flags])}
  (^js []
   (.createModuleDeclaration typescript/factory))
  (^js [a]
   (.createModuleDeclaration typescript/factory a))
  (^js [a b]
   (.createModuleDeclaration typescript/factory a b))
  (^js [a b c]
   (.createModuleDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createModuleDeclaration typescript/factory a b c d))
  (^js [decorators modifiers name body flags]
   (.createModuleDeclaration typescript/factory decorators modifiers name body flags)))

(defn update-module-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers name]
               [node decorators modifiers name body]
               [node modifiers]
               [node modifiers name]
               [node modifiers name body])}
  (^js [node]
   (.updateModuleDeclaration typescript/factory node))
  (^js [a b]
   (.updateModuleDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateModuleDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateModuleDeclaration typescript/factory a b c d))
  (^js [node decorators modifiers name body]
   (.updateModuleDeclaration typescript/factory node decorators modifiers name body)))

(defn create-module-block
  ^js [statements]
  (.createModuleBlock typescript/factory statements))

(defn update-module-block
  ^js [node statements]
  (.updateModuleBlock typescript/factory node statements))

(defn create-case-block
  ^js [clauses]
  (.createCaseBlock typescript/factory clauses))

(defn update-case-block
  ^js [node clauses]
  (.updateCaseBlock typescript/factory node clauses))

(defn create-namespace-export-declaration
  ^js [name]
  (.createNamespaceExportDeclaration typescript/factory name))

(defn update-namespace-export-declaration
  ^js [node name]
  (.updateNamespaceExportDeclaration typescript/factory node name))

(defn create-import-equals-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers type-only?]
               [decorators modifiers type-only? name]
               [decorators modifiers type-only? name module-reference]
               [modifiers]
               [modifiers type-only?]
               [modifiers type-only? name]
               [modifiers type-only? name module-reference])}
  (^js []
   (.createImportEqualsDeclaration typescript/factory))
  (^js [a]
   (.createImportEqualsDeclaration typescript/factory a))
  (^js [a b]
   (.createImportEqualsDeclaration typescript/factory a b))
  (^js [a b c]
   (.createImportEqualsDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createImportEqualsDeclaration typescript/factory a b c d))
  (^js [decorators modifiers type-only? name module-reference]
   (.createImportEqualsDeclaration typescript/factory decorators modifiers type-only? name module-reference)))

(defn update-import-equals-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers type-only?]
               [node decorators modifiers type-only? name]
               [node decorators modifiers type-only? name module-reference]
               [node modifiers]
               [node modifiers type-only?]
               [node modifiers type-only? name]
               [node modifiers type-only? name module-reference])}
  (^js [node]
   (.updateImportEqualsDeclaration typescript/factory node))
  (^js [a b]
   (.updateImportEqualsDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateImportEqualsDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateImportEqualsDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updateImportEqualsDeclaration typescript/factory a b c d e))
  (^js [node decorators modifiers type-only? name module-reference]
   (.updateImportEqualsDeclaration typescript/factory node decorators modifiers type-only? name module-reference)))

(defn create-import-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers import-clause]
               [decorators modifiers import-clause module-specifier]
               [decorators modifiers import-clause module-specifier assert-clause]
               [modifiers]
               [modifiers import-clause]
               [modifiers import-clause module-specifier]
               [modifiers import-clause module-specifier assert-clause])}
  (^js []
   (.createImportDeclaration typescript/factory))
  (^js [a]
   (.createImportDeclaration typescript/factory a))
  (^js [a b]
   (.createImportDeclaration typescript/factory a b))
  (^js [a b c]
   (.createImportDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createImportDeclaration typescript/factory a b c d))
  (^js [decorators modifiers import-clause module-specifier assert-clause]
   (.createImportDeclaration typescript/factory decorators modifiers import-clause module-specifier assert-clause)))

(defn update-import-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers import-clause]
               [node decorators modifiers import-clause module-specifier]
               [node decorators modifiers import-clause module-specifier assert-clause]
               [node modifiers]
               [node modifiers import-clause]
               [node modifiers import-clause module-specifier]
               [node modifiers import-clause module-specifier assert-clause])}
  (^js [node]
   (.updateImportDeclaration typescript/factory node))
  (^js [a b]
   (.updateImportDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateImportDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateImportDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updateImportDeclaration typescript/factory a b c d e))
  (^js [node decorators modifiers import-clause module-specifier assert-clause]
   (.updateImportDeclaration typescript/factory node decorators modifiers import-clause module-specifier assert-clause)))

(defn create-import-clause
  (^js [type-only?]
   (.createImportClause typescript/factory type-only?))
  (^js [type-only? name]
   (.createImportClause typescript/factory type-only? name))
  (^js [type-only? name named-bindings]
   (.createImportClause typescript/factory type-only? name named-bindings)))

(defn update-import-clause
  (^js [node type-only?]
   (.updateImportClause typescript/factory node type-only?))
  (^js [node type-only? name]
   (.updateImportClause typescript/factory node type-only? name))
  (^js [node type-only? name named-bindings]
   (.updateImportClause typescript/factory node type-only? name named-bindings)))

(defn create-assert-clause
  (^js [elements]
   (.createAssertClause typescript/factory elements))
  (^js [elements multi-line?]
   (.createAssertClause typescript/factory elements multi-line?)))

(defn update-assert-clause
  (^js [node elements]
   (.updateAssertClause typescript/factory node elements))
  (^js [node elements multi-line?]
   (.updateAssertClause typescript/factory node elements multi-line?)))

(defn create-assert-entry
  ^js [name value]
  (.createAssertEntry typescript/factory name value))

(defn update-assert-entry
  ^js [node name value]
  (.updateAssertEntry typescript/factory node name value))

(defn create-import-type-assertion-container
  (^js [clause]
   (.createImportTypeAssertionContainer typescript/factory clause))
  (^js [clause multi-line?]
   (.createImportTypeAssertionContainer typescript/factory clause multi-line?)))

(defn update-import-type-assertion-container
  (^js [node clause]
   (.updateImportTypeAssertionContainer typescript/factory node clause))
  (^js [node clause multi-line?]
   (.updateImportTypeAssertionContainer typescript/factory node clause multi-line?)))

(defn create-namespace-import
  ^js [name]
  (.createNamespaceImport typescript/factory name))

(defn update-namespace-import
  ^js [node name]
  (.updateNamespaceImport typescript/factory node name))

(defn create-namespace-export
  ^js [name]
  (.createNamespaceExport typescript/factory name))

(defn update-namespace-export
  ^js [node name]
  (.updateNamespaceExport typescript/factory node name))

(defn create-named-imports
  ^js [elements]
  (.createNamedImports typescript/factory elements))

(defn update-named-imports
  ^js [node elements]
  (.updateNamedImports typescript/factory node elements))

(defn create-import-specifier
  (^js [type-only?]
   (.createImportSpecifier typescript/factory type-only?))
  (^js [type-only? property-name]
   (.createImportSpecifier typescript/factory type-only? property-name))
  (^js [type-only? property-name name]
   (.createImportSpecifier typescript/factory type-only? property-name name)))

(defn update-import-specifier
  (^js [node type-only?]
   (.updateImportSpecifier typescript/factory node type-only?))
  (^js [node type-only? property-name]
   (.updateImportSpecifier typescript/factory node type-only? property-name))
  (^js [node type-only? property-name name]
   (.updateImportSpecifier typescript/factory node type-only? property-name name)))

(defn create-export-assignment
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers export-equals?]
               [decorators modifiers export-equals? expression]
               [modifiers]
               [modifiers export-equals?]
               [modifiers export-equals? expression])}
  (^js []
   (.createExportAssignment typescript/factory))
  (^js [a]
   (.createExportAssignment typescript/factory a))
  (^js [a b]
   (.createExportAssignment typescript/factory a b))
  (^js [a b c]
   (.createExportAssignment typescript/factory a b c))
  (^js [decorators modifiers export-equals? expression]
   (.createExportAssignment typescript/factory decorators modifiers export-equals? expression)))

(defn update-export-assignment
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers expression]
               [node modifiers]
               [node modifiers expression])}
  (^js [node]
   (.updateExportAssignment typescript/factory node))
  (^js [a b]
   (.updateExportAssignment typescript/factory a b))
  (^js [a b c]
   (.updateExportAssignment typescript/factory a b c))
  (^js [node decorators modifiers expression]
   (.updateExportAssignment typescript/factory node decorators modifiers expression)))

(defn create-export-declaration
  {:arglists '([]
               [decorators]
               [decorators modifiers]
               [decorators modifiers type-only?]
               [decorators modifiers type-only? export-clause]
               [decorators modifiers type-only? export-clause module-specifier]
               [decorators modifiers type-only? export-clause module-specifier assert-clause]
               [modifiers]
               [modifiers type-only?]
               [modifiers type-only? export-clause]
               [modifiers type-only? export-clause module-specifier]
               [modifiers type-only? export-clause module-specifier assert-clause])}
  (^js []
   (.createExportDeclaration typescript/factory))
  (^js [a]
   (.createExportDeclaration typescript/factory a))
  (^js [a b]
   (.createExportDeclaration typescript/factory a b))
  (^js [a b c]
   (.createExportDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.createExportDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.createExportDeclaration typescript/factory a b c d e))
  (^js [decorators modifiers type-only? export-clause module-specifier assert-clause]
   (.createExportDeclaration typescript/factory decorators modifiers type-only? export-clause module-specifier assert-clause)))

(defn update-export-declaration
  {:arglists '([node]
               [node decorators]
               [node decorators modifiers]
               [node decorators modifiers type-only?]
               [node decorators modifiers type-only? export-clause]
               [node decorators modifiers type-only? export-clause module-specifier]
               [node decorators modifiers type-only? export-clause module-specifier assert-clause]
               [node modifiers]
               [node modifiers type-only?]
               [node modifiers type-only? export-clause]
               [node modifiers type-only? export-clause module-specifier]
               [node modifiers type-only? export-clause module-specifier assert-clause])}
  (^js [node]
   (.updateExportDeclaration typescript/factory node))
  (^js [a b]
   (.updateExportDeclaration typescript/factory a b))
  (^js [a b c]
   (.updateExportDeclaration typescript/factory a b c))
  (^js [a b c d]
   (.updateExportDeclaration typescript/factory a b c d))
  (^js [a b c d e]
   (.updateExportDeclaration typescript/factory a b c d e))
  (^js [a b c d e f]
   (.updateExportDeclaration typescript/factory a b c d e f))
  (^js [node decorators modifiers type-only? export-clause module-specifier assert-clause]
   (.updateExportDeclaration typescript/factory node decorators modifiers type-only? export-clause module-specifier assert-clause)))

(defn create-named-exports
  ^js [elements]
  (.createNamedExports typescript/factory elements))

(defn update-named-exports
  ^js [node elements]
  (.updateNamedExports typescript/factory node elements))

(defn create-export-specifier
  (^js [type-only?]
   (.createExportSpecifier typescript/factory type-only?))
  (^js [type-only? property-name]
   (.createExportSpecifier typescript/factory type-only? property-name))
  (^js [type-only? property-name name]
   (.createExportSpecifier typescript/factory type-only? property-name name)))

(defn update-export-specifier
  (^js [node type-only?]
   (.updateExportSpecifier typescript/factory node type-only?))
  (^js [node type-only? property-name]
   (.updateExportSpecifier typescript/factory node type-only? property-name))
  (^js [node type-only? property-name name]
   (.updateExportSpecifier typescript/factory node type-only? property-name name)))

(defn create-external-module-reference
  ^js [expression]
  (.createExternalModuleReference typescript/factory expression))

(defn update-external-module-reference
  ^js [node expression]
  (.updateExternalModuleReference typescript/factory node expression))

(defn create-js-doc-all-type
  ^js []
  (.createJSDocAllType typescript/factory))

(defn create-js-doc-unknown-type
  ^js []
  (.createJSDocUnknownType typescript/factory))

(defn create-js-doc-non-nullable-type
  (^js [type]
   (.createJSDocNonNullableType typescript/factory type))
  (^js [type postfix?]
   (.createJSDocNonNullableType typescript/factory type postfix?)))

(defn update-js-doc-non-nullable-type
  ^js [node type]
  (.updateJSDocNonNullableType typescript/factory node type))

(defn create-js-doc-nullable-type
  (^js [type]
   (.createJSDocNullableType typescript/factory type))
  (^js [type postfix?]
   (.createJSDocNullableType typescript/factory type postfix?)))

(defn update-js-doc-nullable-type
  ^js [node type]
  (.updateJSDocNullableType typescript/factory node type))

(defn create-js-doc-optional-type
  ^js [type]
  (.createJSDocOptionalType typescript/factory type))

(defn update-js-doc-optional-type
  ^js [node type]
  (.updateJSDocOptionalType typescript/factory node type))

(defn create-js-doc-function-type
  (^js [parameters]
   (.createJSDocFunctionType typescript/factory parameters))
  (^js [parameters type]
   (.createJSDocFunctionType typescript/factory parameters type)))

(defn update-js-doc-function-type
  (^js [node parameters]
   (.updateJSDocFunctionType typescript/factory node parameters))
  (^js [node parameters type]
   (.updateJSDocFunctionType typescript/factory node parameters type)))

(defn create-js-doc-variadic-type
  ^js [type]
  (.createJSDocVariadicType typescript/factory type))

(defn update-js-doc-variadic-type
  ^js [node type]
  (.updateJSDocVariadicType typescript/factory node type))

(defn create-js-doc-namepath-type
  ^js [type]
  (.createJSDocNamepathType typescript/factory type))

(defn update-js-doc-namepath-type
  ^js [node type]
  (.updateJSDocNamepathType typescript/factory node type))

(defn create-js-doc-type-expression
  ^js [type]
  (.createJSDocTypeExpression typescript/factory type))

(defn update-js-doc-type-expression
  ^js [node type]
  (.updateJSDocTypeExpression typescript/factory node type))

(defn create-js-doc-name-reference
  ^js [name]
  (.createJSDocNameReference typescript/factory name))

(defn update-js-doc-name-reference
  ^js [node name]
  (.updateJSDocNameReference typescript/factory node name))

(defn create-js-doc-member-name
  ^js [left right]
  (.createJSDocMemberName typescript/factory left right))

(defn update-js-doc-member-name
  ^js [node left right]
  (.updateJSDocMemberName typescript/factory node left right))

(defn create-js-doc-link
  (^js []
   (.createJSDocLink typescript/factory))
  (^js [name]
   (.createJSDocLink typescript/factory name))
  (^js [name text]
   (.createJSDocLink typescript/factory name text)))

(defn update-js-doc-link
  (^js [node]
   (.updateJSDocLink typescript/factory node))
  (^js [node name]
   (.updateJSDocLink typescript/factory node name))
  (^js [node name text]
   (.updateJSDocLink typescript/factory node name text)))

(defn create-js-doc-link-code
  (^js []
   (.createJSDocLinkCode typescript/factory))
  (^js [name]
   (.createJSDocLinkCode typescript/factory name))
  (^js [name text]
   (.createJSDocLinkCode typescript/factory name text)))

(defn update-js-doc-link-code
  (^js [node]
   (.updateJSDocLinkCode typescript/factory node))
  (^js [node name]
   (.updateJSDocLinkCode typescript/factory node name))
  (^js [node name text]
   (.updateJSDocLinkCode typescript/factory node name text)))

(defn create-js-doc-link-plain
  (^js []
   (.createJSDocLinkPlain typescript/factory))
  (^js [name]
   (.createJSDocLinkPlain typescript/factory name))
  (^js [name text]
   (.createJSDocLinkPlain typescript/factory name text)))

(defn update-js-doc-link-plain
  (^js [node]
   (.updateJSDocLinkPlain typescript/factory node))
  (^js [node name]
   (.updateJSDocLinkPlain typescript/factory node name))
  (^js [node name text]
   (.updateJSDocLinkPlain typescript/factory node name text)))

(defn create-js-doc-type-literal
  (^js []
   (.createJSDocTypeLiteral typescript/factory))
  (^js [js-doc-property-tags]
   (.createJSDocTypeLiteral typescript/factory js-doc-property-tags))
  (^js [js-doc-property-tags array-type?]
   (.createJSDocTypeLiteral typescript/factory js-doc-property-tags array-type?)))

(defn update-js-doc-type-literal
  (^js [node]
   (.updateJSDocTypeLiteral typescript/factory node))
  (^js [node js-doc-property-tags]
   (.updateJSDocTypeLiteral typescript/factory node js-doc-property-tags))
  (^js [node js-doc-property-tags array-type?]
   (.updateJSDocTypeLiteral typescript/factory node js-doc-property-tags array-type?)))

(defn create-js-doc-signature
  (^js []
   (.createJSDocSignature typescript/factory))
  (^js [type-parameters]
   (.createJSDocSignature typescript/factory type-parameters))
  (^js [type-parameters parameters]
   (.createJSDocSignature typescript/factory type-parameters parameters))
  (^js [type-parameters parameters type]
   (.createJSDocSignature typescript/factory type-parameters parameters type)))

(defn update-js-doc-signature
  (^js [node]
   (.updateJSDocSignature typescript/factory node))
  (^js [node type-parameters]
   (.updateJSDocSignature typescript/factory node type-parameters))
  (^js [node type-parameters parameters]
   (.updateJSDocSignature typescript/factory node type-parameters parameters))
  (^js [node type-parameters parameters type]
   (.updateJSDocSignature typescript/factory node type-parameters parameters type)))

(defn create-js-doc-template-tag
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
  (^js []
   (.createJSDocTypeTag typescript/factory))
  (^js [tag-name]
   (.createJSDocTypeTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocTypeTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocTypeTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-type-tag
  (^js [node]
   (.updateJSDocTypeTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocTypeTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocTypeTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocTypeTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-see-tag
  (^js []
   (.createJSDocSeeTag typescript/factory))
  (^js [tag-name]
   (.createJSDocSeeTag typescript/factory tag-name))
  (^js [tag-name name-expression]
   (.createJSDocSeeTag typescript/factory tag-name name-expression))
  (^js [tag-name name-expression comment]
   (.createJSDocSeeTag typescript/factory tag-name name-expression comment)))

(defn update-js-doc-see-tag
  (^js [node]
   (.updateJSDocSeeTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocSeeTag typescript/factory node tag-name))
  (^js [node tag-name name-expression]
   (.updateJSDocSeeTag typescript/factory node tag-name name-expression))
  (^js [node tag-name name-expression comment]
   (.updateJSDocSeeTag typescript/factory node tag-name name-expression comment)))

(defn create-js-doc-return-tag
  (^js []
   (.createJSDocReturnTag typescript/factory))
  (^js [tag-name]
   (.createJSDocReturnTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocReturnTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocReturnTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-return-tag
  (^js [node]
   (.updateJSDocReturnTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocReturnTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocReturnTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocReturnTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-this-tag
  (^js []
   (.createJSDocThisTag typescript/factory))
  (^js [tag-name]
   (.createJSDocThisTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocThisTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocThisTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-this-tag
  (^js [node]
   (.updateJSDocThisTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocThisTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocThisTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocThisTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-enum-tag
  (^js []
   (.createJSDocEnumTag typescript/factory))
  (^js [tag-name]
   (.createJSDocEnumTag typescript/factory tag-name))
  (^js [tag-name type-expression]
   (.createJSDocEnumTag typescript/factory tag-name type-expression))
  (^js [tag-name type-expression comment]
   (.createJSDocEnumTag typescript/factory tag-name type-expression comment)))

(defn update-js-doc-enum-tag
  (^js [node]
   (.updateJSDocEnumTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocEnumTag typescript/factory node tag-name))
  (^js [node tag-name type-expression]
   (.updateJSDocEnumTag typescript/factory node tag-name type-expression))
  (^js [node tag-name type-expression comment]
   (.updateJSDocEnumTag typescript/factory node tag-name type-expression comment)))

(defn create-js-doc-callback-tag
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

(defn create-js-doc-augments-tag
  (^js []
   (.createJSDocAugmentsTag typescript/factory))
  (^js [tag-name]
   (.createJSDocAugmentsTag typescript/factory tag-name))
  (^js [tag-name class-name]
   (.createJSDocAugmentsTag typescript/factory tag-name class-name))
  (^js [tag-name class-name comment]
   (.createJSDocAugmentsTag typescript/factory tag-name class-name comment)))

(defn update-js-doc-augments-tag
  (^js [node]
   (.updateJSDocAugmentsTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocAugmentsTag typescript/factory node tag-name))
  (^js [node tag-name class-name]
   (.updateJSDocAugmentsTag typescript/factory node tag-name class-name))
  (^js [node tag-name class-name comment]
   (.updateJSDocAugmentsTag typescript/factory node tag-name class-name comment)))

(defn create-js-doc-implements-tag
  (^js []
   (.createJSDocImplementsTag typescript/factory))
  (^js [tag-name]
   (.createJSDocImplementsTag typescript/factory tag-name))
  (^js [tag-name class-name]
   (.createJSDocImplementsTag typescript/factory tag-name class-name))
  (^js [tag-name class-name comment]
   (.createJSDocImplementsTag typescript/factory tag-name class-name comment)))

(defn update-js-doc-implements-tag
  (^js [node]
   (.updateJSDocImplementsTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocImplementsTag typescript/factory node tag-name))
  (^js [node tag-name class-name]
   (.updateJSDocImplementsTag typescript/factory node tag-name class-name))
  (^js [node tag-name class-name comment]
   (.updateJSDocImplementsTag typescript/factory node tag-name class-name comment)))

(defn create-js-doc-author-tag
  (^js []
   (.createJSDocAuthorTag typescript/factory))
  (^js [tag-name]
   (.createJSDocAuthorTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocAuthorTag typescript/factory tag-name comment)))

(defn update-js-doc-author-tag
  (^js [node]
   (.updateJSDocAuthorTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocAuthorTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocAuthorTag typescript/factory node tag-name comment)))

(defn create-js-doc-class-tag
  (^js []
   (.createJSDocClassTag typescript/factory))
  (^js [tag-name]
   (.createJSDocClassTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocClassTag typescript/factory tag-name comment)))

(defn update-js-doc-class-tag
  (^js [node]
   (.updateJSDocClassTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocClassTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocClassTag typescript/factory node tag-name comment)))

(defn create-js-doc-public-tag
  (^js []
   (.createJSDocPublicTag typescript/factory))
  (^js [tag-name]
   (.createJSDocPublicTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocPublicTag typescript/factory tag-name comment)))

(defn update-js-doc-public-tag
  (^js [node]
   (.updateJSDocPublicTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocPublicTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocPublicTag typescript/factory node tag-name comment)))

(defn create-js-doc-private-tag
  (^js []
   (.createJSDocPrivateTag typescript/factory))
  (^js [tag-name]
   (.createJSDocPrivateTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocPrivateTag typescript/factory tag-name comment)))

(defn update-js-doc-private-tag
  (^js [node]
   (.updateJSDocPrivateTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocPrivateTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocPrivateTag typescript/factory node tag-name comment)))

(defn create-js-doc-protected-tag
  (^js []
   (.createJSDocProtectedTag typescript/factory))
  (^js [tag-name]
   (.createJSDocProtectedTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocProtectedTag typescript/factory tag-name comment)))

(defn update-js-doc-protected-tag
  (^js [node]
   (.updateJSDocProtectedTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocProtectedTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocProtectedTag typescript/factory node tag-name comment)))

(defn create-js-doc-readonly-tag
  (^js []
   (.createJSDocReadonlyTag typescript/factory))
  (^js [tag-name]
   (.createJSDocReadonlyTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocReadonlyTag typescript/factory tag-name comment)))

(defn update-js-doc-readonly-tag
  (^js [node]
   (.updateJSDocReadonlyTag typescript/factory node))
  (^js [node tag-name]
   (.updateJSDocReadonlyTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocReadonlyTag typescript/factory node tag-name comment)))

(defn create-js-doc-unknown-tag
  (^js [tag-name]
   (.createJSDocUnknownTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocUnknownTag typescript/factory tag-name comment)))

(defn update-js-doc-unknown-tag
  (^js [node tag-name]
   (.updateJSDocUnknownTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocUnknownTag typescript/factory node tag-name comment)))

(defn create-js-doc-deprecated-tag
  (^js [tag-name]
   (.createJSDocDeprecatedTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocDeprecatedTag typescript/factory tag-name comment)))

(defn update-js-doc-deprecated-tag
  (^js [node tag-name]
   (.updateJSDocDeprecatedTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocDeprecatedTag typescript/factory node tag-name comment)))

(defn create-js-doc-override-tag
  (^js [tag-name]
   (.createJSDocOverrideTag typescript/factory tag-name))
  (^js [tag-name comment]
   (.createJSDocOverrideTag typescript/factory tag-name comment)))

(defn update-js-doc-override-tag
  (^js [node tag-name]
   (.updateJSDocOverrideTag typescript/factory node tag-name))
  (^js [node tag-name comment]
   (.updateJSDocOverrideTag typescript/factory node tag-name comment)))

(defn create-js-doc-text
  ^js [text]
  (.createJSDocText typescript/factory text))

(defn update-js-doc-text
  ^js [node text]
  (.updateJSDocText typescript/factory node text))

(defn create-js-doc-comment
  (^js []
   (.createJSDocComment typescript/factory))
  (^js [comment]
   (.createJSDocComment typescript/factory comment))
  (^js [comment tags]
   (.createJSDocComment typescript/factory comment tags)))

(defn update-js-doc-comment
  (^js [node]
   (.updateJSDocComment typescript/factory node))
  (^js [node comment]
   (.updateJSDocComment typescript/factory node comment))
  (^js [node comment tags]
   (.updateJSDocComment typescript/factory node comment tags)))

(defn create-jsx-element
  ^js [opening-element children closing-element]
  (.createJsxElement typescript/factory opening-element children closing-element))

(defn update-jsx-element
  ^js [node opening-element children closing-element]
  (.updateJsxElement typescript/factory node opening-element children closing-element))

(defn create-jsx-self-closing-element
  (^js [tag-name]
   (.createJsxSelfClosingElement typescript/factory tag-name))
  (^js [tag-name type-arguments]
   (.createJsxSelfClosingElement typescript/factory tag-name type-arguments))
  (^js [tag-name type-arguments attributes]
   (.createJsxSelfClosingElement typescript/factory tag-name type-arguments attributes)))

(defn update-jsx-self-closing-element
  (^js [node tag-name]
   (.updateJsxSelfClosingElement typescript/factory node tag-name))
  (^js [node tag-name type-arguments]
   (.updateJsxSelfClosingElement typescript/factory node tag-name type-arguments))
  (^js [node tag-name type-arguments attributes]
   (.updateJsxSelfClosingElement typescript/factory node tag-name type-arguments attributes)))

(defn create-jsx-opening-element
  (^js [tag-name]
   (.createJsxOpeningElement typescript/factory tag-name))
  (^js [tag-name type-arguments]
   (.createJsxOpeningElement typescript/factory tag-name type-arguments))
  (^js [tag-name type-arguments attributes]
   (.createJsxOpeningElement typescript/factory tag-name type-arguments attributes)))

(defn update-jsx-opening-element
  (^js [node tag-name]
   (.updateJsxOpeningElement typescript/factory node tag-name))
  (^js [node tag-name type-arguments]
   (.updateJsxOpeningElement typescript/factory node tag-name type-arguments))
  (^js [node tag-name type-arguments attributes]
   (.updateJsxOpeningElement typescript/factory node tag-name type-arguments attributes)))

(defn create-jsx-closing-element
  ^js [tag-name]
  (.createJsxClosingElement typescript/factory tag-name))

(defn update-jsx-closing-element
  ^js [node tag-name]
  (.updateJsxClosingElement typescript/factory node tag-name))

(defn create-jsx-fragment
  ^js [opening-fragment children closing-fragment]
  (.createJsxFragment typescript/factory opening-fragment children closing-fragment))

(defn create-jsx-text
  (^js [text]
   (.createJsxText typescript/factory text))
  (^js [text contains-only-trivia-white-spaces?]
   (.createJsxText typescript/factory text contains-only-trivia-white-spaces?)))

(defn update-jsx-text
  (^js [node text]
   (.updateJsxText typescript/factory node text))
  (^js [node text contains-only-trivia-white-spaces?]
   (.updateJsxText typescript/factory node text contains-only-trivia-white-spaces?)))

(defn create-jsx-opening-fragment
  ^js []
  (.createJsxOpeningFragment typescript/factory))

(defn create-jsx-jsx-closing-fragment
  ^js []
  (.createJsxJsxClosingFragment typescript/factory))

(defn update-jsx-fragment
  ^js [node opening-fragment children closing-fragment]
  (.updateJsxFragment typescript/factory node opening-fragment children closing-fragment))

(defn create-jsx-attribute
  (^js [name]
   (.createJsxAttribute typescript/factory name))
  (^js [name initializer]
   (.createJsxAttribute typescript/factory name initializer)))

(defn update-jsx-attribute
  (^js [node name]
   (.updateJsxAttribute typescript/factory node name))
  (^js [node name initializer]
   (.updateJsxAttribute typescript/factory node name initializer)))

(defn create-jsx-attributes
  ^js [properties]
  (.createJsxAttributes typescript/factory properties))

(defn update-jsx-attributes
  ^js [node properties]
  (.updateJsxAttributes typescript/factory node properties))

(defn create-jsx-spread-attribute
  ^js [expression]
  (.createJsxSpreadAttribute typescript/factory expression))

(defn update-jsx-spread-attribute
  ^js [node expression]
  (.updateJsxSpreadAttribute typescript/factory node expression))

(defn create-jsx-expression
  (^js []
   (.createJsxExpression typescript/factory))
  (^js [dot-dot-dot-token]
   (.createJsxExpression typescript/factory dot-dot-dot-token))
  (^js [dot-dot-dot-token expression]
   (.createJsxExpression typescript/factory dot-dot-dot-token expression)))

(defn update-jsx-expression
  (^js [node]
   (.updateJsxExpression typescript/factory node))
  (^js [node expression]
   (.updateJsxExpression typescript/factory node expression)))

(defn create-case-clause
  ^js [expression statements]
  (.createCaseClause typescript/factory expression statements))

(defn update-case-clause
  ^js [node expression statements]
  (.updateCaseClause typescript/factory node expression statements))

(defn create-default-clause
  ^js [statements]
  (.createDefaultClause typescript/factory statements))

(defn update-default-clause
  ^js [node statements]
  (.updateDefaultClause typescript/factory node statements))

(defn create-heritage-clause
  ^js [token types]
  (.createHeritageClause typescript/factory token types))

(defn update-heritage-clause
  ^js [node types]
  (.updateHeritageClause typescript/factory node types))

(defn create-catch-clause
  (^js []
   (.createCatchClause typescript/factory))
  (^js [variable-declaration]
   (.createCatchClause typescript/factory variable-declaration))
  (^js [variable-declaration block]
   (.createCatchClause typescript/factory variable-declaration block)))

(defn update-catch-clause
  (^js [node]
   (.updateCatchClause typescript/factory node))
  (^js [node variable-declaration]
   (.updateCatchClause typescript/factory node variable-declaration))
  (^js [node variable-declaration block]
   (.updateCatchClause typescript/factory node variable-declaration block)))

(defn create-property-assignment
  ^js [name initializer]
  (.createPropertyAssignment typescript/factory name initializer))

(defn update-property-assignment
  ^js [node name initializer]
  (.updatePropertyAssignment typescript/factory node name initializer))

(defn create-shorthand-property-assignment
  (^js [name]
   (.createShorthandPropertyAssignment typescript/factory name))
  (^js [name object-assignment-initializer]
   (.createShorthandPropertyAssignment typescript/factory name object-assignment-initializer)))

(defn update-shorthand-property-assignment
  (^js [node name]
   (.updateShorthandPropertyAssignment typescript/factory node name))
  (^js [node name object-assignment-initializer]
   (.updateShorthandPropertyAssignment typescript/factory node name object-assignment-initializer)))

(defn create-spread-assignment
  ^js [expression]
  (.createSpreadAssignment typescript/factory expression))

(defn update-spread-assignment
  ^js [node expression]
  (.updateSpreadAssignment typescript/factory node expression))

(defn create-enum-member
  (^js [name]
   (.createEnumMember typescript/factory name))
  (^js [name initializer]
   (.createEnumMember typescript/factory name initializer)))

(defn update-enum-member
  (^js [node name]
   (.updateEnumMember typescript/factory node name))
  (^js [node name initializer]
   (.updateEnumMember typescript/factory node name initializer)))

(defn create-source-file
  ^js [statements end-of-file-token flags]
  (.createSourceFile typescript/factory statements end-of-file-token flags))

(defn update-source-file
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
  ^js [original]
  (.createNotEmittedStatement typescript/factory original))

(defn create-partially-emitted-expression
  (^js [expression]
   (.createPartiallyEmittedExpression typescript/factory expression))
  (^js [expression original]
   (.createPartiallyEmittedExpression typescript/factory expression original)))

(defn update-partially-emitted-expression
  ^js [node expression]
  (.updatePartiallyEmittedExpression typescript/factory node expression))

(defn create-comma-list-expression
  ^js [elements]
  (.createCommaListExpression typescript/factory elements))

(defn update-comma-list-expression
  ^js [node elements]
  (.updateCommaListExpression typescript/factory node elements))

(defn create-bundle
  (^js [source-files]
   (.createBundle typescript/factory source-files))
  (^js [source-files prepends]
   (.createBundle typescript/factory source-files prepends)))

(defn update-bundle
  (^js [node source-files]
   (.updateBundle typescript/factory node source-files))
  (^js [node source-files prepends]
   (.updateBundle typescript/factory node source-files prepends)))

(defn create-comma
  ^js [left right]
  (.createComma typescript/factory left right))

(defn create-assignment
  ^js [left right]
  (.createAssignment typescript/factory left right))

(defn create-logical-or
  ^js [left right]
  (.createLogicalOr typescript/factory left right))

(defn create-logical-and
  ^js [left right]
  (.createLogicalAnd typescript/factory left right))

(defn create-bitwise-or
  ^js [left right]
  (.createBitwiseOr typescript/factory left right))

(defn create-bitwise-xor
  ^js [left right]
  (.createBitwiseXor typescript/factory left right))

(defn create-bitwise-and
  ^js [left right]
  (.createBitwiseAnd typescript/factory left right))

(defn create-strict-equality
  ^js [left right]
  (.createStrictEquality typescript/factory left right))

(defn create-strict-inequality
  ^js [left right]
  (.createStrictInequality typescript/factory left right))

(defn create-equality
  ^js [left right]
  (.createEquality typescript/factory left right))

(defn create-inequality
  ^js [left right]
  (.createInequality typescript/factory left right))

(defn create-less-than
  ^js [left right]
  (.createLessThan typescript/factory left right))

(defn create-less-than-equals
  ^js [left right]
  (.createLessThanEquals typescript/factory left right))

(defn create-greater-than
  ^js [left right]
  (.createGreaterThan typescript/factory left right))

(defn create-greater-than-equals
  ^js [left right]
  (.createGreaterThanEquals typescript/factory left right))

(defn create-left-shift
  ^js [left right]
  (.createLeftShift typescript/factory left right))

(defn create-right-shift
  ^js [left right]
  (.createRightShift typescript/factory left right))

(defn create-unsigned-right-shift
  ^js [left right]
  (.createUnsignedRightShift typescript/factory left right))

(defn create-add
  ^js [left right]
  (.createAdd typescript/factory left right))

(defn create-subtract
  ^js [left right]
  (.createSubtract typescript/factory left right))

(defn create-multiply
  ^js [left right]
  (.createMultiply typescript/factory left right))

(defn create-divide
  ^js [left right]
  (.createDivide typescript/factory left right))

(defn create-modulo
  ^js [left right]
  (.createModulo typescript/factory left right))

(defn create-exponent
  ^js [left right]
  (.createExponent typescript/factory left right))

(defn create-prefix-plus
  ^js [operand]
  (.createPrefixPlus typescript/factory operand))

(defn create-prefix-minus
  ^js [operand]
  (.createPrefixMinus typescript/factory operand))

(defn create-prefix-increment
  ^js [operand]
  (.createPrefixIncrement typescript/factory operand))

(defn create-prefix-decrement
  ^js [operand]
  (.createPrefixDecrement typescript/factory operand))

(defn create-bitwise-not
  ^js [operand]
  (.createBitwiseNot typescript/factory operand))

(defn create-logical-not
  ^js [operand]
  (.createLogicalNot typescript/factory operand))

(defn create-postfix-increment
  ^js [operand]
  (.createPostfixIncrement typescript/factory operand))

(defn create-postfix-decrement
  ^js [operand]
  (.createPostfixDecrement typescript/factory operand))

(defn create-immediately-invoked-function-expression
  (^js [statements]
   (.createImmediatelyInvokedFunctionExpression typescript/factory statements))
  (^js [statements param param-value]
   (.createImmediatelyInvokedFunctionExpression typescript/factory statements param param-value)))

(defn create-immediately-invoked-arrow-function
  (^js [statements]
   (.createImmediatelyInvokedArrowFunction typescript/factory statements))
  (^js [statements param param-value]
   (.createImmediatelyInvokedArrowFunction typescript/factory statements param param-value)))

(defn create-void-zero
  ^js []
  (.createVoidZero typescript/factory))

(defn create-export-default
  ^js [expression]
  (.createExportDefault typescript/factory expression))

(defn create-external-module-export
  ^js [export-name]
  (.createExternalModuleExport typescript/factory export-name))

(defn restore-outer-expressions
  (^js []
   (.restoreOuterExpressions typescript/factory))
  (^js [outer-expression]
   (.restoreOuterExpressions typescript/factory outer-expression))
  (^js [outer-expression inner-expression]
   (.restoreOuterExpressions typescript/factory outer-expression inner-expression))
  (^js [outer-expression inner-expression kinds]
   (.restoreOuterExpressions typescript/factory outer-expression inner-expression kinds)))
