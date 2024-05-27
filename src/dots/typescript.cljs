(ns dots.typescript
  (:require ["typescript" :as typescript]))

(defn token-to-string
  "**Parameters:**
   - `t`: `SyntaxKind`
   
   **Returns:** `string | undefined`"
  ^js [t]
  (typescript/tokenToString t))

(defn position-of-line-and-character
  "**Parameters:**
   - `source-file`: `SourceFileLike`
   - `line`: `number`
   - `character`: `number`
   
   **Returns:** `number`"
  ^js [source-file line character]
  (typescript/getPositionOfLineAndCharacter source-file line character))

(defn line-and-character-of-position
  "**Parameters:**
   - `source-file`: `SourceFileLike`
   - `position`: `number`
   
   **Returns:** `LineAndCharacter`"
  ^js [source-file position]
  (typescript/getLineAndCharacterOfPosition source-file position))

(defn white-space-like?
  "**Parameters:**
   - `ch`: `number`
   
   **Returns:** `boolean`"
  ^js [ch]
  (typescript/isWhiteSpaceLike ch))

(defn white-space-single-line?
  "Does not include line breaks. For that, see isWhiteSpaceLike.
   
   **Parameters:**
   - `ch`: `number`
   
   **Returns:** `boolean`"
  ^js [ch]
  (typescript/isWhiteSpaceSingleLine ch))

(defn line-break?
  "**Parameters:**
   - `ch`: `number`
   
   **Returns:** `boolean`"
  ^js [ch]
  (typescript/isLineBreak ch))

(defn could-start-trivia?
  "**Parameters:**
   - `text`: `string`
   - `pos`: `number`
   
   **Returns:** `boolean`"
  ^js [text pos]
  (typescript/couldStartTrivia text pos))

(defn for-each-leading-comment-range
  "**Parameters:**
   - `text`: `string`
   - `pos`: `number`
   - `cb`: `(pos: number, end: number, kind: CommentKind, hasTrailingNewLine: boolean, state: T) => U`
   - `state`: `T`
   
   **Returns:** `U | undefined`"
  (^js [text pos cb]
   (typescript/forEachLeadingCommentRange text pos cb))
  (^js [text pos cb state]
   (typescript/forEachLeadingCommentRange text pos cb state)))

(defn for-each-trailing-comment-range
  "**Parameters:**
   - `text`: `string`
   - `pos`: `number`
   - `cb`: `(pos: number, end: number, kind: CommentKind, hasTrailingNewLine: boolean, state: T) => U`
   - `state`: `T`
   
   **Returns:** `U | undefined`"
  (^js [text pos cb]
   (typescript/forEachTrailingCommentRange text pos cb))
  (^js [text pos cb state]
   (typescript/forEachTrailingCommentRange text pos cb state)))

(defn reduce-each-leading-comment-range
  "**Parameters:**
   - `text`: `string`
   - `pos`: `number`
   - `cb`: `(pos: number, end: number, kind: CommentKind, hasTrailingNewLine: boolean, state: T) => U`
   - `state`: `T`
   - `initial`: `U`
   
   **Returns:** `U | undefined`"
  ^js [text pos cb state initial]
  (typescript/reduceEachLeadingCommentRange text pos cb state initial))

(defn reduce-each-trailing-comment-range
  "**Parameters:**
   - `text`: `string`
   - `pos`: `number`
   - `cb`: `(pos: number, end: number, kind: CommentKind, hasTrailingNewLine: boolean, state: T) => U`
   - `state`: `T`
   - `initial`: `U`
   
   **Returns:** `U | undefined`"
  ^js [text pos cb state initial]
  (typescript/reduceEachTrailingCommentRange text pos cb state initial))

(defn leading-comment-ranges
  "**Parameters:**
   - `text`: `string`
   - `pos`: `number`
   
   **Returns:** `CommentRange[] | undefined`"
  ^js [text pos]
  (typescript/getLeadingCommentRanges text pos))

(defn trailing-comment-ranges
  "**Parameters:**
   - `text`: `string`
   - `pos`: `number`
   
   **Returns:** `CommentRange[] | undefined`"
  ^js [text pos]
  (typescript/getTrailingCommentRanges text pos))

(defn shebang
  "Optionally, get the shebang
   
   **Parameters:**
   - `text`: `string`
   
   **Returns:** `string | undefined`"
  ^js [text]
  (typescript/getShebang text))

(defn identifier-start?
  "**Parameters:**
   - `ch`: `number`
   - `language-version`: `ScriptTarget | undefined`
   
   **Returns:** `boolean`"
  (^js [ch]
   (typescript/isIdentifierStart ch))
  (^js [ch language-version]
   (typescript/isIdentifierStart ch language-version)))

(defn identifier-part?
  "**Parameters:**
   - `ch`: `number`
   - `language-version`: `ScriptTarget | undefined`
   - `identifier-variant`: `LanguageVariant | undefined`
   
   **Returns:** `boolean`"
  (^js [ch]
   (typescript/isIdentifierPart ch))
  (^js [ch language-version]
   (typescript/isIdentifierPart ch language-version))
  (^js [ch language-version identifier-variant]
   (typescript/isIdentifierPart ch language-version identifier-variant)))

(defn create-scanner
  "**Parameters:**
   - `language-version`: `ScriptTarget`
   - `skip-trivia?`: `boolean`
   - `language-variant`: `LanguageVariant | undefined`
   - `text-initial`: `string | undefined`
   - `on-error`: `ErrorCallback | undefined`
   - `start`: `number | undefined`
   - `length`: `number | undefined`
   
   **Returns:** `Scanner`"
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
  "**Parameters:**
   - `module-name`: `string`
   
   **Returns:** `boolean`"
  ^js [module-name]
  (typescript/isExternalModuleNameRelative module-name))

(defn sort-and-deduplicate-diagnostics
  "**Parameters:**
   - `diagnostics`: `readonly T[]`
   
   **Returns:** `SortedReadonlyArray<T>`"
  ^js [diagnostics]
  (typescript/sortAndDeduplicateDiagnostics diagnostics))

(defn default-lib-file-name
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `string`"
  ^js [options]
  (typescript/getDefaultLibFileName options))

(defn text-span-end
  "**Parameters:**
   - `span`: `TextSpan`
   
   **Returns:** `number`"
  ^js [span]
  (typescript/textSpanEnd span))

(defn text-span-is-empty?
  "**Parameters:**
   - `span`: `TextSpan`
   
   **Returns:** `boolean`"
  ^js [span]
  (typescript/textSpanIsEmpty span))

(defn text-span-contains-position?
  "**Parameters:**
   - `span`: `TextSpan`
   - `position`: `number`
   
   **Returns:** `boolean`"
  ^js [span position]
  (typescript/textSpanContainsPosition span position))

(defn text-span-contains-text-span?
  "**Parameters:**
   - `span`: `TextSpan`
   - `other`: `TextSpan`
   
   **Returns:** `boolean`"
  ^js [span other]
  (typescript/textSpanContainsTextSpan span other))

(defn text-span-overlaps-with?
  "**Parameters:**
   - `span`: `TextSpan`
   - `other`: `TextSpan`
   
   **Returns:** `boolean`"
  ^js [span other]
  (typescript/textSpanOverlapsWith span other))

(defn text-span-overlap
  "**Parameters:**
   - `span-1`: `TextSpan`
   - `span-2`: `TextSpan`
   
   **Returns:** `TextSpan | undefined`"
  ^js [span-1 span-2]
  (typescript/textSpanOverlap span-1 span-2))

(defn text-span-intersects-with-text-span?
  "**Parameters:**
   - `span`: `TextSpan`
   - `other`: `TextSpan`
   
   **Returns:** `boolean`"
  ^js [span other]
  (typescript/textSpanIntersectsWithTextSpan span other))

(defn text-span-intersects-with?
  "**Parameters:**
   - `span`: `TextSpan`
   - `start`: `number`
   - `length`: `number`
   
   **Returns:** `boolean`"
  ^js [span start length]
  (typescript/textSpanIntersectsWith span start length))

(defn decoded-text-span-intersects-with?
  "**Parameters:**
   - `start-1`: `number`
   - `length-1`: `number`
   - `start-2`: `number`
   - `length-2`: `number`
   
   **Returns:** `boolean`"
  ^js [start-1 length-1 start-2 length-2]
  (typescript/decodedTextSpanIntersectsWith start-1 length-1 start-2 length-2))

(defn text-span-intersects-with-position?
  "**Parameters:**
   - `span`: `TextSpan`
   - `position`: `number`
   
   **Returns:** `boolean`"
  ^js [span position]
  (typescript/textSpanIntersectsWithPosition span position))

(defn text-span-intersection
  "**Parameters:**
   - `span-1`: `TextSpan`
   - `span-2`: `TextSpan`
   
   **Returns:** `TextSpan | undefined`"
  ^js [span-1 span-2]
  (typescript/textSpanIntersection span-1 span-2))

(defn create-text-span
  "**Parameters:**
   - `start`: `number`
   - `length`: `number`
   
   **Returns:** `TextSpan`"
  ^js [start length]
  (typescript/createTextSpan start length))

(defn create-text-span-from-bounds
  "**Parameters:**
   - `start`: `number`
   - `end`: `number`
   
   **Returns:** `TextSpan`"
  ^js [start end]
  (typescript/createTextSpanFromBounds start end))

(defn text-change-range-new-span
  "**Parameters:**
   - `range`: `TextChangeRange`
   
   **Returns:** `TextSpan`"
  ^js [range]
  (typescript/textChangeRangeNewSpan range))

(defn text-change-range-is-unchanged?
  "**Parameters:**
   - `range`: `TextChangeRange`
   
   **Returns:** `boolean`"
  ^js [range]
  (typescript/textChangeRangeIsUnchanged range))

(defn create-text-change-range
  "**Parameters:**
   - `span`: `TextSpan`
   - `new-length`: `number`
   
   **Returns:** `TextChangeRange`"
  ^js [span new-length]
  (typescript/createTextChangeRange span new-length))

(defn collapse-text-change-ranges-across-multiple-versions
  "Called to merge all the changes that occurred across several versions of a script snapshot
   into a single change.  i.e. if a user keeps making successive edits to a script we will
   have a text change from V1 to V2, V2 to V3, ..., Vn.
   
   This function will then merge those changes into a single change range valid between V1 and
   Vn.
   
   **Parameters:**
   - `changes`: `readonly TextChangeRange[]`
   
   **Returns:** `TextChangeRange`"
  ^js [changes]
  (typescript/collapseTextChangeRangesAcrossMultipleVersions changes))

(defn type-parameter-owner
  "**Parameters:**
   - `d`: `Declaration`
   
   **Returns:** `Declaration | undefined`"
  ^js [d]
  (typescript/getTypeParameterOwner d))

(defn parameter-property-declaration?
  "**Parameters:**
   - `node`: `Node`
   - `parent`: `Node`
   
   **Returns:** `boolean`"
  ^js [node parent]
  (typescript/isParameterPropertyDeclaration node parent))

(defn empty-binding-pattern?
  "**Parameters:**
   - `node`: `BindingName`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isEmptyBindingPattern node))

(defn empty-binding-element?
  "**Parameters:**
   - `node`: `ArrayBindingElement`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isEmptyBindingElement node))

(defn walk-up-binding-elements-and-patterns
  "**Parameters:**
   - `binding`: `BindingElement`
   
   **Returns:** `VariableDeclaration | ParameterDeclaration`"
  ^js [binding]
  (typescript/walkUpBindingElementsAndPatterns binding))

(defn combined-modifier-flags
  "**Parameters:**
   - `node`: `Declaration`
   
   **Returns:** `ModifierFlags`"
  ^js [node]
  (typescript/getCombinedModifierFlags node))

(defn combined-node-flags
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `NodeFlags`"
  ^js [node]
  (typescript/getCombinedNodeFlags node))

(defn validate-locale-and-set-language
  "Checks to see if the locale is in the appropriate format,
   and if it is, attempts to set the appropriate language.
   
   **Parameters:**
   - `locale`: `string`
   - `sys`: `{ getExecutingFilePath(): string; resolvePath(path: string): string; fileExists(fileName: string): boolean; readFile(fileName: string): string | undefined; }`
   - `errors`: `Diagnostic[] | undefined`
   
   **Returns:** `void`"
  (^js [locale sys]
   (typescript/validateLocaleAndSetLanguage locale sys))
  (^js [locale sys errors]
   (typescript/validateLocaleAndSetLanguage locale sys errors)))

(defn original-node
  "**Parameters:**
   - `node`: `Node | undefined`
   - `node-test`: `(node: Node) => node is T`
   
   **Returns:** `T | undefined`"
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
   At that point findAncestor returns undefined.
   
   **Parameters:**
   - `node`: `Node | undefined`
   - `callback`: `(element: Node) => boolean | \"quit\"`
   
   **Returns:** `Node | undefined`"
  (^js []
   (typescript/findAncestor))
  (^js [node]
   (typescript/findAncestor node))
  (^js [node callback]
   (typescript/findAncestor node callback)))

(defn parse-tree-node?
  "Gets a value indicating whether a node originated in the parse tree.
   
   **Parameters:**
   - `node`: `Node` - The node to test.
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isParseTreeNode node))

(defn parse-tree-node
  "Gets the original parse tree node for a node.
   
   **Parameters:**
   - `node`: `T | undefined` - The original node.
   - `node-test`: `((node: Node) => node is T) | undefined` - A callback used to ensure the correct type of parse tree node is returned.
   
   **Returns:** `T | undefined` - The original parse tree node if found; otherwise, undefined."
  (^js []
   (typescript/getParseTreeNode))
  (^js [node]
   (typescript/getParseTreeNode node))
  (^js [node node-test]
   (typescript/getParseTreeNode node node-test)))

(defn escape-leading-underscores
  "Add an extra underscore to identifiers that start with two underscores to avoid issues with magic names like '__proto__'
   
   **Parameters:**
   - `identifier`: `string`
   
   **Returns:** `__String`"
  ^js [identifier]
  (typescript/escapeLeadingUnderscores identifier))

(defn unescape-leading-underscores
  "Remove extra underscore from escaped identifier text content.
   
   **Parameters:**
   - `identifier`: `__String` - The escaped identifier text.
   
   **Returns:** `string` - The unescaped identifier text."
  ^js [identifier]
  (typescript/unescapeLeadingUnderscores identifier))

(defn id-text
  "**Parameters:**
   - `identifier-or-private-name`: `Identifier | PrivateIdentifier`
   
   **Returns:** `string`"
  ^js [identifier-or-private-name]
  (typescript/idText identifier-or-private-name))

(defn identifier-to-keyword-kind
  "If the text of an Identifier matches a keyword (including contextual and TypeScript-specific keywords), returns the
   SyntaxKind for the matching keyword.
   
   **Parameters:**
   - `node`: `Identifier`
   
   **Returns:** `KeywordSyntaxKind | undefined`"
  ^js [node]
  (typescript/identifierToKeywordKind node))

(defn symbol-name
  "**Parameters:**
   - `symbol`: `Symbol`
   
   **Returns:** `string`"
  ^js [symbol]
  (typescript/symbolName symbol))

(defn name-of-js-doc-typedef
  "**Parameters:**
   - `declaration`: `JSDocTypedefTag`
   
   **Returns:** `Identifier | PrivateIdentifier | undefined`"
  ^js [declaration]
  (typescript/getNameOfJSDocTypedef declaration))

(defn name-of-declaration
  "**Parameters:**
   - `declaration`: `Declaration | Expression | undefined`
   
   **Returns:** `DeclarationName | undefined`"
  (^js []
   (typescript/getNameOfDeclaration))
  (^js [declaration]
   (typescript/getNameOfDeclaration declaration)))

(defn decorators
  "**Parameters:**
   - `node`: `HasDecorators`
   
   **Returns:** `readonly Decorator[] | undefined`"
  ^js [node]
  (typescript/getDecorators node))

(defn modifiers
  "**Parameters:**
   - `node`: `HasModifiers`
   
   **Returns:** `readonly Modifier[] | undefined`"
  ^js [node]
  (typescript/getModifiers node))

(defn js-doc-parameter-tags
  "Gets the JSDoc parameter tags for the node if present.
   
   **Parameters:**
   - `param`: `ParameterDeclaration`
   
   **Returns:** `readonly JSDocParameterTag[]`"
  ^js [param]
  (typescript/getJSDocParameterTags param))

(defn js-doc-type-parameter-tags
  "Gets the JSDoc type parameter tags for the node if present.
   
   **Parameters:**
   - `param`: `TypeParameterDeclaration`
   
   **Returns:** `readonly JSDocTemplateTag[]`"
  ^js [param]
  (typescript/getJSDocTypeParameterTags param))

(defn has-js-doc-parameter-tags?
  "Return true if the node has JSDoc parameter tags.
   
   **Parameters:**
   - `node`: `GetAccessorDeclaration | SetAccessorDeclaration | ArrowFunction | CallSignatureDeclaration | ... 9 more ... | MethodSignature`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/hasJSDocParameterTags node))

(defn js-doc-augments-tag
  "Gets the JSDoc augments tag for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocAugmentsTag | undefined`"
  ^js [node]
  (typescript/getJSDocAugmentsTag node))

(defn js-doc-implements-tags
  "Gets the JSDoc implements tags for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `readonly JSDocImplementsTag[]`"
  ^js [node]
  (typescript/getJSDocImplementsTags node))

(defn js-doc-class-tag
  "Gets the JSDoc class tag for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocClassTag | undefined`"
  ^js [node]
  (typescript/getJSDocClassTag node))

(defn js-doc-public-tag
  "Gets the JSDoc public tag for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocPublicTag | undefined`"
  ^js [node]
  (typescript/getJSDocPublicTag node))

(defn js-doc-private-tag
  "Gets the JSDoc private tag for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocPrivateTag | undefined`"
  ^js [node]
  (typescript/getJSDocPrivateTag node))

(defn js-doc-protected-tag
  "Gets the JSDoc protected tag for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocProtectedTag | undefined`"
  ^js [node]
  (typescript/getJSDocProtectedTag node))

(defn js-doc-readonly-tag
  "Gets the JSDoc protected tag for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocReadonlyTag | undefined`"
  ^js [node]
  (typescript/getJSDocReadonlyTag node))

(defn js-doc-override-tag-no-cache
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocOverrideTag | undefined`"
  ^js [node]
  (typescript/getJSDocOverrideTagNoCache node))

(defn js-doc-deprecated-tag
  "Gets the JSDoc deprecated tag for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocDeprecatedTag | undefined`"
  ^js [node]
  (typescript/getJSDocDeprecatedTag node))

(defn js-doc-enum-tag
  "Gets the JSDoc enum tag for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocEnumTag | undefined`"
  ^js [node]
  (typescript/getJSDocEnumTag node))

(defn js-doc-this-tag
  "Gets the JSDoc this tag for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocThisTag | undefined`"
  ^js [node]
  (typescript/getJSDocThisTag node))

(defn js-doc-return-tag
  "Gets the JSDoc return tag for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocReturnTag | undefined`"
  ^js [node]
  (typescript/getJSDocReturnTag node))

(defn js-doc-template-tag
  "Gets the JSDoc template tag for the node if present
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocTemplateTag | undefined`"
  ^js [node]
  (typescript/getJSDocTemplateTag node))

(defn js-doc-satisfies-tag
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocSatisfiesTag | undefined`"
  ^js [node]
  (typescript/getJSDocSatisfiesTag node))

(defn js-doc-type-tag
  "Gets the JSDoc type tag for the node if present and valid
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `JSDocTypeTag | undefined`"
  ^js [node]
  (typescript/getJSDocTypeTag node))

(defn js-doc-type
  "Gets the type node for the node if provided via JSDoc.
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `TypeNode | undefined`"
  ^js [node]
  (typescript/getJSDocType node))

(defn js-doc-return-type
  "Gets the return type node for the node if provided via JSDoc return tag or type tag.
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `TypeNode | undefined`"
  ^js [node]
  (typescript/getJSDocReturnType node))

(defn js-doc-tags
  "Get all JSDoc tags related to a node, including those on parent nodes.
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `readonly JSDocTag[]`"
  ^js [node]
  (typescript/getJSDocTags node))

(defn all-js-doc-tags
  "Gets all JSDoc tags that match a specified predicate
   
   **Parameters:**
   - `node`: `Node`
   - `predicate`: `(tag: JSDocTag) => tag is T`
   
   **Returns:** `readonly T[]`"
  ^js [node predicate]
  (typescript/getAllJSDocTags node predicate))

(defn all-js-doc-tags-of-kind
  "Gets all JSDoc tags of a specified kind
   
   **Parameters:**
   - `node`: `Node`
   - `kind`: `SyntaxKind`
   
   **Returns:** `readonly JSDocTag[]`"
  ^js [node kind]
  (typescript/getAllJSDocTagsOfKind node kind))

(defn text-of-js-doc-comment
  "Gets the text of a jsdoc comment, flattening links to their text.
   
   **Parameters:**
   - `comment`: `string | NodeArray<JSDocComment> | undefined`
   
   **Returns:** `string | undefined`"
  (^js []
   (typescript/getTextOfJSDocComment))
  (^js [comment]
   (typescript/getTextOfJSDocComment comment)))

(defn effective-type-parameter-declarations
  "Gets the effective type parameters. If the node was parsed in a
   JavaScript file, gets the type parameters from the `@template` tag from JSDoc.
   
   This does *not* return type parameters from a jsdoc reference to a generic type, eg
   
   type Id = <T>(x: T) => T
   /**
   
   **Parameters:**
   - `node`: `DeclarationWithTypeParameters`
   
   **Returns:** `readonly TypeParameterDeclaration[]`"
  ^js [node]
  (typescript/getEffectiveTypeParameterDeclarations node))

(defn effective-constraint-of-type-parameter
  "**Parameters:**
   - `node`: `TypeParameterDeclaration`
   
   **Returns:** `TypeNode | undefined`"
  ^js [node]
  (typescript/getEffectiveConstraintOfTypeParameter node))

(defn member-name?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isMemberName node))

(defn property-access-chain?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPropertyAccessChain node))

(defn element-access-chain?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isElementAccessChain node))

(defn call-chain?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isCallChain node))

(defn optional-chain?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isOptionalChain node))

(defn nullish-coalesce?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNullishCoalesce node))

(defn const-type-reference?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isConstTypeReference node))

(defn skip-partially-emitted-expressions
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `Node`"
  ^js [node]
  (typescript/skipPartiallyEmittedExpressions node))

(defn non-null-chain?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNonNullChain node))

(defn break-or-continue-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isBreakOrContinueStatement node))

(defn named-export-bindings?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNamedExportBindings node))

(defn unparsed-text-like?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isUnparsedTextLike node))

(defn unparsed-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isUnparsedNode node))

(defn js-doc-property-like-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocPropertyLikeTag node))

(defn token-kind?
  "True if kind is of some token syntax kind.
   For example, this is true for an IfKeyword but not for an IfStatement.
   Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail.
   
   **Parameters:**
   - `kind`: `SyntaxKind`
   
   **Returns:** `boolean`"
  ^js [kind]
  (typescript/isTokenKind kind))

(defn token?
  "True if node is of some token syntax kind.
   For example, this is true for an IfKeyword but not for an IfStatement.
   Literals are considered tokens, except TemplateLiteral, but does include TemplateHead/Middle/Tail.
   
   **Parameters:**
   - `n`: `Node`
   
   **Returns:** `boolean`"
  ^js [n]
  (typescript/isToken n))

(defn literal-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isLiteralExpression node))

(defn template-literal-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTemplateLiteralToken node))

(defn template-middle-or-template-tail?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTemplateMiddleOrTemplateTail node))

(defn import-or-export-specifier?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isImportOrExportSpecifier node))

(defn type-only-import-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeOnlyImportDeclaration node))

(defn type-only-export-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeOnlyExportDeclaration node))

(defn type-only-import-or-export-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeOnlyImportOrExportDeclaration node))

(defn string-text-containing-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isStringTextContainingNode node))

(defn import-attribute-name?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isImportAttributeName node))

(defn modifier?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isModifier node))

(defn entity-name?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isEntityName node))

(defn property-name?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPropertyName node))

(defn binding-name?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isBindingName node))

(defn function-like?
  "**Parameters:**
   - `node`: `Node | undefined`
   
   **Returns:** `boolean`"
  (^js []
   (typescript/isFunctionLike))
  (^js [node]
   (typescript/isFunctionLike node)))

(defn class-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isClassElement node))

(defn class-like?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isClassLike node))

(defn accessor?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isAccessor node))

(defn auto-accessor-property-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isAutoAccessorPropertyDeclaration node))

(defn modifier-like?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isModifierLike node))

(defn type-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeElement node))

(defn class-or-type-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isClassOrTypeElement node))

(defn object-literal-element-like?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isObjectLiteralElementLike node))

(defn type-node?
  "Node test that determines whether a node is a valid type node.
   This differs from the `isPartOfTypeNode` function which determines whether a node is *part*
   of a TypeNode.
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeNode node))

(defn function-or-constructor-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isFunctionOrConstructorTypeNode node))

(defn array-binding-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isArrayBindingElement node))

(defn property-access-or-qualified-name?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPropertyAccessOrQualifiedName node))

(defn call-like-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isCallLikeExpression node))

(defn call-or-new-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isCallOrNewExpression node))

(defn template-literal?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTemplateLiteral node))

(defn left-hand-side-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isLeftHandSideExpression node))

(defn literal-type-literal?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isLiteralTypeLiteral node))

(defn expression?
  "Determines whether a node is an expression based only on its kind.
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isExpression node))

(defn assertion-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isAssertionExpression node))

(defn iteration-statement?
  "**Parameters:**
   - `node`: `Node`
   - `look-in-labeled-statements`: `false`
   - `look-in-labeled-statements?`: `boolean`
   
   **Returns:** `boolean`"
  {:arglists '([node look-in-labeled-statements]
               [node look-in-labeled-statements?])}
  ^js [a b]
  (typescript/isIterationStatement a b))

(defn concise-body?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isConciseBody node))

(defn for-initializer?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isForInitializer node))

(defn module-body?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isModuleBody node))

(defn named-import-bindings?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNamedImportBindings node))

(defn declaration-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isDeclarationStatement node))

(defn statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isStatement node))

(defn module-reference?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isModuleReference node))

(defn jsx-tag-name-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxTagNameExpression node))

(defn jsx-child?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxChild node))

(defn jsx-attribute-like?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxAttributeLike node))

(defn string-literal-or-jsx-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isStringLiteralOrJsxExpression node))

(defn jsx-opening-like-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxOpeningLikeElement node))

(defn case-or-default-clause?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isCaseOrDefaultClause node))

(defn js-doc-comment-containing-node?
  "True if node is of a kind that may contain comment text.
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocCommentContainingNode node))

(defn set-accessor?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isSetAccessor node))

(defn get-accessor?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isGetAccessor node))

(defn has-only-expression-initializer?
  "True if has initializer node attached to it.
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/hasOnlyExpressionInitializer node))

(defn object-literal-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isObjectLiteralElement node))

(defn string-literal-like?
  "**Parameters:**
   - `node`: `Node | FileReference`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isStringLiteralLike node))

(defn js-doc-link-like?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocLinkLike node))

(defn has-rest-parameter?
  "**Parameters:**
   - `s`: `JSDocSignature | SignatureDeclaration`
   
   **Returns:** `boolean`"
  ^js [s]
  (typescript/hasRestParameter s))

(defn rest-parameter?
  "**Parameters:**
   - `node`: `ParameterDeclaration | JSDocParameterTag`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isRestParameter node))

(defn internal-declaration?
  "**Parameters:**
   - `node`: `Node`
   - `source-file`: `SourceFile | undefined`
   
   **Returns:** `boolean`"
  (^js [node]
   (typescript/isInternalDeclaration node))
  (^js [node source-file]
   (typescript/isInternalDeclaration node source-file)))

(defn part-of-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPartOfTypeNode node))

(defn js-doc-comments-and-tags
  "This function checks multiple locations for JSDoc comments that apply to a host node.
   At each location, the whole comment may apply to the node, or only a specific tag in
   the comment. In the first case, location adds the entire {@link JSDoc } object. In the
   second case, it adds the applicable {@link JSDocTag }.
   
   For example, a JSDoc comment before a parameter adds the entire {@link JSDoc }. But a
   `@param` tag on the parent function only adds the {@link JSDocTag } for the `@param`.
   
   ```ts
   /** JSDoc will be returned for `a` *\\/
   const a = 0
   /**
    * Entire JSDoc will be returned for `b`
    *
   
   **Parameters:**
   - `host-node`: `Node`
   
   **Returns:** `readonly (JSDocTag | JSDoc)[]`"
  ^js [host-node]
  (typescript/getJSDocCommentsAndTags host-node))

(defn create-unparsed-source-file
  "**Parameters:**
   - `input-file`: `InputFiles`
   - `text`: `string`
   - `map-path`: `string | undefined`
   - `type`: `\"js\" | \"dts\"`
   - `map`: `string | undefined`
   - `strip-internal?`: `boolean | undefined`
   
   **Returns:** `UnparsedSource`"
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
  "**Parameters:**
   - `javascript-text`: `string`
   - `read-file-text`: `(path: string) => string | undefined`
   - `declaration-text`: `string`
   - `javascript-path`: `string`
   - `javascript-map-path`: `string | undefined`
   - `declaration-path`: `string`
   - `javascript-map-text`: `string | undefined`
   - `declaration-map-path`: `string | undefined`
   - `build-info-path`: `string | undefined`
   - `declaration-map-text`: `string | undefined`
   
   **Returns:** `InputFiles`"
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
  "Create an external source map source file reference
   
   **Parameters:**
   - `file-name`: `string`
   - `text`: `string`
   - `skip-trivia`: `((pos: number) => number) | undefined`
   
   **Returns:** `SourceMapSource`"
  (^js [file-name text]
   (typescript/createSourceMapSource file-name text))
  (^js [file-name text skip-trivia]
   (typescript/createSourceMapSource file-name text skip-trivia)))

(defn set-original-node
  "**Parameters:**
   - `node`: `T`
   - `original`: `Node | undefined`
   
   **Returns:** `T`"
  (^js [node]
   (typescript/setOriginalNode node))
  (^js [node original]
   (typescript/setOriginalNode node original)))

(defn dispose-emit-nodes
  "Clears any `EmitNode` entries from parse-tree nodes.
   
   **Parameters:**
   - `source-file`: `SourceFile | undefined` - A source file.
   
   **Returns:** `void`"
  (^js []
   (typescript/disposeEmitNodes))
  (^js [source-file]
   (typescript/disposeEmitNodes source-file)))

(defn set-emit-flags
  "Sets flags that control emit behavior of a node.
   
   **Parameters:**
   - `node`: `T`
   - `emit-flags`: `EmitFlags`
   
   **Returns:** `T`"
  ^js [node emit-flags]
  (typescript/setEmitFlags node emit-flags))

(defn source-map-range
  "Gets a custom text range to use when emitting source maps.
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `SourceMapRange`"
  ^js [node]
  (typescript/getSourceMapRange node))

(defn set-source-map-range
  "Sets a custom text range to use when emitting source maps.
   
   **Parameters:**
   - `node`: `T`
   - `range`: `SourceMapRange | undefined`
   
   **Returns:** `T`"
  (^js [node]
   (typescript/setSourceMapRange node))
  (^js [node range]
   (typescript/setSourceMapRange node range)))

(defn token-source-map-range
  "Gets the TextRange to use for source maps for a token of a node.
   
   **Parameters:**
   - `node`: `Node`
   - `token`: `SyntaxKind`
   
   **Returns:** `SourceMapRange | undefined`"
  ^js [node token]
  (typescript/getTokenSourceMapRange node token))

(defn set-token-source-map-range
  "Sets the TextRange to use for source maps for a token of a node.
   
   **Parameters:**
   - `node`: `T`
   - `token`: `SyntaxKind`
   - `range`: `SourceMapRange | undefined`
   
   **Returns:** `T`"
  (^js [node token]
   (typescript/setTokenSourceMapRange node token))
  (^js [node token range]
   (typescript/setTokenSourceMapRange node token range)))

(defn comment-range
  "Gets a custom text range to use when emitting comments.
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `TextRange`"
  ^js [node]
  (typescript/getCommentRange node))

(defn set-comment-range
  "Sets a custom text range to use when emitting comments.
   
   **Parameters:**
   - `node`: `T`
   - `range`: `TextRange`
   
   **Returns:** `T`"
  ^js [node range]
  (typescript/setCommentRange node range))

(defn synthetic-leading-comments
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `SynthesizedComment[] | undefined`"
  ^js [node]
  (typescript/getSyntheticLeadingComments node))

(defn set-synthetic-leading-comments
  "**Parameters:**
   - `node`: `T`
   - `comments`: `SynthesizedComment[] | undefined`
   
   **Returns:** `T`"
  (^js [node]
   (typescript/setSyntheticLeadingComments node))
  (^js [node comments]
   (typescript/setSyntheticLeadingComments node comments)))

(defn add-synthetic-leading-comment
  "**Parameters:**
   - `node`: `T`
   - `kind`: `SyntaxKind.SingleLineCommentTrivia | SyntaxKind.MultiLineCommentTrivia`
   - `text`: `string`
   - `has-trailing-new-line?`: `boolean | undefined`
   
   **Returns:** `T`"
  (^js [node kind text]
   (typescript/addSyntheticLeadingComment node kind text))
  (^js [node kind text has-trailing-new-line?]
   (typescript/addSyntheticLeadingComment node kind text has-trailing-new-line?)))

(defn synthetic-trailing-comments
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `SynthesizedComment[] | undefined`"
  ^js [node]
  (typescript/getSyntheticTrailingComments node))

(defn set-synthetic-trailing-comments
  "**Parameters:**
   - `node`: `T`
   - `comments`: `SynthesizedComment[] | undefined`
   
   **Returns:** `T`"
  (^js [node]
   (typescript/setSyntheticTrailingComments node))
  (^js [node comments]
   (typescript/setSyntheticTrailingComments node comments)))

(defn add-synthetic-trailing-comment
  "**Parameters:**
   - `node`: `T`
   - `kind`: `SyntaxKind.SingleLineCommentTrivia | SyntaxKind.MultiLineCommentTrivia`
   - `text`: `string`
   - `has-trailing-new-line?`: `boolean | undefined`
   
   **Returns:** `T`"
  (^js [node kind text]
   (typescript/addSyntheticTrailingComment node kind text))
  (^js [node kind text has-trailing-new-line?]
   (typescript/addSyntheticTrailingComment node kind text has-trailing-new-line?)))

(defn move-synthetic-comments
  "**Parameters:**
   - `node`: `T`
   - `original`: `Node`
   
   **Returns:** `T`"
  ^js [node original]
  (typescript/moveSyntheticComments node original))

(defn constant-value
  "Gets the constant value to emit for an expression representing an enum.
   
   **Parameters:**
   - `node`: `AccessExpression`
   
   **Returns:** `string | number | undefined`"
  ^js [node]
  (typescript/getConstantValue node))

(defn set-constant-value
  "Sets the constant value to emit for an expression.
   
   **Parameters:**
   - `node`: `AccessExpression`
   - `value`: `string | number`
   
   **Returns:** `AccessExpression`"
  ^js [node value]
  (typescript/setConstantValue node value))

(defn add-emit-helper
  "Adds an EmitHelper to a node.
   
   **Parameters:**
   - `node`: `T`
   - `helper`: `EmitHelper`
   
   **Returns:** `T`"
  ^js [node helper]
  (typescript/addEmitHelper node helper))

(defn add-emit-helpers
  "Add EmitHelpers to a node.
   
   **Parameters:**
   - `node`: `T`
   - `helpers`: `EmitHelper[] | undefined`
   
   **Returns:** `T`"
  (^js [node]
   (typescript/addEmitHelpers node))
  (^js [node helpers]
   (typescript/addEmitHelpers node helpers)))

(defn remove-emit-helper?
  "Removes an EmitHelper from a node.
   
   **Parameters:**
   - `node`: `Node`
   - `helper`: `EmitHelper`
   
   **Returns:** `boolean`"
  ^js [node helper]
  (typescript/removeEmitHelper node helper))

(defn emit-helpers
  "Gets the EmitHelpers of a node.
   
   **Parameters:**
   - `node`: `Node`
   
   **Returns:** `EmitHelper[] | undefined`"
  ^js [node]
  (typescript/getEmitHelpers node))

(defn move-emit-helpers
  "Moves matching emit helpers from a source node to a target node.
   
   **Parameters:**
   - `source`: `Node`
   - `target`: `Node`
   - `predicate`: `(helper: EmitHelper) => boolean`
   
   **Returns:** `void`"
  ^js [source target predicate]
  (typescript/moveEmitHelpers source target predicate))

(defn numeric-literal?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNumericLiteral node))

(defn big-int-literal?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isBigIntLiteral node))

(defn string-literal?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isStringLiteral node))

(defn jsx-text?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxText node))

(defn regular-expression-literal?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isRegularExpressionLiteral node))

(defn no-substitution-template-literal?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNoSubstitutionTemplateLiteral node))

(defn template-head?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTemplateHead node))

(defn template-middle?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTemplateMiddle node))

(defn template-tail?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTemplateTail node))

(defn dot-dot-dot-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isDotDotDotToken node))

(defn plus-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPlusToken node))

(defn minus-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isMinusToken node))

(defn asterisk-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isAsteriskToken node))

(defn exclamation-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isExclamationToken node))

(defn question-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isQuestionToken node))

(defn colon-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isColonToken node))

(defn question-dot-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isQuestionDotToken node))

(defn equals-greater-than-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isEqualsGreaterThanToken node))

(defn identifier?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isIdentifier node))

(defn private-identifier?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPrivateIdentifier node))

(defn asserts-keyword?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isAssertsKeyword node))

(defn await-keyword?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isAwaitKeyword node))

(defn qualified-name?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isQualifiedName node))

(defn computed-property-name?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isComputedPropertyName node))

(defn type-parameter-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeParameterDeclaration node))

(defn parameter?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isParameter node))

(defn decorator?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isDecorator node))

(defn property-signature?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPropertySignature node))

(defn property-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPropertyDeclaration node))

(defn method-signature?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isMethodSignature node))

(defn method-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isMethodDeclaration node))

(defn class-static-block-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isClassStaticBlockDeclaration node))

(defn constructor-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isConstructorDeclaration node))

(defn get-accessor-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isGetAccessorDeclaration node))

(defn set-accessor-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isSetAccessorDeclaration node))

(defn call-signature-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isCallSignatureDeclaration node))

(defn construct-signature-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isConstructSignatureDeclaration node))

(defn index-signature-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isIndexSignatureDeclaration node))

(defn type-predicate-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypePredicateNode node))

(defn type-reference-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeReferenceNode node))

(defn function-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isFunctionTypeNode node))

(defn constructor-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isConstructorTypeNode node))

(defn type-query-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeQueryNode node))

(defn type-literal-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeLiteralNode node))

(defn array-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isArrayTypeNode node))

(defn tuple-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTupleTypeNode node))

(defn named-tuple-member?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNamedTupleMember node))

(defn optional-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isOptionalTypeNode node))

(defn rest-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isRestTypeNode node))

(defn union-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isUnionTypeNode node))

(defn intersection-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isIntersectionTypeNode node))

(defn conditional-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isConditionalTypeNode node))

(defn infer-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isInferTypeNode node))

(defn parenthesized-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isParenthesizedTypeNode node))

(defn this-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isThisTypeNode node))

(defn type-operator-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeOperatorNode node))

(defn indexed-access-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isIndexedAccessTypeNode node))

(defn mapped-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isMappedTypeNode node))

(defn literal-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isLiteralTypeNode node))

(defn import-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isImportTypeNode node))

(defn template-literal-type-span?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTemplateLiteralTypeSpan node))

(defn template-literal-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTemplateLiteralTypeNode node))

(defn object-binding-pattern?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isObjectBindingPattern node))

(defn array-binding-pattern?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isArrayBindingPattern node))

(defn binding-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isBindingElement node))

(defn array-literal-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isArrayLiteralExpression node))

(defn object-literal-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isObjectLiteralExpression node))

(defn property-access-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPropertyAccessExpression node))

(defn element-access-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isElementAccessExpression node))

(defn call-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isCallExpression node))

(defn new-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNewExpression node))

(defn tagged-template-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTaggedTemplateExpression node))

(defn type-assertion-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeAssertionExpression node))

(defn parenthesized-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isParenthesizedExpression node))

(defn function-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isFunctionExpression node))

(defn arrow-function?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isArrowFunction node))

(defn delete-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isDeleteExpression node))

(defn type-of-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeOfExpression node))

(defn void-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isVoidExpression node))

(defn await-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isAwaitExpression node))

(defn prefix-unary-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPrefixUnaryExpression node))

(defn postfix-unary-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPostfixUnaryExpression node))

(defn binary-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isBinaryExpression node))

(defn conditional-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isConditionalExpression node))

(defn template-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTemplateExpression node))

(defn yield-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isYieldExpression node))

(defn spread-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isSpreadElement node))

(defn class-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isClassExpression node))

(defn omitted-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isOmittedExpression node))

(defn expression-with-type-arguments?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isExpressionWithTypeArguments node))

(defn as-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isAsExpression node))

(defn satisfies-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isSatisfiesExpression node))

(defn non-null-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNonNullExpression node))

(defn meta-property?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isMetaProperty node))

(defn synthetic-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isSyntheticExpression node))

(defn partially-emitted-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPartiallyEmittedExpression node))

(defn comma-list-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isCommaListExpression node))

(defn template-span?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTemplateSpan node))

(defn semicolon-class-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isSemicolonClassElement node))

(defn block?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isBlock node))

(defn variable-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isVariableStatement node))

(defn empty-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isEmptyStatement node))

(defn expression-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isExpressionStatement node))

(defn if-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isIfStatement node))

(defn do-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isDoStatement node))

(defn while-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isWhileStatement node))

(defn for-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isForStatement node))

(defn for-in-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isForInStatement node))

(defn for-of-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isForOfStatement node))

(defn continue-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isContinueStatement node))

(defn break-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isBreakStatement node))

(defn return-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isReturnStatement node))

(defn with-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isWithStatement node))

(defn switch-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isSwitchStatement node))

(defn labeled-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isLabeledStatement node))

(defn throw-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isThrowStatement node))

(defn try-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTryStatement node))

(defn debugger-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isDebuggerStatement node))

(defn variable-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isVariableDeclaration node))

(defn variable-declaration-list?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isVariableDeclarationList node))

(defn function-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isFunctionDeclaration node))

(defn class-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isClassDeclaration node))

(defn interface-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isInterfaceDeclaration node))

(defn type-alias-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isTypeAliasDeclaration node))

(defn enum-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isEnumDeclaration node))

(defn module-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isModuleDeclaration node))

(defn module-block?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isModuleBlock node))

(defn case-block?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isCaseBlock node))

(defn namespace-export-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNamespaceExportDeclaration node))

(defn import-equals-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isImportEqualsDeclaration node))

(defn import-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isImportDeclaration node))

(defn import-clause?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isImportClause node))

(defn import-type-assertion-container?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isImportTypeAssertionContainer node))

(defn assert-clause?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isAssertClause node))

(defn assert-entry?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isAssertEntry node))

(defn import-attributes?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isImportAttributes node))

(defn import-attribute?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isImportAttribute node))

(defn namespace-import?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNamespaceImport node))

(defn namespace-export?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNamespaceExport node))

(defn named-imports?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNamedImports node))

(defn import-specifier?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isImportSpecifier node))

(defn export-assignment?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isExportAssignment node))

(defn export-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isExportDeclaration node))

(defn named-exports?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNamedExports node))

(defn export-specifier?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isExportSpecifier node))

(defn missing-declaration?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isMissingDeclaration node))

(defn not-emitted-statement?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isNotEmittedStatement node))

(defn external-module-reference?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isExternalModuleReference node))

(defn jsx-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxElement node))

(defn jsx-self-closing-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxSelfClosingElement node))

(defn jsx-opening-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxOpeningElement node))

(defn jsx-closing-element?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxClosingElement node))

(defn jsx-fragment?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxFragment node))

(defn jsx-opening-fragment?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxOpeningFragment node))

(defn jsx-closing-fragment?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxClosingFragment node))

(defn jsx-attribute?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxAttribute node))

(defn jsx-attributes?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxAttributes node))

(defn jsx-spread-attribute?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxSpreadAttribute node))

(defn jsx-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxExpression node))

(defn jsx-namespaced-name?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJsxNamespacedName node))

(defn case-clause?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isCaseClause node))

(defn default-clause?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isDefaultClause node))

(defn heritage-clause?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isHeritageClause node))

(defn catch-clause?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isCatchClause node))

(defn property-assignment?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isPropertyAssignment node))

(defn shorthand-property-assignment?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isShorthandPropertyAssignment node))

(defn spread-assignment?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isSpreadAssignment node))

(defn enum-member?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isEnumMember node))

(defn unparsed-prepend?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isUnparsedPrepend node))

(defn source-file?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isSourceFile node))

(defn bundle?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isBundle node))

(defn unparsed-source?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isUnparsedSource node))

(defn js-doc-type-expression?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocTypeExpression node))

(defn js-doc-name-reference?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocNameReference node))

(defn js-doc-member-name?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocMemberName node))

(defn js-doc-link?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocLink node))

(defn js-doc-link-code?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocLinkCode node))

(defn js-doc-link-plain?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocLinkPlain node))

(defn js-doc-all-type?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocAllType node))

(defn js-doc-unknown-type?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocUnknownType node))

(defn js-doc-nullable-type?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocNullableType node))

(defn js-doc-non-nullable-type?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocNonNullableType node))

(defn js-doc-optional-type?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocOptionalType node))

(defn js-doc-function-type?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocFunctionType node))

(defn js-doc-variadic-type?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocVariadicType node))

(defn js-doc-namepath-type?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocNamepathType node))

(defn js-doc?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDoc node))

(defn js-doc-type-literal?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocTypeLiteral node))

(defn js-doc-signature?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocSignature node))

(defn js-doc-augments-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocAugmentsTag node))

(defn js-doc-author-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocAuthorTag node))

(defn js-doc-class-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocClassTag node))

(defn js-doc-callback-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocCallbackTag node))

(defn js-doc-public-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocPublicTag node))

(defn js-doc-private-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocPrivateTag node))

(defn js-doc-protected-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocProtectedTag node))

(defn js-doc-readonly-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocReadonlyTag node))

(defn js-doc-override-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocOverrideTag node))

(defn js-doc-overload-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocOverloadTag node))

(defn js-doc-deprecated-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocDeprecatedTag node))

(defn js-doc-see-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocSeeTag node))

(defn js-doc-enum-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocEnumTag node))

(defn js-doc-parameter-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocParameterTag node))

(defn js-doc-return-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocReturnTag node))

(defn js-doc-this-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocThisTag node))

(defn js-doc-type-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocTypeTag node))

(defn js-doc-template-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocTemplateTag node))

(defn js-doc-typedef-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocTypedefTag node))

(defn js-doc-unknown-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocUnknownTag node))

(defn js-doc-property-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocPropertyTag node))

(defn js-doc-implements-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocImplementsTag node))

(defn js-doc-satisfies-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocSatisfiesTag node))

(defn js-doc-throws-tag?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isJSDocThrowsTag node))

(defn question-or-exclamation-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isQuestionOrExclamationToken node))

(defn identifier-or-this-type-node?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isIdentifierOrThisTypeNode node))

(defn readonly-keyword-or-plus-or-minus-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isReadonlyKeywordOrPlusOrMinusToken node))

(defn question-or-plus-or-minus-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isQuestionOrPlusOrMinusToken node))

(defn module-name?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isModuleName node))

(defn binary-operator-token?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/isBinaryOperatorToken node))

(defn set-text-range
  "**Parameters:**
   - `range`: `T`
   - `location`: `TextRange | undefined`
   
   **Returns:** `T`"
  (^js [range]
   (typescript/setTextRange range))
  (^js [range location]
   (typescript/setTextRange range location)))

(defn can-have-modifiers?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/canHaveModifiers node))

(defn can-have-decorators?
  "**Parameters:**
   - `node`: `Node`
   
   **Returns:** `boolean`"
  ^js [node]
  (typescript/canHaveDecorators node))

(defn for-each-child
  "Invokes a callback for each child of the given node. The 'cbNode' callback is invoked for all child nodes
   stored in properties. If a 'cbNodes' callback is specified, it is invoked for embedded arrays; otherwise,
   embedded arrays are flattened and the 'cbNode' callback is invoked for each element. If a callback returns
   a truthy value, iteration stops and that value is returned. Otherwise, undefined is returned.
   
   **Parameters:**
   - `node`: `Node` - a given node to visit its children
   - `cb-node`: `(node: Node) => T | undefined` - a callback to be invoked for all child nodes
   - `cb-nodes`: `((nodes: NodeArray<Node>) => T | undefined) | undefined` - a callback to be invoked for embedded array
   
   **Returns:** `T | undefined`"
  (^js [node cb-node]
   (typescript/forEachChild node cb-node))
  (^js [node cb-node cb-nodes]
   (typescript/forEachChild node cb-node cb-nodes)))

(defn create-source-file
  "**Parameters:**
   - `file-name`: `string`
   - `source-text`: `string`
   - `language-version-or-options`: `ScriptTarget | CreateSourceFileOptions`
   - `set-parent-nodes?`: `boolean | undefined`
   - `script-kind`: `ScriptKind | undefined`
   
   **Returns:** `SourceFile`"
  (^js [file-name source-text language-version-or-options]
   (typescript/createSourceFile file-name source-text language-version-or-options))
  (^js [file-name source-text language-version-or-options set-parent-nodes?]
   (typescript/createSourceFile file-name source-text language-version-or-options set-parent-nodes?))
  (^js [file-name source-text language-version-or-options set-parent-nodes? script-kind]
   (typescript/createSourceFile file-name source-text language-version-or-options set-parent-nodes? script-kind)))

(defn parse-isolated-entity-name
  "**Parameters:**
   - `text`: `string`
   - `language-version`: `ScriptTarget`
   
   **Returns:** `EntityName | undefined`"
  ^js [text language-version]
  (typescript/parseIsolatedEntityName text language-version))

(defn parse-json-text
  "Parse json text into SyntaxTree and return node and parse errors if any
   
   **Parameters:**
   - `file-name`: `string`
   - `source-text`: `string`
   
   **Returns:** `JsonSourceFile`"
  ^js [file-name source-text]
  (typescript/parseJsonText file-name source-text))

(defn external-module?
  "**Parameters:**
   - `file`: `SourceFile`
   
   **Returns:** `boolean`"
  ^js [file]
  (typescript/isExternalModule file))

(defn update-source-file
  "**Parameters:**
   - `source-file`: `SourceFile`
   - `new-text`: `string`
   - `text-change-range`: `TextChangeRange`
   - `aggressive-checks?`: `boolean | undefined`
   
   **Returns:** `SourceFile`"
  (^js [source-file new-text text-change-range]
   (typescript/updateSourceFile source-file new-text text-change-range))
  (^js [source-file new-text text-change-range aggressive-checks?]
   (typescript/updateSourceFile source-file new-text text-change-range aggressive-checks?)))

(defn parse-command-line
  "**Parameters:**
   - `command-line`: `readonly string[]`
   - `read-file`: `((path: string) => string | undefined) | undefined`
   
   **Returns:** `ParsedCommandLine`"
  (^js [command-line]
   (typescript/parseCommandLine command-line))
  (^js [command-line read-file]
   (typescript/parseCommandLine command-line read-file)))

(defn parsed-command-line-of-config-file
  "Reads the config file, reports errors if any and exits if the config file cannot be found
   
   **Parameters:**
   - `config-file-name`: `string`
   - `options-to-extend`: `CompilerOptions | undefined`
   - `host`: `ParseConfigFileHost`
   - `extended-config-cache`: `any`
   - `watch-options-to-extend`: `WatchOptions | undefined`
   - `extra-file-extensions`: `readonly FileExtensionInfo[] | undefined`
   
   **Returns:** `ParsedCommandLine | undefined`"
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
  "Read tsconfig.json file
   
   **Parameters:**
   - `file-name`: `string` - The path to the config file
   - `read-file`: `(path: string) => string | undefined`
   
   **Returns:** `{ config?: any; error?: Diagnostic | undefined; }`"
  ^js [file-name read-file]
  (typescript/readConfigFile file-name read-file))

(defn parse-config-file-text-to-json
  "Parse the text of the tsconfig.json file
   
   **Parameters:**
   - `file-name`: `string` - The path to the config file
   - `json-text`: `string` - The text of the config file
   
   **Returns:** `{ config?: any; error?: Diagnostic | undefined; }`"
  ^js [file-name json-text]
  (typescript/parseConfigFileTextToJson file-name json-text))

(defn read-json-config-file
  "Read tsconfig.json file
   
   **Parameters:**
   - `file-name`: `string` - The path to the config file
   - `read-file`: `(path: string) => string | undefined`
   
   **Returns:** `TsConfigSourceFile`"
  ^js [file-name read-file]
  (typescript/readJsonConfigFile file-name read-file))

(defn convert-to-object
  "Convert the json syntax tree into the json value
   
   **Parameters:**
   - `source-file`: `JsonSourceFile`
   - `errors`: `Diagnostic[]`
   
   **Returns:** `any`"
  ^js [source-file errors]
  (typescript/convertToObject source-file errors))

(defn parse-json-config-file-content
  "Parse the contents of a config file (tsconfig.json).
   
   **Parameters:**
   - `json`: `any` - The contents of the config file to parse
   - `host`: `ParseConfigHost` - Instance of ParseConfigHost used to enumerate files in folder.
   - `base-path`: `string` - A root directory to resolve relative path entries in the config
   file to. e.g. outDir
   - `existing-options`: `CompilerOptions | undefined`
   - `config-file-name`: `string | undefined`
   - `resolution-stack`: `Path[] | undefined`
   - `extra-file-extensions`: `readonly FileExtensionInfo[] | undefined`
   - `extended-config-cache`: `any`
   - `existing-watch-options`: `WatchOptions | undefined`
   
   **Returns:** `ParsedCommandLine`"
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
  "Parse the contents of a config file (tsconfig.json).
   
   **Parameters:**
   - `source-file`: `TsConfigSourceFile`
   - `host`: `ParseConfigHost` - Instance of ParseConfigHost used to enumerate files in folder.
   - `base-path`: `string` - A root directory to resolve relative path entries in the config
   file to. e.g. outDir
   - `existing-options`: `CompilerOptions | undefined`
   - `config-file-name`: `string | undefined`
   - `resolution-stack`: `Path[] | undefined`
   - `extra-file-extensions`: `readonly FileExtensionInfo[] | undefined`
   - `extended-config-cache`: `any`
   - `existing-watch-options`: `WatchOptions | undefined`
   
   **Returns:** `ParsedCommandLine`"
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
  "**Parameters:**
   - `json-options`: `any`
   - `base-path`: `string`
   - `config-file-name`: `string | undefined`
   
   **Returns:** `{ options: CompilerOptions; errors: Diagnostic[]; }`"
  (^js [json-options base-path]
   (typescript/convertCompilerOptionsFromJson json-options base-path))
  (^js [json-options base-path config-file-name]
   (typescript/convertCompilerOptionsFromJson json-options base-path config-file-name)))

(defn convert-type-acquisition-from-json
  "**Parameters:**
   - `json-options`: `any`
   - `base-path`: `string`
   - `config-file-name`: `string | undefined`
   
   **Returns:** `{ options: TypeAcquisition; errors: Diagnostic[]; }`"
  (^js [json-options base-path]
   (typescript/convertTypeAcquisitionFromJson json-options base-path))
  (^js [json-options base-path config-file-name]
   (typescript/convertTypeAcquisitionFromJson json-options base-path config-file-name)))

(defn effective-type-roots
  "**Parameters:**
   - `options`: `CompilerOptions`
   - `host`: `GetEffectiveTypeRootsHost`
   
   **Returns:** `string[] | undefined`"
  ^js [options host]
  (typescript/getEffectiveTypeRoots options host))

(defn resolve-type-reference-directive
  "**Parameters:**
   - `type-reference-directive-name`: `string`
   - `containing-file`: `string | undefined` - - file that contains type reference directive, can be undefined if containing file is unknown.
   This is possible in case if resolution is performed for directives specified via 'types' parameter. In this case initial path for secondary lookups
   is assumed to be the same as root directory of the project.
   - `options`: `CompilerOptions`
   - `host`: `ModuleResolutionHost`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `cache`: `TypeReferenceDirectiveResolutionCache | undefined`
   - `resolution-mode`: `ResolutionMode`
   
   **Returns:** `ResolvedTypeReferenceDirectiveWithFailedLookupLocations`"
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
     this list is only the set of defaults that are implicitly included.
   
   **Parameters:**
   - `options`: `CompilerOptions`
   - `host`: `ModuleResolutionHost`
   
   **Returns:** `string[]`"
  ^js [options host]
  (typescript/getAutomaticTypeDirectiveNames options host))

(defn create-module-resolution-cache
  "**Parameters:**
   - `current-directory`: `string`
   - `canonical-file-name`: `(s: string) => string`
   - `options`: `CompilerOptions | undefined`
   - `package-json-info-cache`: `PackageJsonInfoCache | undefined`
   
   **Returns:** `ModuleResolutionCache`"
  (^js [current-directory canonical-file-name]
   (typescript/createModuleResolutionCache current-directory canonical-file-name))
  (^js [current-directory canonical-file-name options]
   (typescript/createModuleResolutionCache current-directory canonical-file-name options))
  (^js [current-directory canonical-file-name options package-json-info-cache]
   (typescript/createModuleResolutionCache current-directory canonical-file-name options package-json-info-cache)))

(defn create-type-reference-directive-resolution-cache
  "**Parameters:**
   - `current-directory`: `string`
   - `canonical-file-name`: `(s: string) => string`
   - `options`: `CompilerOptions | undefined`
   - `package-json-info-cache`: `PackageJsonInfoCache | undefined`
   
   **Returns:** `TypeReferenceDirectiveResolutionCache`"
  (^js [current-directory canonical-file-name]
   (typescript/createTypeReferenceDirectiveResolutionCache current-directory canonical-file-name))
  (^js [current-directory canonical-file-name options]
   (typescript/createTypeReferenceDirectiveResolutionCache current-directory canonical-file-name options))
  (^js [current-directory canonical-file-name options package-json-info-cache]
   (typescript/createTypeReferenceDirectiveResolutionCache current-directory canonical-file-name options package-json-info-cache)))

(defn resolve-module-name-from-cache
  "**Parameters:**
   - `module-name`: `string`
   - `containing-file`: `string`
   - `cache`: `ModuleResolutionCache`
   - `mode`: `ResolutionMode`
   
   **Returns:** `ResolvedModuleWithFailedLookupLocations | undefined`"
  (^js [module-name containing-file cache]
   (typescript/resolveModuleNameFromCache module-name containing-file cache))
  (^js [module-name containing-file cache mode]
   (typescript/resolveModuleNameFromCache module-name containing-file cache mode)))

(defn resolve-module-name
  "**Parameters:**
   - `module-name`: `string`
   - `containing-file`: `string`
   - `compiler-options`: `CompilerOptions`
   - `host`: `ModuleResolutionHost`
   - `cache`: `ModuleResolutionCache | undefined`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   - `resolution-mode`: `ResolutionMode`
   
   **Returns:** `ResolvedModuleWithFailedLookupLocations`"
  (^js [module-name containing-file compiler-options host]
   (typescript/resolveModuleName module-name containing-file compiler-options host))
  (^js [module-name containing-file compiler-options host cache]
   (typescript/resolveModuleName module-name containing-file compiler-options host cache))
  (^js [module-name containing-file compiler-options host cache redirected-reference]
   (typescript/resolveModuleName module-name containing-file compiler-options host cache redirected-reference))
  (^js [module-name containing-file compiler-options host cache redirected-reference resolution-mode]
   (typescript/resolveModuleName module-name containing-file compiler-options host cache redirected-reference resolution-mode)))

(defn bundler-module-name-resolver
  "**Parameters:**
   - `module-name`: `string`
   - `containing-file`: `string`
   - `compiler-options`: `CompilerOptions`
   - `host`: `ModuleResolutionHost`
   - `cache`: `ModuleResolutionCache | undefined`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `ResolvedModuleWithFailedLookupLocations`"
  (^js [module-name containing-file compiler-options host]
   (typescript/bundlerModuleNameResolver module-name containing-file compiler-options host))
  (^js [module-name containing-file compiler-options host cache]
   (typescript/bundlerModuleNameResolver module-name containing-file compiler-options host cache))
  (^js [module-name containing-file compiler-options host cache redirected-reference]
   (typescript/bundlerModuleNameResolver module-name containing-file compiler-options host cache redirected-reference)))

(defn node-module-name-resolver
  "**Parameters:**
   - `module-name`: `string`
   - `containing-file`: `string`
   - `compiler-options`: `CompilerOptions`
   - `host`: `ModuleResolutionHost`
   - `cache`: `ModuleResolutionCache | undefined`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `ResolvedModuleWithFailedLookupLocations`"
  (^js [module-name containing-file compiler-options host]
   (typescript/nodeModuleNameResolver module-name containing-file compiler-options host))
  (^js [module-name containing-file compiler-options host cache]
   (typescript/nodeModuleNameResolver module-name containing-file compiler-options host cache))
  (^js [module-name containing-file compiler-options host cache redirected-reference]
   (typescript/nodeModuleNameResolver module-name containing-file compiler-options host cache redirected-reference)))

(defn classic-name-resolver
  "**Parameters:**
   - `module-name`: `string`
   - `containing-file`: `string`
   - `compiler-options`: `CompilerOptions`
   - `host`: `ModuleResolutionHost`
   - `cache`: `NonRelativeModuleNameResolutionCache | undefined`
   - `redirected-reference`: `ResolvedProjectReference | undefined`
   
   **Returns:** `ResolvedModuleWithFailedLookupLocations`"
  (^js [module-name containing-file compiler-options host]
   (typescript/classicNameResolver module-name containing-file compiler-options host))
  (^js [module-name containing-file compiler-options host cache]
   (typescript/classicNameResolver module-name containing-file compiler-options host cache))
  (^js [module-name containing-file compiler-options host cache redirected-reference]
   (typescript/classicNameResolver module-name containing-file compiler-options host cache redirected-reference)))

(defn visit-node
  "Visits a Node using the supplied visitor, possibly returning a new Node in its place.
   
   - If the input node is undefined, then the output is undefined.
   - If the visitor returns undefined, then the output is undefined.
   - If the output node is not undefined, then it will satisfy the test function.
   - In order to obtain a return type that is more specific than `Node`, a test
     function _must_ be provided, and that function must be a type predicate.
   
   **Parameters:**
   - `node`: `TIn` - The Node to visit.
   - `visitor`: `Visitor<NonNullable<TIn>, TVisited>` - The callback used to visit the Node.
   - `test`: `((node: Node) => boolean) | undefined` - A callback to execute to verify the Node is valid.
   - `lift`: `((node: readonly Node[]) => Node) | undefined` - An optional callback to execute to lift a NodeArray into a valid Node.
   
   **Returns:** `Node | (TIn & undefined) | (TVisited & undefined)`"
  (^js [node visitor]
   (typescript/visitNode node visitor))
  (^js [node visitor test]
   (typescript/visitNode node visitor test))
  (^js [node visitor test lift]
   (typescript/visitNode node visitor test lift)))

(defn visit-nodes
  "Visits a NodeArray using the supplied visitor, possibly returning a new NodeArray in its place.
   
   - If the input node array is undefined, the output is undefined.
   - If the visitor can return undefined, the node it visits in the array will be reused.
   - If the output node array is not undefined, then its contents will satisfy the test.
   - In order to obtain a return type that is more specific than `NodeArray<Node>`, a test
     function _must_ be provided, and that function must be a type predicate.
   
   **Parameters:**
   - `nodes`: `TInArray` - The NodeArray to visit.
   - `visitor`: `Visitor<TIn, Node | undefined>` - The callback used to visit a Node.
   - `test`: `((node: Node) => boolean) | undefined` - A node test to execute for each node.
   - `start`: `number | undefined` - An optional value indicating the starting offset at which to start visiting.
   - `count`: `number | undefined` - An optional value indicating the maximum number of nodes to visit.
   
   **Returns:** `NodeArray<Node> | (TInArray & undefined)`"
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
   and merging hoisted declarations upon completion.
   
   **Parameters:**
   - `statements`: `NodeArray<Statement>`
   - `visitor`: `Visitor<Node, Node | undefined>`
   - `context`: `TransformationContext`
   - `start`: `number | undefined`
   - `ensure-use-strict?`: `boolean | undefined`
   - `nodes-visitor`: `NodesVisitor | undefined`
   
   **Returns:** `NodeArray<Statement>`"
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
   environment upon completion.
   
   **Parameters:**
   - `nodes`: `NodeArray<ParameterDeclaration> | undefined`
   - `visitor`: `Visitor<Node, Node | undefined>`
   - `context`: `TransformationContext`
   - `nodes-visitor`: `NodesVisitor | undefined`
   
   **Returns:** `NodeArray<ParameterDeclaration> | undefined`"
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
   environment and merging hoisted declarations upon completion.
   
   **Parameters:**
   - `node`: `ConciseBody`
   - `visitor`: `Visitor<Node, Node | undefined>`
   - `context`: `TransformationContext`
   
   **Returns:** `ConciseBody`"
  (^js []
   (typescript/visitFunctionBody))
  (^js [node]
   (typescript/visitFunctionBody node))
  (^js [node visitor]
   (typescript/visitFunctionBody node visitor))
  (^js [node visitor context]
   (typescript/visitFunctionBody node visitor context)))

(defn visit-iteration-body
  "Visits an iteration body, adding any block-scoped variables required by the transformation.
   
   **Parameters:**
   - `body`: `Statement`
   - `visitor`: `Visitor<Node, Node | undefined>`
   - `context`: `TransformationContext`
   
   **Returns:** `Statement`"
  ^js [body visitor context]
  (typescript/visitIterationBody body visitor context))

(defn visit-comma-list-elements
  "Visits the elements of a {@link CommaListExpression }.
   
   **Parameters:**
   - `elements`: `NodeArray<Expression>`
   - `visitor`: `Visitor<Node, Node | undefined>` - The visitor to use when visiting expressions whose result will not be discarded at runtime.
   - `discard-visitor`: `Visitor<Node, Node | undefined> | undefined` - The visitor to use when visiting expressions whose result will be discarded at runtime. Defaults to {@link visitor }.
   
   **Returns:** `NodeArray<Expression>`"
  (^js [elements visitor]
   (typescript/visitCommaListElements elements visitor))
  (^js [elements visitor discard-visitor]
   (typescript/visitCommaListElements elements visitor discard-visitor)))

(defn visit-each-child
  "Visits each child of a Node using the supplied visitor, possibly returning a new Node of the same kind in its place.
   
   **Parameters:**
   - `node`: `T | undefined` - The Node whose children will be visited.
   - `visitor`: `Visitor<Node, Node | undefined>` - The callback used to visit each child.
   - `context`: `TransformationContext | undefined` - A lexical environment context for the visitor.
   - `nodes-visitor`: `{ <TIn extends Node, TInArray extends NodeArray<TIn> | undefined, TOut extends Node>(nodes: TInArray, visitor: Visitor<TIn, Node | undefined>, test: (node: Node) => node is TOut, start?: number | undefined, count?: number | undefined): NodeArray<...> | (TInArray & undefined); <TIn extends Node, TInArray extends Node...`
   - `token-visitor`: `Visitor<Node, Node | undefined> | undefined`
   
   **Returns:** `T | undefined`"
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
  "**Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `string | undefined`"
  ^js [options]
  (typescript/getTsBuildInfoEmitOutputFilePath options))

(defn output-file-names
  "**Parameters:**
   - `command-line`: `ParsedCommandLine`
   - `input-file-name`: `string`
   - `ignore-case?`: `boolean`
   
   **Returns:** `readonly string[]`"
  ^js [command-line input-file-name ignore-case?]
  (typescript/getOutputFileNames command-line input-file-name ignore-case?))

(defn create-printer
  "**Parameters:**
   - `printer-options`: `PrinterOptions | undefined`
   - `handlers`: `PrintHandlers | undefined`
   
   **Returns:** `Printer`"
  (^js []
   (typescript/createPrinter))
  (^js [printer-options]
   (typescript/createPrinter printer-options))
  (^js [printer-options handlers]
   (typescript/createPrinter printer-options handlers)))

(defn find-config-file
  "**Parameters:**
   - `search-path`: `string`
   - `file-exists`: `(fileName: string) => boolean`
   - `config-name`: `string | undefined`
   
   **Returns:** `string | undefined`"
  (^js [search-path file-exists]
   (typescript/findConfigFile search-path file-exists))
  (^js [search-path file-exists config-name]
   (typescript/findConfigFile search-path file-exists config-name)))

(defn resolve-tripleslash-reference
  "**Parameters:**
   - `module-name`: `string`
   - `containing-file`: `string`
   
   **Returns:** `string`"
  ^js [module-name containing-file]
  (typescript/resolveTripleslashReference module-name containing-file))

(defn create-compiler-host
  "**Parameters:**
   - `options`: `CompilerOptions`
   - `set-parent-nodes?`: `boolean | undefined`
   
   **Returns:** `CompilerHost`"
  (^js [options]
   (typescript/createCompilerHost options))
  (^js [options set-parent-nodes?]
   (typescript/createCompilerHost options set-parent-nodes?)))

(defn pre-emit-diagnostics
  "**Parameters:**
   - `program`: `Program`
   - `source-file`: `SourceFile | undefined`
   - `cancellation-token`: `CancellationToken | undefined`
   
   **Returns:** `readonly Diagnostic[]`"
  (^js [program]
   (typescript/getPreEmitDiagnostics program))
  (^js [program source-file]
   (typescript/getPreEmitDiagnostics program source-file))
  (^js [program source-file cancellation-token]
   (typescript/getPreEmitDiagnostics program source-file cancellation-token)))

(defn format-diagnostics
  "**Parameters:**
   - `diagnostics`: `readonly Diagnostic[]`
   - `host`: `FormatDiagnosticsHost`
   
   **Returns:** `string`"
  ^js [diagnostics host]
  (typescript/formatDiagnostics diagnostics host))

(defn format-diagnostic
  "**Parameters:**
   - `diagnostic`: `Diagnostic`
   - `host`: `FormatDiagnosticsHost`
   
   **Returns:** `string`"
  ^js [diagnostic host]
  (typescript/formatDiagnostic diagnostic host))

(defn format-diagnostics-with-color-and-context
  "**Parameters:**
   - `diagnostics`: `readonly Diagnostic[]`
   - `host`: `FormatDiagnosticsHost`
   
   **Returns:** `string`"
  ^js [diagnostics host]
  (typescript/formatDiagnosticsWithColorAndContext diagnostics host))

(defn flatten-diagnostic-message-text
  "**Parameters:**
   - `diag`: `string | DiagnosticMessageChain | undefined`
   - `new-line`: `string`
   - `indent`: `number | undefined`
   
   **Returns:** `string`"
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
   provided resolution mode in the reference, unless one is not present, in which case it is the mode of the containing file.
   
   **Parameters:**
   - `ref`: `string | FileReference`
   - `containing-file-mode`: `ResolutionMode`
   
   **Returns:** `ResolutionMode`"
  (^js [ref]
   (typescript/getModeForFileReference ref))
  (^js [ref containing-file-mode]
   (typescript/getModeForFileReference ref containing-file-mode)))

(defn mode-for-resolution-at-index
  "Use `program.getModeForResolutionAtIndex`, which retrieves the correct `compilerOptions`, instead of this function whenever possible.
   Calculates the final resolution mode for an import at some index within a file's `imports` list. This is the resolution mode
   explicitly provided via import attributes, if present, or the syntax the usage would have if emitted to JavaScript. In
   `--module node16` or `nodenext`, this may depend on the file's `impliedNodeFormat`. In `--module preserve`, it depends only on the
   input syntax of the reference. In other `module` modes, when overriding import attributes are not provided, this function returns
   `undefined`, as the result would have no impact on module resolution, emit, or type checking.
   
   **Parameters:**
   - `file`: `SourceFile` - File to fetch the resolution mode within
   - `index`: `number` - Index into the file's complete resolution list to get the resolution of - this is a concatenation of the file's imports and module augmentations
   - `compiler-options`: `CompilerOptions` - The compiler options for the program that owns the file. If the file belongs to a referenced project, the compiler options
   should be the options of the referenced project, not the referencing project.
   
   **Returns:** `ResolutionMode`"
  ^js [file index compiler-options]
  (typescript/getModeForResolutionAtIndex file index compiler-options))

(defn mode-for-usage-location
  "Use `program.getModeForUsageLocation`, which retrieves the correct `compilerOptions`, instead of this function whenever possible.
   Calculates the final resolution mode for a given module reference node. This is the resolution mode explicitly provided via import
   attributes, if present, or the syntax the usage would have if emitted to JavaScript. In `--module node16` or `nodenext`, this may
   depend on the file's `impliedNodeFormat`. In `--module preserve`, it depends only on the input syntax of the reference. In other
   `module` modes, when overriding import attributes are not provided, this function returns `undefined`, as the result would have no
   impact on module resolution, emit, or type checking.
   
   **Parameters:**
   - `file`: `{ impliedNodeFormat?: ResolutionMode; }` - The file the import or import-like reference is contained within
   - `usage`: `StringLiteralLike` - The module reference string
   - `compiler-options`: `CompilerOptions` - The compiler options for the program that owns the file. If the file belongs to a referenced project, the compiler options
   should be the options of the referenced project, not the referencing project.
   
   **Returns:** `ModuleKind.CommonJS | ModuleKind.ESNext | undefined` - The final resolution mode of the import"
  ^js [file usage compiler-options]
  (typescript/getModeForUsageLocation file usage compiler-options))

(defn config-file-parsing-diagnostics
  "**Parameters:**
   - `config-file-parse-result`: `ParsedCommandLine`
   
   **Returns:** `readonly Diagnostic[]`"
  ^js [config-file-parse-result]
  (typescript/getConfigFileParsingDiagnostics config-file-parse-result))

(defn implied-node-format-for-file
  "A function for determining if a given file is esm or cjs format, assuming modern node module resolution rules, as configured by the
   `options` parameter.
   
   **Parameters:**
   - `file-name`: `string` - The file name to check the format of (it need not exist on disk)
   - `package-json-info-cache`: `PackageJsonInfoCache | undefined` - A cache for package file lookups - it's best to have a cache when this function is called often
   - `host`: `ModuleResolutionHost` - The ModuleResolutionHost which can perform the filesystem lookups for package json data
   - `options`: `CompilerOptions` - The compiler options to perform the analysis under - relevant options are `moduleResolution` and `traceResolution`
   
   **Returns:** `ResolutionMode` - `undefined` if the path has no relevant implied format, `ModuleKind.ESNext` for esm format, and `ModuleKind.CommonJS` for cjs format"
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
   triple-slash-reference-path directives transitively. '@types' and triple-slash-reference-types are also pulled in.
   
   **Parameters:**
   - `create-program-options`: `CreateProgramOptions` - - The options for creating a program.
   - `root-names`: `readonly string[]` - - A set of root files.
   - `options`: `CompilerOptions` - - The compiler options which should be used.
   - `host`: `CompilerHost | undefined` - - The host interacts with the underlying file system.
   - `old-program`: `Program | undefined` - - Reuses an old program structure.
   - `config-file-parsing-diagnostics`: `readonly Diagnostic[] | undefined` - - error during config file parsing
   
   **Returns:** `Program` - A 'Program' object."
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
   Note: The file might not exist.
   
   **Parameters:**
   - `ref`: `ProjectReference`
   
   **Returns:** `ResolvedConfigFileName`"
  ^js [ref]
  (typescript/resolveProjectReferencePath ref))

(defn create-semantic-diagnostics-builder-program
  "Create the builder to manage semantic diagnostics and cache them
   
   **Parameters:**
   - `new-program`: `Program`
   - `root-names`: `readonly string[] | undefined`
   - `options`: `CompilerOptions | undefined`
   - `host`: `CompilerHost | undefined`
   - `old-program`: `SemanticDiagnosticsBuilderProgram | undefined`
   - `config-file-parsing-diagnostics`: `readonly Diagnostic[] | undefined`
   - `project-references`: `readonly ProjectReference[] | undefined`
   
   **Returns:** `SemanticDiagnosticsBuilderProgram`"
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
   to emit the those files and manage semantic diagnostics cache as well
   
   **Parameters:**
   - `new-program`: `Program`
   - `root-names`: `readonly string[] | undefined`
   - `options`: `CompilerOptions | undefined`
   - `host`: `CompilerHost | undefined`
   - `old-program`: `EmitAndSemanticDiagnosticsBuilderProgram | undefined`
   - `config-file-parsing-diagnostics`: `readonly Diagnostic[] | undefined`
   - `project-references`: `readonly ProjectReference[] | undefined`
   
   **Returns:** `EmitAndSemanticDiagnosticsBuilderProgram`"
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
  "Creates a builder thats just abstraction over program and can be used with watch
   
   **Parameters:**
   - `new-program`: `Program`
   - `root-names`: `readonly string[] | undefined`
   - `options`: `CompilerOptions | undefined`
   - `host`: `CompilerHost | undefined`
   - `old-program`: `BuilderProgram | undefined`
   - `config-file-parsing-diagnostics`: `readonly Diagnostic[] | undefined`
   - `project-references`: `readonly ProjectReference[] | undefined`
   
   **Returns:** `BuilderProgram`"
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
  "**Parameters:**
   - `compiler-options`: `CompilerOptions`
   - `host`: `ReadBuildProgramHost`
   
   **Returns:** `EmitAndSemanticDiagnosticsBuilderProgram | undefined`"
  ^js [compiler-options host]
  (typescript/readBuilderProgram compiler-options host))

(defn create-incremental-compiler-host
  "**Parameters:**
   - `options`: `CompilerOptions`
   - `system`: `System | undefined`
   
   **Returns:** `CompilerHost`"
  (^js [options]
   (typescript/createIncrementalCompilerHost options))
  (^js [options system]
   (typescript/createIncrementalCompilerHost options system)))

(defn create-incremental-program
  "**Parameters:**
   - `root-names-options-config-file-parsing-diagnostics-project-references-host-create-program`: `IncrementalProgramOptions<T>`
   
   **Returns:** `T`"
  ^js [root-names-options-config-file-parsing-diagnostics-project-references-host-create-program]
  (typescript/createIncrementalProgram root-names-options-config-file-parsing-diagnostics-project-references-host-create-program))

(defn create-watch-compiler-host
  "Create the watch compiler host for either configFile or fileNames and its options
   
   **Parameters:**
   - `config-file-name`: `string`
   - `root-files`: `string[]`
   - `options`: `CompilerOptions`
   - `options-to-extend`: `CompilerOptions | undefined`
   - `system`: `System`
   - `create-program`: `CreateProgram<T> | undefined`
   - `report-diagnostic`: `DiagnosticReporter | undefined`
   - `report-watch-status`: `WatchStatusReporter | undefined`
   - `project-references`: `readonly ProjectReference[] | undefined`
   - `watch-options-to-extend`: `WatchOptions | undefined`
   - `extra-file-extensions`: `readonly FileExtensionInfo[] | undefined`
   - `watch-options`: `WatchOptions | undefined`
   
   **Returns:** `WatchCompilerHostOfFilesAndCompilerOptions<T>`"
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
   Creates the watch from the host for config file
   
   **Parameters:**
   - `host`: `WatchCompilerHostOfConfigFile<T>`
   
   **Returns:** `WatchOfConfigFile<T>`"
  ^js [host]
  (typescript/createWatchProgram host))

(defn create-builder-status-reporter
  "Create a function that reports watch status by writing to the system and handles the formating of the diagnostic
   
   **Parameters:**
   - `system`: `System`
   - `pretty?`: `boolean | undefined`
   
   **Returns:** `DiagnosticReporter`"
  (^js [system]
   (typescript/createBuilderStatusReporter system))
  (^js [system pretty?]
   (typescript/createBuilderStatusReporter system pretty?)))

(defn create-solution-builder-host
  "**Parameters:**
   - `system`: `System | undefined`
   - `create-program`: `CreateProgram<T> | undefined`
   - `report-diagnostic`: `DiagnosticReporter | undefined`
   - `report-solution-builder-status`: `DiagnosticReporter | undefined`
   - `report-error-summary`: `ReportEmitErrorSummary | undefined`
   
   **Returns:** `SolutionBuilderHost<T>`"
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
  "**Parameters:**
   - `system`: `System | undefined`
   - `create-program`: `CreateProgram<T> | undefined`
   - `report-diagnostic`: `DiagnosticReporter | undefined`
   - `report-solution-builder-status`: `DiagnosticReporter | undefined`
   - `report-watch-status`: `WatchStatusReporter | undefined`
   
   **Returns:** `SolutionBuilderWithWatchHost<T>`"
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
  "**Parameters:**
   - `host`: `SolutionBuilderHost<T>`
   - `root-names`: `readonly string[]`
   - `default-options`: `BuildOptions`
   
   **Returns:** `SolutionBuilder<T>`"
  ^js [host root-names default-options]
  (typescript/createSolutionBuilder host root-names default-options))

(defn create-solution-builder-with-watch
  "**Parameters:**
   - `host`: `SolutionBuilderWithWatchHost<T>`
   - `root-names`: `readonly string[]`
   - `default-options`: `BuildOptions`
   - `base-watch-options`: `WatchOptions | undefined`
   
   **Returns:** `SolutionBuilder<T>`"
  (^js [host root-names default-options]
   (typescript/createSolutionBuilderWithWatch host root-names default-options))
  (^js [host root-names default-options base-watch-options]
   (typescript/createSolutionBuilderWithWatch host root-names default-options base-watch-options)))

(defn default-format-code-settings
  "**Parameters:**
   - `new-line-character`: `string | undefined`
   
   **Returns:** `FormatCodeSettings`"
  (^js []
   (typescript/getDefaultFormatCodeSettings))
  (^js [new-line-character]
   (typescript/getDefaultFormatCodeSettings new-line-character)))

(defn create-classifier
  "The classifier is used for syntactic highlighting in editors via the TSServer
   
   **Returns:** `Classifier`"
  ^js []
  (typescript/createClassifier))

(defn create-document-registry
  "**Parameters:**
   - `use-case-sensitive-file-names?`: `boolean | undefined`
   - `current-directory`: `string | undefined`
   - `js-doc-parsing-mode`: `JSDocParsingMode | undefined`
   
   **Returns:** `DocumentRegistry`"
  (^js []
   (typescript/createDocumentRegistry))
  (^js [use-case-sensitive-file-names?]
   (typescript/createDocumentRegistry use-case-sensitive-file-names?))
  (^js [use-case-sensitive-file-names? current-directory]
   (typescript/createDocumentRegistry use-case-sensitive-file-names? current-directory))
  (^js [use-case-sensitive-file-names? current-directory js-doc-parsing-mode]
   (typescript/createDocumentRegistry use-case-sensitive-file-names? current-directory js-doc-parsing-mode)))

(defn pre-process-file
  "**Parameters:**
   - `source-text`: `string`
   - `read-import-files?`: `boolean | undefined`
   - `detect-java-script-imports?`: `boolean | undefined`
   
   **Returns:** `PreProcessedFileInfo`"
  (^js [source-text]
   (typescript/preProcessFile source-text))
  (^js [source-text read-import-files?]
   (typescript/preProcessFile source-text read-import-files?))
  (^js [source-text read-import-files? detect-java-script-imports?]
   (typescript/preProcessFile source-text read-import-files? detect-java-script-imports?)))

(defn transpile-module
  "**Parameters:**
   - `input`: `string`
   - `transpile-options`: `TranspileOptions`
   
   **Returns:** `TranspileOutput`"
  ^js [input transpile-options]
  (typescript/transpileModule input transpile-options))

(defn transpile
  "**Parameters:**
   - `input`: `string`
   - `compiler-options`: `CompilerOptions | undefined`
   - `file-name`: `string | undefined`
   - `diagnostics`: `Diagnostic[] | undefined`
   - `module-name`: `string | undefined`
   
   **Returns:** `string`"
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
  "**Parameters:**
   - `options`: `EditorSettings | EditorOptions`
   
   **Returns:** `EditorSettings`"
  ^js [options]
  (typescript/toEditorSettings options))

(defn display-parts-to-string
  "**Parameters:**
   - `display-parts`: `SymbolDisplayPart[] | undefined`
   
   **Returns:** `string`"
  (^js []
   (typescript/displayPartsToString))
  (^js [display-parts]
   (typescript/displayPartsToString display-parts)))

(defn default-compiler-options
  "**Returns:** `CompilerOptions`"
  ^js []
  (typescript/getDefaultCompilerOptions))

(defn supported-code-fixes
  "**Returns:** `readonly string[]`"
  ^js []
  (typescript/getSupportedCodeFixes))

(defn create-language-service-source-file
  "**Parameters:**
   - `file-name`: `string`
   - `script-snapshot`: `IScriptSnapshot`
   - `script-target-or-options`: `ScriptTarget | CreateSourceFileOptions`
   - `version`: `string`
   - `set-node-parents?`: `boolean`
   - `script-kind`: `ScriptKind | undefined`
   
   **Returns:** `SourceFile`"
  (^js [file-name script-snapshot script-target-or-options version set-node-parents?]
   (typescript/createLanguageServiceSourceFile file-name script-snapshot script-target-or-options version set-node-parents?))
  (^js [file-name script-snapshot script-target-or-options version set-node-parents? script-kind]
   (typescript/createLanguageServiceSourceFile file-name script-snapshot script-target-or-options version set-node-parents? script-kind)))

(defn update-language-service-source-file
  "**Parameters:**
   - `source-file`: `SourceFile`
   - `script-snapshot`: `IScriptSnapshot`
   - `version`: `string`
   - `text-change-range`: `TextChangeRange | undefined`
   - `aggressive-checks?`: `boolean | undefined`
   
   **Returns:** `SourceFile`"
  (^js [source-file script-snapshot version]
   (typescript/updateLanguageServiceSourceFile source-file script-snapshot version))
  (^js [source-file script-snapshot version text-change-range]
   (typescript/updateLanguageServiceSourceFile source-file script-snapshot version text-change-range))
  (^js [source-file script-snapshot version text-change-range aggressive-checks?]
   (typescript/updateLanguageServiceSourceFile source-file script-snapshot version text-change-range aggressive-checks?)))

(defn create-language-service
  "**Parameters:**
   - `host`: `LanguageServiceHost`
   - `document-registry`: `DocumentRegistry | undefined`
   - `syntax-only-or-language-service-mode?`: `boolean | LanguageServiceMode | undefined`
   
   **Returns:** `LanguageService`"
  (^js [host]
   (typescript/createLanguageService host))
  (^js [host document-registry]
   (typescript/createLanguageService host document-registry))
  (^js [host document-registry syntax-only-or-language-service-mode?]
   (typescript/createLanguageService host document-registry syntax-only-or-language-service-mode?)))

(defn default-lib-file-path
  "Get the path of the default library files (lib.d.ts) as distributed with the typescript
   node package.
   The functionality is not supported if the ts module is consumed outside of a node module.
   
   **Parameters:**
   - `options`: `CompilerOptions`
   
   **Returns:** `string`"
  ^js [options]
  (typescript/getDefaultLibFilePath options))

(defn transform
  "Transform one or more nodes using the supplied transformers.
   
   **Parameters:**
   - `source`: `T | T[]` - A single `Node` or an array of `Node` objects.
   - `transformers`: `TransformerFactory<T>[]` - An array of `TransformerFactory` callbacks used to process the transformation.
   - `compiler-options`: `CompilerOptions | undefined` - Optional compiler options.
   
   **Returns:** `TransformationResult<T>`"
  (^js [source transformers]
   (typescript/transform source transformers))
  (^js [source transformers compiler-options]
   (typescript/transform source transformers compiler-options)))

(defn version-major-minor
  "**Returns:** `\"5.4\"`"
  ^js []
  typescript/versionMajorMinor)

(defn version
  "The version of the TypeScript compiler release
   
   **Returns:** `string`"
  ^js []
  typescript/version)

(defn sys
  "**Returns:** `System`"
  ^js []
  typescript/sys)

(defn unchanged-text-change-range
  "**Returns:** `TextChangeRange`"
  ^js []
  typescript/unchangedTextChangeRange)

(defn factory
  "**Returns:** `NodeFactory`"
  ^js []
  typescript/factory)

(defn services-version
  "The version of the language service API
   
   **Returns:** `\"0.8\"`"
  ^js []
  typescript/servicesVersion)
