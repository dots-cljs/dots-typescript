(ns dots.typescript
  (:require ["typescript" :as typescript]))

(defn version-major-minor
  ^js []
  typescript/versionMajorMinor)

(defn version
  "The version of the TypeScript compiler release"
  ^js []
  typescript/version)

(defn node-major-version
  ^js []
  (typescript/getNodeMajorVersion))

(defn sys
  ^js []
  typescript/sys)

(defn token-to-string
  ^js [t]
  (typescript/tokenToString t))

(defn position-of-line-and-character
  ^js [source-file line character]
  (typescript/getPositionOfLineAndCharacter source-file line character))

(defn line-and-character-of-position
  ^js [source-file position]
  (typescript/getLineAndCharacterOfPosition source-file position))

(defn white-space-like?
  ^js [ch]
  (typescript/isWhiteSpaceLike ch))

(defn white-space-single-line?
  "Does not include line breaks. For that, see isWhiteSpaceLike."
  ^js [ch]
  (typescript/isWhiteSpaceSingleLine ch))

(defn line-break?
  ^js [ch]
  (typescript/isLineBreak ch))

(defn could-start-trivia?
  ^js [text pos]
  (typescript/couldStartTrivia text pos))

(defn for-each-leading-comment-range
  (^js [text pos cb]
   (typescript/forEachLeadingCommentRange text pos cb))
  (^js [text pos cb state]
   (typescript/forEachLeadingCommentRange text pos cb state)))

(defn for-each-trailing-comment-range
  (^js [text pos cb]
   (typescript/forEachTrailingCommentRange text pos cb))
  (^js [text pos cb state]
   (typescript/forEachTrailingCommentRange text pos cb state)))

(defn reduce-each-leading-comment-range
  ^js [text pos cb state initial]
  (typescript/reduceEachLeadingCommentRange text pos cb state initial))

(defn reduce-each-trailing-comment-range
  ^js [text pos cb state initial]
  (typescript/reduceEachTrailingCommentRange text pos cb state initial))

(defn leading-comment-ranges
  ^js [text pos]
  (typescript/getLeadingCommentRanges text pos))

(defn trailing-comment-ranges
  ^js [text pos]
  (typescript/getTrailingCommentRanges text pos))

(defn shebang
  "Optionally, get the shebang"
  ^js [text]
  (typescript/getShebang text))

(defn identifier-start?
  (^js [ch]
   (typescript/isIdentifierStart ch))
  (^js [ch language-version]
   (typescript/isIdentifierStart ch language-version)))

(defn identifier-part?
  (^js [ch]
   (typescript/isIdentifierPart ch))
  (^js [ch language-version]
   (typescript/isIdentifierPart ch language-version))
  (^js [ch language-version identifier-variant]
   (typescript/isIdentifierPart ch language-version identifier-variant)))

(defn create-scanner
  (^js [language-version skip-trivia?]
   (typescript/createScanner language-version skip-trivia?))
  (^js [language-version skip-trivia? language-variant]
   (typescript/createScanner language-version skip-trivia? language-variant))
  (^js [language-version skip-trivia? language-variant text-initial]
   (typescript/createScanner language-version skip-trivia? language-variant text-initial))
  (^js [language-version skip-trivia? language-variant text-initial on-error]
   (typescript/createScanner language-version skip-trivia? language-variant text-initial on-error))
  (^js [language-version skip-trivia? language-variant text-initial on-error start]
   (typescript/createScanner language-version skip-trivia? language-variant text-initial on-error start))
  (^js [language-version skip-trivia? language-variant text-initial on-error start length]
   (typescript/createScanner language-version skip-trivia? language-variant text-initial on-error start length)))

(defn external-module-name-relative?
  ^js [module-name]
  (typescript/isExternalModuleNameRelative module-name))

(defn sort-and-deduplicate-diagnostics
  ^js [diagnostics]
  (typescript/sortAndDeduplicateDiagnostics diagnostics))

(defn default-lib-file-name
  ^js [options]
  (typescript/getDefaultLibFileName options))

(defn text-span-end
  ^js [span]
  (typescript/textSpanEnd span))

(defn text-span-is-empty?
  ^js [span]
  (typescript/textSpanIsEmpty span))

(defn text-span-contains-position?
  ^js [span position]
  (typescript/textSpanContainsPosition span position))

(defn text-span-contains-text-span?
  ^js [span other]
  (typescript/textSpanContainsTextSpan span other))

(defn text-span-overlaps-with?
  ^js [span other]
  (typescript/textSpanOverlapsWith span other))

(defn text-span-overlap
  ^js [span-1 span-2]
  (typescript/textSpanOverlap span-1 span-2))

(defn text-span-intersects-with-text-span?
  ^js [span other]
  (typescript/textSpanIntersectsWithTextSpan span other))

(defn text-span-intersects-with?
  ^js [span start length]
  (typescript/textSpanIntersectsWith span start length))

(defn decoded-text-span-intersects-with?
  ^js [start-1 length-1 start-2 length-2]
  (typescript/decodedTextSpanIntersectsWith start-1 length-1 start-2 length-2))

(defn text-span-intersects-with-position?
  ^js [span position]
  (typescript/textSpanIntersectsWithPosition span position))

(defn text-span-intersection
  ^js [span-1 span-2]
  (typescript/textSpanIntersection span-1 span-2))

(defn create-text-span
  ^js [start length]
  (typescript/createTextSpan start length))

(defn create-text-span-from-bounds
  ^js [start end]
  (typescript/createTextSpanFromBounds start end))

(defn text-change-range-new-span
  ^js [range]
  (typescript/textChangeRangeNewSpan range))

(defn text-change-range-is-unchanged?
  ^js [range]
  (typescript/textChangeRangeIsUnchanged range))

(defn create-text-change-range
  ^js [span new-length]
  (typescript/createTextChangeRange span new-length))

(defn collapse-text-change-ranges-across-multiple-versions
  "Called to merge all the changes that occurred across several versions of a script snapshot
   into a single change.  i.e. if a user keeps making successive edits to a script we will
   have a text change from V1 to V2, V2 to V3, ..., Vn.
   
   This function will then merge those changes into a single change range valid between V1 and
   Vn."
  ^js [changes]
  (typescript/collapseTextChangeRangesAcrossMultipleVersions changes))

(defn type-parameter-owner
  ^js [d]
  (typescript/getTypeParameterOwner d))

(defn parameter-property-declaration?
  ^js [node parent]
  (typescript/isParameterPropertyDeclaration node parent))

(defn empty-binding-pattern?
  ^js [node]
  (typescript/isEmptyBindingPattern node))

(defn empty-binding-element?
  ^js [node]
  (typescript/isEmptyBindingElement node))

(defn walk-up-binding-elements-and-patterns
  ^js [binding]
  (typescript/walkUpBindingElementsAndPatterns binding))

(defn combined-modifier-flags
  ^js [node]
  (typescript/getCombinedModifierFlags node))

(defn combined-node-flags
  ^js [node]
  (typescript/getCombinedNodeFlags node))

(defn validate-locale-and-set-language
  "Checks to see if the locale is in the appropriate format,
   and if it is, attempts to set the appropriate language."
  (^js [locale sys]
   (typescript/validateLocaleAndSetLanguage locale sys))
  (^js [locale sys errors]
   (typescript/validateLocaleAndSetLanguage locale sys errors)))

(defn original-node
  (^js []
   (typescript/getOriginalNode))
  (^js [node]
   (typescript/getOriginalNode node))
  (^js [node node-test]
   (typescript/getOriginalNode node node-test)))

(defn find-ancestor
  "Iterates through the parent chain of a node and performs the callback on each parent until the callback
   returns a truthy value, then returns that value.
   If no such value is found, it applies the callback until the parent pointer is undefined or the callback returns \"quit\"
   At that point findAncestor returns undefined."
  (^js []
   (typescript/findAncestor))
  (^js [node]
   (typescript/findAncestor node))
  (^js [node callback]
   (typescript/findAncestor node callback)))

(defn parse-tree-node?
  "Gets a value indicating whether a node originated in the parse tree."
  ^js [node]
  (typescript/isParseTreeNode node))

(defn parse-tree-node
  "Gets the original parse tree node for a node."
  (^js []
   (typescript/getParseTreeNode))
  (^js [node]
   (typescript/getParseTreeNode node))
  (^js [node node-test]
   (typescript/getParseTreeNode node node-test)))

(defn escape-leading-underscores
  "Add an extra underscore to identifiers that start with two underscores to avoid issues with magic names like '__proto__'"
  ^js [identifier]
  (typescript/escapeLeadingUnderscores identifier))

(defn unescape-leading-underscores
  "Remove extra underscore from escaped identifier text content."
  ^js [identifier]
  (typescript/unescapeLeadingUnderscores identifier))

(defn id-text
  ^js [identifier-or-private-name]
  (typescript/idText identifier-or-private-name))

(defn symbol-name
  ^js [symbol]
  (typescript/symbolName symbol))

(defn name-of-js-doc-typedef
  ^js [declaration]
  (typescript/getNameOfJSDocTypedef declaration))

(defn name-of-declaration
  (^js []
   (typescript/getNameOfDeclaration))
  (^js [declaration]
   (typescript/getNameOfDeclaration declaration)))

(defn decorators
  ^js [node]
  (typescript/getDecorators node))

(defn modifiers
  ^js [node]
  (typescript/getModifiers node))

(defn js-doc-parameter-tags
  "Gets the JSDoc parameter tags for the node if present."
  ^js [param]
  (typescript/getJSDocParameterTags param))

(defn js-doc-type-parameter-tags
  "Gets the JSDoc type parameter tags for the node if present."
  ^js [param]
  (typescript/getJSDocTypeParameterTags param))

(defn has-js-doc-parameter-tags?
  "Return true if the node has JSDoc parameter tags."
  ^js [node]
  (typescript/hasJSDocParameterTags node))

(defn js-doc-augments-tag
  "Gets the JSDoc augments tag for the node if present"
  ^js [node]
  (typescript/getJSDocAugmentsTag node))

(defn js-doc-implements-tags
  "Gets the JSDoc implements tags for the node if present"
  ^js [node]
  (typescript/getJSDocImplementsTags node))

(defn js-doc-class-tag
  "Gets the JSDoc class tag for the node if present"
  ^js [node]
  (typescript/getJSDocClassTag node))

(defn js-doc-public-tag
  "Gets the JSDoc public tag for the node if present"
  ^js [node]
  (typescript/getJSDocPublicTag node))

(defn js-doc-private-tag
  "Gets the JSDoc private tag for the node if present"
  ^js [node]
  (typescript/getJSDocPrivateTag node))

(defn js-doc-protected-tag
  "Gets the JSDoc protected tag for the node if present"
  ^js [node]
  (typescript/getJSDocProtectedTag node))

(defn js-doc-readonly-tag
  "Gets the JSDoc protected tag for the node if present"
  ^js [node]
  (typescript/getJSDocReadonlyTag node))

(defn js-doc-override-tag-no-cache
  ^js [node]
  (typescript/getJSDocOverrideTagNoCache node))

(defn js-doc-deprecated-tag
  "Gets the JSDoc deprecated tag for the node if present"
  ^js [node]
  (typescript/getJSDocDeprecatedTag node))

(defn js-doc-enum-tag
  "Gets the JSDoc enum tag for the node if present"
  ^js [node]
  (typescript/getJSDocEnumTag node))

(defn js-doc-this-tag
  "Gets the JSDoc this tag for the node if present"
  ^js [node]
  (typescript/getJSDocThisTag node))

(defn js-doc-return-tag
  "Gets the JSDoc return tag for the node if present"
  ^js [node]
  (typescript/getJSDocReturnTag node))

(defn js-doc-template-tag
  "Gets the JSDoc template tag for the node if present"
  ^js [node]
  (typescript/getJSDocTemplateTag node))

(defn js-doc-type-tag
  "Gets the JSDoc type tag for the node if present and valid"
  ^js [node]
  (typescript/getJSDocTypeTag node))

(defn js-doc-type
  "Gets the type node for the node if provided via JSDoc."
  ^js [node]
  (typescript/getJSDocType node))

(defn js-doc-return-type
  "Gets the return type node for the node if provided via JSDoc return tag or type tag."
  ^js [node]
  (typescript/getJSDocReturnType node))

(defn js-doc-tags
  "Get all JSDoc tags related to a node, including those on parent nodes."
  ^js [node]
  (typescript/getJSDocTags node))

(defn all-js-doc-tags
  "Gets all JSDoc tags that match a specified predicate"
  ^js [node predicate]
  (typescript/getAllJSDocTags node predicate))

(defn all-js-doc-tags-of-kind
  "Gets all JSDoc tags of a specified kind"
  ^js [node kind]
  (typescript/getAllJSDocTagsOfKind node kind))

(defn text-of-js-doc-comment
  "Gets the text of a jsdoc comment, flattening links to their text."
  (^js []
   (typescript/getTextOfJSDocComment))
  (^js [comment]
   (typescript/getTextOfJSDocComment comment)))

(defn effective-type-parameter-declarations
  "Gets the effective type parameters. If the node was parsed in a
   JavaScript file, gets the type parameters from the `@template` tag from JSDoc.
   
   This does *not* return type parameters from a jsdoc reference to a generic type, eg
   
   type Id = <T>(x: T) => T
   /** @type {Id} /
   function id(x) { return x }"
  ^js [node]
  (typescript/getEffectiveTypeParameterDeclarations node))

(defn effective-constraint-of-type-parameter
  ^js [node]
  (typescript/getEffectiveConstraintOfTypeParameter node))

(defn member-name?
  ^js [node]
  (typescript/isMemberName node))

(defn property-access-chain?
  ^js [node]
  (typescript/isPropertyAccessChain node))

(defn element-access-chain?
  ^js [node]
  (typescript/isElementAccessChain node))

(defn call-chain?
  ^js [node]
  (typescript/isCallChain node))

(defn optional-chain?
  ^js [node]
  (typescript/isOptionalChain node))

(defn nullish-coalesce?
  ^js [node]
  (typescript/isNullishCoalesce node))

(defn const-type-reference?
  ^js [node]
  (typescript/isConstTypeReference node))

(defn skip-partially-emitted-expressions
  ^js [node]
  (typescript/skipPartiallyEmittedExpressions node))

(defn non-null-chain?
  ^js [node]
  (typescript/isNonNullChain node))

(defn break-or-continue-statement?
  ^js [node]
  (typescript/isBreakOrContinueStatement node))

(defn named-export-bindings?
  ^js [node]
  (typescript/isNamedExportBindings node))

(defn unparsed-text-like?
  ^js [node]
  (typescript/isUnparsedTextLike node))

(defn unparsed-node?
  ^js [node]
  (typescript/isUnparsedNode node))

(defn js-doc-property-like-tag?
  ^js [node]
  (typescript/isJSDocPropertyLikeTag node))

(defn token-kind?
  "True if kind is of some token syntax kind.
   For example, this is true for an IfKeyword but not for an IfStatement.
   Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail."
  ^js [kind]
  (typescript/isTokenKind kind))

(defn token?
  "True if node is of some token syntax kind.
   For example, this is true for an IfKeyword but not for an IfStatement.
   Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail."
  ^js [n]
  (typescript/isToken n))

(defn literal-expression?
  ^js [node]
  (typescript/isLiteralExpression node))

(defn template-literal-token?
  ^js [node]
  (typescript/isTemplateLiteralToken node))

(defn template-middle-or-template-tail?
  ^js [node]
  (typescript/isTemplateMiddleOrTemplateTail node))

(defn import-or-export-specifier?
  ^js [node]
  (typescript/isImportOrExportSpecifier node))

(defn type-only-import-or-export-declaration?
  ^js [node]
  (typescript/isTypeOnlyImportOrExportDeclaration node))

(defn assertion-key?
  ^js [node]
  (typescript/isAssertionKey node))

(defn string-text-containing-node?
  ^js [node]
  (typescript/isStringTextContainingNode node))

(defn modifier?
  ^js [node]
  (typescript/isModifier node))

(defn entity-name?
  ^js [node]
  (typescript/isEntityName node))

(defn property-name?
  ^js [node]
  (typescript/isPropertyName node))

(defn binding-name?
  ^js [node]
  (typescript/isBindingName node))

(defn function-like?
  (^js []
   (typescript/isFunctionLike))
  (^js [node]
   (typescript/isFunctionLike node)))

(defn class-element?
  ^js [node]
  (typescript/isClassElement node))

(defn class-like?
  ^js [node]
  (typescript/isClassLike node))

(defn accessor?
  ^js [node]
  (typescript/isAccessor node))

(defn modifier-like?
  ^js [node]
  (typescript/isModifierLike node))

(defn type-element?
  ^js [node]
  (typescript/isTypeElement node))

(defn class-or-type-element?
  ^js [node]
  (typescript/isClassOrTypeElement node))

(defn object-literal-element-like?
  ^js [node]
  (typescript/isObjectLiteralElementLike node))

(defn type-node?
  "Node test that determines whether a node is a valid type node.
   This differs from the `isPartOfTypeNode` function which determines whether a node is *part*
   of a TypeNode."
  ^js [node]
  (typescript/isTypeNode node))

(defn function-or-constructor-type-node?
  ^js [node]
  (typescript/isFunctionOrConstructorTypeNode node))

(defn property-access-or-qualified-name?
  ^js [node]
  (typescript/isPropertyAccessOrQualifiedName node))

(defn call-like-expression?
  ^js [node]
  (typescript/isCallLikeExpression node))

(defn call-or-new-expression?
  ^js [node]
  (typescript/isCallOrNewExpression node))

(defn template-literal?
  ^js [node]
  (typescript/isTemplateLiteral node))

(defn assertion-expression?
  ^js [node]
  (typescript/isAssertionExpression node))

(defn iteration-statement?
  {:arglists '([node look-in-labeled-statements]
               [node look-in-labeled-statements?])}
  ^js [a b]
  (typescript/isIterationStatement a b))

(defn jsx-opening-like-element?
  ^js [node]
  (typescript/isJsxOpeningLikeElement node))

(defn case-or-default-clause?
  ^js [node]
  (typescript/isCaseOrDefaultClause node))

(defn js-doc-comment-containing-node?
  "True if node is of a kind that may contain comment text."
  ^js [node]
  (typescript/isJSDocCommentContainingNode node))

(defn set-accessor?
  ^js [node]
  (typescript/isSetAccessor node))

(defn get-accessor?
  ^js [node]
  (typescript/isGetAccessor node))

(defn has-only-expression-initializer?
  "True if has initializer node attached to it."
  ^js [node]
  (typescript/hasOnlyExpressionInitializer node))

(defn object-literal-element?
  ^js [node]
  (typescript/isObjectLiteralElement node))

(defn string-literal-like?
  ^js [node]
  (typescript/isStringLiteralLike node))

(defn js-doc-link-like?
  ^js [node]
  (typescript/isJSDocLinkLike node))

(defn has-rest-parameter?
  ^js [s]
  (typescript/hasRestParameter s))

(defn rest-parameter?
  ^js [node]
  (typescript/isRestParameter node))

(defn unchanged-text-change-range
  ^js []
  typescript/unchangedTextChangeRange)

(defn create-unparsed-source-file
  {:arglists '([input-file type]
               [input-file type strip-internal?]
               [text]
               [text map-path]
               [text map-path map])}
  (^js [text]
   (typescript/createUnparsedSourceFile text))
  (^js [a b]
   (typescript/createUnparsedSourceFile a b))
  (^js [a b c]
   (typescript/createUnparsedSourceFile a b c)))

(defn create-input-files
  {:arglists '([javascript-text declaration-text]
               [javascript-text declaration-text javascript-map-path]
               [javascript-text declaration-text javascript-map-path javascript-map-text]
               [javascript-text declaration-text javascript-map-path javascript-map-text declaration-map-path]
               [javascript-text declaration-text javascript-map-path javascript-map-text declaration-map-path declaration-map-text]
               [read-file-text javascript-path]
               [read-file-text javascript-path javascript-map-path]
               [read-file-text javascript-path javascript-map-path declaration-path]
               [read-file-text javascript-path javascript-map-path declaration-path declaration-map-path]
               [read-file-text javascript-path javascript-map-path declaration-path declaration-map-path build-info-path])}
  (^js [a b]
   (typescript/createInputFiles a b))
  (^js [a b c]
   (typescript/createInputFiles a b c))
  (^js [a b c d]
   (typescript/createInputFiles a b c d))
  (^js [a b c d e]
   (typescript/createInputFiles a b c d e))
  (^js [a b c d e f]
   (typescript/createInputFiles a b c d e f)))

(defn create-source-map-source
  "Create an external source map source file reference"
  (^js [file-name text]
   (typescript/createSourceMapSource file-name text))
  (^js [file-name text skip-trivia]
   (typescript/createSourceMapSource file-name text skip-trivia)))

(defn set-original-node
  (^js [node]
   (typescript/setOriginalNode node))
  (^js [node original]
   (typescript/setOriginalNode node original)))

(defn factory
  ^js []
  typescript/factory)

(defn dispose-emit-nodes
  "Clears any `EmitNode` entries from parse-tree nodes."
  (^js []
   (typescript/disposeEmitNodes))
  (^js [source-file]
   (typescript/disposeEmitNodes source-file)))

(defn set-emit-flags
  "Sets flags that control emit behavior of a node."
  ^js [node emit-flags]
  (typescript/setEmitFlags node emit-flags))

(defn source-map-range
  "Gets a custom text range to use when emitting source maps."
  ^js [node]
  (typescript/getSourceMapRange node))

(defn set-source-map-range
  "Sets a custom text range to use when emitting source maps."
  (^js [node]
   (typescript/setSourceMapRange node))
  (^js [node range]
   (typescript/setSourceMapRange node range)))

(defn token-source-map-range
  "Gets the TextRange to use for source maps for a token of a node."
  ^js [node token]
  (typescript/getTokenSourceMapRange node token))

(defn set-token-source-map-range
  "Sets the TextRange to use for source maps for a token of a node."
  (^js [node token]
   (typescript/setTokenSourceMapRange node token))
  (^js [node token range]
   (typescript/setTokenSourceMapRange node token range)))

(defn comment-range
  "Gets a custom text range to use when emitting comments."
  ^js [node]
  (typescript/getCommentRange node))

(defn set-comment-range
  "Sets a custom text range to use when emitting comments."
  ^js [node range]
  (typescript/setCommentRange node range))

(defn synthetic-leading-comments
  ^js [node]
  (typescript/getSyntheticLeadingComments node))

(defn set-synthetic-leading-comments
  (^js [node]
   (typescript/setSyntheticLeadingComments node))
  (^js [node comments]
   (typescript/setSyntheticLeadingComments node comments)))

(defn add-synthetic-leading-comment
  (^js [node kind text]
   (typescript/addSyntheticLeadingComment node kind text))
  (^js [node kind text has-trailing-new-line?]
   (typescript/addSyntheticLeadingComment node kind text has-trailing-new-line?)))

(defn synthetic-trailing-comments
  ^js [node]
  (typescript/getSyntheticTrailingComments node))

(defn set-synthetic-trailing-comments
  (^js [node]
   (typescript/setSyntheticTrailingComments node))
  (^js [node comments]
   (typescript/setSyntheticTrailingComments node comments)))

(defn add-synthetic-trailing-comment
  (^js [node kind text]
   (typescript/addSyntheticTrailingComment node kind text))
  (^js [node kind text has-trailing-new-line?]
   (typescript/addSyntheticTrailingComment node kind text has-trailing-new-line?)))

(defn move-synthetic-comments
  ^js [node original]
  (typescript/moveSyntheticComments node original))

(defn constant-value
  "Gets the constant value to emit for an expression representing an enum."
  ^js [node]
  (typescript/getConstantValue node))

(defn set-constant-value
  "Sets the constant value to emit for an expression."
  ^js [node value]
  (typescript/setConstantValue node value))

(defn add-emit-helper
  "Adds an EmitHelper to a node."
  ^js [node helper]
  (typescript/addEmitHelper node helper))

(defn add-emit-helpers
  "Add EmitHelpers to a node."
  (^js [node]
   (typescript/addEmitHelpers node))
  (^js [node helpers]
   (typescript/addEmitHelpers node helpers)))

(defn remove-emit-helper?
  "Removes an EmitHelper from a node."
  ^js [node helper]
  (typescript/removeEmitHelper node helper))

(defn emit-helpers
  "Gets the EmitHelpers of a node."
  ^js [node]
  (typescript/getEmitHelpers node))

(defn move-emit-helpers
  "Moves matching emit helpers from a source node to a target node."
  ^js [source target predicate]
  (typescript/moveEmitHelpers source target predicate))

(defn numeric-literal?
  ^js [node]
  (typescript/isNumericLiteral node))

(defn big-int-literal?
  ^js [node]
  (typescript/isBigIntLiteral node))

(defn string-literal?
  ^js [node]
  (typescript/isStringLiteral node))

(defn jsx-text?
  ^js [node]
  (typescript/isJsxText node))

(defn regular-expression-literal?
  ^js [node]
  (typescript/isRegularExpressionLiteral node))

(defn no-substitution-template-literal?
  ^js [node]
  (typescript/isNoSubstitutionTemplateLiteral node))

(defn template-head?
  ^js [node]
  (typescript/isTemplateHead node))

(defn template-middle?
  ^js [node]
  (typescript/isTemplateMiddle node))

(defn template-tail?
  ^js [node]
  (typescript/isTemplateTail node))

(defn dot-dot-dot-token?
  ^js [node]
  (typescript/isDotDotDotToken node))

(defn plus-token?
  ^js [node]
  (typescript/isPlusToken node))

(defn minus-token?
  ^js [node]
  (typescript/isMinusToken node))

(defn asterisk-token?
  ^js [node]
  (typescript/isAsteriskToken node))

(defn identifier?
  ^js [node]
  (typescript/isIdentifier node))

(defn private-identifier?
  ^js [node]
  (typescript/isPrivateIdentifier node))

(defn qualified-name?
  ^js [node]
  (typescript/isQualifiedName node))

(defn computed-property-name?
  ^js [node]
  (typescript/isComputedPropertyName node))

(defn type-parameter-declaration?
  ^js [node]
  (typescript/isTypeParameterDeclaration node))

(defn parameter?
  ^js [node]
  (typescript/isParameter node))

(defn decorator?
  ^js [node]
  (typescript/isDecorator node))

(defn property-signature?
  ^js [node]
  (typescript/isPropertySignature node))

(defn property-declaration?
  ^js [node]
  (typescript/isPropertyDeclaration node))

(defn method-signature?
  ^js [node]
  (typescript/isMethodSignature node))

(defn method-declaration?
  ^js [node]
  (typescript/isMethodDeclaration node))

(defn class-static-block-declaration?
  ^js [node]
  (typescript/isClassStaticBlockDeclaration node))

(defn constructor-declaration?
  ^js [node]
  (typescript/isConstructorDeclaration node))

(defn get-accessor-declaration?
  ^js [node]
  (typescript/isGetAccessorDeclaration node))

(defn set-accessor-declaration?
  ^js [node]
  (typescript/isSetAccessorDeclaration node))

(defn call-signature-declaration?
  ^js [node]
  (typescript/isCallSignatureDeclaration node))

(defn construct-signature-declaration?
  ^js [node]
  (typescript/isConstructSignatureDeclaration node))

(defn index-signature-declaration?
  ^js [node]
  (typescript/isIndexSignatureDeclaration node))

(defn type-predicate-node?
  ^js [node]
  (typescript/isTypePredicateNode node))

(defn type-reference-node?
  ^js [node]
  (typescript/isTypeReferenceNode node))

(defn function-type-node?
  ^js [node]
  (typescript/isFunctionTypeNode node))

(defn constructor-type-node?
  ^js [node]
  (typescript/isConstructorTypeNode node))

(defn type-query-node?
  ^js [node]
  (typescript/isTypeQueryNode node))

(defn type-literal-node?
  ^js [node]
  (typescript/isTypeLiteralNode node))

(defn array-type-node?
  ^js [node]
  (typescript/isArrayTypeNode node))

(defn tuple-type-node?
  ^js [node]
  (typescript/isTupleTypeNode node))

(defn named-tuple-member?
  ^js [node]
  (typescript/isNamedTupleMember node))

(defn optional-type-node?
  ^js [node]
  (typescript/isOptionalTypeNode node))

(defn rest-type-node?
  ^js [node]
  (typescript/isRestTypeNode node))

(defn union-type-node?
  ^js [node]
  (typescript/isUnionTypeNode node))

(defn intersection-type-node?
  ^js [node]
  (typescript/isIntersectionTypeNode node))

(defn conditional-type-node?
  ^js [node]
  (typescript/isConditionalTypeNode node))

(defn infer-type-node?
  ^js [node]
  (typescript/isInferTypeNode node))

(defn parenthesized-type-node?
  ^js [node]
  (typescript/isParenthesizedTypeNode node))

(defn this-type-node?
  ^js [node]
  (typescript/isThisTypeNode node))

(defn type-operator-node?
  ^js [node]
  (typescript/isTypeOperatorNode node))

(defn indexed-access-type-node?
  ^js [node]
  (typescript/isIndexedAccessTypeNode node))

(defn mapped-type-node?
  ^js [node]
  (typescript/isMappedTypeNode node))

(defn literal-type-node?
  ^js [node]
  (typescript/isLiteralTypeNode node))

(defn import-type-node?
  ^js [node]
  (typescript/isImportTypeNode node))

(defn template-literal-type-span?
  ^js [node]
  (typescript/isTemplateLiteralTypeSpan node))

(defn template-literal-type-node?
  ^js [node]
  (typescript/isTemplateLiteralTypeNode node))

(defn object-binding-pattern?
  ^js [node]
  (typescript/isObjectBindingPattern node))

(defn array-binding-pattern?
  ^js [node]
  (typescript/isArrayBindingPattern node))

(defn binding-element?
  ^js [node]
  (typescript/isBindingElement node))

(defn array-literal-expression?
  ^js [node]
  (typescript/isArrayLiteralExpression node))

(defn object-literal-expression?
  ^js [node]
  (typescript/isObjectLiteralExpression node))

(defn property-access-expression?
  ^js [node]
  (typescript/isPropertyAccessExpression node))

(defn element-access-expression?
  ^js [node]
  (typescript/isElementAccessExpression node))

(defn call-expression?
  ^js [node]
  (typescript/isCallExpression node))

(defn new-expression?
  ^js [node]
  (typescript/isNewExpression node))

(defn tagged-template-expression?
  ^js [node]
  (typescript/isTaggedTemplateExpression node))

(defn type-assertion-expression?
  ^js [node]
  (typescript/isTypeAssertionExpression node))

(defn parenthesized-expression?
  ^js [node]
  (typescript/isParenthesizedExpression node))

(defn function-expression?
  ^js [node]
  (typescript/isFunctionExpression node))

(defn arrow-function?
  ^js [node]
  (typescript/isArrowFunction node))

(defn delete-expression?
  ^js [node]
  (typescript/isDeleteExpression node))

(defn type-of-expression?
  ^js [node]
  (typescript/isTypeOfExpression node))

(defn void-expression?
  ^js [node]
  (typescript/isVoidExpression node))

(defn await-expression?
  ^js [node]
  (typescript/isAwaitExpression node))

(defn prefix-unary-expression?
  ^js [node]
  (typescript/isPrefixUnaryExpression node))

(defn postfix-unary-expression?
  ^js [node]
  (typescript/isPostfixUnaryExpression node))

(defn binary-expression?
  ^js [node]
  (typescript/isBinaryExpression node))

(defn conditional-expression?
  ^js [node]
  (typescript/isConditionalExpression node))

(defn template-expression?
  ^js [node]
  (typescript/isTemplateExpression node))

(defn yield-expression?
  ^js [node]
  (typescript/isYieldExpression node))

(defn spread-element?
  ^js [node]
  (typescript/isSpreadElement node))

(defn class-expression?
  ^js [node]
  (typescript/isClassExpression node))

(defn omitted-expression?
  ^js [node]
  (typescript/isOmittedExpression node))

(defn expression-with-type-arguments?
  ^js [node]
  (typescript/isExpressionWithTypeArguments node))

(defn as-expression?
  ^js [node]
  (typescript/isAsExpression node))

(defn non-null-expression?
  ^js [node]
  (typescript/isNonNullExpression node))

(defn meta-property?
  ^js [node]
  (typescript/isMetaProperty node))

(defn synthetic-expression?
  ^js [node]
  (typescript/isSyntheticExpression node))

(defn partially-emitted-expression?
  ^js [node]
  (typescript/isPartiallyEmittedExpression node))

(defn comma-list-expression?
  ^js [node]
  (typescript/isCommaListExpression node))

(defn template-span?
  ^js [node]
  (typescript/isTemplateSpan node))

(defn semicolon-class-element?
  ^js [node]
  (typescript/isSemicolonClassElement node))

(defn block?
  ^js [node]
  (typescript/isBlock node))

(defn variable-statement?
  ^js [node]
  (typescript/isVariableStatement node))

(defn empty-statement?
  ^js [node]
  (typescript/isEmptyStatement node))

(defn expression-statement?
  ^js [node]
  (typescript/isExpressionStatement node))

(defn if-statement?
  ^js [node]
  (typescript/isIfStatement node))

(defn do-statement?
  ^js [node]
  (typescript/isDoStatement node))

(defn while-statement?
  ^js [node]
  (typescript/isWhileStatement node))

(defn for-statement?
  ^js [node]
  (typescript/isForStatement node))

(defn for-in-statement?
  ^js [node]
  (typescript/isForInStatement node))

(defn for-of-statement?
  ^js [node]
  (typescript/isForOfStatement node))

(defn continue-statement?
  ^js [node]
  (typescript/isContinueStatement node))

(defn break-statement?
  ^js [node]
  (typescript/isBreakStatement node))

(defn return-statement?
  ^js [node]
  (typescript/isReturnStatement node))

(defn with-statement?
  ^js [node]
  (typescript/isWithStatement node))

(defn switch-statement?
  ^js [node]
  (typescript/isSwitchStatement node))

(defn labeled-statement?
  ^js [node]
  (typescript/isLabeledStatement node))

(defn throw-statement?
  ^js [node]
  (typescript/isThrowStatement node))

(defn try-statement?
  ^js [node]
  (typescript/isTryStatement node))

(defn debugger-statement?
  ^js [node]
  (typescript/isDebuggerStatement node))

(defn variable-declaration?
  ^js [node]
  (typescript/isVariableDeclaration node))

(defn variable-declaration-list?
  ^js [node]
  (typescript/isVariableDeclarationList node))

(defn function-declaration?
  ^js [node]
  (typescript/isFunctionDeclaration node))

(defn class-declaration?
  ^js [node]
  (typescript/isClassDeclaration node))

(defn interface-declaration?
  ^js [node]
  (typescript/isInterfaceDeclaration node))

(defn type-alias-declaration?
  ^js [node]
  (typescript/isTypeAliasDeclaration node))

(defn enum-declaration?
  ^js [node]
  (typescript/isEnumDeclaration node))

(defn module-declaration?
  ^js [node]
  (typescript/isModuleDeclaration node))

(defn module-block?
  ^js [node]
  (typescript/isModuleBlock node))

(defn case-block?
  ^js [node]
  (typescript/isCaseBlock node))

(defn namespace-export-declaration?
  ^js [node]
  (typescript/isNamespaceExportDeclaration node))

(defn import-equals-declaration?
  ^js [node]
  (typescript/isImportEqualsDeclaration node))

(defn import-declaration?
  ^js [node]
  (typescript/isImportDeclaration node))

(defn import-clause?
  ^js [node]
  (typescript/isImportClause node))

(defn import-type-assertion-container?
  ^js [node]
  (typescript/isImportTypeAssertionContainer node))

(defn assert-clause?
  ^js [node]
  (typescript/isAssertClause node))

(defn assert-entry?
  ^js [node]
  (typescript/isAssertEntry node))

(defn namespace-import?
  ^js [node]
  (typescript/isNamespaceImport node))

(defn namespace-export?
  ^js [node]
  (typescript/isNamespaceExport node))

(defn named-imports?
  ^js [node]
  (typescript/isNamedImports node))

(defn import-specifier?
  ^js [node]
  (typescript/isImportSpecifier node))

(defn export-assignment?
  ^js [node]
  (typescript/isExportAssignment node))

(defn export-declaration?
  ^js [node]
  (typescript/isExportDeclaration node))

(defn named-exports?
  ^js [node]
  (typescript/isNamedExports node))

(defn export-specifier?
  ^js [node]
  (typescript/isExportSpecifier node))

(defn missing-declaration?
  ^js [node]
  (typescript/isMissingDeclaration node))

(defn not-emitted-statement?
  ^js [node]
  (typescript/isNotEmittedStatement node))

(defn external-module-reference?
  ^js [node]
  (typescript/isExternalModuleReference node))

(defn jsx-element?
  ^js [node]
  (typescript/isJsxElement node))

(defn jsx-self-closing-element?
  ^js [node]
  (typescript/isJsxSelfClosingElement node))

(defn jsx-opening-element?
  ^js [node]
  (typescript/isJsxOpeningElement node))

(defn jsx-closing-element?
  ^js [node]
  (typescript/isJsxClosingElement node))

(defn jsx-fragment?
  ^js [node]
  (typescript/isJsxFragment node))

(defn jsx-opening-fragment?
  ^js [node]
  (typescript/isJsxOpeningFragment node))

(defn jsx-closing-fragment?
  ^js [node]
  (typescript/isJsxClosingFragment node))

(defn jsx-attribute?
  ^js [node]
  (typescript/isJsxAttribute node))

(defn jsx-attributes?
  ^js [node]
  (typescript/isJsxAttributes node))

(defn jsx-spread-attribute?
  ^js [node]
  (typescript/isJsxSpreadAttribute node))

(defn jsx-expression?
  ^js [node]
  (typescript/isJsxExpression node))

(defn case-clause?
  ^js [node]
  (typescript/isCaseClause node))

(defn default-clause?
  ^js [node]
  (typescript/isDefaultClause node))

(defn heritage-clause?
  ^js [node]
  (typescript/isHeritageClause node))

(defn catch-clause?
  ^js [node]
  (typescript/isCatchClause node))

(defn property-assignment?
  ^js [node]
  (typescript/isPropertyAssignment node))

(defn shorthand-property-assignment?
  ^js [node]
  (typescript/isShorthandPropertyAssignment node))

(defn spread-assignment?
  ^js [node]
  (typescript/isSpreadAssignment node))

(defn enum-member?
  ^js [node]
  (typescript/isEnumMember node))

(defn unparsed-prepend?
  ^js [node]
  (typescript/isUnparsedPrepend node))

(defn source-file?
  ^js [node]
  (typescript/isSourceFile node))

(defn bundle?
  ^js [node]
  (typescript/isBundle node))

(defn unparsed-source?
  ^js [node]
  (typescript/isUnparsedSource node))

(defn js-doc-type-expression?
  ^js [node]
  (typescript/isJSDocTypeExpression node))

(defn js-doc-name-reference?
  ^js [node]
  (typescript/isJSDocNameReference node))

(defn js-doc-member-name?
  ^js [node]
  (typescript/isJSDocMemberName node))

(defn js-doc-link?
  ^js [node]
  (typescript/isJSDocLink node))

(defn js-doc-link-code?
  ^js [node]
  (typescript/isJSDocLinkCode node))

(defn js-doc-link-plain?
  ^js [node]
  (typescript/isJSDocLinkPlain node))

(defn js-doc-all-type?
  ^js [node]
  (typescript/isJSDocAllType node))

(defn js-doc-unknown-type?
  ^js [node]
  (typescript/isJSDocUnknownType node))

(defn js-doc-nullable-type?
  ^js [node]
  (typescript/isJSDocNullableType node))

(defn js-doc-non-nullable-type?
  ^js [node]
  (typescript/isJSDocNonNullableType node))

(defn js-doc-optional-type?
  ^js [node]
  (typescript/isJSDocOptionalType node))

(defn js-doc-function-type?
  ^js [node]
  (typescript/isJSDocFunctionType node))

(defn js-doc-variadic-type?
  ^js [node]
  (typescript/isJSDocVariadicType node))

(defn js-doc-namepath-type?
  ^js [node]
  (typescript/isJSDocNamepathType node))

(defn js-doc?
  ^js [node]
  (typescript/isJSDoc node))

(defn js-doc-type-literal?
  ^js [node]
  (typescript/isJSDocTypeLiteral node))

(defn js-doc-signature?
  ^js [node]
  (typescript/isJSDocSignature node))

(defn js-doc-augments-tag?
  ^js [node]
  (typescript/isJSDocAugmentsTag node))

(defn js-doc-author-tag?
  ^js [node]
  (typescript/isJSDocAuthorTag node))

(defn js-doc-class-tag?
  ^js [node]
  (typescript/isJSDocClassTag node))

(defn js-doc-callback-tag?
  ^js [node]
  (typescript/isJSDocCallbackTag node))

(defn js-doc-public-tag?
  ^js [node]
  (typescript/isJSDocPublicTag node))

(defn js-doc-private-tag?
  ^js [node]
  (typescript/isJSDocPrivateTag node))

(defn js-doc-protected-tag?
  ^js [node]
  (typescript/isJSDocProtectedTag node))

(defn js-doc-readonly-tag?
  ^js [node]
  (typescript/isJSDocReadonlyTag node))

(defn js-doc-override-tag?
  ^js [node]
  (typescript/isJSDocOverrideTag node))

(defn js-doc-deprecated-tag?
  ^js [node]
  (typescript/isJSDocDeprecatedTag node))

(defn js-doc-see-tag?
  ^js [node]
  (typescript/isJSDocSeeTag node))

(defn js-doc-enum-tag?
  ^js [node]
  (typescript/isJSDocEnumTag node))

(defn js-doc-parameter-tag?
  ^js [node]
  (typescript/isJSDocParameterTag node))

(defn js-doc-return-tag?
  ^js [node]
  (typescript/isJSDocReturnTag node))

(defn js-doc-this-tag?
  ^js [node]
  (typescript/isJSDocThisTag node))

(defn js-doc-type-tag?
  ^js [node]
  (typescript/isJSDocTypeTag node))

(defn js-doc-template-tag?
  ^js [node]
  (typescript/isJSDocTemplateTag node))

(defn js-doc-typedef-tag?
  ^js [node]
  (typescript/isJSDocTypedefTag node))

(defn js-doc-unknown-tag?
  ^js [node]
  (typescript/isJSDocUnknownTag node))

(defn js-doc-property-tag?
  ^js [node]
  (typescript/isJSDocPropertyTag node))

(defn js-doc-implements-tag?
  ^js [node]
  (typescript/isJSDocImplementsTag node))

(defn set-text-range
  (^js [range]
   (typescript/setTextRange range))
  (^js [range location]
   (typescript/setTextRange range location)))

(defn can-have-modifiers?
  ^js [node]
  (typescript/canHaveModifiers node))

(defn can-have-decorators?
  ^js [node]
  (typescript/canHaveDecorators node))

(defn for-each-child
  "Invokes a callback for each child of the given node. The 'cbNode' callback is invoked for all child nodes
   stored in properties. If a 'cbNodes' callback is specified, it is invoked for embedded arrays; otherwise,
   embedded arrays are flattened and the 'cbNode' callback is invoked for each element. If a callback returns
   a truthy value, iteration stops and that value is returned. Otherwise, undefined is returned."
  (^js [node cb-node]
   (typescript/forEachChild node cb-node))
  (^js [node cb-node cb-nodes]
   (typescript/forEachChild node cb-node cb-nodes)))

(defn create-source-file
  (^js [file-name source-text language-version-or-options]
   (typescript/createSourceFile file-name source-text language-version-or-options))
  (^js [file-name source-text language-version-or-options set-parent-nodes?]
   (typescript/createSourceFile file-name source-text language-version-or-options set-parent-nodes?))
  (^js [file-name source-text language-version-or-options set-parent-nodes? script-kind]
   (typescript/createSourceFile file-name source-text language-version-or-options set-parent-nodes? script-kind)))

(defn parse-isolated-entity-name
  ^js [text language-version]
  (typescript/parseIsolatedEntityName text language-version))

(defn parse-json-text
  "Parse json text into SyntaxTree and return node and parse errors if any"
  ^js [file-name source-text]
  (typescript/parseJsonText file-name source-text))

(defn external-module?
  ^js [file]
  (typescript/isExternalModule file))

(defn update-source-file
  (^js [source-file new-text text-change-range]
   (typescript/updateSourceFile source-file new-text text-change-range))
  (^js [source-file new-text text-change-range aggressive-checks?]
   (typescript/updateSourceFile source-file new-text text-change-range aggressive-checks?)))

(defn parse-command-line
  (^js [command-line]
   (typescript/parseCommandLine command-line))
  (^js [command-line read-file]
   (typescript/parseCommandLine command-line read-file)))

(defn parsed-command-line-of-config-file
  "Reads the config file, reports errors if any and exits if the config file cannot be found"
  (^js [config-file-name]
   (typescript/getParsedCommandLineOfConfigFile config-file-name))
  (^js [config-file-name options-to-extend]
   (typescript/getParsedCommandLineOfConfigFile config-file-name options-to-extend))
  (^js [config-file-name options-to-extend host]
   (typescript/getParsedCommandLineOfConfigFile config-file-name options-to-extend host))
  (^js [config-file-name options-to-extend host extended-config-cache]
   (typescript/getParsedCommandLineOfConfigFile config-file-name options-to-extend host extended-config-cache))
  (^js [config-file-name options-to-extend host extended-config-cache watch-options-to-extend]
   (typescript/getParsedCommandLineOfConfigFile config-file-name options-to-extend host extended-config-cache watch-options-to-extend))
  (^js [config-file-name options-to-extend host extended-config-cache watch-options-to-extend extra-file-extensions]
   (typescript/getParsedCommandLineOfConfigFile config-file-name options-to-extend host extended-config-cache watch-options-to-extend extra-file-extensions)))

(defn read-config-file
  "Read tsconfig.json file"
  ^js [file-name read-file]
  (typescript/readConfigFile file-name read-file))

(defn parse-config-file-text-to-json
  "Parse the text of the tsconfig.json file"
  ^js [file-name json-text]
  (typescript/parseConfigFileTextToJson file-name json-text))

(defn read-json-config-file
  "Read tsconfig.json file"
  ^js [file-name read-file]
  (typescript/readJsonConfigFile file-name read-file))

(defn convert-to-object
  "Convert the json syntax tree into the json value"
  ^js [source-file errors]
  (typescript/convertToObject source-file errors))

(defn parse-json-config-file-content
  "Parse the contents of a config file (tsconfig.json)."
  (^js [json host base-path]
   (typescript/parseJsonConfigFileContent json host base-path))
  (^js [json host base-path existing-options]
   (typescript/parseJsonConfigFileContent json host base-path existing-options))
  (^js [json host base-path existing-options config-file-name]
   (typescript/parseJsonConfigFileContent json host base-path existing-options config-file-name))
  (^js [json host base-path existing-options config-file-name resolution-stack]
   (typescript/parseJsonConfigFileContent json host base-path existing-options config-file-name resolution-stack))
  (^js [json host base-path existing-options config-file-name resolution-stack extra-file-extensions]
   (typescript/parseJsonConfigFileContent json host base-path existing-options config-file-name resolution-stack extra-file-extensions))
  (^js [json host base-path existing-options config-file-name resolution-stack extra-file-extensions extended-config-cache]
   (typescript/parseJsonConfigFileContent json host base-path existing-options config-file-name resolution-stack extra-file-extensions extended-config-cache))
  (^js [json host base-path existing-options config-file-name resolution-stack extra-file-extensions extended-config-cache existing-watch-options]
   (typescript/parseJsonConfigFileContent json host base-path existing-options config-file-name resolution-stack extra-file-extensions extended-config-cache existing-watch-options)))

(defn parse-json-source-file-config-file-content
  "Parse the contents of a config file (tsconfig.json)."
  (^js [source-file host base-path]
   (typescript/parseJsonSourceFileConfigFileContent source-file host base-path))
  (^js [source-file host base-path existing-options]
   (typescript/parseJsonSourceFileConfigFileContent source-file host base-path existing-options))
  (^js [source-file host base-path existing-options config-file-name]
   (typescript/parseJsonSourceFileConfigFileContent source-file host base-path existing-options config-file-name))
  (^js [source-file host base-path existing-options config-file-name resolution-stack]
   (typescript/parseJsonSourceFileConfigFileContent source-file host base-path existing-options config-file-name resolution-stack))
  (^js [source-file host base-path existing-options config-file-name resolution-stack extra-file-extensions]
   (typescript/parseJsonSourceFileConfigFileContent source-file host base-path existing-options config-file-name resolution-stack extra-file-extensions))
  (^js [source-file host base-path existing-options config-file-name resolution-stack extra-file-extensions extended-config-cache]
   (typescript/parseJsonSourceFileConfigFileContent source-file host base-path existing-options config-file-name resolution-stack extra-file-extensions extended-config-cache))
  (^js [source-file host base-path existing-options config-file-name resolution-stack extra-file-extensions extended-config-cache existing-watch-options]
   (typescript/parseJsonSourceFileConfigFileContent source-file host base-path existing-options config-file-name resolution-stack extra-file-extensions extended-config-cache existing-watch-options)))

(defn convert-compiler-options-from-json
  (^js [json-options base-path]
   (typescript/convertCompilerOptionsFromJson json-options base-path))
  (^js [json-options base-path config-file-name]
   (typescript/convertCompilerOptionsFromJson json-options base-path config-file-name)))

(defn convert-type-acquisition-from-json
  (^js [json-options base-path]
   (typescript/convertTypeAcquisitionFromJson json-options base-path))
  (^js [json-options base-path config-file-name]
   (typescript/convertTypeAcquisitionFromJson json-options base-path config-file-name)))

(defn effective-type-roots
  ^js [options host]
  (typescript/getEffectiveTypeRoots options host))

(defn resolve-type-reference-directive
  (^js [type-reference-directive-name]
   (typescript/resolveTypeReferenceDirective type-reference-directive-name))
  (^js [type-reference-directive-name containing-file]
   (typescript/resolveTypeReferenceDirective type-reference-directive-name containing-file))
  (^js [type-reference-directive-name containing-file options]
   (typescript/resolveTypeReferenceDirective type-reference-directive-name containing-file options))
  (^js [type-reference-directive-name containing-file options host]
   (typescript/resolveTypeReferenceDirective type-reference-directive-name containing-file options host))
  (^js [type-reference-directive-name containing-file options host redirected-reference]
   (typescript/resolveTypeReferenceDirective type-reference-directive-name containing-file options host redirected-reference))
  (^js [type-reference-directive-name containing-file options host redirected-reference cache]
   (typescript/resolveTypeReferenceDirective type-reference-directive-name containing-file options host redirected-reference cache))
  (^js [type-reference-directive-name containing-file options host redirected-reference cache resolution-mode]
   (typescript/resolveTypeReferenceDirective type-reference-directive-name containing-file options host redirected-reference cache resolution-mode)))

(defn automatic-type-directive-names
  "Given a set of options, returns the set of type directive names
     that should be included for this program automatically.
   This list could either come from the config file,
     or from enumerating the types root + initial secondary types lookup location.
   More type directives might appear in the program later as a result of loading actual source files;
     this list is only the set of defaults that are implicitly included."
  ^js [options host]
  (typescript/getAutomaticTypeDirectiveNames options host))

(defn create-module-resolution-cache
  (^js [current-directory canonical-file-name]
   (typescript/createModuleResolutionCache current-directory canonical-file-name))
  (^js [current-directory canonical-file-name options]
   (typescript/createModuleResolutionCache current-directory canonical-file-name options)))

(defn create-type-reference-directive-resolution-cache
  (^js [current-directory canonical-file-name]
   (typescript/createTypeReferenceDirectiveResolutionCache current-directory canonical-file-name))
  (^js [current-directory canonical-file-name options]
   (typescript/createTypeReferenceDirectiveResolutionCache current-directory canonical-file-name options))
  (^js [current-directory canonical-file-name options package-json-info-cache]
   (typescript/createTypeReferenceDirectiveResolutionCache current-directory canonical-file-name options package-json-info-cache)))

(defn resolve-module-name-from-cache
  (^js [module-name containing-file cache]
   (typescript/resolveModuleNameFromCache module-name containing-file cache))
  (^js [module-name containing-file cache mode]
   (typescript/resolveModuleNameFromCache module-name containing-file cache mode)))

(defn resolve-module-name
  (^js [module-name containing-file compiler-options host]
   (typescript/resolveModuleName module-name containing-file compiler-options host))
  (^js [module-name containing-file compiler-options host cache]
   (typescript/resolveModuleName module-name containing-file compiler-options host cache))
  (^js [module-name containing-file compiler-options host cache redirected-reference]
   (typescript/resolveModuleName module-name containing-file compiler-options host cache redirected-reference))
  (^js [module-name containing-file compiler-options host cache redirected-reference resolution-mode]
   (typescript/resolveModuleName module-name containing-file compiler-options host cache redirected-reference resolution-mode)))

(defn node-module-name-resolver
  (^js [module-name containing-file compiler-options host]
   (typescript/nodeModuleNameResolver module-name containing-file compiler-options host))
  (^js [module-name containing-file compiler-options host cache]
   (typescript/nodeModuleNameResolver module-name containing-file compiler-options host cache))
  (^js [module-name containing-file compiler-options host cache redirected-reference]
   (typescript/nodeModuleNameResolver module-name containing-file compiler-options host cache redirected-reference)))

(defn classic-name-resolver
  (^js [module-name containing-file compiler-options host]
   (typescript/classicNameResolver module-name containing-file compiler-options host))
  (^js [module-name containing-file compiler-options host cache]
   (typescript/classicNameResolver module-name containing-file compiler-options host cache))
  (^js [module-name containing-file compiler-options host cache redirected-reference]
   (typescript/classicNameResolver module-name containing-file compiler-options host cache redirected-reference)))

(defn visit-node
  "Visits a Node using the supplied visitor, possibly returning a new Node in its place."
  (^js []
   (typescript/visitNode))
  (^js [node]
   (typescript/visitNode node))
  (^js [node visitor]
   (typescript/visitNode node visitor))
  (^js [node visitor test]
   (typescript/visitNode node visitor test))
  (^js [node visitor test lift]
   (typescript/visitNode node visitor test lift)))

(defn visit-nodes
  "Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place."
  (^js []
   (typescript/visitNodes))
  (^js [nodes]
   (typescript/visitNodes nodes))
  (^js [nodes visitor]
   (typescript/visitNodes nodes visitor))
  (^js [nodes visitor test]
   (typescript/visitNodes nodes visitor test))
  (^js [nodes visitor test start]
   (typescript/visitNodes nodes visitor test start))
  (^js [nodes visitor test start count]
   (typescript/visitNodes nodes visitor test start count)))

(defn visit-lexical-environment
  "Starts a new lexical environment and visits a statement list, ending the lexical environment
   and merging hoisted declarations upon completion."
  (^js [statements visitor context]
   (typescript/visitLexicalEnvironment statements visitor context))
  (^js [statements visitor context start]
   (typescript/visitLexicalEnvironment statements visitor context start))
  (^js [statements visitor context start ensure-use-strict?]
   (typescript/visitLexicalEnvironment statements visitor context start ensure-use-strict?))
  (^js [statements visitor context start ensure-use-strict? nodes-visitor]
   (typescript/visitLexicalEnvironment statements visitor context start ensure-use-strict? nodes-visitor)))

(defn visit-parameter-list
  "Starts a new lexical environment and visits a parameter list, suspending the lexical
   environment upon completion."
  (^js []
   (typescript/visitParameterList))
  (^js [nodes]
   (typescript/visitParameterList nodes))
  (^js [nodes visitor]
   (typescript/visitParameterList nodes visitor))
  (^js [nodes visitor context]
   (typescript/visitParameterList nodes visitor context))
  (^js [nodes visitor context nodes-visitor]
   (typescript/visitParameterList nodes visitor context nodes-visitor)))

(defn visit-function-body
  "Resumes a suspended lexical environment and visits a function body, ending the lexical
   environment and merging hoisted declarations upon completion.
   Resumes a suspended lexical environment and visits a concise body, ending the lexical
   environment and merging hoisted declarations upon completion."
  (^js []
   (typescript/visitFunctionBody))
  (^js [node]
   (typescript/visitFunctionBody node))
  (^js [node visitor]
   (typescript/visitFunctionBody node visitor))
  (^js [node visitor context]
   (typescript/visitFunctionBody node visitor context)))

(defn visit-iteration-body
  "Visits an iteration body, adding any block-scoped variables required by the transformation."
  ^js [body visitor context]
  (typescript/visitIterationBody body visitor context))

(defn visit-each-child
  "Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place."
  (^js []
   (typescript/visitEachChild))
  (^js [node]
   (typescript/visitEachChild node))
  (^js [node visitor]
   (typescript/visitEachChild node visitor))
  (^js [node visitor context]
   (typescript/visitEachChild node visitor context))
  (^js [node visitor context nodes-visitor]
   (typescript/visitEachChild node visitor context nodes-visitor))
  (^js [node visitor context nodes-visitor token-visitor]
   (typescript/visitEachChild node visitor context nodes-visitor token-visitor)))

(defn ts-build-info-emit-output-file-path
  ^js [options]
  (typescript/getTsBuildInfoEmitOutputFilePath options))

(defn output-file-names
  ^js [command-line input-file-name ignore-case?]
  (typescript/getOutputFileNames command-line input-file-name ignore-case?))

(defn create-printer
  (^js []
   (typescript/createPrinter))
  (^js [printer-options]
   (typescript/createPrinter printer-options))
  (^js [printer-options handlers]
   (typescript/createPrinter printer-options handlers)))

(defn find-config-file
  (^js [search-path file-exists]
   (typescript/findConfigFile search-path file-exists))
  (^js [search-path file-exists config-name]
   (typescript/findConfigFile search-path file-exists config-name)))

(defn resolve-tripleslash-reference
  ^js [module-name containing-file]
  (typescript/resolveTripleslashReference module-name containing-file))

(defn create-compiler-host
  (^js [options]
   (typescript/createCompilerHost options))
  (^js [options set-parent-nodes?]
   (typescript/createCompilerHost options set-parent-nodes?)))

(defn pre-emit-diagnostics
  (^js [program]
   (typescript/getPreEmitDiagnostics program))
  (^js [program source-file]
   (typescript/getPreEmitDiagnostics program source-file))
  (^js [program source-file cancellation-token]
   (typescript/getPreEmitDiagnostics program source-file cancellation-token)))

(defn format-diagnostics
  ^js [diagnostics host]
  (typescript/formatDiagnostics diagnostics host))

(defn format-diagnostic
  ^js [diagnostic host]
  (typescript/formatDiagnostic diagnostic host))

(defn format-diagnostics-with-color-and-context
  ^js [diagnostics host]
  (typescript/formatDiagnosticsWithColorAndContext diagnostics host))

(defn flatten-diagnostic-message-text
  (^js []
   (typescript/flattenDiagnosticMessageText))
  (^js [diag]
   (typescript/flattenDiagnosticMessageText diag))
  (^js [diag new-line]
   (typescript/flattenDiagnosticMessageText diag new-line))
  (^js [diag new-line indent]
   (typescript/flattenDiagnosticMessageText diag new-line indent)))

(defn mode-for-file-reference
  "Calculates the resulting resolution mode for some reference in some file - this is generally the explicitly
   provided resolution mode in the reference, unless one is not present, in which case it is the mode of the containing file."
  (^js [ref]
   (typescript/getModeForFileReference ref))
  (^js [ref containing-file-mode]
   (typescript/getModeForFileReference ref containing-file-mode)))

(defn mode-for-resolution-at-index
  "Calculates the final resolution mode for an import at some index within a file's imports list. This is generally the explicitly
   defined mode of the import if provided, or, if not, the mode of the containing file (with some exceptions: import=require is always commonjs, dynamic import is always esm).
   If you have an actual import node, prefer using getModeForUsageLocation on the reference string node."
  ^js [file index]
  (typescript/getModeForResolutionAtIndex file index))

(defn mode-for-usage-location
  "Calculates the final resolution mode for a given module reference node. This is generally the explicitly provided resolution mode, if
   one exists, or the mode of the containing source file. (Excepting import=require, which is always commonjs, and dynamic import, which is always esm).
   Notably, this function always returns `undefined` if the containing file has an `undefined` `impliedNodeFormat` - this field is only set when
   `moduleResolution` is `node16`+."
  ^js [file usage]
  (typescript/getModeForUsageLocation file usage))

(defn config-file-parsing-diagnostics
  ^js [config-file-parse-result]
  (typescript/getConfigFileParsingDiagnostics config-file-parse-result))

(defn implied-node-format-for-file
  "A function for determining if a given file is esm or cjs format, assuming modern node module resolution rules, as configured by the
   `options` parameter."
  (^js [file-name]
   (typescript/getImpliedNodeFormatForFile file-name))
  (^js [file-name package-json-info-cache]
   (typescript/getImpliedNodeFormatForFile file-name package-json-info-cache))
  (^js [file-name package-json-info-cache host]
   (typescript/getImpliedNodeFormatForFile file-name package-json-info-cache host))
  (^js [file-name package-json-info-cache host options]
   (typescript/getImpliedNodeFormatForFile file-name package-json-info-cache host options)))

(defn create-program
  "Create a new 'Program' instance. A Program is an immutable collection of 'SourceFile's and a 'CompilerOptions'
   that represent a compilation unit.
   
   Creating a program proceeds from a set of root files, expanding the set of inputs by following imports and
   triple-slash-reference-path directives transitively. '@types' and triple-slash-reference-types are also pulled in."
  (^js [create-program-options]
   (typescript/createProgram create-program-options))
  (^js [root-names options]
   (typescript/createProgram root-names options))
  (^js [root-names options host]
   (typescript/createProgram root-names options host))
  (^js [root-names options host old-program]
   (typescript/createProgram root-names options host old-program))
  (^js [root-names options host old-program config-file-parsing-diagnostics]
   (typescript/createProgram root-names options host old-program config-file-parsing-diagnostics)))

(defn resolve-project-reference-path
  "Returns the target config filename of a project reference.
   Note: The file might not exist."
  (^js [ref]
   (typescript/resolveProjectReferencePath ref))
  (^js [host ref]
   (typescript/resolveProjectReferencePath host ref)))

(defn create-semantic-diagnostics-builder-program
  "Create the builder to manage semantic diagnostics and cache them"
  {:arglists '([]
               [new-program host]
               [new-program host old-program]
               [new-program host old-program config-file-parsing-diagnostics]
               [root-names]
               [root-names options]
               [root-names options host]
               [root-names options host old-program]
               [root-names options host old-program config-file-parsing-diagnostics]
               [root-names options host old-program config-file-parsing-diagnostics project-references])}
  (^js []
   (typescript/createSemanticDiagnosticsBuilderProgram))
  (^js [root-names]
   (typescript/createSemanticDiagnosticsBuilderProgram root-names))
  (^js [a b]
   (typescript/createSemanticDiagnosticsBuilderProgram a b))
  (^js [a b c]
   (typescript/createSemanticDiagnosticsBuilderProgram a b c))
  (^js [a b c d]
   (typescript/createSemanticDiagnosticsBuilderProgram a b c d))
  (^js [root-names options host old-program config-file-parsing-diagnostics]
   (typescript/createSemanticDiagnosticsBuilderProgram root-names options host old-program config-file-parsing-diagnostics))
  (^js [root-names options host old-program config-file-parsing-diagnostics project-references]
   (typescript/createSemanticDiagnosticsBuilderProgram root-names options host old-program config-file-parsing-diagnostics project-references)))

(defn create-emit-and-semantic-diagnostics-builder-program
  "Create the builder that can handle the changes in program and iterate through changed files
   to emit the those files and manage semantic diagnostics cache as well"
  {:arglists '([]
               [new-program host]
               [new-program host old-program]
               [new-program host old-program config-file-parsing-diagnostics]
               [root-names]
               [root-names options]
               [root-names options host]
               [root-names options host old-program]
               [root-names options host old-program config-file-parsing-diagnostics]
               [root-names options host old-program config-file-parsing-diagnostics project-references])}
  (^js []
   (typescript/createEmitAndSemanticDiagnosticsBuilderProgram))
  (^js [root-names]
   (typescript/createEmitAndSemanticDiagnosticsBuilderProgram root-names))
  (^js [a b]
   (typescript/createEmitAndSemanticDiagnosticsBuilderProgram a b))
  (^js [a b c]
   (typescript/createEmitAndSemanticDiagnosticsBuilderProgram a b c))
  (^js [a b c d]
   (typescript/createEmitAndSemanticDiagnosticsBuilderProgram a b c d))
  (^js [root-names options host old-program config-file-parsing-diagnostics]
   (typescript/createEmitAndSemanticDiagnosticsBuilderProgram root-names options host old-program config-file-parsing-diagnostics))
  (^js [root-names options host old-program config-file-parsing-diagnostics project-references]
   (typescript/createEmitAndSemanticDiagnosticsBuilderProgram root-names options host old-program config-file-parsing-diagnostics project-references)))

(defn create-abstract-builder
  "Creates a builder thats just abstraction over program and can be used with watch"
  {:arglists '([]
               [new-program host]
               [new-program host old-program]
               [new-program host old-program config-file-parsing-diagnostics]
               [root-names]
               [root-names options]
               [root-names options host]
               [root-names options host old-program]
               [root-names options host old-program config-file-parsing-diagnostics]
               [root-names options host old-program config-file-parsing-diagnostics project-references])}
  (^js []
   (typescript/createAbstractBuilder))
  (^js [root-names]
   (typescript/createAbstractBuilder root-names))
  (^js [a b]
   (typescript/createAbstractBuilder a b))
  (^js [a b c]
   (typescript/createAbstractBuilder a b c))
  (^js [a b c d]
   (typescript/createAbstractBuilder a b c d))
  (^js [root-names options host old-program config-file-parsing-diagnostics]
   (typescript/createAbstractBuilder root-names options host old-program config-file-parsing-diagnostics))
  (^js [root-names options host old-program config-file-parsing-diagnostics project-references]
   (typescript/createAbstractBuilder root-names options host old-program config-file-parsing-diagnostics project-references)))

(defn read-builder-program
  ^js [compiler-options host]
  (typescript/readBuilderProgram compiler-options host))

(defn create-incremental-compiler-host
  (^js [options]
   (typescript/createIncrementalCompilerHost options))
  (^js [options system]
   (typescript/createIncrementalCompilerHost options system)))

(defn create-incremental-program
  ^js [root-names-options-config-file-parsing-diagnostics-project-references-host-create-program]
  (typescript/createIncrementalProgram root-names-options-config-file-parsing-diagnostics-project-references-host-create-program))

(defn create-watch-compiler-host
  "Create the watch compiler host for either configFile or fileNames and its options"
  {:arglists '([config-file-name]
               [config-file-name options-to-extend]
               [config-file-name options-to-extend system]
               [config-file-name options-to-extend system create-program]
               [config-file-name options-to-extend system create-program report-diagnostic]
               [config-file-name options-to-extend system create-program report-diagnostic report-watch-status]
               [config-file-name options-to-extend system create-program report-diagnostic report-watch-status watch-options-to-extend]
               [config-file-name options-to-extend system create-program report-diagnostic report-watch-status watch-options-to-extend extra-file-extensions]
               [root-files options system]
               [root-files options system create-program]
               [root-files options system create-program report-diagnostic]
               [root-files options system create-program report-diagnostic report-watch-status]
               [root-files options system create-program report-diagnostic report-watch-status project-references]
               [root-files options system create-program report-diagnostic report-watch-status project-references watch-options])}
  (^js [config-file-name]
   (typescript/createWatchCompilerHost config-file-name))
  (^js [config-file-name options-to-extend]
   (typescript/createWatchCompilerHost config-file-name options-to-extend))
  (^js [a b c]
   (typescript/createWatchCompilerHost a b c))
  (^js [a b c d]
   (typescript/createWatchCompilerHost a b c d))
  (^js [a b c d e]
   (typescript/createWatchCompilerHost a b c d e))
  (^js [a b c d e f]
   (typescript/createWatchCompilerHost a b c d e f))
  (^js [a b c d e f g]
   (typescript/createWatchCompilerHost a b c d e f g))
  (^js [a b c d e f g h]
   (typescript/createWatchCompilerHost a b c d e f g h)))

(defn create-watch-program
  "Creates the watch from the host for root files and compiler options
   Creates the watch from the host for config file"
  ^js [host]
  (typescript/createWatchProgram host))

(defn create-builder-status-reporter
  "Create a function that reports watch status by writing to the system and handles the formating of the diagnostic"
  (^js [system]
   (typescript/createBuilderStatusReporter system))
  (^js [system pretty?]
   (typescript/createBuilderStatusReporter system pretty?)))

(defn create-solution-builder-host
  (^js []
   (typescript/createSolutionBuilderHost))
  (^js [system]
   (typescript/createSolutionBuilderHost system))
  (^js [system create-program]
   (typescript/createSolutionBuilderHost system create-program))
  (^js [system create-program report-diagnostic]
   (typescript/createSolutionBuilderHost system create-program report-diagnostic))
  (^js [system create-program report-diagnostic report-solution-builder-status]
   (typescript/createSolutionBuilderHost system create-program report-diagnostic report-solution-builder-status))
  (^js [system create-program report-diagnostic report-solution-builder-status report-error-summary]
   (typescript/createSolutionBuilderHost system create-program report-diagnostic report-solution-builder-status report-error-summary)))

(defn create-solution-builder-with-watch-host
  (^js []
   (typescript/createSolutionBuilderWithWatchHost))
  (^js [system]
   (typescript/createSolutionBuilderWithWatchHost system))
  (^js [system create-program]
   (typescript/createSolutionBuilderWithWatchHost system create-program))
  (^js [system create-program report-diagnostic]
   (typescript/createSolutionBuilderWithWatchHost system create-program report-diagnostic))
  (^js [system create-program report-diagnostic report-solution-builder-status]
   (typescript/createSolutionBuilderWithWatchHost system create-program report-diagnostic report-solution-builder-status))
  (^js [system create-program report-diagnostic report-solution-builder-status report-watch-status]
   (typescript/createSolutionBuilderWithWatchHost system create-program report-diagnostic report-solution-builder-status report-watch-status)))

(defn create-solution-builder
  ^js [host root-names default-options]
  (typescript/createSolutionBuilder host root-names default-options))

(defn create-solution-builder-with-watch
  (^js [host root-names default-options]
   (typescript/createSolutionBuilderWithWatch host root-names default-options))
  (^js [host root-names default-options base-watch-options]
   (typescript/createSolutionBuilderWithWatch host root-names default-options base-watch-options)))

(defn default-format-code-settings
  (^js []
   (typescript/getDefaultFormatCodeSettings))
  (^js [new-line-character]
   (typescript/getDefaultFormatCodeSettings new-line-character)))

(defn create-classifier
  "The classifier is used for syntactic highlighting in editors via the TSServer"
  ^js []
  (typescript/createClassifier))

(defn create-document-registry
  (^js []
   (typescript/createDocumentRegistry))
  (^js [use-case-sensitive-file-names?]
   (typescript/createDocumentRegistry use-case-sensitive-file-names?))
  (^js [use-case-sensitive-file-names? current-directory]
   (typescript/createDocumentRegistry use-case-sensitive-file-names? current-directory)))

(defn pre-process-file
  (^js [source-text]
   (typescript/preProcessFile source-text))
  (^js [source-text read-import-files?]
   (typescript/preProcessFile source-text read-import-files?))
  (^js [source-text read-import-files? detect-java-script-imports?]
   (typescript/preProcessFile source-text read-import-files? detect-java-script-imports?)))

(defn transpile-module
  ^js [input transpile-options]
  (typescript/transpileModule input transpile-options))

(defn transpile
  (^js [input]
   (typescript/transpile input))
  (^js [input compiler-options]
   (typescript/transpile input compiler-options))
  (^js [input compiler-options file-name]
   (typescript/transpile input compiler-options file-name))
  (^js [input compiler-options file-name diagnostics]
   (typescript/transpile input compiler-options file-name diagnostics))
  (^js [input compiler-options file-name diagnostics module-name]
   (typescript/transpile input compiler-options file-name diagnostics module-name)))

(defn to-editor-settings
  ^js [options]
  (typescript/toEditorSettings options))

(defn display-parts-to-string
  (^js []
   (typescript/displayPartsToString))
  (^js [display-parts]
   (typescript/displayPartsToString display-parts)))

(defn default-compiler-options
  ^js []
  (typescript/getDefaultCompilerOptions))

(defn supported-code-fixes
  ^js []
  (typescript/getSupportedCodeFixes))

(defn create-language-service-source-file
  (^js [file-name script-snapshot script-target-or-options version set-node-parents?]
   (typescript/createLanguageServiceSourceFile file-name script-snapshot script-target-or-options version set-node-parents?))
  (^js [file-name script-snapshot script-target-or-options version set-node-parents? script-kind]
   (typescript/createLanguageServiceSourceFile file-name script-snapshot script-target-or-options version set-node-parents? script-kind)))

(defn update-language-service-source-file
  (^js [source-file script-snapshot version]
   (typescript/updateLanguageServiceSourceFile source-file script-snapshot version))
  (^js [source-file script-snapshot version text-change-range]
   (typescript/updateLanguageServiceSourceFile source-file script-snapshot version text-change-range))
  (^js [source-file script-snapshot version text-change-range aggressive-checks?]
   (typescript/updateLanguageServiceSourceFile source-file script-snapshot version text-change-range aggressive-checks?)))

(defn create-language-service
  (^js [host]
   (typescript/createLanguageService host))
  (^js [host document-registry]
   (typescript/createLanguageService host document-registry))
  (^js [host document-registry syntax-only-or-language-service-mode?]
   (typescript/createLanguageService host document-registry syntax-only-or-language-service-mode?)))

(defn default-lib-file-path
  "Get the path of the default library files (lib.d.ts) as distributed with the typescript
   node package.
   The functionality is not supported if the ts module is consumed outside of a node module."
  ^js [options]
  (typescript/getDefaultLibFilePath options))

(defn services-version
  "The version of the language service API"
  ^js []
  typescript/servicesVersion)

(defn transform
  "Transform one or more nodes using the supplied transformers."
  (^js [source transformers]
   (typescript/transform source transformers))
  (^js [source transformers compiler-options]
   (typescript/transform source transformers compiler-options)))

(defn create-node-array
  ^js []
  typescript/createNodeArray)

(defn create-numeric-literal
  ^js []
  typescript/createNumericLiteral)

(defn create-big-int-literal
  ^js []
  typescript/createBigIntLiteral)

(defn create-string-literal
  ^js []
  typescript/createStringLiteral)

(defn create-string-literal-from-node
  ^js []
  typescript/createStringLiteralFromNode)

(defn create-regular-expression-literal
  ^js []
  typescript/createRegularExpressionLiteral)

(defn create-loop-variable
  ^js []
  typescript/createLoopVariable)

(defn create-unique-name
  ^js []
  typescript/createUniqueName)

(defn create-private-identifier
  ^js []
  typescript/createPrivateIdentifier)

(defn create-super
  ^js []
  typescript/createSuper)

(defn create-this
  ^js []
  typescript/createThis)

(defn create-null
  ^js []
  typescript/createNull)

(defn create-true
  ^js []
  typescript/createTrue)

(defn create-false
  ^js []
  typescript/createFalse)

(defn create-modifier
  ^js []
  typescript/createModifier)

(defn create-modifiers-from-modifier-flags
  ^js []
  typescript/createModifiersFromModifierFlags)

(defn create-qualified-name
  ^js []
  typescript/createQualifiedName)

(defn update-qualified-name
  ^js []
  typescript/updateQualifiedName)

(defn create-computed-property-name
  ^js []
  typescript/createComputedPropertyName)

(defn update-computed-property-name
  ^js []
  typescript/updateComputedPropertyName)

(defn create-type-parameter-declaration
  ^js []
  typescript/createTypeParameterDeclaration)

(defn update-type-parameter-declaration
  ^js []
  typescript/updateTypeParameterDeclaration)

(defn create-parameter
  ^js []
  typescript/createParameter)

(defn update-parameter
  ^js []
  typescript/updateParameter)

(defn create-decorator
  ^js []
  typescript/createDecorator)

(defn update-decorator
  ^js []
  typescript/updateDecorator)

(defn create-property
  ^js []
  typescript/createProperty)

(defn update-property
  ^js []
  typescript/updateProperty)

(defn create-method
  ^js []
  typescript/createMethod)

(defn update-method
  ^js []
  typescript/updateMethod)

(defn create-constructor
  ^js []
  typescript/createConstructor)

(defn update-constructor
  ^js []
  typescript/updateConstructor)

(defn create-get-accessor
  ^js []
  typescript/createGetAccessor)

(defn update-get-accessor
  ^js []
  typescript/updateGetAccessor)

(defn create-set-accessor
  ^js []
  typescript/createSetAccessor)

(defn update-set-accessor
  ^js []
  typescript/updateSetAccessor)

(defn create-call-signature
  ^js []
  typescript/createCallSignature)

(defn update-call-signature
  ^js []
  typescript/updateCallSignature)

(defn create-construct-signature
  ^js []
  typescript/createConstructSignature)

(defn update-construct-signature
  ^js []
  typescript/updateConstructSignature)

(defn update-index-signature
  ^js []
  typescript/updateIndexSignature)

(defn create-keyword-type-node
  ^js []
  typescript/createKeywordTypeNode)

(defn create-type-predicate-node-with-modifier
  ^js []
  typescript/createTypePredicateNodeWithModifier)

(defn update-type-predicate-node-with-modifier
  ^js []
  typescript/updateTypePredicateNodeWithModifier)

(defn create-type-reference-node
  ^js []
  typescript/createTypeReferenceNode)

(defn update-type-reference-node
  ^js []
  typescript/updateTypeReferenceNode)

(defn create-function-type-node
  ^js []
  typescript/createFunctionTypeNode)

(defn update-function-type-node
  ^js []
  typescript/updateFunctionTypeNode)

(defn create-constructor-type-node
  ^js []
  typescript/createConstructorTypeNode)

(defn update-constructor-type-node
  ^js []
  typescript/updateConstructorTypeNode)

(defn create-type-query-node
  ^js []
  typescript/createTypeQueryNode)

(defn update-type-query-node
  ^js []
  typescript/updateTypeQueryNode)

(defn create-type-literal-node
  ^js []
  typescript/createTypeLiteralNode)

(defn update-type-literal-node
  ^js []
  typescript/updateTypeLiteralNode)

(defn create-array-type-node
  ^js []
  typescript/createArrayTypeNode)

(defn update-array-type-node
  ^js []
  typescript/updateArrayTypeNode)

(defn create-tuple-type-node
  ^js []
  typescript/createTupleTypeNode)

(defn update-tuple-type-node
  ^js []
  typescript/updateTupleTypeNode)

(defn create-optional-type-node
  ^js []
  typescript/createOptionalTypeNode)

(defn update-optional-type-node
  ^js []
  typescript/updateOptionalTypeNode)

(defn create-rest-type-node
  ^js []
  typescript/createRestTypeNode)

(defn update-rest-type-node
  ^js []
  typescript/updateRestTypeNode)

(defn create-union-type-node
  ^js []
  typescript/createUnionTypeNode)

(defn update-union-type-node
  ^js []
  typescript/updateUnionTypeNode)

(defn create-intersection-type-node
  ^js []
  typescript/createIntersectionTypeNode)

(defn update-intersection-type-node
  ^js []
  typescript/updateIntersectionTypeNode)

(defn create-conditional-type-node
  ^js []
  typescript/createConditionalTypeNode)

(defn update-conditional-type-node
  ^js []
  typescript/updateConditionalTypeNode)

(defn create-infer-type-node
  ^js []
  typescript/createInferTypeNode)

(defn update-infer-type-node
  ^js []
  typescript/updateInferTypeNode)

(defn create-import-type-node
  ^js []
  typescript/createImportTypeNode)

(defn update-import-type-node
  ^js []
  typescript/updateImportTypeNode)

(defn create-parenthesized-type
  ^js []
  typescript/createParenthesizedType)

(defn update-parenthesized-type
  ^js []
  typescript/updateParenthesizedType)

(defn create-this-type-node
  ^js []
  typescript/createThisTypeNode)

(defn update-type-operator-node
  ^js []
  typescript/updateTypeOperatorNode)

(defn create-indexed-access-type-node
  ^js []
  typescript/createIndexedAccessTypeNode)

(defn update-indexed-access-type-node
  ^js []
  typescript/updateIndexedAccessTypeNode)

(defn create-mapped-type-node
  ^js []
  typescript/createMappedTypeNode)

(defn update-mapped-type-node
  ^js []
  typescript/updateMappedTypeNode)

(defn create-literal-type-node
  ^js []
  typescript/createLiteralTypeNode)

(defn update-literal-type-node
  ^js []
  typescript/updateLiteralTypeNode)

(defn create-object-binding-pattern
  ^js []
  typescript/createObjectBindingPattern)

(defn update-object-binding-pattern
  ^js []
  typescript/updateObjectBindingPattern)

(defn create-array-binding-pattern
  ^js []
  typescript/createArrayBindingPattern)

(defn update-array-binding-pattern
  ^js []
  typescript/updateArrayBindingPattern)

(defn create-binding-element
  ^js []
  typescript/createBindingElement)

(defn update-binding-element
  ^js []
  typescript/updateBindingElement)

(defn create-array-literal
  ^js []
  typescript/createArrayLiteral)

(defn update-array-literal
  ^js []
  typescript/updateArrayLiteral)

(defn create-object-literal
  ^js []
  typescript/createObjectLiteral)

(defn update-object-literal
  ^js []
  typescript/updateObjectLiteral)

(defn create-property-access
  ^js []
  typescript/createPropertyAccess)

(defn update-property-access
  ^js []
  typescript/updatePropertyAccess)

(defn create-property-access-chain
  ^js []
  typescript/createPropertyAccessChain)

(defn update-property-access-chain
  ^js []
  typescript/updatePropertyAccessChain)

(defn create-element-access
  ^js []
  typescript/createElementAccess)

(defn update-element-access
  ^js []
  typescript/updateElementAccess)

(defn create-element-access-chain
  ^js []
  typescript/createElementAccessChain)

(defn update-element-access-chain
  ^js []
  typescript/updateElementAccessChain)

(defn create-call
  ^js []
  typescript/createCall)

(defn update-call
  ^js []
  typescript/updateCall)

(defn create-call-chain
  ^js []
  typescript/createCallChain)

(defn update-call-chain
  ^js []
  typescript/updateCallChain)

(defn create-new
  ^js []
  typescript/createNew)

(defn update-new
  ^js []
  typescript/updateNew)

(defn create-type-assertion
  ^js []
  typescript/createTypeAssertion)

(defn update-type-assertion
  ^js []
  typescript/updateTypeAssertion)

(defn create-paren
  ^js []
  typescript/createParen)

(defn update-paren
  ^js []
  typescript/updateParen)

(defn create-function-expression
  ^js []
  typescript/createFunctionExpression)

(defn update-function-expression
  ^js []
  typescript/updateFunctionExpression)

(defn create-delete
  ^js []
  typescript/createDelete)

(defn update-delete
  ^js []
  typescript/updateDelete)

(defn create-type-of
  ^js []
  typescript/createTypeOf)

(defn update-type-of
  ^js []
  typescript/updateTypeOf)

(defn create-void
  ^js []
  typescript/createVoid)

(defn update-void
  ^js []
  typescript/updateVoid)

(defn create-await
  ^js []
  typescript/createAwait)

(defn update-await
  ^js []
  typescript/updateAwait)

(defn create-prefix
  ^js []
  typescript/createPrefix)

(defn update-prefix
  ^js []
  typescript/updatePrefix)

(defn create-postfix
  ^js []
  typescript/createPostfix)

(defn update-postfix
  ^js []
  typescript/updatePostfix)

(defn create-binary
  ^js []
  typescript/createBinary)

(defn update-conditional
  ^js []
  typescript/updateConditional)

(defn create-template-expression
  ^js []
  typescript/createTemplateExpression)

(defn update-template-expression
  ^js []
  typescript/updateTemplateExpression)

(defn create-template-head
  ^js []
  typescript/createTemplateHead)

(defn create-template-middle
  ^js []
  typescript/createTemplateMiddle)

(defn create-template-tail
  ^js []
  typescript/createTemplateTail)

(defn create-no-substitution-template-literal
  ^js []
  typescript/createNoSubstitutionTemplateLiteral)

(defn update-yield
  ^js []
  typescript/updateYield)

(defn create-spread
  ^js []
  typescript/createSpread)

(defn update-spread
  ^js []
  typescript/updateSpread)

(defn create-omitted-expression
  ^js []
  typescript/createOmittedExpression)

(defn create-as-expression
  ^js []
  typescript/createAsExpression)

(defn update-as-expression
  ^js []
  typescript/updateAsExpression)

(defn create-non-null-expression
  ^js []
  typescript/createNonNullExpression)

(defn update-non-null-expression
  ^js []
  typescript/updateNonNullExpression)

(defn create-non-null-chain
  ^js []
  typescript/createNonNullChain)

(defn update-non-null-chain
  ^js []
  typescript/updateNonNullChain)

(defn create-meta-property
  ^js []
  typescript/createMetaProperty)

(defn update-meta-property
  ^js []
  typescript/updateMetaProperty)

(defn create-template-span
  ^js []
  typescript/createTemplateSpan)

(defn update-template-span
  ^js []
  typescript/updateTemplateSpan)

(defn create-semicolon-class-element
  ^js []
  typescript/createSemicolonClassElement)

(defn create-block
  ^js []
  typescript/createBlock)

(defn update-block
  ^js []
  typescript/updateBlock)

(defn create-variable-statement
  ^js []
  typescript/createVariableStatement)

(defn update-variable-statement
  ^js []
  typescript/updateVariableStatement)

(defn create-empty-statement
  ^js []
  typescript/createEmptyStatement)

(defn create-expression-statement
  ^js []
  typescript/createExpressionStatement)

(defn update-expression-statement
  ^js []
  typescript/updateExpressionStatement)

(defn create-statement
  ^js []
  typescript/createStatement)

(defn update-statement
  ^js []
  typescript/updateStatement)

(defn create-if
  ^js []
  typescript/createIf)

(defn update-if
  ^js []
  typescript/updateIf)

(defn create-do
  ^js []
  typescript/createDo)

(defn update-do
  ^js []
  typescript/updateDo)

(defn create-while
  ^js []
  typescript/createWhile)

(defn update-while
  ^js []
  typescript/updateWhile)

(defn create-for
  ^js []
  typescript/createFor)

(defn update-for
  ^js []
  typescript/updateFor)

(defn create-for-in
  ^js []
  typescript/createForIn)

(defn update-for-in
  ^js []
  typescript/updateForIn)

(defn create-for-of
  ^js []
  typescript/createForOf)

(defn update-for-of
  ^js []
  typescript/updateForOf)

(defn create-continue
  ^js []
  typescript/createContinue)

(defn update-continue
  ^js []
  typescript/updateContinue)

(defn create-break
  ^js []
  typescript/createBreak)

(defn update-break
  ^js []
  typescript/updateBreak)

(defn create-return
  ^js []
  typescript/createReturn)

(defn update-return
  ^js []
  typescript/updateReturn)

(defn create-with
  ^js []
  typescript/createWith)

(defn update-with
  ^js []
  typescript/updateWith)

(defn create-switch
  ^js []
  typescript/createSwitch)

(defn update-switch
  ^js []
  typescript/updateSwitch)

(defn create-label
  ^js []
  typescript/createLabel)

(defn update-label
  ^js []
  typescript/updateLabel)

(defn create-throw
  ^js []
  typescript/createThrow)

(defn update-throw
  ^js []
  typescript/updateThrow)

(defn create-try
  ^js []
  typescript/createTry)

(defn update-try
  ^js []
  typescript/updateTry)

(defn create-debugger-statement
  ^js []
  typescript/createDebuggerStatement)

(defn create-variable-declaration-list
  ^js []
  typescript/createVariableDeclarationList)

(defn update-variable-declaration-list
  ^js []
  typescript/updateVariableDeclarationList)

(defn create-function-declaration
  ^js []
  typescript/createFunctionDeclaration)

(defn update-function-declaration
  ^js []
  typescript/updateFunctionDeclaration)

(defn create-class-declaration
  ^js []
  typescript/createClassDeclaration)

(defn update-class-declaration
  ^js []
  typescript/updateClassDeclaration)

(defn create-interface-declaration
  ^js []
  typescript/createInterfaceDeclaration)

(defn update-interface-declaration
  ^js []
  typescript/updateInterfaceDeclaration)

(defn create-type-alias-declaration
  ^js []
  typescript/createTypeAliasDeclaration)

(defn update-type-alias-declaration
  ^js []
  typescript/updateTypeAliasDeclaration)

(defn create-enum-declaration
  ^js []
  typescript/createEnumDeclaration)

(defn update-enum-declaration
  ^js []
  typescript/updateEnumDeclaration)

(defn create-module-declaration
  ^js []
  typescript/createModuleDeclaration)

(defn update-module-declaration
  ^js []
  typescript/updateModuleDeclaration)

(defn create-module-block
  ^js []
  typescript/createModuleBlock)

(defn update-module-block
  ^js []
  typescript/updateModuleBlock)

(defn create-case-block
  ^js []
  typescript/createCaseBlock)

(defn update-case-block
  ^js []
  typescript/updateCaseBlock)

(defn create-namespace-export-declaration
  ^js []
  typescript/createNamespaceExportDeclaration)

(defn update-namespace-export-declaration
  ^js []
  typescript/updateNamespaceExportDeclaration)

(defn create-import-equals-declaration
  ^js []
  typescript/createImportEqualsDeclaration)

(defn update-import-equals-declaration
  ^js []
  typescript/updateImportEqualsDeclaration)

(defn create-import-declaration
  ^js []
  typescript/createImportDeclaration)

(defn update-import-declaration
  ^js []
  typescript/updateImportDeclaration)

(defn create-namespace-import
  ^js []
  typescript/createNamespaceImport)

(defn update-namespace-import
  ^js []
  typescript/updateNamespaceImport)

(defn create-named-imports
  ^js []
  typescript/createNamedImports)

(defn update-named-imports
  ^js []
  typescript/updateNamedImports)

(defn create-import-specifier
  ^js []
  typescript/createImportSpecifier)

(defn update-import-specifier
  ^js []
  typescript/updateImportSpecifier)

(defn create-export-assignment
  ^js []
  typescript/createExportAssignment)

(defn update-export-assignment
  ^js []
  typescript/updateExportAssignment)

(defn create-named-exports
  ^js []
  typescript/createNamedExports)

(defn update-named-exports
  ^js []
  typescript/updateNamedExports)

(defn create-export-specifier
  ^js []
  typescript/createExportSpecifier)

(defn update-export-specifier
  ^js []
  typescript/updateExportSpecifier)

(defn create-external-module-reference
  ^js []
  typescript/createExternalModuleReference)

(defn update-external-module-reference
  ^js []
  typescript/updateExternalModuleReference)

(defn create-js-doc-type-expression
  ^js []
  typescript/createJSDocTypeExpression)

(defn create-js-doc-type-tag
  ^js []
  typescript/createJSDocTypeTag)

(defn create-js-doc-return-tag
  ^js []
  typescript/createJSDocReturnTag)

(defn create-js-doc-this-tag
  ^js []
  typescript/createJSDocThisTag)

(defn create-js-doc-comment
  ^js []
  typescript/createJSDocComment)

(defn create-js-doc-parameter-tag
  ^js []
  typescript/createJSDocParameterTag)

(defn create-js-doc-class-tag
  ^js []
  typescript/createJSDocClassTag)

(defn create-js-doc-augments-tag
  ^js []
  typescript/createJSDocAugmentsTag)

(defn create-js-doc-enum-tag
  ^js []
  typescript/createJSDocEnumTag)

(defn create-js-doc-template-tag
  ^js []
  typescript/createJSDocTemplateTag)

(defn create-js-doc-typedef-tag
  ^js []
  typescript/createJSDocTypedefTag)

(defn create-js-doc-callback-tag
  ^js []
  typescript/createJSDocCallbackTag)

(defn create-js-doc-signature
  ^js []
  typescript/createJSDocSignature)

(defn create-js-doc-property-tag
  ^js []
  typescript/createJSDocPropertyTag)

(defn create-js-doc-type-literal
  ^js []
  typescript/createJSDocTypeLiteral)

(defn create-js-doc-implements-tag
  ^js []
  typescript/createJSDocImplementsTag)

(defn create-js-doc-author-tag
  ^js []
  typescript/createJSDocAuthorTag)

(defn create-js-doc-public-tag
  ^js []
  typescript/createJSDocPublicTag)

(defn create-js-doc-private-tag
  ^js []
  typescript/createJSDocPrivateTag)

(defn create-js-doc-protected-tag
  ^js []
  typescript/createJSDocProtectedTag)

(defn create-js-doc-readonly-tag
  ^js []
  typescript/createJSDocReadonlyTag)

(defn create-js-doc-tag
  ^js []
  typescript/createJSDocTag)

(defn create-jsx-element
  ^js []
  typescript/createJsxElement)

(defn update-jsx-element
  ^js []
  typescript/updateJsxElement)

(defn create-jsx-self-closing-element
  ^js []
  typescript/createJsxSelfClosingElement)

(defn update-jsx-self-closing-element
  ^js []
  typescript/updateJsxSelfClosingElement)

(defn create-jsx-opening-element
  ^js []
  typescript/createJsxOpeningElement)

(defn update-jsx-opening-element
  ^js []
  typescript/updateJsxOpeningElement)

(defn create-jsx-closing-element
  ^js []
  typescript/createJsxClosingElement)

(defn update-jsx-closing-element
  ^js []
  typescript/updateJsxClosingElement)

(defn create-jsx-fragment
  ^js []
  typescript/createJsxFragment)

(defn create-jsx-text
  ^js []
  typescript/createJsxText)

(defn update-jsx-text
  ^js []
  typescript/updateJsxText)

(defn create-jsx-opening-fragment
  ^js []
  typescript/createJsxOpeningFragment)

(defn create-jsx-jsx-closing-fragment
  ^js []
  typescript/createJsxJsxClosingFragment)

(defn update-jsx-fragment
  ^js []
  typescript/updateJsxFragment)

(defn create-jsx-attribute
  ^js []
  typescript/createJsxAttribute)

(defn update-jsx-attribute
  ^js []
  typescript/updateJsxAttribute)

(defn create-jsx-attributes
  ^js []
  typescript/createJsxAttributes)

(defn update-jsx-attributes
  ^js []
  typescript/updateJsxAttributes)

(defn create-jsx-spread-attribute
  ^js []
  typescript/createJsxSpreadAttribute)

(defn update-jsx-spread-attribute
  ^js []
  typescript/updateJsxSpreadAttribute)

(defn create-jsx-expression
  ^js []
  typescript/createJsxExpression)

(defn update-jsx-expression
  ^js []
  typescript/updateJsxExpression)

(defn create-case-clause
  ^js []
  typescript/createCaseClause)

(defn update-case-clause
  ^js []
  typescript/updateCaseClause)

(defn create-default-clause
  ^js []
  typescript/createDefaultClause)

(defn update-default-clause
  ^js []
  typescript/updateDefaultClause)

(defn create-heritage-clause
  ^js []
  typescript/createHeritageClause)

(defn update-heritage-clause
  ^js []
  typescript/updateHeritageClause)

(defn create-catch-clause
  ^js []
  typescript/createCatchClause)

(defn update-catch-clause
  ^js []
  typescript/updateCatchClause)

(defn create-property-assignment
  ^js []
  typescript/createPropertyAssignment)

(defn update-property-assignment
  ^js []
  typescript/updatePropertyAssignment)

(defn create-shorthand-property-assignment
  ^js []
  typescript/createShorthandPropertyAssignment)

(defn update-shorthand-property-assignment
  ^js []
  typescript/updateShorthandPropertyAssignment)

(defn create-spread-assignment
  ^js []
  typescript/createSpreadAssignment)

(defn update-spread-assignment
  ^js []
  typescript/updateSpreadAssignment)

(defn create-enum-member
  ^js []
  typescript/createEnumMember)

(defn update-enum-member
  ^js []
  typescript/updateEnumMember)

(defn update-source-file-node
  ^js []
  typescript/updateSourceFileNode)

(defn create-not-emitted-statement
  ^js []
  typescript/createNotEmittedStatement)

(defn create-partially-emitted-expression
  ^js []
  typescript/createPartiallyEmittedExpression)

(defn update-partially-emitted-expression
  ^js []
  typescript/updatePartiallyEmittedExpression)

(defn create-comma-list
  ^js []
  typescript/createCommaList)

(defn update-comma-list
  ^js []
  typescript/updateCommaList)

(defn create-bundle
  ^js []
  typescript/createBundle)

(defn update-bundle
  ^js []
  typescript/updateBundle)

(defn create-immediately-invoked-function-expression
  ^js []
  typescript/createImmediatelyInvokedFunctionExpression)

(defn create-immediately-invoked-arrow-function
  ^js []
  typescript/createImmediatelyInvokedArrowFunction)

(defn create-void-zero
  ^js []
  typescript/createVoidZero)

(defn create-export-default
  ^js []
  typescript/createExportDefault)

(defn create-external-module-export
  ^js []
  typescript/createExternalModuleExport)

(defn create-namespace-export
  ^js []
  typescript/createNamespaceExport)

(defn update-namespace-export
  ^js []
  typescript/updateNamespaceExport)

(defn create-token
  ^js []
  typescript/createToken)

(defn create-identifier
  ^js []
  typescript/createIdentifier)

(defn create-temp-variable
  ^js []
  typescript/createTempVariable)

(defn generated-name-for-node
  ^js []
  typescript/getGeneratedNameForNode)

(defn create-optimistic-unique-name
  ^js []
  typescript/createOptimisticUniqueName)

(defn create-file-level-unique-name
  ^js []
  typescript/createFileLevelUniqueName)

(defn create-index-signature
  ^js []
  typescript/createIndexSignature)

(defn create-type-predicate-node
  ^js []
  typescript/createTypePredicateNode)

(defn update-type-predicate-node
  ^js []
  typescript/updateTypePredicateNode)

(defn create-literal
  ^js []
  typescript/createLiteral)

(defn create-method-signature
  ^js []
  typescript/createMethodSignature)

(defn update-method-signature
  ^js []
  typescript/updateMethodSignature)

(defn create-type-operator-node
  ^js []
  typescript/createTypeOperatorNode)

(defn create-tagged-template
  ^js []
  typescript/createTaggedTemplate)

(defn update-tagged-template
  ^js []
  typescript/updateTaggedTemplate)

(defn update-binary
  ^js []
  typescript/updateBinary)

(defn create-conditional
  ^js []
  typescript/createConditional)

(defn create-yield
  ^js []
  typescript/createYield)

(defn create-class-expression
  ^js []
  typescript/createClassExpression)

(defn update-class-expression
  ^js []
  typescript/updateClassExpression)

(defn create-property-signature
  ^js []
  typescript/createPropertySignature)

(defn update-property-signature
  ^js []
  typescript/updatePropertySignature)

(defn create-expression-with-type-arguments
  ^js []
  typescript/createExpressionWithTypeArguments)

(defn update-expression-with-type-arguments
  ^js []
  typescript/updateExpressionWithTypeArguments)

(defn create-arrow-function
  ^js []
  typescript/createArrowFunction)

(defn update-arrow-function
  ^js []
  typescript/updateArrowFunction)

(defn create-variable-declaration
  ^js []
  typescript/createVariableDeclaration)

(defn update-variable-declaration
  ^js []
  typescript/updateVariableDeclaration)

(defn create-import-clause
  ^js []
  typescript/createImportClause)

(defn update-import-clause
  ^js []
  typescript/updateImportClause)

(defn create-export-declaration
  ^js []
  typescript/createExportDeclaration)

(defn update-export-declaration
  ^js []
  typescript/updateExportDeclaration)

(defn create-js-doc-param-tag
  ^js []
  typescript/createJSDocParamTag)

(defn create-comma
  ^js []
  typescript/createComma)

(defn create-less-than
  ^js []
  typescript/createLessThan)

(defn create-assignment
  ^js []
  typescript/createAssignment)

(defn create-strict-equality
  ^js []
  typescript/createStrictEquality)

(defn create-strict-inequality
  ^js []
  typescript/createStrictInequality)

(defn create-add
  ^js []
  typescript/createAdd)

(defn create-subtract
  ^js []
  typescript/createSubtract)

(defn create-logical-and
  ^js []
  typescript/createLogicalAnd)

(defn create-logical-or
  ^js []
  typescript/createLogicalOr)

(defn create-postfix-increment
  ^js []
  typescript/createPostfixIncrement)

(defn create-logical-not
  ^js []
  typescript/createLogicalNot)

(defn create-node
  ^js []
  typescript/createNode)

(defn mutable-clone
  "Creates a shallow, memberwise clone of a node ~for mutation~ with its `pos`, `end`, and `parent` set.
   
   NOTE: It is unsafe to change any properties of a `Node` that relate to its AST children, as those changes won't be
   captured with respect to transformations."
  ^js []
  typescript/getMutableClone)

(defn type-assertion
  ^js []
  typescript/isTypeAssertion)

(defn identifier-or-private-identifier
  ^js []
  typescript/isIdentifierOrPrivateIdentifier)
